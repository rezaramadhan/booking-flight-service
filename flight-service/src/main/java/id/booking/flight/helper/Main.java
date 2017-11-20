package id.booking.flight.helper;

import java.sql.Date;
import id.booking.flight.entity.Airport;
import id.booking.flight.entity.Flight;
import id.booking.flight.entity.Location;
import id.booking.flight.service.soap.impl.FlightImpl;
import id.booking.flight.service.soap.impl.FlightSearchImpl;

public class Main {
	public static void main(String[] args) throws Exception {
        MySQLAccess sqlAccessor = new MySQLAccess();
        String dbName = "booking_domain";
        
        FlightImpl flightService = new FlightImpl();
        Airport departure = new Airport(3);
        Airport destination = new Airport(20);
        Flight[] flights = flightService.findAllFlight();
//        Flight[] flights = flightService.findFlightByBoarding(new Date(2017, 10, 25), new Date(2017, 10, 30), departure, destination);
		System.out.println("Row count: " + flights.length);
        for (int i = 0; i < flights.length; i++) {
        		System.out.println(flights[i].getId() + ". " + flights[i].getDepartureId().getName()
    				+ " -> " + flights[i].getDestinationId().getName() + " Rp " + flights[i].getPrice()
    				+ " boarding time: " + flights[i].getBoardingTime());
        }
//        String query = "select * from locations where Province = 'Jawa Timur'";
//        ArrayList<Map<String, String>> results = sqlAccessor.runSelectQuery(dbName, query);
//        System.out.println(results);
        
//        Location loc = new Location("Jawa Timur", "Surabayaaa");
//        System.out.println("loc id: " + loc.getId());        
    }
}