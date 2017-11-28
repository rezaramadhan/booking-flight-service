package id.booking.flight.service.soap.impl;

import id.booking.flight.entity.Booking;
import id.booking.flight.entity.Invoice;
import id.booking.flight.entity.User;
import id.booking.flight.service.entity.InvoiceService;

public class InvoiceImpl implements InvoiceService {

	/* Create invoice baru
	 * */
	@Override
	public Invoice createInvoice(User customer, Booking booking) {
		Invoice inv = new Invoice(customer, booking);
		return inv;
	}

	@Override
	public boolean setInvoicePaid(Invoice invoice) {
		try {
			invoice.setPaid(true);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
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
	@Override
	public boolean sendInvoice(User customer, Invoice invoice) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Sending invoice " + invoice);
			System.out.println("to customer " + customer);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
