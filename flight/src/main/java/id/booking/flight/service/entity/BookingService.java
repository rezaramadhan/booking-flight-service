package id.booking.flight.service.entity;

import id.booking.flight.entity.Booking;
import id.booking.flight.entity.Flight;
import id.booking.flight.entity.User;

public interface BookingService {
	public Booking createBooking(User customer, Flight flight, String passengerName);
	public Booking modifyBooking(Booking booking, Flight flight, String passangerName);
	public boolean cancelBooking(Booking booking);
	public boolean changeBookingStatus(Booking booking, String status);
}
