/**
 * FWTUserDefinedUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTUserDefinedUpdate  implements java.io.Serializable {
    /* User-defined fields are updated based on
     *                                 index. Therefore if only one is supplied
     * it is assumed that this is user-defined
     *                                 field 1. To update user-defined field
     * 5
     *                                 you would need to also supply the
     * first
     *                                 4 fields, these may be empty if no
     * change is required. */
    private java.lang.String userDefined;

    private java.lang.String updateType;

    public FWTUserDefinedUpdate() {
    }

    public FWTUserDefinedUpdate(
           java.lang.String userDefined,
           java.lang.String updateType) {
           this.userDefined = userDefined;
           this.updateType = updateType;
    }


    /**
     * Gets the userDefined value for this FWTUserDefinedUpdate.
     * 
     * @return userDefined   * User-defined fields are updated based on
     *                                 index. Therefore if only one is supplied
     * it is assumed that this is user-defined
     *                                 field 1. To update user-defined field
     * 5
     *                                 you would need to also supply the
     * first
     *                                 4 fields, these may be empty if no
     * change is required.
     */
    public java.lang.String getUserDefined() {
        return userDefined;
    }


    /**
     * Sets the userDefined value for this FWTUserDefinedUpdate.
     * 
     * @param userDefined   * User-defined fields are updated based on
     *                                 index. Therefore if only one is supplied
     * it is assumed that this is user-defined
     *                                 field 1. To update user-defined field
     * 5
     *                                 you would need to also supply the
     * first
     *                                 4 fields, these may be empty if no
     * change is required.
     */
    public void setUserDefined(java.lang.String userDefined) {
        this.userDefined = userDefined;
    }


    /**
     * Gets the updateType value for this FWTUserDefinedUpdate.
     * 
     * @return updateType
     */
    public java.lang.String getUpdateType() {
        return updateType;
    }


    /**
     * Sets the updateType value for this FWTUserDefinedUpdate.
     * 
     * @param updateType
     */
    public void setUpdateType(java.lang.String updateType) {
        this.updateType = updateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTUserDefinedUpdate)) return false;
        FWTUserDefinedUpdate other = (FWTUserDefinedUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userDefined==null && other.getUserDefined()==null) || 
             (this.userDefined!=null &&
              this.userDefined.equals(other.getUserDefined()))) &&
            ((this.updateType==null && other.getUpdateType()==null) || 
             (this.updateType!=null &&
              this.updateType.equals(other.getUpdateType())));
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
        if (getUserDefined() != null) {
            _hashCode += getUserDefined().hashCode();
        }
        if (getUpdateType() != null) {
            _hashCode += getUpdateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTUserDefinedUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTUserDefinedUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "UpdateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
