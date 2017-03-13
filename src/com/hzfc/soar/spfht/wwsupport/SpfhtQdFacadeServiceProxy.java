package com.hzfc.soar.spfht.wwsupport;

public class SpfhtQdFacadeServiceProxy implements com.hzfc.soar.spfht.wwsupport.SpfhtQdFacadeService {
  private String _endpoint = null;
  private com.hzfc.soar.spfht.wwsupport.SpfhtQdFacadeService spfhtQdFacadeService = null;
  
  public SpfhtQdFacadeServiceProxy() {
    _initSpfhtQdFacadeServiceProxy();
  }
  
  public SpfhtQdFacadeServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSpfhtQdFacadeServiceProxy();
  }
  
  private void _initSpfhtQdFacadeServiceProxy() {
    try {
      spfhtQdFacadeService = (new com.hzfc.soar.spfht.wwsupport.WwSpfhtServiceLocator()).getSpfhtQdFacadeServiceImplPort();
      if (spfhtQdFacadeService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)spfhtQdFacadeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)spfhtQdFacadeService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (spfhtQdFacadeService != null)
      ((javax.xml.rpc.Stub)spfhtQdFacadeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.hzfc.soar.spfht.wwsupport.SpfhtQdFacadeService getSpfhtQdFacadeService() {
    if (spfhtQdFacadeService == null)
      _initSpfhtQdFacadeServiceProxy();
    return spfhtQdFacadeService;
  }
  
  public java.lang.String ifvailide(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (spfhtQdFacadeService == null)
      _initSpfhtQdFacadeServiceProxy();
    return spfhtQdFacadeService.ifvailide(arg0, arg1);
  }
  
  public java.lang.String returnFwzt(java.lang.String arg0) throws java.rmi.RemoteException{
    if (spfhtQdFacadeService == null)
      _initSpfhtQdFacadeServiceProxy();
    return spfhtQdFacadeService.returnFwzt(arg0);
  }
  
  public java.lang.String getlpbFwxxAndXsxx(java.lang.String arg0) throws java.rmi.RemoteException{
    if (spfhtQdFacadeService == null)
      _initSpfhtQdFacadeServiceProxy();
    return spfhtQdFacadeService.getlpbFwxxAndXsxx(arg0);
  }
  
  public java.lang.String returnBszd(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (spfhtQdFacadeService == null)
      _initSpfhtQdFacadeServiceProxy();
    return spfhtQdFacadeService.returnBszd(arg0, arg1, arg2);
  }
  
  public java.lang.String returnfwtych(int arg0) throws java.rmi.RemoteException{
    if (spfhtQdFacadeService == null)
      _initSpfhtQdFacadeServiceProxy();
    return spfhtQdFacadeService.returnfwtych(arg0);
  }
  
  public java.lang.String getBzdtHistoryAll() throws java.rmi.RemoteException{
    if (spfhtQdFacadeService == null)
      _initSpfhtQdFacadeServiceProxy();
    return spfhtQdFacadeService.getBzdtHistoryAll();
  }
  
  public java.lang.String returnfwXx(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (spfhtQdFacadeService == null)
      _initSpfhtQdFacadeServiceProxy();
    return spfhtQdFacadeService.returnfwXx(arg0, arg1, arg2);
  }
  
  public java.lang.String returnFwString(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException{
    if (spfhtQdFacadeService == null)
      _initSpfhtQdFacadeServiceProxy();
    return spfhtQdFacadeService.returnFwString(arg0, arg1, arg2, arg3, arg4);
  }
  
  
}