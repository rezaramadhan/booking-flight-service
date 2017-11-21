package id.booking.flight.service.soap.impl;

public class CheckFlightSeatImplProxy implements id.booking.flight.service.soap.impl.CheckFlightSeatImpl {
  private String _endpoint = null;
  private id.booking.flight.service.soap.impl.CheckFlightSeatImpl checkFlightSeatImpl = null;
  
  public CheckFlightSeatImplProxy() {
    _initCheckFlightSeatImplProxy();
  }
  
  public CheckFlightSeatImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initCheckFlightSeatImplProxy();
  }
  
  private void _initCheckFlightSeatImplProxy() {
    try {
      checkFlightSeatImpl = (new id.booking.flight.service.soap.impl.CheckFlightSeatImplServiceLocator()).getCheckFlightSeatImpl();
      if (checkFlightSeatImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)checkFlightSeatImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)checkFlightSeatImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (checkFlightSeatImpl != null)
      ((javax.xml.rpc.Stub)checkFlightSeatImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public id.booking.flight.service.soap.impl.CheckFlightSeatImpl getCheckFlightSeatImpl() {
    if (checkFlightSeatImpl == null)
      _initCheckFlightSeatImplProxy();
    return checkFlightSeatImpl;
  }
  
  public int checkSeat(id.booking.flight.entity.Flight flight) throws java.rmi.RemoteException{
    if (checkFlightSeatImpl == null)
      _initCheckFlightSeatImplProxy();
    return checkFlightSeatImpl.checkSeat(flight);
  }
  
  
}