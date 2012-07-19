/**
 * FWTRelationshipFormDataUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTRelationshipFormDataUpdate  implements java.io.Serializable {
    private long relationshipID;

    private lagan.api.main.FWTCaseForm extraData;

    public FWTRelationshipFormDataUpdate() {
    }

    public FWTRelationshipFormDataUpdate(
           long relationshipID,
           lagan.api.main.FWTCaseForm extraData) {
           this.relationshipID = relationshipID;
           this.extraData = extraData;
    }


    /**
     * Gets the relationshipID value for this FWTRelationshipFormDataUpdate.
     * 
     * @return relationshipID
     */
    public long getRelationshipID() {
        return relationshipID;
    }


    /**
     * Sets the relationshipID value for this FWTRelationshipFormDataUpdate.
     * 
     * @param relationshipID
     */
    public void setRelationshipID(long relationshipID) {
        this.relationshipID = relationshipID;
    }


    /**
     * Gets the extraData value for this FWTRelationshipFormDataUpdate.
     * 
     * @return extraData
     */
    public lagan.api.main.FWTCaseForm getExtraData() {
        return extraData;
    }


    /**
     * Sets the extraData value for this FWTRelationshipFormDataUpdate.
     * 
     * @param extraData
     */
    public void setExtraData(lagan.api.main.FWTCaseForm extraData) {
        this.extraData = extraData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTRelationshipFormDataUpdate)) return false;
        FWTRelationshipFormDataUpdate other = (FWTRelationshipFormDataUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.relationshipID == other.getRelationshipID() &&
            ((this.extraData==null && other.getExtraData()==null) || 
             (this.extraData!=null &&
              this.extraData.equals(other.getExtraData())));
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
        _hashCode += new Long(getRelationshipID()).hashCode();
        if (getExtraData() != null) {
            _hashCode += getExtraData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTRelationshipFormDataUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTRelationshipFormDataUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RelationshipID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExtraData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseForm"));
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
