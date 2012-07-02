/**
 * FLLinkCasesParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FLLinkCasesParams  implements java.io.Serializable {
    private long caseID;

    private long targetCaseID;

    private int linkType;

    public FLLinkCasesParams() {
    }

    public FLLinkCasesParams(
           long caseID,
           long targetCaseID,
           int linkType) {
           this.caseID = caseID;
           this.targetCaseID = targetCaseID;
           this.linkType = linkType;
    }


    /**
     * Gets the caseID value for this FLLinkCasesParams.
     * 
     * @return caseID
     */
    public long getCaseID() {
        return caseID;
    }


    /**
     * Sets the caseID value for this FLLinkCasesParams.
     * 
     * @param caseID
     */
    public void setCaseID(long caseID) {
        this.caseID = caseID;
    }


    /**
     * Gets the targetCaseID value for this FLLinkCasesParams.
     * 
     * @return targetCaseID
     */
    public long getTargetCaseID() {
        return targetCaseID;
    }


    /**
     * Sets the targetCaseID value for this FLLinkCasesParams.
     * 
     * @param targetCaseID
     */
    public void setTargetCaseID(long targetCaseID) {
        this.targetCaseID = targetCaseID;
    }


    /**
     * Gets the linkType value for this FLLinkCasesParams.
     * 
     * @return linkType
     */
    public int getLinkType() {
        return linkType;
    }


    /**
     * Sets the linkType value for this FLLinkCasesParams.
     * 
     * @param linkType
     */
    public void setLinkType(int linkType) {
        this.linkType = linkType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FLLinkCasesParams)) return false;
        FLLinkCasesParams other = (FLLinkCasesParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.caseID == other.getCaseID() &&
            this.targetCaseID == other.getTargetCaseID() &&
            this.linkType == other.getLinkType();
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
        _hashCode += new Long(getCaseID()).hashCode();
        _hashCode += new Long(getTargetCaseID()).hashCode();
        _hashCode += getLinkType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FLLinkCasesParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FLLinkCasesParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetCaseID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetCaseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LinkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
