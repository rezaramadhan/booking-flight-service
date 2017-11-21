/**
 * Booking.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.entity;

public class Booking  implements java.io.Serializable {
    private id.booking.flight.entity.Flight flightId;

    private java.lang.Integer id;

    private java.lang.String passengerName;

    private java.lang.String status;

    private id.booking.flight.entity.User userId;

    public Booking() {
    }

    public Booking(
           id.booking.flight.entity.Flight flightId,
           java.lang.Integer id,
           java.lang.String passengerName,
           java.lang.String status,
           id.booking.flight.entity.User userId) {
           this.flightId = flightId;
           this.id = id;
           this.passengerName = passengerName;
           this.status = status;
           this.userId = userId;
    }


    /**
     * Gets the flightId value for this Booking.
     * 
     * @return flightId
     */
    public id.booking.flight.entity.Flight getFlightId() {
        return flightId;
    }


    /**
     * Sets the flightId value for this Booking.
     * 
     * @param flightId
     */
    public void setFlightId(id.booking.flight.entity.Flight flightId) {
        this.flightId = flightId;
    }


    /**
     * Gets the id value for this Booking.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Booking.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the passengerName value for this Booking.
     * 
     * @return passengerName
     */
    public java.lang.String getPassengerName() {
        return passengerName;
    }


    /**
     * Sets the passengerName value for this Booking.
     * 
     * @param passengerName
     */
    public void setPassengerName(java.lang.String passengerName) {
        this.passengerName = passengerName;
    }


    /**
     * Gets the status value for this Booking.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Booking.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the userId value for this Booking.
     * 
     * @return userId
     */
    public id.booking.flight.entity.User getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this Booking.
     * 
     * @param userId
     */
    public void setUserId(id.booking.flight.entity.User userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Booking)) return false;
        Booking other = (Booking) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flightId==null && other.getFlightId()==null) || 
             (this.flightId!=null &&
              this.flightId.equals(other.getFlightId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.passengerName==null && other.getPassengerName()==null) || 
             (this.passengerName!=null &&
              this.passengerName.equals(other.getPassengerName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFlightId() != null) {
            _hashCode += getFlightId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPassengerName() != null) {
            _hashCode += getPassengerName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Booking.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.flight.booking.id", "Booking"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "flightId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.flight.booking.id", "Flight"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "passengerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.flight.booking.id", "User"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
