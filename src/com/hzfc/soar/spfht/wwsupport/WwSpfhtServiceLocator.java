/**
 * WwSpfhtServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hzfc.soar.spfht.wwsupport;

public class WwSpfhtServiceLocator extends org.apache.axis.client.Service implements com.hzfc.soar.spfht.wwsupport.WwSpfhtService {

    public WwSpfhtServiceLocator() {
    }


    public WwSpfhtServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WwSpfhtServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SpfhtQdFacadeServiceImplPort
    private java.lang.String SpfhtQdFacadeServiceImplPort_address = "http://172.16.100.91/spi/wwSpfhtService";

    public java.lang.String getSpfhtQdFacadeServiceImplPortAddress() {
        return SpfhtQdFacadeServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SpfhtQdFacadeServiceImplPortWSDDServiceName = "SpfhtQdFacadeServiceImplPort";

    public java.lang.String getSpfhtQdFacadeServiceImplPortWSDDServiceName() {
        return SpfhtQdFacadeServiceImplPortWSDDServiceName;
    }

    public void setSpfhtQdFacadeServiceImplPortWSDDServiceName(java.lang.String name) {
        SpfhtQdFacadeServiceImplPortWSDDServiceName = name;
    }

    public com.hzfc.soar.spfht.wwsupport.SpfhtQdFacadeService getSpfhtQdFacadeServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SpfhtQdFacadeServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSpfhtQdFacadeServiceImplPort(endpoint);
    }

    public com.hzfc.soar.spfht.wwsupport.SpfhtQdFacadeService getSpfhtQdFacadeServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.hzfc.soar.spfht.wwsupport.WwSpfhtServiceSoapBindingStub _stub = new com.hzfc.soar.spfht.wwsupport.WwSpfhtServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSpfhtQdFacadeServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSpfhtQdFacadeServiceImplPortEndpointAddress(java.lang.String address) {
        SpfhtQdFacadeServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.hzfc.soar.spfht.wwsupport.SpfhtQdFacadeService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.hzfc.soar.spfht.wwsupport.WwSpfhtServiceSoapBindingStub _stub = new com.hzfc.soar.spfht.wwsupport.WwSpfhtServiceSoapBindingStub(new java.net.URL(SpfhtQdFacadeServiceImplPort_address), this);
                _stub.setPortName(getSpfhtQdFacadeServiceImplPortWSDDServiceName());
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
        if ("SpfhtQdFacadeServiceImplPort".equals(inputPortName)) {
            return getSpfhtQdFacadeServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soar.hzfc.com/spfht/wwsupport", "wwSpfhtService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soar.hzfc.com/spfht/wwsupport", "SpfhtQdFacadeServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SpfhtQdFacadeServiceImplPort".equals(portName)) {
            setSpfhtQdFacadeServiceImplPortEndpointAddress(address);
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
