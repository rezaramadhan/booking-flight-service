/**
 * PaymentManagementImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.service.soap.impl;

public interface PaymentManagementImpl extends java.rmi.Remote {
    public boolean createPaymentRequest(id.booking.flight.entity.Invoice invoice) throws java.rmi.RemoteException;
    public boolean receivePaymentData(id.booking.flight.entity.Invoice invoice) throws java.rmi.RemoteException;
}
