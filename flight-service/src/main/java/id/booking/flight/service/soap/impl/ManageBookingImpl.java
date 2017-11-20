package id.booking.flight.service.soap.impl;

import id.booking.flight.entity.Booking;
import id.booking.flight.entity.Flight;
import id.booking.flight.entity.Invoice;
import id.booking.flight.entity.User;
import id.booking.flight.service.task.ManageBookingService;

public class ManageBookingImpl implements ManageBookingService {

	/* Ngecek apakah seat masih ada, terus baru create booking sama invoice, terus sendInvoice ke user
	 * */
	@Override
	public boolean createBookingAndInvoice(User customer, Flight flight, String passengerName) {
		// TODO Auto-generated method stub
		return false;
	}

	/* Hapus booking & invoice
	 * */
	@Override
	public boolean deleteBookingAndInvoice(Booking booking, Invoice invoice) {
		// TODO Auto-generated method stub
		return false;
	}

}
