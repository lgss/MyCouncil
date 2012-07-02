/**
 * FWTRuleEngineCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTRuleEngineCriteria  implements java.io.Serializable {
    private long ruleSet;

    private long caseId;

    private java.lang.String userId;

    private lagan.api.main.FWTRuleEngineItem[] data;

    public FWTRuleEngineCriteria() {
    }

    public FWTRuleEngineCriteria(
           long ruleSet,
           long caseId,
           java.lang.String userId,
           lagan.api.main.FWTRuleEngineItem[] data) {
           this.ruleSet = ruleSet;
           this.caseId = caseId;
           this.userId = userId;
           this.data = data;
    }


    /**
     * Gets the ruleSet value for this FWTRuleEngineCriteria.
     * 
     * @return ruleSet
     */
    public long getRuleSet() {
        return ruleSet;
    }


    /**
     * Sets the ruleSet value for this FWTRuleEngineCriteria.
     * 
     * @param ruleSet
     */
    public void setRuleSet(long ruleSet) {
        this.ruleSet = ruleSet;
    }


    /**
     * Gets the caseId value for this FWTRuleEngineCriteria.
     * 
     * @return caseId
     */
    public long getCaseId() {
        return caseId;
    }


    /**
     * Sets the caseId value for this FWTRuleEngineCriteria.
     * 
     * @param caseId
     */
    public void setCaseId(long caseId) {
        this.caseId = caseId;
    }


    /**
     * Gets the userId value for this FWTRuleEngineCriteria.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this FWTRuleEngineCriteria.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the data value for this FWTRuleEngineCriteria.
     * 
     * @return data
     */
    public lagan.api.main.FWTRuleEngineItem[] getData() {
        return data;
    }


    /**
     * Sets the data value for this FWTRuleEngineCriteria.
     * 
     * @param data
     */
    public void setData(lagan.api.main.FWTRuleEngineItem[] data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTRuleEngineCriteria)) return false;
        FWTRuleEngineCriteria other = (FWTRuleEngineCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ruleSet == other.getRuleSet() &&
            this.caseId == other.getCaseId() &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData())));
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
        _hashCode += new Long(getRuleSet()).hashCode();
        _hashCode += new Long(getCaseId()).hashCode();
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
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
        new org.apache.axis.description.TypeDesc(FWTRuleEngineCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTRuleEngineCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RuleSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTRuleEngineItem"));
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
