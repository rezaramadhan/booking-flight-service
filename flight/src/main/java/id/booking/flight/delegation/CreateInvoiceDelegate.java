package id.booking.flight.delegation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;

import id.booking.flight.entity.*;
import id.booking.flight.service.soap.impl.BookingImpl;
import id.booking.flight.service.soap.impl.InvoiceImpl;
import id.booking.flight.service.soap.impl.ManageBookingImpl;
//import id.booking.flight.service.soap.impl.ManageBookingImplProxy;

public class CreateInvoiceDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("CREATE INVOICE");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.CreateInvoiceDelegate");
		
		Integer user_id = (Integer) execution.getVariable("userId");
		Integer bookingId = (Integer) execution.getVariable("bookingId");
				
		InvoiceImpl invImpl = new InvoiceImpl();
		Booking b = new Booking(bookingId);
		Invoice i = invImpl.createInvoice(new User(user_id), b);
		
		execution.setVariable("invoiceId", i.getId());
	}
}
