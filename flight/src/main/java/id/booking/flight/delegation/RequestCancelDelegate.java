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

public class RequestCancelDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("REQUEST CANCEL");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.RequestCancelDelegate");
		
		Integer bookingId = (Integer) execution.getVariable("bookingId");
		Integer userId = (Integer) execution.getVariable("userId");
		Booking b = new Booking(bookingId);
		LOGGER.info("User " + userId + " made a request for booking number " + bookingId +
			" cancellation.");
		LOGGER.info("BOOKING INFO");
		LOGGER.info("ID: " + b.getId() + " | User ID: " + b.getUserId().getId() + " | Flight ID: " +
			b.getFlightId() + " | Status: " + b.getStatus() + " | Passenger Name: " +
			b.getPassengerName()	);
	}
}
