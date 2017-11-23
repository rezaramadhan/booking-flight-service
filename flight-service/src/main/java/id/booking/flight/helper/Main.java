package id.booking.flight.helper;

import id.booking.flight.service.soap.impl.BookingImpl;
import id.booking.flight.service.soap.impl.FlightImpl;
import id.booking.flight.service.soap.impl.FlightSearchImpl;
import id.booking.flight.service.soap.impl.InvoiceImpl;
import id.booking.flight.service.soap.impl.ManageBookingImpl;
import id.booking.flight.service.soap.impl.PaymentManagementImpl;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;

import id.booking.flight.entity.*;
import id.booking.flight.service.soap.impl.UserImpl;

public class Main {
	public static void main(String[] args) throws Exception {
		int origin = 21;
		int destination = 29;

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		Date departureDateMin = df.parse("2018-06-08");
        Date departureDateMax = df.parse("2018-06-19");

		FlightSearchImpl impl = new FlightSearchImpl();

		Flight[] flights = impl.findFlightByBoarding(departureDateMin, departureDateMax, new Airport(origin), new Airport(destination));
		
		System.out.println(flights[0]);
		
		Integer user_id = 1;
		Integer flightId = flights[0].getId();
		String passengerName = "Hahaah";
		
		InvoiceImpl invImpl = new InvoiceImpl();
		BookingImpl bookingImpl = new BookingImpl();
		Booking b = bookingImpl.createBooking(new User(user_id), new Flight(flightId), passengerName);
		Invoice i = invImpl.createInvoice(new User(user_id), b);
		
		PaymentManagementImpl pymntimpl = new PaymentManagementImpl();
		boolean status = pymntimpl.createPaymentRequest(new Invoice(i.getId()));
		
		Integer booking_code = i.getId();
		boolean statuss = pymntimpl.receivePaymentData(new Invoice(booking_code));
		System.out.println(statuss);
    }
};