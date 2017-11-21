/**
 * FlightImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.service.soap.impl;

public interface FlightImplService extends javax.xml.rpc.Service {
    public java.lang.String getFlightImplAddress();

    public id.booking.flight.service.soap.impl.FlightImpl getFlightImpl() throws javax.xml.rpc.ServiceException;

    public id.booking.flight.service.soap.impl.FlightImpl getFlightImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
