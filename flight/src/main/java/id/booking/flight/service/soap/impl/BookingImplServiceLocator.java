/**
 * BookingImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.service.soap.impl;

public class BookingImplServiceLocator extends org.apache.axis.client.Service implements id.booking.flight.service.soap.impl.BookingImplService {

    public BookingImplServiceLocator() {
    }


    public BookingImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BookingImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BookingImpl
    private java.lang.String BookingImpl_address = "http://localhost:8081/WebServiceProject/services/BookingImpl";

    public java.lang.String getBookingImplAddress() {
        return BookingImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BookingImplWSDDServiceName = "BookingImpl";

    public java.lang.String getBookingImplWSDDServiceName() {
        return BookingImplWSDDServiceName;
    }

    public void setBookingImplWSDDServiceName(java.lang.String name) {
        BookingImplWSDDServiceName = name;
    }

    public id.booking.flight.service.soap.impl.BookingImpl getBookingImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BookingImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBookingImpl(endpoint);
    }

    public id.booking.flight.service.soap.impl.BookingImpl getBookingImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            id.booking.flight.service.soap.impl.BookingImplSoapBindingStub _stub = new id.booking.flight.service.soap.impl.BookingImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getBookingImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBookingImplEndpointAddress(java.lang.String address) {
        BookingImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (id.booking.flight.service.soap.impl.BookingImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                id.booking.flight.service.soap.impl.BookingImplSoapBindingStub _stub = new id.booking.flight.service.soap.impl.BookingImplSoapBindingStub(new java.net.URL(BookingImpl_address), this);
                _stub.setPortName(getBookingImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BookingImpl".equals(inputPortName)) {
            return getBookingImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.soap.service.flight.booking.id", "BookingImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.soap.service.flight.booking.id", "BookingImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BookingImpl".equals(portName)) {
            setBookingImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
