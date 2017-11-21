/**
 * BookingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.service.soap.impl;

public interface BookingImpl extends java.rmi.Remote {
    public id.booking.flight.entity.Booking createBooking(id.booking.flight.entity.User user, id.booking.flight.entity.Flight flight, java.lang.String passengerName) throws java.rmi.RemoteException;
    public boolean cancelBooking(id.booking.flight.entity.Booking booking) throws java.rmi.RemoteException;
    public id.booking.flight.entity.Booking modifyBooking(id.booking.flight.entity.Booking booking, id.booking.flight.entity.Flight flight, java.lang.String passengerName) throws java.rmi.RemoteException;
}
