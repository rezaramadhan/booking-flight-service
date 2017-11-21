package id.booking.flight.service.soap.impl;

public class BookingImplProxy implements id.booking.flight.service.soap.impl.BookingImpl {
  private String _endpoint = null;
  private id.booking.flight.service.soap.impl.BookingImpl bookingImpl = null;
  
  public BookingImplProxy() {
    _initBookingImplProxy();
  }
  
  public BookingImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookingImplProxy();
  }
  
  private void _initBookingImplProxy() {
    try {
      bookingImpl = (new id.booking.flight.service.soap.impl.BookingImplServiceLocator()).getBookingImpl();
      if (bookingImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookingImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookingImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookingImpl != null)
      ((javax.xml.rpc.Stub)bookingImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public id.booking.flight.service.soap.impl.BookingImpl getBookingImpl() {
    if (bookingImpl == null)
      _initBookingImplProxy();
    return bookingImpl;
  }
  
  public id.booking.flight.entity.Booking createBooking(id.booking.flight.entity.User user, id.booking.flight.entity.Flight flight, java.lang.String passengerName) throws java.rmi.RemoteException{
    if (bookingImpl == null)
      _initBookingImplProxy();
    return bookingImpl.createBooking(user, flight, passengerName);
  }
  
  public boolean cancelBooking(id.booking.flight.entity.Booking booking) throws java.rmi.RemoteException{
    if (bookingImpl == null)
      _initBookingImplProxy();
    return bookingImpl.cancelBooking(booking);
  }
  
  public id.booking.flight.entity.Booking modifyBooking(id.booking.flight.entity.Booking booking, id.booking.flight.entity.Flight flight, java.lang.String passengerName) throws java.rmi.RemoteException{
    if (bookingImpl == null)
      _initBookingImplProxy();
    return bookingImpl.modifyBooking(booking, flight, passengerName);
  }
  
  
}