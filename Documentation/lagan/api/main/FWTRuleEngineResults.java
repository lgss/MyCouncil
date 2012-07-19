/**
 * FWTRuleEngineResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTRuleEngineResults  implements java.io.Serializable {
    private java.lang.Long sessionID;

    private lagan.api.main.FWTRuleEngineItem[] output;

    public FWTRuleEngineResults() {
    }

    public FWTRuleEngineResults(
           java.lang.Long sessionID,
           lagan.api.main.FWTRuleEngineItem[] output) {
           this.sessionID = sessionID;
           this.output = output;
    }


    /**
     * Gets the sessionID value for this FWTRuleEngineResults.
     * 
     * @return sessionID
     */
    public java.lang.Long getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this FWTRuleEngineResults.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.Long sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the output value for this FWTRuleEngineResults.
     * 
     * @return output
     */
    public lagan.api.main.FWTRuleEngineItem[] getOutput() {
        return output;
    }


    /**
     * Sets the output value for this FWTRuleEngineResults.
     * 
     * @param output
     */
    public void setOutput(lagan.api.main.FWTRuleEngineItem[] output) {
        this.output = output;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTRuleEngineResults)) return false;
        FWTRuleEngineResults other = (FWTRuleEngineResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID()))) &&
            ((this.output==null && other.getOutput()==null) || 
             (this.output!=null &&
              java.util.Arrays.equals(this.output, other.getOutput())));
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
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        if (getOutput() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutput());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutput(), i);
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
        new org.apache.axis.description.TypeDesc(FWTRuleEngineResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTRuleEngineResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTRuleEngineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "FWTRuleEngineItem"));
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
