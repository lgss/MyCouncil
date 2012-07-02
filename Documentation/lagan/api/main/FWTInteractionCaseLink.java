/**
 * FWTInteractionCaseLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTInteractionCaseLink  implements java.io.Serializable {
    private long interactionID;

    private java.lang.String caseReference;

    public FWTInteractionCaseLink() {
    }

    public FWTInteractionCaseLink(
           long interactionID,
           java.lang.String caseReference) {
           this.interactionID = interactionID;
           this.caseReference = caseReference;
    }


    /**
     * Gets the interactionID value for this FWTInteractionCaseLink.
     * 
     * @return interactionID
     */
    public long getInteractionID() {
        return interactionID;
    }


    /**
     * Sets the interactionID value for this FWTInteractionCaseLink.
     * 
     * @param interactionID
     */
    public void setInteractionID(long interactionID) {
        this.interactionID = interactionID;
    }


    /**
     * Gets the caseReference value for this FWTInteractionCaseLink.
     * 
     * @return caseReference
     */
    public java.lang.String getCaseReference() {
        return caseReference;
    }


    /**
     * Sets the caseReference value for this FWTInteractionCaseLink.
     * 
     * @param caseReference
     */
    public void setCaseReference(java.lang.String caseReference) {
        this.caseReference = caseReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTInteractionCaseLink)) return false;
        FWTInteractionCaseLink other = (FWTInteractionCaseLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.interactionID == other.getInteractionID() &&
            ((this.caseReference==null && other.getCaseReference()==null) || 
             (this.caseReference!=null &&
              this.caseReference.equals(other.getCaseReference())));
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
        _hashCode += new Long(getInteractionID()).hashCode();
        if (getCaseReference() != null) {
            _hashCode += getCaseReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTInteractionCaseLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTInteractionCaseLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "InteractionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CaseReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseReference"));
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
