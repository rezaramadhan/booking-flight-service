package id.booking.flight.entity;

import java.sql.Time;

import org.joda.time.DateTime;

public class Flight {
	private String code;
	private String flightClass;
	private String origin;
	private String destination;
	private DateTime departTime;
	private Time duration;
	private int price;
	
	public Flight() {
		code = "";
		flightClass = "";
		origin = "";
		destination = "";
		departTime = new DateTime();
		duration = new Time(0, 0, 0);
		price = 0;
	}
}
