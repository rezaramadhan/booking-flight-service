package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

import id.booking.flight.service.soap.impl.ManageBookingImpl;
import id.booking.flight.service.soap.impl.ManageBookingImplProxy;

public class ManageBookingDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("MANAGE-BOOKING");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.ManageBookingDelegate");
	    LOGGER.info("Processing request by '" + execution.getVariable("user_id") + "'...");
		
		Integer user_id = (Integer) execution.getVariable("user_id");
		Integer flightId = (Integer) execution.getVariable("flightId");
		String passengerName = (String) execution.getVariable("passengerName");
		
		ManageBookingImpl impl = new ManageBookingImplProxy();
		
//		boolean status = impl.createBookingAndInvoice(customer, flight, passengerName)
//		execution.setVariable("status", status);
// TODO: expose search user, flight, location, invoice ke service. 
		
	}
}
