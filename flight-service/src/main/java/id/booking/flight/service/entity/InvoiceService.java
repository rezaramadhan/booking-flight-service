package id.booking.flight.service.entity;

import id.booking.flight.entity.Booking;
import id.booking.flight.entity.Invoice;
import id.booking.flight.entity.User;

public interface InvoiceService {
	public Invoice createInvoice(User customer, Booking booking);
	public boolean setInvoicePaid(Invoice invoice);
	public boolean deleteInvoice(Invoice invoice);
    public boolean sendInvoice(User customer, Invoice invoice);
}
