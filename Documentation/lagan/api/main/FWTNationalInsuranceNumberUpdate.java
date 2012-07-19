/**
 * FWTNationalInsuranceNumberUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTNationalInsuranceNumberUpdate  implements java.io.Serializable {
    /* Not applicable for US individuals */
    private java.lang.String nationalInsuranceNumber;

    private java.lang.String updateType;

    public FWTNationalInsuranceNumberUpdate() {
    }

    public FWTNationalInsuranceNumberUpdate(
           java.lang.String nationalInsuranceNumber,
           java.lang.String updateType) {
           this.nationalInsuranceNumber = nationalInsuranceNumber;
           this.updateType = updateType;
    }


    /**
     * Gets the nationalInsuranceNumber value for this FWTNationalInsuranceNumberUpdate.
     * 
     * @return nationalInsuranceNumber   * Not applicable for US individuals
     */
    public java.lang.String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }


    /**
     * Sets the nationalInsuranceNumber value for this FWTNationalInsuranceNumberUpdate.
     * 
     * @param nationalInsuranceNumber   * Not applicable for US individuals
     */
    public void setNationalInsuranceNumber(java.lang.String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }


    /**
     * Gets the updateType value for this FWTNationalInsuranceNumberUpdate.
     * 
     * @return updateType
     */
    public java.lang.String getUpdateType() {
        return updateType;
    }


    /**
     * Sets the updateType value for this FWTNationalInsuranceNumberUpdate.
     * 
     * @param updateType
     */
    public void setUpdateType(java.lang.String updateType) {
        this.updateType = updateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTNationalInsuranceNumberUpdate)) return false;
        FWTNationalInsuranceNumberUpdate other = (FWTNationalInsuranceNumberUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nationalInsuranceNumber==null && other.getNationalInsuranceNumber()==null) || 
             (this.nationalInsuranceNumber!=null &&
              this.nationalInsuranceNumber.equals(other.getNationalInsuranceNumber()))) &&
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
        if (getNationalInsuranceNumber() != null) {
            _hashCode += getNationalInsuranceNumber().hashCode();
        }
        if (getUpdateType() != null) {
            _hashCode += getUpdateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTNationalInsuranceNumberUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTNationalInsuranceNumberUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalInsuranceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NationalInsuranceNumber"));
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
