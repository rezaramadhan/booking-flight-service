package id.booking.flight.entity;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;

import id.booking.flight.helper.MySQLAccess;

public class Invoice implements Serializable {
	private static final long serialVersionUID = -5577579081118070434L;
	
	private static final MySQLAccess sqlAccessor = new MySQLAccess();
    private static final String dbName = "booking_domain";
    
	int id;
	User user;
	Booking booking;
	boolean isPaid;

	public Invoice() {
		
	}
	
	public Invoice(int id) {
		this.id = id;
        String query = "select * from flight where id = " +id +"";
        Map<String, String> results;
		try {
			results = sqlAccessor.runSelectQuery(dbName, query).get(0);
	        System.out.println(results);
	        this.isPaid = Boolean.parseBoolean(results.get("isPaid"));
	        this.user = new User(Integer.parseInt(results.get("userId")));
	        this.booking = new Booking(Integer.parseInt(results.get("bookingId")));
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Invoice(User u, Booking b) {
		this.user = u;
		this.booking = b;
		
		String query = "insert into invoice (userId, bookingId, isPaid) values("+u.getId()+", " + b.getId()+ ", False)";
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User customer) {
		this.user = customer;
		
		String query = "update invoice set userId = " + this.user.getId() + " where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
		
		String query = "update invoice set userId = " + this.booking.getId() + " where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
		
		String query = "update invoice set isPaid = " + this.isPaid + " where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public void delete() {
   	 String query = "DELETE FROM invoice WHERE Id = '" + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
}
