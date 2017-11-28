package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

import id.booking.flight.entity.Invoice;
import id.booking.flight.service.soap.impl.FlightImpl;
import id.booking.flight.service.soap.impl.PaymentManagementImpl;

public class ReduceQuotaDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("REDUCE QUOTA");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.ReduceQuotaDelegate");
		
		Integer flightId = (Integer) execution.getVariable("flightId");
		
		FlightImpl impl = new FlightImpl();
		impl.reduceQuota(flightId);
	}
}