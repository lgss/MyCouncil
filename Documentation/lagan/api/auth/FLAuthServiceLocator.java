/**
 * FLAuthServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.auth;

public class FLAuthServiceLocator extends org.apache.axis.client.Service implements lagan.api.auth.FLAuthService {

    public FLAuthServiceLocator() {
    }


    public FLAuthServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FLAuthServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FLAuth
    private java.lang.String FLAuth_address = "http://ascrmlive:8080/lagan/services/FLAuth";

    public java.lang.String getFLAuthAddress() {
        return FLAuth_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FLAuthWSDDServiceName = "FLAuth";

    public java.lang.String getFLAuthWSDDServiceName() {
        return FLAuthWSDDServiceName;
    }

    public void setFLAuthWSDDServiceName(java.lang.String name) {
        FLAuthWSDDServiceName = name;
    }

    public lagan.api.auth.FLAuthWebInterface getFLAuth() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FLAuth_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFLAuth(endpoint);
    }

    public lagan.api.auth.FLAuthWebInterface getFLAuth(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            lagan.api.auth.FLAuthWebBindingStub _stub = new lagan.api.auth.FLAuthWebBindingStub(portAddress, this);
            _stub.setPortName(getFLAuthWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFLAuthEndpointAddress(java.lang.String address) {
        FLAuth_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (lagan.api.auth.FLAuthWebInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                lagan.api.auth.FLAuthWebBindingStub _stub = new lagan.api.auth.FLAuthWebBindingStub(new java.net.URL(FLAuth_address), this);
                _stub.setPortName(getFLAuthWSDDServiceName());
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
        if ("FLAuth".equals(inputPortName)) {
            return getFLAuth();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLAuthService", "FLAuthService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLAuthService", "FLAuth"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FLAuth".equals(portName)) {
            setFLAuthEndpointAddress(address);
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
