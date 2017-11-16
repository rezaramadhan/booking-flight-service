package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

public class RecievePaymentDelegate extends JavaDelegateInvocation {

	public RecievePaymentDelegate(JavaDelegate delegateInstance, DelegateExecution execution) {
		super(delegateInstance, execution);
		// TODO Auto-generated constructor stub
	}
	
	private final static Logger LOGGER = Logger.getLogger("RECEIVE-PAYMENT");

	public void execute(DelegateExecution execution) throws Exception {
		Integer user_id = (Integer) execution.getVariable("user_id");
		String booking_code = (String) execution.getVariable("booking_code");

		LOGGER.info("Getting payment data from payment gateway");		
		LOGGER.info("Processing payment result for booking_code:" + booking_code);
		LOGGER.info("Setting payment data in database for booking code:" + booking_code);
		
		LOGGER.info("Sending confirmation to User");
		
		execution.setVariable("payment_status", '0');
		execution.setVariable("booking_status", '0');
	}
}
