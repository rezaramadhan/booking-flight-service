/**
 * Flight.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.entity;

public class Flight  implements java.io.Serializable {
    private java.util.Calendar boardingTime;

    private java.lang.String company;

    private id.booking.flight.entity.Airport departureId;

    private id.booking.flight.entity.Airport destinationId;

    private java.lang.Integer id;

    private double price;

    private java.lang.String quality;

    private int quota;

    public Flight() {
    }

    public Flight(
           java.util.Calendar boardingTime,
           java.lang.String company,
           id.booking.flight.entity.Airport departureId,
           id.booking.flight.entity.Airport destinationId,
           java.lang.Integer id,
           double price,
           java.lang.String quality,
           int quota) {
           this.boardingTime = boardingTime;
           this.company = company;
           this.departureId = departureId;
           this.destinationId = destinationId;
           this.id = id;
           this.price = price;
           this.quality = quality;
           this.quota = quota;
    }


    /**
     * Gets the boardingTime value for this Flight.
     * 
     * @return boardingTime
     */
    public java.util.Calendar getBoardingTime() {
        return boardingTime;
    }


    /**
     * Sets the boardingTime value for this Flight.
     * 
     * @param boardingTime
     */
    public void setBoardingTime(java.util.Calendar boardingTime) {
        this.boardingTime = boardingTime;
    }


    /**
     * Gets the company value for this Flight.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this Flight.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the departureId value for this Flight.
     * 
     * @return departureId
     */
    public id.booking.flight.entity.Airport getDepartureId() {
        return departureId;
    }


    /**
     * Sets the departureId value for this Flight.
     * 
     * @param departureId
     */
    public void setDepartureId(id.booking.flight.entity.Airport departureId) {
        this.departureId = departureId;
    }


    /**
     * Gets the destinationId value for this Flight.
     * 
     * @return destinationId
     */
    public id.booking.flight.entity.Airport getDestinationId() {
        return destinationId;
    }


    /**
     * Sets the destinationId value for this Flight.
     * 
     * @param destinationId
     */
    public void setDestinationId(id.booking.flight.entity.Airport destinationId) {
        this.destinationId = destinationId;
    }


    /**
     * Gets the id value for this Flight.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Flight.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the price value for this Flight.
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Flight.
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Gets the quality value for this Flight.
     * 
     * @return quality
     */
    public java.lang.String getQuality() {
        return quality;
    }


    /**
     * Sets the quality value for this Flight.
     * 
     * @param quality
     */
    public void setQuality(java.lang.String quality) {
        this.quality = quality;
    }


    /**
     * Gets the quota value for this Flight.
     * 
     * @return quota
     */
    public int getQuota() {
        return quota;
    }


    /**
     * Sets the quota value for this Flight.
     * 
     * @param quota
     */
    public void setQuota(int quota) {
        this.quota = quota;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Flight)) return false;
        Flight other = (Flight) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.boardingTime==null && other.getBoardingTime()==null) || 
             (this.boardingTime!=null &&
              this.boardingTime.equals(other.getBoardingTime()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.departureId==null && other.getDepartureId()==null) || 
             (this.departureId!=null &&
              this.departureId.equals(other.getDepartureId()))) &&
            ((this.destinationId==null && other.getDestinationId()==null) || 
             (this.destinationId!=null &&
              this.destinationId.equals(other.getDestinationId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.price == other.getPrice() &&
            ((this.quality==null && other.getQuality()==null) || 
             (this.quality!=null &&
              this.quality.equals(other.getQuality()))) &&
            this.quota == other.getQuota();
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
        if (getBoardingTime() != null) {
            _hashCode += getBoardingTime().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getDepartureId() != null) {
            _hashCode += getDepartureId().hashCode();
        }
        if (getDestinationId() != null) {
            _hashCode += getDestinationId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += new Double(getPrice()).hashCode();
        if (getQuality() != null) {
            _hashCode += getQuality().hashCode();
        }
        _hashCode += getQuota();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Flight.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.flight.booking.id", "Flight"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boardingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "boardingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "departureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.flight.booking.id", "Airport"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "destinationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.flight.booking.id", "Airport"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "quality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.flight.booking.id", "quota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
