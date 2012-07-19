/**
 * FWTPlaceOfBirthUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTPlaceOfBirthUpdate  implements java.io.Serializable {
    private java.lang.String placeOfBirth;

    private java.lang.String updateType;

    public FWTPlaceOfBirthUpdate() {
    }

    public FWTPlaceOfBirthUpdate(
           java.lang.String placeOfBirth,
           java.lang.String updateType) {
           this.placeOfBirth = placeOfBirth;
           this.updateType = updateType;
    }


    /**
     * Gets the placeOfBirth value for this FWTPlaceOfBirthUpdate.
     * 
     * @return placeOfBirth
     */
    public java.lang.String getPlaceOfBirth() {
        return placeOfBirth;
    }


    /**
     * Sets the placeOfBirth value for this FWTPlaceOfBirthUpdate.
     * 
     * @param placeOfBirth
     */
    public void setPlaceOfBirth(java.lang.String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }


    /**
     * Gets the updateType value for this FWTPlaceOfBirthUpdate.
     * 
     * @return updateType
     */
    public java.lang.String getUpdateType() {
        return updateType;
    }


    /**
     * Sets the updateType value for this FWTPlaceOfBirthUpdate.
     * 
     * @param updateType
     */
    public void setUpdateType(java.lang.String updateType) {
        this.updateType = updateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTPlaceOfBirthUpdate)) return false;
        FWTPlaceOfBirthUpdate other = (FWTPlaceOfBirthUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.placeOfBirth==null && other.getPlaceOfBirth()==null) || 
             (this.placeOfBirth!=null &&
              this.placeOfBirth.equals(other.getPlaceOfBirth()))) &&
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
        if (getPlaceOfBirth() != null) {
            _hashCode += getPlaceOfBirth().hashCode();
        }
        if (getUpdateType() != null) {
            _hashCode += getUpdateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTPlaceOfBirthUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTPlaceOfBirthUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PlaceOfBirth"));
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
