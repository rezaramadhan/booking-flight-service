package id.booking.flight.service.soap.impl;

import java.util.logging.Logger;

import id.booking.flight.entity.Booking;
import id.booking.flight.entity.Invoice;
import id.booking.flight.entity.User;
import id.booking.flight.service.entity.InvoiceService;

public class InvoiceImpl implements InvoiceService {
	private final static Logger LOGGER = Logger.getLogger("INVOICE");

	/* Create invoice baru
	 * */
	public Invoice createInvoice(User customer, Booking booking) {
		Invoice inv = new Invoice(customer, booking);
		return inv;
	}

	public boolean setInvoicePaid(Invoice invoice) {
		try {
			invoice.setPaid(true);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean deleteInvoice(Invoice invoice) {
		try {
			invoice.delete();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	

	
	/* Ini ngeprint ke log aja, harusnya sih ngirim via email gitu
	 * */
	public boolean sendInvoice(User customer, Invoice invoice) {
		// TODO Auto-generated method stub
		try {
			LOGGER.info("Sending paid invoice " + invoice.getId() + " to " + customer.getName());
			System.out.println("Sending invoice " + invoice);
			System.out.println("to customer " + customer);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public Invoice getInvoiceByBookingId(int bookingId) {
		Invoice invoice = new Invoice();
		invoice.getByBookingId(bookingId);	
		return invoice;
	}
}
