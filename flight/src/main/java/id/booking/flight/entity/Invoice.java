/**
 * Invoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.entity;

public class Invoice  implements java.io.Serializable {
    private id.booking.flight.entity.Booking booking;

    private boolean paid;

    private id.booking.flight.entity.User user;

    public Invoice() {
    }

    public Invoice(
           id.booking.flight.entity.Booking booking,
           boolean paid,
           id.booking.flight.entity.User user) {
           this.booking = booking;
           this.paid = paid;
           this.user = user;
    }


    /**
     * Gets the booking value for this Invoice.
     * 
     * @return booking
     */
    public id.booking.flight.entity.Booking getBooking() {
        return booking;
    }


    /**
     * Sets the booking value for this Invoice.
     * 
     * @param booking
     */
    public void setBooking(id.booking.flight.entity.Booking booking) {
        this.booking = booking;
    }


    /**
     * Gets the paid value for this Invoice.
     * 
     * @return paid
     */
    public boolean isPaid() {
        return paid;
    }


    /**
     * Sets the paid value for this Invoice.
     * 
     * @param paid
     */
    public void setPaid(boolean paid) {
        this.paid = paid;
    }


    /**
     * Gets the user value for this Invoice.
     * 
     * @return user
     */
    public id.booking.flight.entity.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Invoice.
     * 
     * @param user
     */
    public void setUser(id.booking.flight.entity.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Invoice)) return false;
        Invoice other = (Invoice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.booking==null && other.getBooking()==null) || 
             (this.booking!=null &&
              this.booking.equals(other.getBooking()))) &&
            this.paid == other.isPaid() &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
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
        if (getBooking() != null) {
            _hashCode += getBooking().hashCode();
        }
        _hashCode += (isPaid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Invoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.flight.booking.id", "Invoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "booking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.flight.booking.id", "Booking"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "paid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "user"));
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
