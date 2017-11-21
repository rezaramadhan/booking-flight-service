package id.booking.flight.service.soap.impl;

public class PaymentManagementImplProxy implements id.booking.flight.service.soap.impl.PaymentManagementImpl {
  private String _endpoint = null;
  private id.booking.flight.service.soap.impl.PaymentManagementImpl paymentManagementImpl = null;
  
  public PaymentManagementImplProxy() {
    _initPaymentManagementImplProxy();
  }
  
  public PaymentManagementImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initPaymentManagementImplProxy();
  }
  
  private void _initPaymentManagementImplProxy() {
    try {
      paymentManagementImpl = (new id.booking.flight.service.soap.impl.PaymentManagementImplServiceLocator()).getPaymentManagementImpl();
      if (paymentManagementImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)paymentManagementImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)paymentManagementImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (paymentManagementImpl != null)
      ((javax.xml.rpc.Stub)paymentManagementImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public id.booking.flight.service.soap.impl.PaymentManagementImpl getPaymentManagementImpl() {
    if (paymentManagementImpl == null)
      _initPaymentManagementImplProxy();
    return paymentManagementImpl;
  }
  
  public boolean createPaymentRequest(id.booking.flight.entity.Invoice invoice) throws java.rmi.RemoteException{
    if (paymentManagementImpl == null)
      _initPaymentManagementImplProxy();
    return paymentManagementImpl.createPaymentRequest(invoice);
  }
  
  public boolean receivePaymentData(id.booking.flight.entity.Invoice invoice) throws java.rmi.RemoteException{
    if (paymentManagementImpl == null)
      _initPaymentManagementImplProxy();
    return paymentManagementImpl.receivePaymentData(invoice);
  }
  
  
}