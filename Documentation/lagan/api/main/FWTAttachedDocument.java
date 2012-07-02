/**
 * FWTAttachedDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTAttachedDocument  implements java.io.Serializable {
    private java.lang.String documentName;

    private java.lang.String documentReference;

    /* Standard storage is 0 */
    private java.lang.Integer storageType;

    public FWTAttachedDocument() {
    }

    public FWTAttachedDocument(
           java.lang.String documentName,
           java.lang.String documentReference,
           java.lang.Integer storageType) {
           this.documentName = documentName;
           this.documentReference = documentReference;
           this.storageType = storageType;
    }


    /**
     * Gets the documentName value for this FWTAttachedDocument.
     * 
     * @return documentName
     */
    public java.lang.String getDocumentName() {
        return documentName;
    }


    /**
     * Sets the documentName value for this FWTAttachedDocument.
     * 
     * @param documentName
     */
    public void setDocumentName(java.lang.String documentName) {
        this.documentName = documentName;
    }


    /**
     * Gets the documentReference value for this FWTAttachedDocument.
     * 
     * @return documentReference
     */
    public java.lang.String getDocumentReference() {
        return documentReference;
    }


    /**
     * Sets the documentReference value for this FWTAttachedDocument.
     * 
     * @param documentReference
     */
    public void setDocumentReference(java.lang.String documentReference) {
        this.documentReference = documentReference;
    }


    /**
     * Gets the storageType value for this FWTAttachedDocument.
     * 
     * @return storageType   * Standard storage is 0
     */
    public java.lang.Integer getStorageType() {
        return storageType;
    }


    /**
     * Sets the storageType value for this FWTAttachedDocument.
     * 
     * @param storageType   * Standard storage is 0
     */
    public void setStorageType(java.lang.Integer storageType) {
        this.storageType = storageType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTAttachedDocument)) return false;
        FWTAttachedDocument other = (FWTAttachedDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentName==null && other.getDocumentName()==null) || 
             (this.documentName!=null &&
              this.documentName.equals(other.getDocumentName()))) &&
            ((this.documentReference==null && other.getDocumentReference()==null) || 
             (this.documentReference!=null &&
              this.documentReference.equals(other.getDocumentReference()))) &&
            ((this.storageType==null && other.getStorageType()==null) || 
             (this.storageType!=null &&
              this.storageType.equals(other.getStorageType())));
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
        if (getDocumentName() != null) {
            _hashCode += getDocumentName().hashCode();
        }
        if (getDocumentReference() != null) {
            _hashCode += getDocumentReference().hashCode();
        }
        if (getStorageType() != null) {
            _hashCode += getStorageType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTAttachedDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTAttachedDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storageType"));
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
