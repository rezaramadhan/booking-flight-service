/**
 * FlightImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.service.soap.impl;

public interface FlightImpl extends java.rmi.Remote {
    public id.booking.flight.entity.Flight[] findBoardingTimeRange(java.util.Calendar boardTimeMin, java.util.Calendar boardTimeMax) throws java.rmi.RemoteException;
    public id.booking.flight.entity.Flight[] findByDepartureLocation(id.booking.flight.entity.Airport loc) throws java.rmi.RemoteException;
    public id.booking.flight.entity.Flight[] findByDestinationLocation(id.booking.flight.entity.Airport loc) throws java.rmi.RemoteException;
    public id.booking.flight.entity.Flight[] findAllFlight() throws java.rmi.RemoteException;
    public id.booking.flight.entity.Flight findById(int id) throws java.rmi.RemoteException;
    public id.booking.flight.entity.Flight[] findPriceRange(int min, int max) throws java.rmi.RemoteException;
}
