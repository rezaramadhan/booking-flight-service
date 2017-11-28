package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

import id.booking.flight.entity.*;
import id.booking.flight.service.soap.impl.BookingImpl;
import id.booking.flight.service.soap.impl.InvoiceImpl;
import id.booking.flight.service.soap.impl.ManageBookingImpl;
//import id.booking.flight.service.soap.impl.ManageBookingImplProxy;

public class CreateBookingDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("CREATE BOOKING");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.CreateBookingDelegate");
	    LOGGER.info("Processing request by '" + execution.getVariable("userId") + "'...");
		
		Integer userId = (Integer) execution.getVariable("userId");
		Integer flightId = (Integer) execution.getVariable("flightId");
		String passengerName = (String) execution.getVariable("passengerName");
				
		BookingImpl bookingImpl = new BookingImpl();
		Booking b = bookingImpl.createBooking(new User(userId), new Flight(flightId), passengerName);
		execution.setVariable("bookingId", b.getId());
	}
}
