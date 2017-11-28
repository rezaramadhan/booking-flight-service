package id.booking.flight.service.soap.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import id.booking.flight.entity.Airport;
import id.booking.flight.entity.Flight;
import id.booking.flight.helper.MySQLAccess;
import id.booking.flight.service.task.FlightSearchService;

public class FlightSearchImpl implements FlightSearchService {
    private static final MySQLAccess sqlAccessor = new MySQLAccess();
    private static final String dbName = "booking_domain";
	
	/* Find flight yang punya departure antara boarding time tertentu AND punya destination & departure tertentu
	 * */
	@Override
	public Flight[] findFlightByBoarding(Date boardingTimeMin, Date boardingTimeMax, Airport departure, Airport destination) {

        String formattedDate1 = new SimpleDateFormat("yyyy-MM-dd").format(boardingTimeMin);
        String formattedDate2 = new SimpleDateFormat("yyyy-MM-dd").format(boardingTimeMax);
        
		String query = "select Id from flight where BoardingTime <= '" + formattedDate2 +
			"' and BoardingTime >= '" + formattedDate1 + "' and DepartureId = " + departure.getId() + " and DestinationId = " + destination.getId();
        System.out.println("QUERY: " + query);
		ArrayList<Map<String, String>> results;
		try {
			results = sqlAccessor.runSelectQuery(dbName, query);
			Flight[] flights = new Flight[results.size()];
			for (int i = 0; i < results.size(); i++) {
				Flight flight = new Flight(Integer.parseInt(results.get(i).get("Id")));
				flights[i] = flight;
			}
			return flights;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Flight[0];
	}

}