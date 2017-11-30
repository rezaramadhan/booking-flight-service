package id.booking.flight.delegation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;
import id.booking.flight.entity.*;
import id.booking.flight.service.soap.impl.FlightSearchImpl;
//import id.booking.flight.service.soap.impl.FlightSearchImplProxy;

public class NotifyUserDelegate implements JavaDelegate{
	
	private final static Logger LOGGER = Logger.getLogger("NOTIFY USER");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.NotifyUserDelegate");

		String isApproved = (String) execution.getVariable("isApproved");
		Integer userId = (Integer) execution.getVariable("userId");
		Integer bookingId = (Integer) execution.getVariable("bookingId");

		if (isApproved.equals("Y")) {
			LOGGER.info("Booking cancellation request from user id " + userId + " for booking number "
				+ bookingId + " is SUCCEED.");
		} else {
			LOGGER.info("Booking cancellation request from user id " + userId + " for booking number "
				+ bookingId + " is FAILED.");			
		}
	}
}
