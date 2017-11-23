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

public class ManageBookingDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("MANAGE-BOOKING");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.ManageBookingDelegate");
	    LOGGER.info("Processing request by '" + execution.getVariable("user_id") + "'...");
		
		Integer user_id = (Integer) execution.getVariable("customerId");
		Integer flightId = (Integer) execution.getVariable("flightId");
		String passengerName = (String) execution.getVariable("passengerName");
		
		ManageBookingImpl impl = new ManageBookingImpl();
		
		InvoiceImpl invImpl = new InvoiceImpl();
		BookingImpl bookingImpl = new BookingImpl();
		Booking b = bookingImpl.createBooking(new User(user_id), new Flight(flightId), passengerName);
		Invoice i = invImpl.createInvoice(new User(user_id), b);
		
		execution.setVariable("status", true);
// TODO: expose search user, flight, location, invoice ke service. 
		
		execution.setVariable("status", true);
		execution.setVariable("invoice_id", i.getId());
	}
}
