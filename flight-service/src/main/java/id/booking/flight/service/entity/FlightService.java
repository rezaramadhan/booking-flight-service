package id.booking.flight.service.entity;

import java.util.Date;

import id.booking.flight.entity.Airport;
import id.booking.flight.entity.Flight;

public interface FlightService {
    public Flight[] findAllFlight();
    public Flight findById(int id);
    public Flight[] findPriceRange(int min, int max);
    public Flight[] findBoardingTimeRange(Date boardTimeMin, Date boardTimeMax);
    public Flight[] findByDepartureLocation(Airport loc);
    public Flight[] findByDestinationLocation(Airport loc);
}
