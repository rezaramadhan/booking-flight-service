package id.booking.flight.service.soap.impl;

import java.util.Date;

import id.booking.flight.entity.Airport;
import id.booking.flight.entity.Flight;
import id.booking.flight.service.task.FlightSearchService;

public class FlightSearchImpl implements FlightSearchService {

	/* Find flight yang punya departure antara boarding time tertentu AND punya destination & departure tertentu
	 * */
	@Override
	public Flight[] findFlightByBoarding(Date boardingTimeMin, Date boardingTimeMax, Airport departure, Airport destination) {
		// TODO Auto-generated method stub
		return null;
	}

}