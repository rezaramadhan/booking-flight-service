/**
 * InvoiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.service.soap.impl;

public class InvoiceImplServiceLocator extends org.apache.axis.client.Service implements id.booking.flight.service.soap.impl.InvoiceImplService {

    public InvoiceImplServiceLocator() {
    }


    public InvoiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InvoiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InvoiceImpl
    private java.lang.String InvoiceImpl_address = "http://localhost:8081/WebServiceProject/services/InvoiceImpl";

    public java.lang.String getInvoiceImplAddress() {
        return InvoiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InvoiceImplWSDDServiceName = "InvoiceImpl";

    public java.lang.String getInvoiceImplWSDDServiceName() {
        return InvoiceImplWSDDServiceName;
    }

    public void setInvoiceImplWSDDServiceName(java.lang.String name) {
        InvoiceImplWSDDServiceName = name;
    }

    public id.booking.flight.service.soap.impl.InvoiceImpl getInvoiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InvoiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInvoiceImpl(endpoint);
    }

    public id.booking.flight.service.soap.impl.InvoiceImpl getInvoiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            id.booking.flight.service.soap.impl.InvoiceImplSoapBindingStub _stub = new id.booking.flight.service.soap.impl.InvoiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getInvoiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInvoiceImplEndpointAddress(java.lang.String address) {
        InvoiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (id.booking.flight.service.soap.impl.InvoiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                id.booking.flight.service.soap.impl.InvoiceImplSoapBindingStub _stub = new id.booking.flight.service.soap.impl.InvoiceImplSoapBindingStub(new java.net.URL(InvoiceImpl_address), this);
                _stub.setPortName(getInvoiceImplWSDDServiceName());
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
        if ("InvoiceImpl".equals(inputPortName)) {
            return getInvoiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.soap.service.flight.booking.id", "InvoiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.soap.service.flight.booking.id", "InvoiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InvoiceImpl".equals(portName)) {
            setInvoiceImplEndpointAddress(address);
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
