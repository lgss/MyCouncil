/**
 * FLAuthService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.auth;

public interface FLAuthService extends javax.xml.rpc.Service {
    public java.lang.String getFLAuthAddress();

    public lagan.api.auth.FLAuthWebInterface getFLAuth() throws javax.xml.rpc.ServiceException;

    public lagan.api.auth.FLAuthWebInterface getFLAuth(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
