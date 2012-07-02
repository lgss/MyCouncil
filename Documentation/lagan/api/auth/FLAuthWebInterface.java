/**
 * FLAuthWebInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.auth;

public interface FLAuthWebInterface extends java.rmi.Remote {

    /**
     * Authenticates a user ID/password pair and returns a security
     * token for that user
     */
    public void authenticate() throws java.rmi.RemoteException, lagan.api.auth.FWTException;

    /**
     * Authenticates a user ID/password pair and returns a security
     * token for the user ID given as input
     */
    public void authenticateByProxy(lagan.api.auth.FWTUser user) throws java.rmi.RemoteException, lagan.api.auth.FWTException;

    /**
     * Returns user details for a security token
     */
    public lagan.api.auth.FWTVerifyDetails verify() throws java.rmi.RemoteException, lagan.api.auth.FWTException;
}
