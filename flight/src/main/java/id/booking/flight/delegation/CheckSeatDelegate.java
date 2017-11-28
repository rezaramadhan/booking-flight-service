package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

import id.booking.flight.entity.Flight;
import id.booking.flight.entity.Invoice;
import id.booking.flight.service.soap.impl.CheckFlightSeatImpl;
import id.booking.flight.service.soap.impl.PaymentManagementImpl;

public class CheckSeatDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("CHECK SEAT");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.CheckSeatDelegate");
		
		Integer flightId = (Integer) execution.getVariable("flightId");
		
		CheckFlightSeatImpl impl = new CheckFlightSeatImpl();
		int quota = impl.checkSeat(new Flight(flightId));

		execution.setVariable("quota", quota);
	}

}
