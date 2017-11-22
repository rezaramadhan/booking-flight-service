package id.booking.flight.service.task;

import id.booking.flight.entity.Invoice;

public interface PaymentManagementService {
	//set invoice jadi sudah dibayar
	public boolean receivePaymentData(Invoice invoice);
	
	//manggil service luar, simulasiin dulu aja
	public boolean createPaymentRequest(Invoice invoice);
}
