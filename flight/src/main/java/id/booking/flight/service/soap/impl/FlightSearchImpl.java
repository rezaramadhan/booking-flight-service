/**
 * FlightSearchImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.service.soap.impl;

public interface FlightSearchImpl extends java.rmi.Remote {
    public id.booking.flight.entity.Flight[] findFlightByBoarding(java.util.Calendar boardingTimeMin, java.util.Calendar boardingTimeMax, id.booking.flight.entity.Airport departure, id.booking.flight.entity.Airport destination) throws java.rmi.RemoteException;
}
