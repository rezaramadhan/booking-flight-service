package id.booking.flight.service.soap.impl;

import java.util.Date;

import id.booking.flight.entity.Airport;
import id.booking.flight.entity.Flight;
import id.booking.flight.service.entity.FlightService;

public class FlightImpl implements FlightService {

	@Override
	public Flight[] findAllFlight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight[] findPriceRange(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight[] findBoardingTimeRange(Date boardTimeMin, Date boardTimeMax) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight[] findByDepartureLocation(Airport loc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight[] findByDestinationLocation(Airport loc) {
		// TODO Auto-generated method stub
		return null;
	}

}
