package com.hzfc.soar.fwdj.wwsupport;

public class FwdjZcxFacadeServiceProxy implements com.hzfc.soar.fwdj.wwsupport.FwdjZcxFacadeService {
  private String _endpoint = null;
  private com.hzfc.soar.fwdj.wwsupport.FwdjZcxFacadeService fwdjZcxFacadeService = null;
  
  public FwdjZcxFacadeServiceProxy() {
    _initFwdjZcxFacadeServiceProxy();
  }
  
  public FwdjZcxFacadeServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFwdjZcxFacadeServiceProxy();
  }
  
  private void _initFwdjZcxFacadeServiceProxy() {
    try {
      fwdjZcxFacadeService = (new com.hzfc.soar.fwdj.wwsupport.WwZcxServiceLocator()).getFwdjZcxFacadeServiceImplPort();
      if (fwdjZcxFacadeService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fwdjZcxFacadeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fwdjZcxFacadeService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fwdjZcxFacadeService != null)
      ((javax.xml.rpc.Stub)fwdjZcxFacadeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.hzfc.soar.fwdj.wwsupport.FwdjZcxFacadeService getFwdjZcxFacadeService() {
    if (fwdjZcxFacadeService == null)
      _initFwdjZcxFacadeServiceProxy();
    return fwdjZcxFacadeService;
  }
  
  public java.lang.String getBzcxGBK(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (fwdjZcxFacadeService == null)
      _initFwdjZcxFacadeServiceProxy();
    return fwdjZcxFacadeService.getBzcxGBK(arg0, arg1);
  }
  
  public java.lang.String getLzgg() throws java.rmi.RemoteException{
    if (fwdjZcxFacadeService == null)
      _initFwdjZcxFacadeServiceProxy();
    return fwdjZcxFacadeService.getLzgg();
  }
  
  public java.lang.String getBzcx(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (fwdjZcxFacadeService == null)
      _initFwdjZcxFacadeServiceProxy();
    return fwdjZcxFacadeService.getBzcx(arg0, arg1);
  }
  
  
}