package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

import id.booking.flight.entity.*;
import id.booking.flight.service.soap.impl.BookingImpl;
import id.booking.flight.service.soap.impl.InvoiceImpl;
import id.booking.flight.service.soap.impl.ManageBookingImpl;

public class UpdateBookingDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("UPDATE BOOKING");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.UpdateBookingDelegate");
		
		Integer bookingId = (Integer) execution.getVariable("bookingId");
		String name = (String) execution.getVariable("newPassengerName");
		Booking b = new Booking(bookingId);
		
		BookingImpl impl = new BookingImpl();
		impl.modifyBooking(b, b.getFlightId(), name);
	}
}
