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

public class DeleteInvoiceDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("DELETE INVOICE");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.DeleteInvoiceDelegate");
		
		Integer bookingId = (Integer) execution.getVariable("bookingId");		
		InvoiceImpl impl = new InvoiceImpl();
		try {
			Invoice inv = impl.getInvoiceByBookingId(bookingId);
			int id = inv.getId();
			impl.deleteInvoice(inv);
			
			LOGGER.info("Delete invoice succeed for invoice number " + id);
		} catch (Exception e) {
			
		}
	}
}
