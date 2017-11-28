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

public class SendInvoiceDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("SEND INVOICE");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.SendInvoiceDelegate");
		
		Integer user_id = (Integer) execution.getVariable("userId");
		User u = new User(user_id);
		LOGGER.info("Sending invoice to " + u.getName());
	}
}