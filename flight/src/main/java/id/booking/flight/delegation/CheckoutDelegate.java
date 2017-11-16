package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

public class CheckoutDelegate extends JavaDelegateInvocation {

	public CheckoutDelegate(JavaDelegate delegateInstance, DelegateExecution execution) {
		super(delegateInstance, execution);
		// TODO Auto-generated constructor stub
	}
	private final static Logger LOGGER = Logger.getLogger("CHECKOUT");

	public void execute(DelegateExecution execution) throws Exception {
		Integer user_id = (Integer) execution.getVariable("user_id");
		String booking_code = (String) execution.getVariable("booking_code");
		
		LOGGER.info("Processing checkout request for booking_code:" + booking_code);

		LOGGER.info("Sending payment data to payment gateway");
		LOGGER.info("Getting confirmation from payment gateway");
		LOGGER.info("Setting payment data in database for booking code:" + booking_code);
		
		LOGGER.info("Setting confirmation to user:" + user_id);
		
		execution.setVariable("payment_status", '0');
		execution.setVariable("booking_status", '0');
	}

}
