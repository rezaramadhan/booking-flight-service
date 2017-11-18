package id.booking.flight.entity;

public class Booking {
	private int user_id;
	private String code;
	private int status; 

	public Booking(int user_id, String code, int status) {
		this.user_id = user_id;
		this.code = code;
		this.status = status;
	}
}
