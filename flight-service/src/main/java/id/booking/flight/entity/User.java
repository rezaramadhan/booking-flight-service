package id.booking.flight.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import id.booking.flight.helper.MySQLAccess;

@Entity
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
    , @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id")
    , @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username")
    , @NamedQuery(name = "User.findByName", query = "SELECT u FROM User u WHERE u.name = :name")
    , @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password")
    , @NamedQuery(name = "User.findByToken", query = "SELECT u FROM User u WHERE u.token = :token")
    , @NamedQuery(name = "User.findByValidDate", query = "SELECT u FROM User u WHERE u.validDate = :validDate")})
public class User implements Serializable {
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
    @Column(name = "Username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "Password")
    private String password;
    @Size(max = 64)
    @Column(name = "token")
    private String token;
    @Column(name = "validDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validDate;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
        
        String dbName = "booking_domain";
        String query = "select * from users where id = " +id +"";
        Map<String, String> results;
		try {
			results = sqlAccessor.runSelectQuery(dbName, query).get(0);
	        System.out.println(results);
	        this.name = results.get("Name");
	        this.username = results.get("Username");
	        this.password = results.get("Password");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public User(String username, String name, String password) {
        this.username = username;
        this.name = name;
        this.password = password;
        
        String query = "insert into users (username, name, password) values('" + username + "', '" + name +
        		"', '" + password + "')";
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public Integer getId() {
    		if (id == null) {
			String query = "select Id from users where Username = '" + this.username + "' and "
			+ "Name = '" + this.name + "' and Password = '" + this.password + "'";
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        
        String query = "update users set Username = '" + username + "' where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        
        String query = "update users set Name = '" + name + "' where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        
        String query = "update users set Password = '" + password + "' where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
        
        String query = "update users set Token = '" + token + "' where Id = " + this.id;
        try {
			sqlAccessor.runQuery(dbName, query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
        
        String query = "update users set ValidDate = " + validDate + " where Id = " + this.id;
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id.booking.flight.entity.User[id=" + id + "]";
    }
    
}

