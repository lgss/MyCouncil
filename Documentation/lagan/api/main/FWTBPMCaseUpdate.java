/**
 * FWTBPMCaseUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTBPMCaseUpdate  implements java.io.Serializable {
    private java.lang.String BPMReference;

    /* add, remove */
    private java.lang.String BPMUpdateType;

    public FWTBPMCaseUpdate() {
    }

    public FWTBPMCaseUpdate(
           java.lang.String BPMReference,
           java.lang.String BPMUpdateType) {
           this.BPMReference = BPMReference;
           this.BPMUpdateType = BPMUpdateType;
    }


    /**
     * Gets the BPMReference value for this FWTBPMCaseUpdate.
     * 
     * @return BPMReference
     */
    public java.lang.String getBPMReference() {
        return BPMReference;
    }


    /**
     * Sets the BPMReference value for this FWTBPMCaseUpdate.
     * 
     * @param BPMReference
     */
    public void setBPMReference(java.lang.String BPMReference) {
        this.BPMReference = BPMReference;
    }


    /**
     * Gets the BPMUpdateType value for this FWTBPMCaseUpdate.
     * 
     * @return BPMUpdateType   * add, remove
     */
    public java.lang.String getBPMUpdateType() {
        return BPMUpdateType;
    }


    /**
     * Sets the BPMUpdateType value for this FWTBPMCaseUpdate.
     * 
     * @param BPMUpdateType   * add, remove
     */
    public void setBPMUpdateType(java.lang.String BPMUpdateType) {
        this.BPMUpdateType = BPMUpdateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTBPMCaseUpdate)) return false;
        FWTBPMCaseUpdate other = (FWTBPMCaseUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BPMReference==null && other.getBPMReference()==null) || 
             (this.BPMReference!=null &&
              this.BPMReference.equals(other.getBPMReference()))) &&
            ((this.BPMUpdateType==null && other.getBPMUpdateType()==null) || 
             (this.BPMUpdateType!=null &&
              this.BPMUpdateType.equals(other.getBPMUpdateType())));
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
        if (getBPMReference() != null) {
            _hashCode += getBPMReference().hashCode();
        }
        if (getBPMUpdateType() != null) {
            _hashCode += getBPMUpdateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTBPMCaseUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTBPMCaseUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BPMReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BPMReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BPMUpdateType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BPMUpdateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
