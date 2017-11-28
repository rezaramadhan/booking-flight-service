package id.booking.flight.helper;

import id.booking.flight.entity.Airport;
import id.booking.flight.entity.Flight;
import id.booking.flight.entity.Location;
import id.booking.flight.service.soap.impl.FlightImpl;
import id.booking.flight.service.soap.impl.FlightSearchImpl;
import id.booking.flight.service.soap.impl.InvoiceImpl;
import id.booking.flight.service.soap.impl.PaymentManagementImpl;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;

import id.booking.flight.entity.*;
import id.booking.flight.service.soap.impl.UserImpl;

public class Main {
	private final static Logger LOGGER = Logger.getLogger("MAIN");

	public static void main(String[] args) throws Exception {
        MySQLAccess sqlAccessor = new MySQLAccess();
        String dbName = "booking_domain";
//        String query = "select * from locations where Province = 'Jawa Timur'";
//        ArrayList<Map<String, String>> results = sqlAccessor.runSelectQuery(dbName, query);
//        System.out.println(results);
//        UserImpl impl = new UserImpl();
//        User u = impl.createNewUser("rezaaasda", "abcd", "password");
//		System.out.println("heho");
//		System.out.println(u.getId());
//		
//		FlightSearchImpl fs = new FlightSearchImpl();
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
//		Date departureDateMax = df.parse("2018-06-30");
//        Date departureDateMin = df.parse("2018-06-01");
//		Flight[] flights = fs.findFlightByBoarding(departureDateMin, departureDateMax, new Airport(21), new Airport(29));
//		System.out.println("Length: " + flights.length);
//		for (int i = 0; i < flights.length; i++) {
//			LOGGER.info("Id: " + Integer.toString(flights[i].getId()) + " | Company: " + flights[i].getCompany() +
//					" | Price: " + Double.toString(flights[i].getPrice()) + " | Quality: " +
//					flights[i].getBoardingTime() + " | Origin: " + flights[i].getDepartureId().getName()
//					+ " | Destination: " + flights[i].getDestinationId().getName());
//		}
		
        InvoiceImpl impl = new InvoiceImpl();
        Invoice inv = impl.getInvoiceByBookingId(26);
	}
}