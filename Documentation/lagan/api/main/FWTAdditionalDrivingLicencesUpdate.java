/**
 * FWTAdditionalDrivingLicencesUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTAdditionalDrivingLicencesUpdate  implements java.io.Serializable {
    private java.lang.Boolean additionalDrivingLicences;

    private java.lang.String updateType;

    public FWTAdditionalDrivingLicencesUpdate() {
    }

    public FWTAdditionalDrivingLicencesUpdate(
           java.lang.Boolean additionalDrivingLicences,
           java.lang.String updateType) {
           this.additionalDrivingLicences = additionalDrivingLicences;
           this.updateType = updateType;
    }


    /**
     * Gets the additionalDrivingLicences value for this FWTAdditionalDrivingLicencesUpdate.
     * 
     * @return additionalDrivingLicences
     */
    public java.lang.Boolean getAdditionalDrivingLicences() {
        return additionalDrivingLicences;
    }


    /**
     * Sets the additionalDrivingLicences value for this FWTAdditionalDrivingLicencesUpdate.
     * 
     * @param additionalDrivingLicences
     */
    public void setAdditionalDrivingLicences(java.lang.Boolean additionalDrivingLicences) {
        this.additionalDrivingLicences = additionalDrivingLicences;
    }


    /**
     * Gets the updateType value for this FWTAdditionalDrivingLicencesUpdate.
     * 
     * @return updateType
     */
    public java.lang.String getUpdateType() {
        return updateType;
    }


    /**
     * Sets the updateType value for this FWTAdditionalDrivingLicencesUpdate.
     * 
     * @param updateType
     */
    public void setUpdateType(java.lang.String updateType) {
        this.updateType = updateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTAdditionalDrivingLicencesUpdate)) return false;
        FWTAdditionalDrivingLicencesUpdate other = (FWTAdditionalDrivingLicencesUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalDrivingLicences==null && other.getAdditionalDrivingLicences()==null) || 
             (this.additionalDrivingLicences!=null &&
              this.additionalDrivingLicences.equals(other.getAdditionalDrivingLicences()))) &&
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
        if (getAdditionalDrivingLicences() != null) {
            _hashCode += getAdditionalDrivingLicences().hashCode();
        }
        if (getUpdateType() != null) {
            _hashCode += getUpdateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTAdditionalDrivingLicencesUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTAdditionalDrivingLicencesUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalDrivingLicences");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdditionalDrivingLicences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
