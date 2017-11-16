package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

public class ManageBookingDelegate extends JavaDelegateInvocation {

	public ManageBookingDelegate(JavaDelegate delegateInstance, DelegateExecution execution) {
		super(delegateInstance, execution);
		// TODO Auto-generated constructor stub
	}
	
	private final static Logger LOGGER = Logger.getLogger("MANAGE-BOOKING");

	public void execute(DelegateExecution execution) throws Exception {
	    //LOGGER.info("Processing request by '" + execution.getVariable("customerId") + "'...");
		
		Integer user_id = (Integer) execution.getVariable("user_id");
		String code = (String) execution.getVariable("code");
		Integer status = (Integer) execution.getVariable("status");
		
		LOGGER.info("Manage Booking of '" + user_id + "' with code '" + code + "'...");
		LOGGER.info("Booking Status: " + status);
		LOGGER.info("Altering status...");
		status = 3;
		execution.setVariable("status", status);
		LOGGER.info("Booking Status: " + status);		
		
		LOGGER.info("Adding new booking with id = 1, code = 163803009, and status = 1...");
		user_id = 1;
		code = "163803010";
		status = 1;
		execution.setVariable("user_id", user_id);
		execution.setVariable("code", code);
		execution.setVariable("status", status);

	}
}
