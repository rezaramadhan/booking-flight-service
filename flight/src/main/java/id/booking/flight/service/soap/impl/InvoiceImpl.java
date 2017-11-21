/**
 * InvoiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.service.soap.impl;

public interface InvoiceImpl extends java.rmi.Remote {
    public boolean sendInvoice(id.booking.flight.entity.User customer, id.booking.flight.entity.Invoice invoice) throws java.rmi.RemoteException;
    public boolean setInvoicePaid(id.booking.flight.entity.Invoice invoice) throws java.rmi.RemoteException;
    public boolean deleteInvoice(id.booking.flight.entity.Invoice invoice) throws java.rmi.RemoteException;
    public id.booking.flight.entity.Invoice createInvoice(id.booking.flight.entity.User customer, id.booking.flight.entity.Booking booking) throws java.rmi.RemoteException;
}
