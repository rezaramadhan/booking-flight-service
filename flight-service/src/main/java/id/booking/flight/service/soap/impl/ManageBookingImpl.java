package id.booking.flight.service.soap.impl;

import id.booking.flight.entity.Booking;
import id.booking.flight.entity.Flight;
import id.booking.flight.entity.Receipt;
import id.booking.flight.entity.User;
import id.booking.flight.service.task.ManageBookingService;

public class ManageBookingImpl implements ManageBookingService {

	@Override
	public boolean createBookingAndInvoice(User customer, Flight flight, String passengerName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBookingAndInvoice(Booking booking, Receipt invoice) {
		// TODO Auto-generated method stub
		return false;
	}

}
