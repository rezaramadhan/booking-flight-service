/**
 * CheckFlightSeatImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.service.soap.impl;

public class CheckFlightSeatImplServiceLocator extends org.apache.axis.client.Service implements id.booking.flight.service.soap.impl.CheckFlightSeatImplService {

    public CheckFlightSeatImplServiceLocator() {
    }


    public CheckFlightSeatImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CheckFlightSeatImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CheckFlightSeatImpl
    private java.lang.String CheckFlightSeatImpl_address = "http://localhost:8081/WebServiceProject/services/CheckFlightSeatImpl";

    public java.lang.String getCheckFlightSeatImplAddress() {
        return CheckFlightSeatImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CheckFlightSeatImplWSDDServiceName = "CheckFlightSeatImpl";

    public java.lang.String getCheckFlightSeatImplWSDDServiceName() {
        return CheckFlightSeatImplWSDDServiceName;
    }

    public void setCheckFlightSeatImplWSDDServiceName(java.lang.String name) {
        CheckFlightSeatImplWSDDServiceName = name;
    }

    public id.booking.flight.service.soap.impl.CheckFlightSeatImpl getCheckFlightSeatImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CheckFlightSeatImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCheckFlightSeatImpl(endpoint);
    }

    public id.booking.flight.service.soap.impl.CheckFlightSeatImpl getCheckFlightSeatImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            id.booking.flight.service.soap.impl.CheckFlightSeatImplSoapBindingStub _stub = new id.booking.flight.service.soap.impl.CheckFlightSeatImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getCheckFlightSeatImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCheckFlightSeatImplEndpointAddress(java.lang.String address) {
        CheckFlightSeatImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (id.booking.flight.service.soap.impl.CheckFlightSeatImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                id.booking.flight.service.soap.impl.CheckFlightSeatImplSoapBindingStub _stub = new id.booking.flight.service.soap.impl.CheckFlightSeatImplSoapBindingStub(new java.net.URL(CheckFlightSeatImpl_address), this);
                _stub.setPortName(getCheckFlightSeatImplWSDDServiceName());
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
        if ("CheckFlightSeatImpl".equals(inputPortName)) {
            return getCheckFlightSeatImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.soap.service.flight.booking.id", "CheckFlightSeatImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.soap.service.flight.booking.id", "CheckFlightSeatImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CheckFlightSeatImpl".equals(portName)) {
            setCheckFlightSeatImplEndpointAddress(address);
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
