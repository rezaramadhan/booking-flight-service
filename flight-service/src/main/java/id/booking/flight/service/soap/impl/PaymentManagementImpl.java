package id.booking.flight.service.soap.impl;

import id.booking.flight.entity.Invoice;
import id.booking.flight.service.task.PaymentManagementService;

public class PaymentManagementImpl implements PaymentManagementService {

	/* Set ispaid di invoice jadi true, abis itu kirim invoice ke user
	 * */
	@Override
	public boolean receivePaymentData(Invoice invoice) {
		// TODO Auto-generated method stub
		return false;
	}

	/* Tulis di log kalo manggil service orang buat minta request pembayaran
	 * */
	@Override
	public boolean createPaymentRequest(Invoice invoice) {
		// TODO Auto-generated method stub
		return false;
	}

}
