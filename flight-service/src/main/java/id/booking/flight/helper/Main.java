package id.booking.flight.helper;

import id.booking.flight.entity.Airport;
import id.booking.flight.entity.Flight;
import id.booking.flight.entity.Location;
import id.booking.flight.service.soap.impl.FlightImpl;
import id.booking.flight.service.soap.impl.FlightSearchImpl;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;

import id.booking.flight.entity.*;
import id.booking.flight.service.soap.impl.UserImpl;

public class Main {
	public static void main(String[] args) throws Exception {
        MySQLAccess sqlAccessor = new MySQLAccess();
        String dbName = "booking_domain";
        String query = "select * from locations where Province = 'Jawa Timur'";
        ArrayList<Map<String, String>> results = sqlAccessor.runSelectQuery(dbName, query);
        System.out.println(results);
        UserImpl impl = new UserImpl();
        User u = impl.createNewUser("rezaaasda", "abcd", "password");
		System.out.println("heho");
		System.out.println(u.getId());
    }
}