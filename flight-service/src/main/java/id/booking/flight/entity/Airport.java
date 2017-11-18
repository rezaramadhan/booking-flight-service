package id.booking.flight.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import id.booking.flight.helper.MySQLAccess;

@Entity
@Table(name = "airports")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Airport.findAll", query = "SELECT a FROM Airport a")
    , @NamedQuery(name = "Airport.findById", query = "SELECT a FROM Airport a WHERE a.id = :id")
    , @NamedQuery(name = "Airport.findByName", query = "SELECT a FROM Airport a WHERE a.name = :name")})
public class Airport implements Serializable {
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
    @Size(min = 1, max = 64)
    @Column(name = "Name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departureId")
    private Collection<Flight> flightsByDeparture;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "destinationId")
    private Collection<Flight> flightsByDestination;
    @JoinColumn(name = "LocationId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Location locationId;

//    public Airport() {
//    	
//    }

//    public Airport(Integer id) {
//        this.id = id;
//    }

    public Airport(String name, Location locationId) {
        this.name = name;
        this.locationId = locationId;
        
        String query = "insert into airports(Name, LocationId) values('" + name +
        		"', " + locationId.getId() + ")";
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public Integer getId() {
	    	if (id == null) {
			String query = "select Id from airports where Name = '" + this.name + "' and "
			+ "LocationId = " + this.locationId.getId();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        
        String query = "update airports set Name = '" + name + "' where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @XmlTransient
    public Collection<Flight> getFlightsByDeparture() {
        return flightsByDeparture;
    }

    public void setFlightsByDeparture(Collection<Flight> flightsByDeparture) {
        this.flightsByDeparture = flightsByDeparture;
    }

    @XmlTransient
    public Collection<Flight> getFlightsByDestination() {
        return flightsByDestination;
    }

    public void setFlightsByDestination(Collection<Flight> flightsByDestination) {
        this.flightsByDestination = flightsByDestination;
    }

    public Location getLocationId() {
        return locationId;
    }

    public void setLocationId(Location locationId) {
        this.locationId = locationId;
        
        String query = "update airports set LocationId = " + locationId.getId() + " where Id = " + this.id;
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
        if (!(object instanceof Airport)) {
            return false;
        }
        Airport other = (Airport) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id.booking.flight.entity.Airport[id=" + id + "]";
    }
    
}

