/**
 * FWTLinkedCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTLinkedCase  implements java.io.Serializable {
    private java.lang.String linkedCase;

    private java.lang.String key;

    private boolean inverse;

    private java.lang.String invertedKey;

    public FWTLinkedCase() {
    }

    public FWTLinkedCase(
           java.lang.String linkedCase,
           java.lang.String key,
           boolean inverse,
           java.lang.String invertedKey) {
           this.linkedCase = linkedCase;
           this.key = key;
           this.inverse = inverse;
           this.invertedKey = invertedKey;
    }


    /**
     * Gets the linkedCase value for this FWTLinkedCase.
     * 
     * @return linkedCase
     */
    public java.lang.String getLinkedCase() {
        return linkedCase;
    }


    /**
     * Sets the linkedCase value for this FWTLinkedCase.
     * 
     * @param linkedCase
     */
    public void setLinkedCase(java.lang.String linkedCase) {
        this.linkedCase = linkedCase;
    }


    /**
     * Gets the key value for this FWTLinkedCase.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this FWTLinkedCase.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the inverse value for this FWTLinkedCase.
     * 
     * @return inverse
     */
    public boolean isInverse() {
        return inverse;
    }


    /**
     * Sets the inverse value for this FWTLinkedCase.
     * 
     * @param inverse
     */
    public void setInverse(boolean inverse) {
        this.inverse = inverse;
    }


    /**
     * Gets the invertedKey value for this FWTLinkedCase.
     * 
     * @return invertedKey
     */
    public java.lang.String getInvertedKey() {
        return invertedKey;
    }


    /**
     * Sets the invertedKey value for this FWTLinkedCase.
     * 
     * @param invertedKey
     */
    public void setInvertedKey(java.lang.String invertedKey) {
        this.invertedKey = invertedKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTLinkedCase)) return false;
        FWTLinkedCase other = (FWTLinkedCase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.linkedCase==null && other.getLinkedCase()==null) || 
             (this.linkedCase!=null &&
              this.linkedCase.equals(other.getLinkedCase()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            this.inverse == other.isInverse() &&
            ((this.invertedKey==null && other.getInvertedKey()==null) || 
             (this.invertedKey!=null &&
              this.invertedKey.equals(other.getInvertedKey())));
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
        if (getLinkedCase() != null) {
            _hashCode += getLinkedCase().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        _hashCode += (isInverse() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInvertedKey() != null) {
            _hashCode += getInvertedKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTLinkedCase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTLinkedCase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedCase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LinkedCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inverse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Inverse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invertedKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InvertedKey"));
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
