package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

import id.booking.flight.entity.Invoice;
import id.booking.flight.service.soap.impl.PaymentManagementImpl;

public class CheckoutDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("CHECKOUT");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.CheckoutDelegate");
		
		Integer user_id = (Integer) execution.getVariable("user_id");
		Integer booking_code = (Integer) execution.getVariable("invoice_id");
		
		PaymentManagementImpl impl = new PaymentManagementImpl();
		boolean status = impl.createPaymentRequest(new Invoice(booking_code));
		execution.setVariable("status", status);
	}

}
