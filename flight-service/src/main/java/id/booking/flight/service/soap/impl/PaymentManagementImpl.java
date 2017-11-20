package id.booking.flight.service.soap.impl;

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
		
		try {
			System.out.println("send invoice to user ");
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
