package id.booking.flight.service.soap.impl;

import id.booking.flight.entity.Booking;
import id.booking.flight.entity.Invoice;
import id.booking.flight.service.task.PaymentManagementService;
import id.booking.flight.service.soap.impl.InvoiceImpl;

public class PaymentManagementImpl implements PaymentManagementService {

	/* Set ispaid di invoice jadi true, abis itu kirim invoice ke user
	 * */
	@Override
	public boolean receivePaymentData(Invoice invoice) {
		// TODO Auto-generated method stub\
		InvoiceImpl invoice_impl = new InvoiceImpl();
		if (!invoice_impl.setInvoicePaid(invoice)) {
			return false;
		}

		Booking b = invoice.getBooking();
		System.out.println("BOOKING: " + b.getId() + " " + b.getPassengerName());
		BookingImpl impl = new BookingImpl();
		if(!impl.changeBookingStatus(b, "paid")) {
			return false;
		}
		
		try {
			invoice_impl.sendInvoice(invoice.getUser(), invoice);
		} catch (Exception e) {
			invoice.setPaid(false);
			return false;
		}
		return true;
	}

	/* Tulis di log kalo manggil service orang buat minta request pembayaran
	 * */
	@Override
	public boolean createPaymentRequest(Invoice invoice) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Call service to createPaymentRequest " + invoice);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
