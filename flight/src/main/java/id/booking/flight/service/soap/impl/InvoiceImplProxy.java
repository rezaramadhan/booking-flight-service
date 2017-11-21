package id.booking.flight.service.soap.impl;

public class InvoiceImplProxy implements id.booking.flight.service.soap.impl.InvoiceImpl {
  private String _endpoint = null;
  private id.booking.flight.service.soap.impl.InvoiceImpl invoiceImpl = null;
  
  public InvoiceImplProxy() {
    _initInvoiceImplProxy();
  }
  
  public InvoiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initInvoiceImplProxy();
  }
  
  private void _initInvoiceImplProxy() {
    try {
      invoiceImpl = (new id.booking.flight.service.soap.impl.InvoiceImplServiceLocator()).getInvoiceImpl();
      if (invoiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)invoiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)invoiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (invoiceImpl != null)
      ((javax.xml.rpc.Stub)invoiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public id.booking.flight.service.soap.impl.InvoiceImpl getInvoiceImpl() {
    if (invoiceImpl == null)
      _initInvoiceImplProxy();
    return invoiceImpl;
  }
  
  public boolean sendInvoice(id.booking.flight.entity.User customer, id.booking.flight.entity.Invoice invoice) throws java.rmi.RemoteException{
    if (invoiceImpl == null)
      _initInvoiceImplProxy();
    return invoiceImpl.sendInvoice(customer, invoice);
  }
  
  public boolean setInvoicePaid(id.booking.flight.entity.Invoice invoice) throws java.rmi.RemoteException{
    if (invoiceImpl == null)
      _initInvoiceImplProxy();
    return invoiceImpl.setInvoicePaid(invoice);
  }
  
  public boolean deleteInvoice(id.booking.flight.entity.Invoice invoice) throws java.rmi.RemoteException{
    if (invoiceImpl == null)
      _initInvoiceImplProxy();
    return invoiceImpl.deleteInvoice(invoice);
  }
  
  public id.booking.flight.entity.Invoice createInvoice(id.booking.flight.entity.User customer, id.booking.flight.entity.Booking booking) throws java.rmi.RemoteException{
    if (invoiceImpl == null)
      _initInvoiceImplProxy();
    return invoiceImpl.createInvoice(customer, booking);
  }
  
  
}