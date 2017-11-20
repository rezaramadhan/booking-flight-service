package id.booking.flight.helper;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;

import id.booking.flight.entity.*;

public class Main {
	public static void main(String[] args) throws Exception {
        MySQLAccess sqlAccessor = new MySQLAccess();
        String dbName = "booking_domain";
        String query = "select * from locations where Province = 'Jawa Timur'";
        ArrayList<Map<String, String>> results = sqlAccessor.runSelectQuery(dbName, query);
        System.out.println(results);
        
        Airport a = new Airport(1);
        Airport b = new Airport(2);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
        Date boardingTime = df.parse("2017-7-7");
        Flight f = new Flight(2);
        User u = new User(2);
        
        Booking book = new Booking("unpaid", "reza ra", f, u);
    }
}