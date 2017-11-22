package id.booking.flight.service.task;

import java.util.Date;

import id.booking.flight.entity.Airport;
import id.booking.flight.entity.Flight;

public interface FlightSearchService {
	public Flight[] findFlightByBoarding(Date boardingTimeMin, Date boardingTimeMax, Airport departure, Airport destination);
}
