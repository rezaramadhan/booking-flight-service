/**
 * ManageBookingImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.service.soap.impl;

public class ManageBookingImplServiceLocator extends org.apache.axis.client.Service implements id.booking.flight.service.soap.impl.ManageBookingImplService {

    public ManageBookingImplServiceLocator() {
    }


    public ManageBookingImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManageBookingImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManageBookingImpl
    private java.lang.String ManageBookingImpl_address = "http://localhost:8081/WebServiceProject/services/ManageBookingImpl";

    public java.lang.String getManageBookingImplAddress() {
        return ManageBookingImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManageBookingImplWSDDServiceName = "ManageBookingImpl";

    public java.lang.String getManageBookingImplWSDDServiceName() {
        return ManageBookingImplWSDDServiceName;
    }

    public void setManageBookingImplWSDDServiceName(java.lang.String name) {
        ManageBookingImplWSDDServiceName = name;
    }

    public id.booking.flight.service.soap.impl.ManageBookingImpl getManageBookingImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManageBookingImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManageBookingImpl(endpoint);
    }

    public id.booking.flight.service.soap.impl.ManageBookingImpl getManageBookingImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            id.booking.flight.service.soap.impl.ManageBookingImplSoapBindingStub _stub = new id.booking.flight.service.soap.impl.ManageBookingImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getManageBookingImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManageBookingImplEndpointAddress(java.lang.String address) {
        ManageBookingImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (id.booking.flight.service.soap.impl.ManageBookingImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                id.booking.flight.service.soap.impl.ManageBookingImplSoapBindingStub _stub = new id.booking.flight.service.soap.impl.ManageBookingImplSoapBindingStub(new java.net.URL(ManageBookingImpl_address), this);
                _stub.setPortName(getManageBookingImplWSDDServiceName());
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
        if ("ManageBookingImpl".equals(inputPortName)) {
            return getManageBookingImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.soap.service.flight.booking.id", "ManageBookingImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.soap.service.flight.booking.id", "ManageBookingImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManageBookingImpl".equals(portName)) {
            setManageBookingImplEndpointAddress(address);
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
