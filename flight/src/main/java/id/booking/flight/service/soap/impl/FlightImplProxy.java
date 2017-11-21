package id.booking.flight.service.soap.impl;

public class FlightImplProxy implements id.booking.flight.service.soap.impl.FlightImpl {
  private String _endpoint = null;
  private id.booking.flight.service.soap.impl.FlightImpl flightImpl = null;
  
  public FlightImplProxy() {
    _initFlightImplProxy();
  }
  
  public FlightImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initFlightImplProxy();
  }
  
  private void _initFlightImplProxy() {
    try {
      flightImpl = (new id.booking.flight.service.soap.impl.FlightImplServiceLocator()).getFlightImpl();
      if (flightImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)flightImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)flightImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (flightImpl != null)
      ((javax.xml.rpc.Stub)flightImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public id.booking.flight.service.soap.impl.FlightImpl getFlightImpl() {
    if (flightImpl == null)
      _initFlightImplProxy();
    return flightImpl;
  }
  
  public id.booking.flight.entity.Flight[] findBoardingTimeRange(java.util.Calendar boardTimeMin, java.util.Calendar boardTimeMax) throws java.rmi.RemoteException{
    if (flightImpl == null)
      _initFlightImplProxy();
    return flightImpl.findBoardingTimeRange(boardTimeMin, boardTimeMax);
  }
  
  public id.booking.flight.entity.Flight[] findByDepartureLocation(id.booking.flight.entity.Airport loc) throws java.rmi.RemoteException{
    if (flightImpl == null)
      _initFlightImplProxy();
    return flightImpl.findByDepartureLocation(loc);
  }
  
  public id.booking.flight.entity.Flight[] findByDestinationLocation(id.booking.flight.entity.Airport loc) throws java.rmi.RemoteException{
    if (flightImpl == null)
      _initFlightImplProxy();
    return flightImpl.findByDestinationLocation(loc);
  }
  
  public id.booking.flight.entity.Flight[] findAllFlight() throws java.rmi.RemoteException{
    if (flightImpl == null)
      _initFlightImplProxy();
    return flightImpl.findAllFlight();
  }
  
  public id.booking.flight.entity.Flight findById(int id) throws java.rmi.RemoteException{
    if (flightImpl == null)
      _initFlightImplProxy();
    return flightImpl.findById(id);
  }
  
  public id.booking.flight.entity.Flight[] findPriceRange(int min, int max) throws java.rmi.RemoteException{
    if (flightImpl == null)
      _initFlightImplProxy();
    return flightImpl.findPriceRange(min, max);
  }
  
  
}