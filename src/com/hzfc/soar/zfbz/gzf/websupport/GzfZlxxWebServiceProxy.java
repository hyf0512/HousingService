package com.hzfc.soar.zfbz.gzf.websupport;

public class GzfZlxxWebServiceProxy implements com.hzfc.soar.zfbz.gzf.websupport.GzfZlxxWebService {
  private String _endpoint = null;
  private com.hzfc.soar.zfbz.gzf.websupport.GzfZlxxWebService gzfZlxxWebService = null;
  
  public GzfZlxxWebServiceProxy() {
    _initGzfZlxxWebServiceProxy();
  }
  
  public GzfZlxxWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initGzfZlxxWebServiceProxy();
  }
  
  private void _initGzfZlxxWebServiceProxy() {
    try {
      gzfZlxxWebService = (new com.hzfc.soar.zfbz.gzf.websupport.WebGzfZlxxServiceLocator()).getGzfZlxxWebServiceImplPort();
      if (gzfZlxxWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gzfZlxxWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gzfZlxxWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gzfZlxxWebService != null)
      ((javax.xml.rpc.Stub)gzfZlxxWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.GzfZlxxWebService getGzfZlxxWebService() {
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService;
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[] findTpgJtxxByRycode(java.lang.Long sqrcode) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findTpgJtxxByRycode(sqrcode);
  }
  
  public java.lang.String findDatasByFwzl(java.lang.String fwzl) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findDatasByFwzl(fwzl);
  }
  
  public java.lang.String findPzrxxByXmZjhmYddh(java.lang.String sqrxm, java.lang.String zjhm, java.lang.String yddh, java.lang.Integer bzlx) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findPzrxxByXmZjhmYddh(sqrxm, zjhm, yddh, bzlx);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[] findZfbzRyxxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findZfbzRyxxs(xqName, pageNo, pageSize);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[] findZfbzGzffyxxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findZfbzGzffyxxs(xqName, pageNo, pageSize);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.FileContentVo[] queryZlxxs(com.hzfc.soar.zfbz.gzf.websupport.FileContentVo[] arg0) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.queryZlxxs(arg0);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx findTpgGzfpzxxByHtbh(java.lang.String arg0) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findTpgGzfpzxxByHtbh(arg0);
  }
  
  public java.lang.String sendSms(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.sendSms(arg0, arg1);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx findTpgRyxxByZjhm(java.lang.String arg0) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findTpgRyxxByZjhm(arg0);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[] findZfbzRygxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findZfbzRygxs(xqName, pageNo, pageSize);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[] findTpgGzffyxxByFycode(java.lang.Long fycode) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findTpgGzffyxxByFycode(fycode);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx findTpgRyxxByYhzjzhid(java.lang.Long yhzjzhid) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findTpgRyxxByYhzjzhid(yhzjzhid);
  }
  
  public java.lang.String sendSms4Query(java.lang.String[] nameAndPhoneNo, java.lang.String content, java.lang.String userId) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.sendSms4Query(nameAndPhoneNo, content, userId);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[] findTpgGzfpzxxsByPzcode(java.lang.Long pzcode) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findTpgGzfpzxxsByPzcode(pzcode);
  }
  
  public java.lang.String findHfdataByHfrq(java.lang.String hfrq) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findHfdataByHfrq(hfrq);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[] findTpgRyxxsByRycode(java.lang.Long sqrcode) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findTpgRyxxsByRycode(sqrcode);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[] findZfbzGzfpzxxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findZfbzGzfpzxxs(xqName, pageNo, pageSize);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[] findTpgrRygxByRycode(java.lang.Long sqrcode) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findTpgrRygxByRycode(sqrcode);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx findZjkfmxUpKfcgsjByPzcode(java.lang.Long pzcode) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findZjkfmxUpKfcgsjByPzcode(pzcode);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx[] findZfbzZjkfmxs(java.lang.String xqName, java.util.Calendar kfsj, java.lang.Integer kfzt, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findZfbzZjkfmxs(xqName, kfsj, kfzt, pageNo, pageSize);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.MapContent verifyHth(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.verifyHth(arg0, arg1, arg2, arg3);
  }
  
  public com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[] findZfbzJtxxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException{
    if (gzfZlxxWebService == null)
      _initGzfZlxxWebServiceProxy();
    return gzfZlxxWebService.findZfbzJtxxs(xqName, pageNo, pageSize);
  }
  
  
}