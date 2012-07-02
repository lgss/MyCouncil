/**
 * FWTSetSidAccessPermissions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTSetSidAccessPermissions  implements java.io.Serializable {
    private lagan.api.main.FWTDomainObjectID domainObjectID;

    private lagan.api.main.FWTSidAccessPermissions[] FWTSidAccessPermissionsList;

    public FWTSetSidAccessPermissions() {
    }

    public FWTSetSidAccessPermissions(
           lagan.api.main.FWTDomainObjectID domainObjectID,
           lagan.api.main.FWTSidAccessPermissions[] FWTSidAccessPermissionsList) {
           this.domainObjectID = domainObjectID;
           this.FWTSidAccessPermissionsList = FWTSidAccessPermissionsList;
    }


    /**
     * Gets the domainObjectID value for this FWTSetSidAccessPermissions.
     * 
     * @return domainObjectID
     */
    public lagan.api.main.FWTDomainObjectID getDomainObjectID() {
        return domainObjectID;
    }


    /**
     * Sets the domainObjectID value for this FWTSetSidAccessPermissions.
     * 
     * @param domainObjectID
     */
    public void setDomainObjectID(lagan.api.main.FWTDomainObjectID domainObjectID) {
        this.domainObjectID = domainObjectID;
    }


    /**
     * Gets the FWTSidAccessPermissionsList value for this FWTSetSidAccessPermissions.
     * 
     * @return FWTSidAccessPermissionsList
     */
    public lagan.api.main.FWTSidAccessPermissions[] getFWTSidAccessPermissionsList() {
        return FWTSidAccessPermissionsList;
    }


    /**
     * Sets the FWTSidAccessPermissionsList value for this FWTSetSidAccessPermissions.
     * 
     * @param FWTSidAccessPermissionsList
     */
    public void setFWTSidAccessPermissionsList(lagan.api.main.FWTSidAccessPermissions[] FWTSidAccessPermissionsList) {
        this.FWTSidAccessPermissionsList = FWTSidAccessPermissionsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTSetSidAccessPermissions)) return false;
        FWTSetSidAccessPermissions other = (FWTSetSidAccessPermissions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domainObjectID==null && other.getDomainObjectID()==null) || 
             (this.domainObjectID!=null &&
              this.domainObjectID.equals(other.getDomainObjectID()))) &&
            ((this.FWTSidAccessPermissionsList==null && other.getFWTSidAccessPermissionsList()==null) || 
             (this.FWTSidAccessPermissionsList!=null &&
              java.util.Arrays.equals(this.FWTSidAccessPermissionsList, other.getFWTSidAccessPermissionsList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDomainObjectID() != null) {
            _hashCode += getDomainObjectID().hashCode();
        }
        if (getFWTSidAccessPermissionsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFWTSidAccessPermissionsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFWTSidAccessPermissionsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTSetSidAccessPermissions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTSetSidAccessPermissions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainObjectID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "DomainObjectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTDomainObjectID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FWTSidAccessPermissionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTSidAccessPermissionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTSidAccessPermissionsList"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
