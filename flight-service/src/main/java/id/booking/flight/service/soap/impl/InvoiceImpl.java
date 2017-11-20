package id.booking.flight.service.soap.impl;

import id.booking.flight.entity.Booking;
import id.booking.flight.entity.Receipt;
import id.booking.flight.entity.User;
import id.booking.flight.service.entity.InvoiceService;

public class InvoiceImpl implements InvoiceService {

	@Override
	public Receipt createInvoice(User customer, Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setInvoicePaid(Receipt invoice) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteInvoice(Receipt invoice) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendInvoice(User customer, Receipt invoice) {
		// TODO Auto-generated method stub
		return false;
	}

}
