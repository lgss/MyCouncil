/**
 * FWTObjectID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTObjectID  implements java.io.Serializable {
    private java.lang.String objectType;

    private java.lang.String[] objectReference;

    public FWTObjectID() {
    }

    public FWTObjectID(
           java.lang.String objectType,
           java.lang.String[] objectReference) {
           this.objectType = objectType;
           this.objectReference = objectReference;
    }


    /**
     * Gets the objectType value for this FWTObjectID.
     * 
     * @return objectType
     */
    public java.lang.String getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this FWTObjectID.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.String objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the objectReference value for this FWTObjectID.
     * 
     * @return objectReference
     */
    public java.lang.String[] getObjectReference() {
        return objectReference;
    }


    /**
     * Sets the objectReference value for this FWTObjectID.
     * 
     * @param objectReference
     */
    public void setObjectReference(java.lang.String[] objectReference) {
        this.objectReference = objectReference;
    }

    public java.lang.String getObjectReference(int i) {
        return this.objectReference[i];
    }

    public void setObjectReference(int i, java.lang.String _value) {
        this.objectReference[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTObjectID)) return false;
        FWTObjectID other = (FWTObjectID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType()))) &&
            ((this.objectReference==null && other.getObjectReference()==null) || 
             (this.objectReference!=null &&
              java.util.Arrays.equals(this.objectReference, other.getObjectReference())));
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
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        if (getObjectReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjectReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjectReference(), i);
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
        new org.apache.axis.description.TypeDesc(FWTObjectID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "ObjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "ObjectReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "ObjectReference"));
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
