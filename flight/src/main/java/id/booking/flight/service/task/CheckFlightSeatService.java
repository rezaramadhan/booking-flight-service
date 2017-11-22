package id.booking.flight.service.task;

import id.booking.flight.entity.Flight;

public interface CheckFlightSeatService {
	//return jumlah seat yang kosong pada flight ini
		public int checkSeat(Flight flight);
}
