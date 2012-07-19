/**
 * FWTCaseClose.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseClose  implements java.io.Serializable {
    private java.lang.String[] caseReference;

    private lagan.api.main.FWTCaseActionReason reason;

    public FWTCaseClose() {
    }

    public FWTCaseClose(
           java.lang.String[] caseReference,
           lagan.api.main.FWTCaseActionReason reason) {
           this.caseReference = caseReference;
           this.reason = reason;
    }


    /**
     * Gets the caseReference value for this FWTCaseClose.
     * 
     * @return caseReference
     */
    public java.lang.String[] getCaseReference() {
        return caseReference;
    }


    /**
     * Sets the caseReference value for this FWTCaseClose.
     * 
     * @param caseReference
     */
    public void setCaseReference(java.lang.String[] caseReference) {
        this.caseReference = caseReference;
    }

    public java.lang.String getCaseReference(int i) {
        return this.caseReference[i];
    }

    public void setCaseReference(int i, java.lang.String _value) {
        this.caseReference[i] = _value;
    }


    /**
     * Gets the reason value for this FWTCaseClose.
     * 
     * @return reason
     */
    public lagan.api.main.FWTCaseActionReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this FWTCaseClose.
     * 
     * @param reason
     */
    public void setReason(lagan.api.main.FWTCaseActionReason reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseClose)) return false;
        FWTCaseClose other = (FWTCaseClose) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseReference==null && other.getCaseReference()==null) || 
             (this.caseReference!=null &&
              java.util.Arrays.equals(this.caseReference, other.getCaseReference()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getCaseReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTCaseClose.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTCaseClose"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CaseReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CaseReference"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseActionReason"));
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
