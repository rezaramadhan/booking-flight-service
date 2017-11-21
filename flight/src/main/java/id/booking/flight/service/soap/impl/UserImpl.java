/**
 * UserImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.service.soap.impl;

public interface UserImpl extends java.rmi.Remote {
    public id.booking.flight.entity.User createNewUser(java.lang.String fullName, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public boolean modifyUserData(id.booking.flight.entity.User user, java.lang.String password, java.lang.String fullName) throws java.rmi.RemoteException;
}
