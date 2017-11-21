package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

import id.booking.flight.service.soap.impl.PaymentManagementImplProxy;

public class CheckoutDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("CHECKOUT");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.CheckoutDelegate");
		
		Integer user_id = (Integer) execution.getVariable("user_id");
		String booking_code = (String) execution.getVariable("invoice_id");
		
//		PaymentManagementImplProxy impl = new PaymentManagementImplProxy();
//		boolean status = impl.createPaymentRequest(invoice);
//		execution.setVariable("status", status);
	}

}
