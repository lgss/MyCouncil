/**
 * FWTCalculateDueDateInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCalculateDueDateInput  implements java.io.Serializable {
    private lagan.api.main.SLATimePeriodType SLATimePeriod;

    private int SLATimeValue;

    private boolean SLAWorkingTime;

    public FWTCalculateDueDateInput() {
    }

    public FWTCalculateDueDateInput(
           lagan.api.main.SLATimePeriodType SLATimePeriod,
           int SLATimeValue,
           boolean SLAWorkingTime) {
           this.SLATimePeriod = SLATimePeriod;
           this.SLATimeValue = SLATimeValue;
           this.SLAWorkingTime = SLAWorkingTime;
    }


    /**
     * Gets the SLATimePeriod value for this FWTCalculateDueDateInput.
     * 
     * @return SLATimePeriod
     */
    public lagan.api.main.SLATimePeriodType getSLATimePeriod() {
        return SLATimePeriod;
    }


    /**
     * Sets the SLATimePeriod value for this FWTCalculateDueDateInput.
     * 
     * @param SLATimePeriod
     */
    public void setSLATimePeriod(lagan.api.main.SLATimePeriodType SLATimePeriod) {
        this.SLATimePeriod = SLATimePeriod;
    }


    /**
     * Gets the SLATimeValue value for this FWTCalculateDueDateInput.
     * 
     * @return SLATimeValue
     */
    public int getSLATimeValue() {
        return SLATimeValue;
    }


    /**
     * Sets the SLATimeValue value for this FWTCalculateDueDateInput.
     * 
     * @param SLATimeValue
     */
    public void setSLATimeValue(int SLATimeValue) {
        this.SLATimeValue = SLATimeValue;
    }


    /**
     * Gets the SLAWorkingTime value for this FWTCalculateDueDateInput.
     * 
     * @return SLAWorkingTime
     */
    public boolean isSLAWorkingTime() {
        return SLAWorkingTime;
    }


    /**
     * Sets the SLAWorkingTime value for this FWTCalculateDueDateInput.
     * 
     * @param SLAWorkingTime
     */
    public void setSLAWorkingTime(boolean SLAWorkingTime) {
        this.SLAWorkingTime = SLAWorkingTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCalculateDueDateInput)) return false;
        FWTCalculateDueDateInput other = (FWTCalculateDueDateInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SLATimePeriod==null && other.getSLATimePeriod()==null) || 
             (this.SLATimePeriod!=null &&
              this.SLATimePeriod.equals(other.getSLATimePeriod()))) &&
            this.SLATimeValue == other.getSLATimeValue() &&
            this.SLAWorkingTime == other.isSLAWorkingTime();
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
        if (getSLATimePeriod() != null) {
            _hashCode += getSLATimePeriod().hashCode();
        }
        _hashCode += getSLATimeValue();
        _hashCode += (isSLAWorkingTime() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTCalculateDueDateInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTCalculateDueDateInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLATimePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SLATimePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "SLATimePeriodType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLATimeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SLATimeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLAWorkingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SLAWorkingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
