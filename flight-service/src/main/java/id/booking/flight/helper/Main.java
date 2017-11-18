package id.booking.flight.helper;

import java.util.ArrayList;
import java.util.Map;

import id.booking.flight.entity.Location;

public class Main {
	public static void main(String[] args) throws Exception {
        MySQLAccess sqlAccessor = new MySQLAccess();
        String dbName = "booking_domain";
        String query = "select * from locations where Province = 'Jawa Timur'";
        ArrayList<Map<String, String>> results = sqlAccessor.runSelectQuery(dbName, query);
        System.out.println(results);
        
//        Location loc = new Location("Jawa Timur", "Surabayaaa");
//        System.out.println("loc id: " + loc.getId());        
    }
}