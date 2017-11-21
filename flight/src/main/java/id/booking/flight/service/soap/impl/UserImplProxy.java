package id.booking.flight.service.soap.impl;

public class UserImplProxy implements id.booking.flight.service.soap.impl.UserImpl {
  private String _endpoint = null;
  private id.booking.flight.service.soap.impl.UserImpl userImpl = null;
  
  public UserImplProxy() {
    _initUserImplProxy();
  }
  
  public UserImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserImplProxy();
  }
  
  private void _initUserImplProxy() {
    try {
      userImpl = (new id.booking.flight.service.soap.impl.UserImplServiceLocator()).getUserImpl();
      if (userImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userImpl != null)
      ((javax.xml.rpc.Stub)userImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public id.booking.flight.service.soap.impl.UserImpl getUserImpl() {
    if (userImpl == null)
      _initUserImplProxy();
    return userImpl;
  }
  
  public id.booking.flight.entity.User createNewUser(java.lang.String fullName, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (userImpl == null)
      _initUserImplProxy();
    return userImpl.createNewUser(fullName, username, password);
  }
  
  public boolean modifyUserData(id.booking.flight.entity.User user, java.lang.String password, java.lang.String fullName) throws java.rmi.RemoteException{
    if (userImpl == null)
      _initUserImplProxy();
    return userImpl.modifyUserData(user, password, fullName);
  }
  
  
}