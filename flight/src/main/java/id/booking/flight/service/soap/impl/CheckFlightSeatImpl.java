package id.booking.flight.service.soap.impl;

import id.booking.flight.entity.Flight;
import id.booking.flight.service.task.CheckFlightSeatService;

public class CheckFlightSeatImpl implements CheckFlightSeatService {

	@Override
	public int checkSeat(Flight flight) {
		return flight.getQuota();
	}

}
