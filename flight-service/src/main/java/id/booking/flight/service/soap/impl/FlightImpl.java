package id.booking.flight.service.soap.impl;

import java.util.Date;

import id.booking.flight.entity.Airport;
import id.booking.flight.entity.Flight;
import id.booking.flight.service.entity.FlightService;

public class FlightImpl implements FlightService {

	@Override
	public Flight[] findAllFlight() {

		return null;
	}

	/* Find flight by id, return flight
	 * */
	@Override
	public Flight findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* Find flight by price range, contohnya harga antara 0.5jt - 1jt
	 * */
	@Override
	public Flight[] findPriceRange(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/* Find flight by boarding time, contohnya kayak antara 12Dec17 - 15Dec17
	 * */
	@Override
	public Flight[] findBoardingTimeRange(Date boardTimeMin, Date boardTimeMax) {
		// TODO Auto-generated method stub
		return null;
	}

	/* Find flight by departure location, contohnya departure di airport Soetta
	 * */
	@Override
	public Flight[] findByDepartureLocation(Airport loc) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* Find flight by departure location, contohnya destination ke airport Soetta
	 * */
	@Override
	public Flight[] findByDestinationLocation(Airport loc) {
		// TODO Auto-generated method stub
		return null;
	}

}
