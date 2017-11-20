package id.booking.flight.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import id.booking.flight.helper.MySQLAccess;

@Entity
@Table(name = "flight")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Flight.findAll", query = "SELECT f FROM Flight f")
    , @NamedQuery(name = "Flight.findById", query = "SELECT f FROM Flight f WHERE f.id = :id")
    , @NamedQuery(name = "Flight.findByQuota", query = "SELECT f FROM Flight f WHERE f.quota = :quota")
    , @NamedQuery(name = "Flight.findByCompany", query = "SELECT f FROM Flight f WHERE f.company = :company")
    , @NamedQuery(name = "Flight.findByPrice", query = "SELECT f FROM Flight f WHERE f.price = :price")
    , @NamedQuery(name = "Flight.findByQuality", query = "SELECT f FROM Flight f WHERE f.quality = :quality")
    , @NamedQuery(name = "Flight.findByBoardingTime", query = "SELECT f FROM Flight f WHERE f.boardingTime = :boardingTime")})
public class Flight implements Serializable {
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
    @Column(name = "Quota")
    private int quota;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "Company")
    private String company;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "Price")
    private double price;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "Quality")
    private String quality;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "BoardingTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date boardingTime;
    
    @JoinColumn(name = "DepartureId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Airport departureId;
    
    @JoinColumn(name = "DestinationId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Airport destinationId;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "flightId")
    private Collection<Booking> bookingCollection;

//    public Flight() {
//    }

//    public Flight(Integer id) {
//        this.id = id;
//    }

    public Flight(Integer id, int quota, String company, double price, String quality, Date boardingTime,
    		Airport departureId, Airport destinationId) {
        this.id = id;
        this.quota = quota;
        this.company = company;
        this.price = price;
        this.quality = quality;
        this.boardingTime = boardingTime;
        this.departureId = departureId;
        this.destinationId = destinationId;
        
        String query = "insert into flight values(" + id + ", " + quota + ", '" + company + "', " +
        		price + ", '" + quality + "', " + boardingTime + ", " + departureId.getId() + ", " +
        		destinationId.getId() + ")";
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public Integer getId() {
        return id;
    }

//    public void setId(Integer id) {
//        this.id = id;
//    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
        
        String query = "update flight set Quota = " + quota + " where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
        
        String query = "update flight set Company = '" + company + "' where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        
        String query = "update flight set Price = " + price + " where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
        
        String query = "update flight set Quality = '" + quality + "' where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public Date getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(Date boardingTime) {
        this.boardingTime = boardingTime;
        
        String query = "update flight set BoardingTime = " + boardingTime + " where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public Airport getDepartureId() {
        return departureId;
    }

    public void setDepartureId(Airport departureId) {
        this.departureId = departureId;
        
        String query = "update flight set DepartureId = " + departureId.getId() + " where Id = " +
        		this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public Airport getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Airport destinationId) {
        this.destinationId = destinationId;
        
        String query = "update flight set DestinationId = " + destinationId.getId() + " where Id = "
        		+ this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @XmlTransient
    public Collection<Booking> getBookingCollection() {
        return bookingCollection;
    }

    public void setBookingCollection(Collection<Booking> bookingCollection) {
        this.bookingCollection = bookingCollection;
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
        if (!(object instanceof Flight)) {
            return false;
        }
        Flight other = (Flight) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id.booking.flight.entity.Flight[id=" + id + "]";
    }
    
}


