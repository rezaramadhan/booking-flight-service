package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

import id.booking.flight.service.soap.impl.PaymentManagementImplProxy;

public class ReceivePaymentDelegate implements JavaDelegate{
	
	private final static Logger LOGGER = Logger.getLogger("RECEIVE-PAYMENT");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.ReceivePaymentDelegate");
		
//		String booking_code = (String) execution.getVariable("invoice_id");
//		PaymentManagementImplProxy impl = new PaymentManagementImplProxy();
//		boolean status = impl.receivePaymentData(invoice);
//		execution.setVariable("status", status);

	}
}
