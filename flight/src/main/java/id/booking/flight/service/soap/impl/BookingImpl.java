package id.booking.flight.service.soap.impl;

import id.booking.flight.entity.Booking;
import id.booking.flight.entity.Flight;
import id.booking.flight.entity.User;
import id.booking.flight.service.entity.BookingService;

public class BookingImpl implements BookingService {

	@Override
	public Booking createBooking(User user, Flight flight, String passengerName) {
		Booking newBooking = new Booking("unpaid", passengerName, flight, user);
		return newBooking;
	}

	@Override
	public Booking modifyBooking(Booking booking, Flight flight, String passengerName) {
		booking.setFlightId(flight);
		booking.setPassengerName(passengerName);
		return booking;
	}

	@Override
	public boolean cancelBooking(Booking booking) {
		try {
			booking.deleteBooking();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public boolean changeBookingStatus(Booking booking, String status) {
		try {
			booking.setStatus(status);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
