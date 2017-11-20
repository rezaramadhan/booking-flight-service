package id.booking.flight.service.task;

import id.booking.flight.entity.Booking;
import id.booking.flight.entity.Flight;
import id.booking.flight.entity.Receipt;
import id.booking.flight.entity.User;

public interface ManageBookingService {
	//return false kalo failed, true otherwise
	public boolean createBookingAndInvoice(User customer, Flight flight, String passengerName);
	public boolean deleteBookingAndInvoice(Booking booking, Receipt invoice);
}
