/**
 * WwZcxServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.fwdj.wwsupport;

public class WwZcxServiceLocator extends org.apache.axis.client.Service implements com.hzfc.soar.fwdj.wwsupport.WwZcxService {

    public WwZcxServiceLocator() {
    }


    public WwZcxServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WwZcxServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FwdjZcxFacadeServiceImplPort
    private java.lang.String FwdjZcxFacadeServiceImplPort_address = "http://172.16.100.91/spi/wwZcxService";

    public java.lang.String getFwdjZcxFacadeServiceImplPortAddress() {
        return FwdjZcxFacadeServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FwdjZcxFacadeServiceImplPortWSDDServiceName = "FwdjZcxFacadeServiceImplPort";

    public java.lang.String getFwdjZcxFacadeServiceImplPortWSDDServiceName() {
        return FwdjZcxFacadeServiceImplPortWSDDServiceName;
    }

    public void setFwdjZcxFacadeServiceImplPortWSDDServiceName(java.lang.String name) {
        FwdjZcxFacadeServiceImplPortWSDDServiceName = name;
    }

    public com.hzfc.soar.fwdj.wwsupport.FwdjZcxFacadeService getFwdjZcxFacadeServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FwdjZcxFacadeServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFwdjZcxFacadeServiceImplPort(endpoint);
    }

    public com.hzfc.soar.fwdj.wwsupport.FwdjZcxFacadeService getFwdjZcxFacadeServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.hzfc.soar.fwdj.wwsupport.WwZcxServiceSoapBindingStub _stub = new com.hzfc.soar.fwdj.wwsupport.WwZcxServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getFwdjZcxFacadeServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFwdjZcxFacadeServiceImplPortEndpointAddress(java.lang.String address) {
        FwdjZcxFacadeServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.hzfc.soar.fwdj.wwsupport.FwdjZcxFacadeService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.hzfc.soar.fwdj.wwsupport.WwZcxServiceSoapBindingStub _stub = new com.hzfc.soar.fwdj.wwsupport.WwZcxServiceSoapBindingStub(new java.net.URL(FwdjZcxFacadeServiceImplPort_address), this);
                _stub.setPortName(getFwdjZcxFacadeServiceImplPortWSDDServiceName());
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
        if ("FwdjZcxFacadeServiceImplPort".equals(inputPortName)) {
            return getFwdjZcxFacadeServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soar.hzfc.com/fwdj/wwsupport", "wwZcxService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soar.hzfc.com/fwdj/wwsupport", "FwdjZcxFacadeServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FwdjZcxFacadeServiceImplPort".equals(portName)) {
            setFwdjZcxFacadeServiceImplPortEndpointAddress(address);
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
