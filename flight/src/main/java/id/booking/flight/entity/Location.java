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
@Table(name = "locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Location.findAll", query = "SELECT l FROM Location l")
    , @NamedQuery(name = "Location.findById", query = "SELECT l FROM Location l WHERE l.id = :id")
    , @NamedQuery(name = "Location.findByProvince", query = "SELECT l FROM Location l WHERE l.province = :province")
    , @NamedQuery(name = "Location.findByTown", query = "SELECT l FROM Location l WHERE l.town = :town")})
public class Location implements Serializable {
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
    @Column(name = "Province")
    private String province;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "Town")
    private String town;

    public Location() {
    	
    }

    public Location(Integer id) {
        this.id = id;

        String query = "select * from locations where id = " +id +"";
        Map<String, String> results;
		try {
			results = sqlAccessor.runSelectQuery(dbName, query).get(0);
	        System.out.println(results);
	        this.province = results.get("Province");
	        this.town = results.get("Town");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public Location(String province, String town) {
        this.province = province;
        this.town = town;
        
        String query = "insert into locations values(default, '" + province + "', '" + town + "')";
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public Integer getId() {
    		if (id == null) {
			String query = "select Id from locations where Province = '" + this.province + "' and "
			+ "Town = '" + this.town + "'";
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
        
        String query = "update locations set Province = '" + province + "' where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
        
        String query = "update locations set Town = '" + town + "' where Id = " + this.id;
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
        if (!(object instanceof Location)) {
            return false;
        }
        Location other = (Location) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id.booking.flight.entity.Location[id=" + id + "]";
    }
    
    public void setTownOnly(String town) {
    		this.town = town;
    }
    
    public void setProvinceOnly(String province) {
    		this.province = province;
    }
    
    public void setIdOnly(int id) {
    		this.id = id;
    }
}

