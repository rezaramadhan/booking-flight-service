package id.booking.flight.service.soap.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import id.booking.flight.entity.Airport;
import id.booking.flight.entity.Flight;
import id.booking.flight.helper.MySQLAccess;
import id.booking.flight.service.entity.FlightService;

public class FlightImpl implements FlightService {
    private static final MySQLAccess sqlAccessor = new MySQLAccess();
    private static final String dbName = "booking_domain";
	
	@Override
	public Flight[] findAllFlight() {
        String query = "select Id from flight";
        ArrayList<Map<String, String>> results;
		try {
			results = sqlAccessor.runSelectQuery(dbName, query);
			Flight[] flights = new Flight[results.size()];
			for (int i = 0; i < results.size(); i++) {
				Flight flight = new Flight(Integer.parseInt(results.get(i).get("Id")));
				flights[i] = flight;
			}
			return flights;
			
//			results = sqlAccessor.executeSelectQuery(dbName, query);
//			Flight[] flights = sqlHelper.SQLToFlights(results);
//			for (int i = 0; i < flights.length; i++) {
//        			System.out.println(flights[i].getId() + ". " + flights[i].getDepartureId().getName()
//    				+ " -> " + flights[i].getDestinationId().getName() + " Rp " + flights[i].getPrice()
//    				+ " boarding time: " + flights[i].getBoardingTime());
//			}
//			return flights;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/* Find flight by id, return flight
	 * */
	@Override
	public Flight findById(int id) {
		return new Flight(id);
	}

	/* Find flight by price range, contohnya harga antara 0.5jt - 1jt
	 * */
	@Override
	public Flight[] findPriceRange(int min, int max) {
        String query = "select Id from flight where Price <= " + max + " and Price >= " + min;
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
		return null;
	}

	
	/* Find flight by boarding time, contohnya kayak antara 12Dec17 - 15Dec17
	 * */
	@Override
	public Flight[] findBoardingTimeRange(Date boardTimeMin, Date boardTimeMax) {
		String query = "select Id from flight where BoardingTime <= " + boardTimeMax + " and BoardingTime >= " + boardTimeMin;
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
		return null;
	}

	/* Find flight by departure location, contohnya departure di airport Soetta
	 * */
	@Override
	public Flight[] findByDepartureLocation(Airport loc) {
		String query = "select Id from flight where DepartureId = " + loc.getId();
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
		return null;
	}
	
	/* Find flight by departure location, contohnya destination ke airport Soetta
	 * */
	@Override
	public Flight[] findByDestinationLocation(Airport loc) {
		String query = "select Id from flight where DestinationId = " + loc.getId();
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
		return null;
	}
	
	@Override
	public void reduceQuota(int id) {
		Flight f = new Flight(id);
		int quota = f.getQuota();
		if (quota > 0) {
			String query = "update flight set Quota = " + (quota-1) + " where Id = " + id;
			try {
				sqlAccessor.runQuery(dbName, query);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
