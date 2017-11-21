package id.booking.flight.service.soap.impl;

public class ManageBookingImplProxy implements id.booking.flight.service.soap.impl.ManageBookingImpl {
  private String _endpoint = null;
  private id.booking.flight.service.soap.impl.ManageBookingImpl manageBookingImpl = null;
  
  public ManageBookingImplProxy() {
    _initManageBookingImplProxy();
  }
  
  public ManageBookingImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initManageBookingImplProxy();
  }
  
  private void _initManageBookingImplProxy() {
    try {
      manageBookingImpl = (new id.booking.flight.service.soap.impl.ManageBookingImplServiceLocator()).getManageBookingImpl();
      if (manageBookingImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)manageBookingImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)manageBookingImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (manageBookingImpl != null)
      ((javax.xml.rpc.Stub)manageBookingImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public id.booking.flight.service.soap.impl.ManageBookingImpl getManageBookingImpl() {
    if (manageBookingImpl == null)
      _initManageBookingImplProxy();
    return manageBookingImpl;
  }
  
  public boolean deleteBookingAndInvoice(id.booking.flight.entity.Booking booking, id.booking.flight.entity.Invoice invoice) throws java.rmi.RemoteException{
    if (manageBookingImpl == null)
      _initManageBookingImplProxy();
    return manageBookingImpl.deleteBookingAndInvoice(booking, invoice);
  }
  
  public boolean createBookingAndInvoice(id.booking.flight.entity.User customer, id.booking.flight.entity.Flight flight, java.lang.String passengerName) throws java.rmi.RemoteException{
    if (manageBookingImpl == null)
      _initManageBookingImplProxy();
    return manageBookingImpl.createBookingAndInvoice(customer, flight, passengerName);
  }
  
  
}