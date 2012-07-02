/**
 * FWTSidAccessPermissions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTSidAccessPermissions  implements java.io.Serializable {
    /* Values: user, group, everyone */
    private java.lang.String type;

    private java.lang.String sid;

    private java.lang.Integer grantMask;

    private java.lang.Integer denyMask;

    public FWTSidAccessPermissions() {
    }

    public FWTSidAccessPermissions(
           java.lang.String type,
           java.lang.String sid,
           java.lang.Integer grantMask,
           java.lang.Integer denyMask) {
           this.type = type;
           this.sid = sid;
           this.grantMask = grantMask;
           this.denyMask = denyMask;
    }


    /**
     * Gets the type value for this FWTSidAccessPermissions.
     * 
     * @return type   * Values: user, group, everyone
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this FWTSidAccessPermissions.
     * 
     * @param type   * Values: user, group, everyone
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the sid value for this FWTSidAccessPermissions.
     * 
     * @return sid
     */
    public java.lang.String getSid() {
        return sid;
    }


    /**
     * Sets the sid value for this FWTSidAccessPermissions.
     * 
     * @param sid
     */
    public void setSid(java.lang.String sid) {
        this.sid = sid;
    }


    /**
     * Gets the grantMask value for this FWTSidAccessPermissions.
     * 
     * @return grantMask
     */
    public java.lang.Integer getGrantMask() {
        return grantMask;
    }


    /**
     * Sets the grantMask value for this FWTSidAccessPermissions.
     * 
     * @param grantMask
     */
    public void setGrantMask(java.lang.Integer grantMask) {
        this.grantMask = grantMask;
    }


    /**
     * Gets the denyMask value for this FWTSidAccessPermissions.
     * 
     * @return denyMask
     */
    public java.lang.Integer getDenyMask() {
        return denyMask;
    }


    /**
     * Sets the denyMask value for this FWTSidAccessPermissions.
     * 
     * @param denyMask
     */
    public void setDenyMask(java.lang.Integer denyMask) {
        this.denyMask = denyMask;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTSidAccessPermissions)) return false;
        FWTSidAccessPermissions other = (FWTSidAccessPermissions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.sid==null && other.getSid()==null) || 
             (this.sid!=null &&
              this.sid.equals(other.getSid()))) &&
            ((this.grantMask==null && other.getGrantMask()==null) || 
             (this.grantMask!=null &&
              this.grantMask.equals(other.getGrantMask()))) &&
            ((this.denyMask==null && other.getDenyMask()==null) || 
             (this.denyMask!=null &&
              this.denyMask.equals(other.getDenyMask())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSid() != null) {
            _hashCode += getSid().hashCode();
        }
        if (getGrantMask() != null) {
            _hashCode += getGrantMask().hashCode();
        }
        if (getDenyMask() != null) {
            _hashCode += getDenyMask().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTSidAccessPermissions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTSidAccessPermissions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Sid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantMask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GrantMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denyMask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DenyMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
