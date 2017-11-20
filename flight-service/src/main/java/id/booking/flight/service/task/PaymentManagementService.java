package id.booking.flight.service.task;

import id.booking.flight.entity.Receipt;

public interface PaymentManagementService {
	//set invoice jadi sudah dibayar
	public boolean receivePaymentData(Receipt invoice);
	
	//manggil service luar, simulasiin dulu aja
	public boolean createPaymentRequest(Receipt invoice);
}
