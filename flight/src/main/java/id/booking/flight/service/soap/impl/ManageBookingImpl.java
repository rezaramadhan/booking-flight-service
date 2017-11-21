/**
 * ManageBookingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.service.soap.impl;

public interface ManageBookingImpl extends java.rmi.Remote {
    public boolean deleteBookingAndInvoice(id.booking.flight.entity.Booking booking, id.booking.flight.entity.Invoice invoice) throws java.rmi.RemoteException;
    public boolean createBookingAndInvoice(id.booking.flight.entity.User customer, id.booking.flight.entity.Flight flight, java.lang.String passengerName) throws java.rmi.RemoteException;
}
