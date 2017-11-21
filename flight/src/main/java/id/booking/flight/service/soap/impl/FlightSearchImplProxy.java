package id.booking.flight.service.soap.impl;

public class FlightSearchImplProxy implements id.booking.flight.service.soap.impl.FlightSearchImpl {
  private String _endpoint = null;
  private id.booking.flight.service.soap.impl.FlightSearchImpl flightSearchImpl = null;
  
  public FlightSearchImplProxy() {
    _initFlightSearchImplProxy();
  }
  
  public FlightSearchImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initFlightSearchImplProxy();
  }
  
  private void _initFlightSearchImplProxy() {
    try {
      flightSearchImpl = (new id.booking.flight.service.soap.impl.FlightSearchImplServiceLocator()).getFlightSearchImpl();
      if (flightSearchImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)flightSearchImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)flightSearchImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (flightSearchImpl != null)
      ((javax.xml.rpc.Stub)flightSearchImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public id.booking.flight.service.soap.impl.FlightSearchImpl getFlightSearchImpl() {
    if (flightSearchImpl == null)
      _initFlightSearchImplProxy();
    return flightSearchImpl;
  }
  
  public id.booking.flight.entity.Flight[] findFlightByBoarding(java.util.Calendar boardingTimeMin, java.util.Calendar boardingTimeMax, id.booking.flight.entity.Airport departure, id.booking.flight.entity.Airport destination) throws java.rmi.RemoteException{
    if (flightSearchImpl == null)
      _initFlightSearchImplProxy();
    return flightSearchImpl.findFlightByBoarding(boardingTimeMin, boardingTimeMax, departure, destination);
  }
  
  
}