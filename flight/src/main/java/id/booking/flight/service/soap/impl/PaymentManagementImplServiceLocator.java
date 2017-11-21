/**
 * PaymentManagementImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package id.booking.flight.service.soap.impl;

public class PaymentManagementImplServiceLocator extends org.apache.axis.client.Service implements id.booking.flight.service.soap.impl.PaymentManagementImplService {

    public PaymentManagementImplServiceLocator() {
    }


    public PaymentManagementImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PaymentManagementImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PaymentManagementImpl
    private java.lang.String PaymentManagementImpl_address = "http://localhost:8081/WebServiceProject/services/PaymentManagementImpl";

    public java.lang.String getPaymentManagementImplAddress() {
        return PaymentManagementImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PaymentManagementImplWSDDServiceName = "PaymentManagementImpl";

    public java.lang.String getPaymentManagementImplWSDDServiceName() {
        return PaymentManagementImplWSDDServiceName;
    }

    public void setPaymentManagementImplWSDDServiceName(java.lang.String name) {
        PaymentManagementImplWSDDServiceName = name;
    }

    public id.booking.flight.service.soap.impl.PaymentManagementImpl getPaymentManagementImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PaymentManagementImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPaymentManagementImpl(endpoint);
    }

    public id.booking.flight.service.soap.impl.PaymentManagementImpl getPaymentManagementImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            id.booking.flight.service.soap.impl.PaymentManagementImplSoapBindingStub _stub = new id.booking.flight.service.soap.impl.PaymentManagementImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getPaymentManagementImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPaymentManagementImplEndpointAddress(java.lang.String address) {
        PaymentManagementImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (id.booking.flight.service.soap.impl.PaymentManagementImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                id.booking.flight.service.soap.impl.PaymentManagementImplSoapBindingStub _stub = new id.booking.flight.service.soap.impl.PaymentManagementImplSoapBindingStub(new java.net.URL(PaymentManagementImpl_address), this);
                _stub.setPortName(getPaymentManagementImplWSDDServiceName());
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
        if ("PaymentManagementImpl".equals(inputPortName)) {
            return getPaymentManagementImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.soap.service.flight.booking.id", "PaymentManagementImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.soap.service.flight.booking.id", "PaymentManagementImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PaymentManagementImpl".equals(portName)) {
            setPaymentManagementImplEndpointAddress(address);
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
