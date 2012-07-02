/**
 * FWTKeyValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTKeyValue  implements java.io.Serializable {
    /* The name of the property this value
     *                                 denotes */
    private java.lang.String key;

    private java.lang.Long numberValue;

    private java.lang.String stringValue;

    private java.util.Date dateValue;

    private java.lang.String blockedValue;

    private java.util.Calendar dateTimeValue;

    public FWTKeyValue() {
    }

    public FWTKeyValue(
           java.lang.String key,
           java.lang.Long numberValue,
           java.lang.String stringValue,
           java.util.Date dateValue,
           java.lang.String blockedValue,
           java.util.Calendar dateTimeValue) {
           this.key = key;
           this.numberValue = numberValue;
           this.stringValue = stringValue;
           this.dateValue = dateValue;
           this.blockedValue = blockedValue;
           this.dateTimeValue = dateTimeValue;
    }


    /**
     * Gets the key value for this FWTKeyValue.
     * 
     * @return key   * The name of the property this value
     *                                 denotes
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this FWTKeyValue.
     * 
     * @param key   * The name of the property this value
     *                                 denotes
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the numberValue value for this FWTKeyValue.
     * 
     * @return numberValue
     */
    public java.lang.Long getNumberValue() {
        return numberValue;
    }


    /**
     * Sets the numberValue value for this FWTKeyValue.
     * 
     * @param numberValue
     */
    public void setNumberValue(java.lang.Long numberValue) {
        this.numberValue = numberValue;
    }


    /**
     * Gets the stringValue value for this FWTKeyValue.
     * 
     * @return stringValue
     */
    public java.lang.String getStringValue() {
        return stringValue;
    }


    /**
     * Sets the stringValue value for this FWTKeyValue.
     * 
     * @param stringValue
     */
    public void setStringValue(java.lang.String stringValue) {
        this.stringValue = stringValue;
    }


    /**
     * Gets the dateValue value for this FWTKeyValue.
     * 
     * @return dateValue
     */
    public java.util.Date getDateValue() {
        return dateValue;
    }


    /**
     * Sets the dateValue value for this FWTKeyValue.
     * 
     * @param dateValue
     */
    public void setDateValue(java.util.Date dateValue) {
        this.dateValue = dateValue;
    }


    /**
     * Gets the blockedValue value for this FWTKeyValue.
     * 
     * @return blockedValue
     */
    public java.lang.String getBlockedValue() {
        return blockedValue;
    }


    /**
     * Sets the blockedValue value for this FWTKeyValue.
     * 
     * @param blockedValue
     */
    public void setBlockedValue(java.lang.String blockedValue) {
        this.blockedValue = blockedValue;
    }


    /**
     * Gets the dateTimeValue value for this FWTKeyValue.
     * 
     * @return dateTimeValue
     */
    public java.util.Calendar getDateTimeValue() {
        return dateTimeValue;
    }


    /**
     * Sets the dateTimeValue value for this FWTKeyValue.
     * 
     * @param dateTimeValue
     */
    public void setDateTimeValue(java.util.Calendar dateTimeValue) {
        this.dateTimeValue = dateTimeValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTKeyValue)) return false;
        FWTKeyValue other = (FWTKeyValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.numberValue==null && other.getNumberValue()==null) || 
             (this.numberValue!=null &&
              this.numberValue.equals(other.getNumberValue()))) &&
            ((this.stringValue==null && other.getStringValue()==null) || 
             (this.stringValue!=null &&
              this.stringValue.equals(other.getStringValue()))) &&
            ((this.dateValue==null && other.getDateValue()==null) || 
             (this.dateValue!=null &&
              this.dateValue.equals(other.getDateValue()))) &&
            ((this.blockedValue==null && other.getBlockedValue()==null) || 
             (this.blockedValue!=null &&
              this.blockedValue.equals(other.getBlockedValue()))) &&
            ((this.dateTimeValue==null && other.getDateTimeValue()==null) || 
             (this.dateTimeValue!=null &&
              this.dateTimeValue.equals(other.getDateTimeValue())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getNumberValue() != null) {
            _hashCode += getNumberValue().hashCode();
        }
        if (getStringValue() != null) {
            _hashCode += getStringValue().hashCode();
        }
        if (getDateValue() != null) {
            _hashCode += getDateValue().hashCode();
        }
        if (getBlockedValue() != null) {
            _hashCode += getBlockedValue().hashCode();
        }
        if (getDateTimeValue() != null) {
            _hashCode += getDateTimeValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTKeyValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTKeyValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumberValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StringValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockedValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BlockedValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateTimeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
