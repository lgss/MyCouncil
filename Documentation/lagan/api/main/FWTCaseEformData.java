/**
 * FWTCaseEformData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseEformData  implements java.io.Serializable {
    private lagan.api.main.FWTCaseEformInstance caseEformInstance;

    private lagan.api.main.FWTEformField[] eformData;

    public FWTCaseEformData() {
    }

    public FWTCaseEformData(
           lagan.api.main.FWTCaseEformInstance caseEformInstance,
           lagan.api.main.FWTEformField[] eformData) {
           this.caseEformInstance = caseEformInstance;
           this.eformData = eformData;
    }


    /**
     * Gets the caseEformInstance value for this FWTCaseEformData.
     * 
     * @return caseEformInstance
     */
    public lagan.api.main.FWTCaseEformInstance getCaseEformInstance() {
        return caseEformInstance;
    }


    /**
     * Sets the caseEformInstance value for this FWTCaseEformData.
     * 
     * @param caseEformInstance
     */
    public void setCaseEformInstance(lagan.api.main.FWTCaseEformInstance caseEformInstance) {
        this.caseEformInstance = caseEformInstance;
    }


    /**
     * Gets the eformData value for this FWTCaseEformData.
     * 
     * @return eformData
     */
    public lagan.api.main.FWTEformField[] getEformData() {
        return eformData;
    }


    /**
     * Sets the eformData value for this FWTCaseEformData.
     * 
     * @param eformData
     */
    public void setEformData(lagan.api.main.FWTEformField[] eformData) {
        this.eformData = eformData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseEformData)) return false;
        FWTCaseEformData other = (FWTCaseEformData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseEformInstance==null && other.getCaseEformInstance()==null) || 
             (this.caseEformInstance!=null &&
              this.caseEformInstance.equals(other.getCaseEformInstance()))) &&
            ((this.eformData==null && other.getEformData()==null) || 
             (this.eformData!=null &&
              java.util.Arrays.equals(this.eformData, other.getEformData())));
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
        if (getCaseEformInstance() != null) {
            _hashCode += getCaseEformInstance().hashCode();
        }
        if (getEformData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEformData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEformData(), i);
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
        new org.apache.axis.description.TypeDesc(FWTCaseEformData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseEformData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseEformInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaseEformInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseEformInstance"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eformData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EformData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTEformField"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "EformFields"));
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
