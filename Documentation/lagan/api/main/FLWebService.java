/**
 * FLWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public interface FLWebService extends javax.xml.rpc.Service {
    public java.lang.String getFLAddress();

    public lagan.api.main.FLWebInterface getFL() throws javax.xml.rpc.ServiceException;

    public lagan.api.main.FLWebInterface getFL(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
