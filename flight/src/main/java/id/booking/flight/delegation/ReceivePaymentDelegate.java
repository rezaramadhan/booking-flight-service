package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

import id.booking.flight.entity.Invoice;
import id.booking.flight.service.soap.impl.PaymentManagementImpl;

public class ReceivePaymentDelegate implements JavaDelegate{
	
	private final static Logger LOGGER = Logger.getLogger("RECEIVE-PAYMENT");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.ReceivePaymentDelegate");
		
		Integer invoice_id = (Integer) execution.getVariable("invoiceId");
		PaymentManagementImpl impl = new PaymentManagementImpl();
		boolean status = impl.receivePaymentData(new Invoice(invoice_id));
		execution.setVariable("status", status);

	}
}
