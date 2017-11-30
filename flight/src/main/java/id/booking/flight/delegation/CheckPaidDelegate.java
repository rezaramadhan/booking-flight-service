package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

import id.booking.flight.entity.Booking;
import id.booking.flight.entity.Flight;
import id.booking.flight.entity.Invoice;
import id.booking.flight.service.soap.impl.BookingImpl;
import id.booking.flight.service.soap.impl.CheckFlightSeatImpl;
import id.booking.flight.service.soap.impl.PaymentManagementImpl;

public class CheckPaidDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("CHECK PAID");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.CheckPaidDelegate");
		
		Integer bookingId = (Integer) execution.getVariable("bookingId");
		
		Booking b = new Booking(bookingId);
		BookingImpl impl = new BookingImpl();
		
		if (impl.isBookingPaid(b)) {
			execution.setVariable("isBookingPaid", 1);
		} else {
			execution.setVariable("isBookingPaid", 0);
		}		
	}

}
