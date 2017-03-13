/**
 * WebGzfZlxxServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.zfbz.gzf.websupport;

public class WebGzfZlxxServiceLocator extends org.apache.axis.client.Service implements com.hzfc.soar.zfbz.gzf.websupport.WebGzfZlxxService {

    public WebGzfZlxxServiceLocator() {
    }


    public WebGzfZlxxServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebGzfZlxxServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GzfZlxxWebServiceImplPort
    private java.lang.String GzfZlxxWebServiceImplPort_address = "http://172.16.100.91/spi/webGzfZlxxService";

    public java.lang.String getGzfZlxxWebServiceImplPortAddress() {
        return GzfZlxxWebServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GzfZlxxWebServiceImplPortWSDDServiceName = "GzfZlxxWebServiceImplPort";

    public java.lang.String getGzfZlxxWebServiceImplPortWSDDServiceName() {
        return GzfZlxxWebServiceImplPortWSDDServiceName;
    }

    public void setGzfZlxxWebServiceImplPortWSDDServiceName(java.lang.String name) {
        GzfZlxxWebServiceImplPortWSDDServiceName = name;
    }

    public com.hzfc.soar.zfbz.gzf.websupport.GzfZlxxWebService getGzfZlxxWebServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GzfZlxxWebServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGzfZlxxWebServiceImplPort(endpoint);
    }

    public com.hzfc.soar.zfbz.gzf.websupport.GzfZlxxWebService getGzfZlxxWebServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.hzfc.soar.zfbz.gzf.websupport.WebGzfZlxxServiceSoapBindingStub _stub = new com.hzfc.soar.zfbz.gzf.websupport.WebGzfZlxxServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGzfZlxxWebServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGzfZlxxWebServiceImplPortEndpointAddress(java.lang.String address) {
        GzfZlxxWebServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.hzfc.soar.zfbz.gzf.websupport.GzfZlxxWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.hzfc.soar.zfbz.gzf.websupport.WebGzfZlxxServiceSoapBindingStub _stub = new com.hzfc.soar.zfbz.gzf.websupport.WebGzfZlxxServiceSoapBindingStub(new java.net.URL(GzfZlxxWebServiceImplPort_address), this);
                _stub.setPortName(getGzfZlxxWebServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GzfZlxxWebServiceImplPort".equals(inputPortName)) {
            return getGzfZlxxWebServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "webGzfZlxxService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soar.hzfc.com/zfbz/gzf/websupport", "GzfZlxxWebServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GzfZlxxWebServiceImplPort".equals(portName)) {
            setGzfZlxxWebServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
