package id.booking.flight.service.entity;

import id.booking.flight.entity.Booking;
import id.booking.flight.entity.Receipt;
import id.booking.flight.entity.User;

public interface InvoiceService {
	public Receipt createInvoice(User customer, Booking booking);
	public boolean setInvoicePaid(Receipt invoice);
	public boolean deleteInvoice(Receipt invoice);
    public boolean sendInvoice(User customer, Receipt invoice);
}
