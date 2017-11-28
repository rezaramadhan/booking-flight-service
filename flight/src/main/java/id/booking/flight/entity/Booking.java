package id.booking.flight.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import id.booking.flight.helper.MySQLAccess;

@Entity
@Table(name = "bookings")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Booking.findAll", query = "SELECT b FROM Booking b")
    , @NamedQuery(name = "Booking.findById", query = "SELECT b FROM Booking b WHERE b.Id = :Id")
    , @NamedQuery(name = "Booking.findByStatus", query = "SELECT b FROM Booking b WHERE b.Status = :Status")
    , @NamedQuery(name = "Booking.findByPassengerName", query = "SELECT b FROM Booking b WHERE b.PassengerName = :PassengerName")})
public class Booking implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final MySQLAccess sqlAccessor = new MySQLAccess();
    private static final String dbName = "booking_domain";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "Status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "PassengerName")
    private String passengerName;
    @JoinColumn(name = "FlightId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Flight flightId;
    @JoinColumn(name = "UserId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private User userId;

    public Booking() {
    	
    }

    public Booking(Integer id) {
        this.id = id;
        String query = "select * from bookings where id = " +id +"";
        Map<String, String> results;
		try {
			results = sqlAccessor.runSelectQuery(dbName, query).get(0);
	        System.out.println(results);
	        this.passengerName = results.get("PassengerName");
	        this.flightId = new Flight(Integer.parseInt(results.get("FlightId")));
	        this.userId = new User(Integer.parseInt(results.get("UserId")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public Booking(String status, String passengerName, Flight flightId, User userId) {
        this.status = status;
        this.passengerName = passengerName;
        this.flightId = flightId;
        this.userId = userId;
        
        String query = "insert into bookings values(default, '" + status + "', '" + passengerName +
        		"', " + flightId.getId() + ", " + userId.getId() + ")";
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public Integer getId() {
    		if (id == null) {
    			String query = "select Id from bookings where Status = '" + this.status + "' and "
				+ "PassengerName = '" + this.passengerName + "' and FlightId = " + this.flightId.getId()
				+ " and UserId = " + this.userId.getId();
    			try {
				ArrayList<Map<String, String>> result = sqlAccessor.runSelectQuery(dbName, query);
				id = Integer.parseInt(result.get(0).get("Id"));
				return id;
    			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return -1;
			}
    		} else {
    			return id;
    		}
	}

//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        
        String query = "update bookings set Status = '" + status + "' where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
        
        String query = "update bookings set PassengerName = '" + passengerName + "' where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public Flight getFlightId() {
        return flightId;
    }

    public void setFlightId(Flight flightId) {
        this.flightId = flightId;
        
        String query = "update bookings set FlightId = " + flightId.getId() + " where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
        
        String query = "update bookings set UserId = " + userId.getId() + " where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id.booking.flight.entity.Booking[id=" + id + "]";
    }
    
    public void deleteBooking() {
    	 String query = "DELETE FROM bookings WHERE Id = " + this.id;
         try {
 			sqlAccessor.runQuery(dbName, query);
 		} catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    }
    
}

