package id.booking.flight.service.soap.impl;

import id.booking.flight.entity.Booking;
import id.booking.flight.entity.Flight;
import id.booking.flight.entity.Invoice;
import id.booking.flight.entity.User;
import id.booking.flight.service.task.ManageBookingService;
import id.booking.flight.service.soap.impl.BookingImpl;
import id.booking.flight.service.soap.impl.InvoiceImpl;
import id.booking.flight.service.soap.impl.CheckFlightSeatImpl;


public class ManageBookingImpl implements ManageBookingService {

	/* Ngecek apakah seat masih ada, terus baru create booking sama invoice, terus sendInvoice ke user
	 * */
	@Override
	public boolean createBookingAndInvoice(User customer, Flight flight, String passengerName) {
		// TODO Auto-generated method stub
		CheckFlightSeatImpl check_flight_seat_impl = new CheckFlightSeatImpl();
		if (check_flight_seat_impl.checkSeat(flight) == 0) {
			return false;
		}	
		
		BookingImpl booking_impl = new BookingImpl();
		Booking booking;
		try {
			booking = booking_impl.createBooking(customer, flight, passengerName);
		} catch (Exception e) {
			return false;
		}
		
		InvoiceImpl invoice_impl = new InvoiceImpl();
		Invoice invoice;
		try {
			invoice = invoice_impl.createInvoice(customer, booking);
		} catch (Exception e) {
			booking_impl.cancelBooking(booking);
			return false;
		}
		
		return invoice_impl.sendInvoice(customer, invoice);
	}

	/* Hapus booking & invoice
	 * */
	@Override
	public boolean deleteBookingAndInvoice(Booking booking, Invoice invoice) {
		// TODO Auto-generated method stub
		BookingImpl booking_impl = new BookingImpl();
		InvoiceImpl invoice_impl = new InvoiceImpl();
		
		return (booking_impl.cancelBooking(booking) && invoice_impl.deleteInvoice(invoice));
	}

}
