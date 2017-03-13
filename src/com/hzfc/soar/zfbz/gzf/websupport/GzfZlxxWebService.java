/**
 * GzfZlxxWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.zfbz.gzf.websupport;

public interface GzfZlxxWebService extends java.rmi.Remote {
    public com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[] findTpgJtxxByRycode(java.lang.Long sqrcode) throws java.rmi.RemoteException;
    public java.lang.String findDatasByFwzl(java.lang.String fwzl) throws java.rmi.RemoteException;
    public java.lang.String findPzrxxByXmZjhmYddh(java.lang.String sqrxm, java.lang.String zjhm, java.lang.String yddh, java.lang.Integer bzlx) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[] findZfbzRyxxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[] findZfbzGzffyxxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.FileContentVo[] queryZlxxs(com.hzfc.soar.zfbz.gzf.websupport.FileContentVo[] arg0) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx findTpgGzfpzxxByHtbh(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String sendSms(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx findTpgRyxxByZjhm(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[] findZfbzRygxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgGzffyxx[] findTpgGzffyxxByFycode(java.lang.Long fycode) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx findTpgRyxxByYhzjzhid(java.lang.Long yhzjzhid) throws java.rmi.RemoteException;
    public java.lang.String sendSms4Query(java.lang.String[] nameAndPhoneNo, java.lang.String content, java.lang.String userId) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[] findTpgGzfpzxxsByPzcode(java.lang.Long pzcode) throws java.rmi.RemoteException;
    public java.lang.String findHfdataByHfrq(java.lang.String hfrq) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgRyxx[] findTpgRyxxsByRycode(java.lang.Long sqrcode) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgGzfpzxx[] findZfbzGzfpzxxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgrRygx[] findTpgrRygxByRycode(java.lang.Long sqrcode) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx findZjkfmxUpKfcgsjByPzcode(java.lang.Long pzcode) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgZjkfmx[] findZfbzZjkfmxs(java.lang.String xqName, java.util.Calendar kfsj, java.lang.Integer kfzt, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.MapContent verifyHth(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException;
    public com.hzfc.soar.zfbz.gzf.websupport.TpgJtxx[] findZfbzJtxxs(java.lang.String xqName, java.lang.Integer pageNo, java.lang.Integer pageSize) throws java.rmi.RemoteException;
}
