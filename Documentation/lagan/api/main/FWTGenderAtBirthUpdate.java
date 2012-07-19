/**
 * FWTGenderAtBirthUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTGenderAtBirthUpdate  implements java.io.Serializable {
    /* F=Female M=Male U=Unknown */
    private java.lang.String genderAtBirth;

    private java.lang.String updateType;

    public FWTGenderAtBirthUpdate() {
    }

    public FWTGenderAtBirthUpdate(
           java.lang.String genderAtBirth,
           java.lang.String updateType) {
           this.genderAtBirth = genderAtBirth;
           this.updateType = updateType;
    }


    /**
     * Gets the genderAtBirth value for this FWTGenderAtBirthUpdate.
     * 
     * @return genderAtBirth   * F=Female M=Male U=Unknown
     */
    public java.lang.String getGenderAtBirth() {
        return genderAtBirth;
    }


    /**
     * Sets the genderAtBirth value for this FWTGenderAtBirthUpdate.
     * 
     * @param genderAtBirth   * F=Female M=Male U=Unknown
     */
    public void setGenderAtBirth(java.lang.String genderAtBirth) {
        this.genderAtBirth = genderAtBirth;
    }


    /**
     * Gets the updateType value for this FWTGenderAtBirthUpdate.
     * 
     * @return updateType
     */
    public java.lang.String getUpdateType() {
        return updateType;
    }


    /**
     * Sets the updateType value for this FWTGenderAtBirthUpdate.
     * 
     * @param updateType
     */
    public void setUpdateType(java.lang.String updateType) {
        this.updateType = updateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTGenderAtBirthUpdate)) return false;
        FWTGenderAtBirthUpdate other = (FWTGenderAtBirthUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.genderAtBirth==null && other.getGenderAtBirth()==null) || 
             (this.genderAtBirth!=null &&
              this.genderAtBirth.equals(other.getGenderAtBirth()))) &&
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
        if (getGenderAtBirth() != null) {
            _hashCode += getGenderAtBirth().hashCode();
        }
        if (getUpdateType() != null) {
            _hashCode += getUpdateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTGenderAtBirthUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTGenderAtBirthUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genderAtBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenderAtBirth"));
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
