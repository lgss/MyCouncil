/**
 * FWTCaseTaskNewManualTaskDuration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseTaskNewManualTaskDuration  implements java.io.Serializable {
    /* minute,
     *                                                                 hour,
     * day,
     *                                                                 week */
    private java.lang.String timeUnit;

    private int timeAmount;

    private boolean workingTime;

    public FWTCaseTaskNewManualTaskDuration() {
    }

    public FWTCaseTaskNewManualTaskDuration(
           java.lang.String timeUnit,
           int timeAmount,
           boolean workingTime) {
           this.timeUnit = timeUnit;
           this.timeAmount = timeAmount;
           this.workingTime = workingTime;
    }


    /**
     * Gets the timeUnit value for this FWTCaseTaskNewManualTaskDuration.
     * 
     * @return timeUnit   * minute,
     *                                                                 hour,
     * day,
     *                                                                 week
     */
    public java.lang.String getTimeUnit() {
        return timeUnit;
    }


    /**
     * Sets the timeUnit value for this FWTCaseTaskNewManualTaskDuration.
     * 
     * @param timeUnit   * minute,
     *                                                                 hour,
     * day,
     *                                                                 week
     */
    public void setTimeUnit(java.lang.String timeUnit) {
        this.timeUnit = timeUnit;
    }


    /**
     * Gets the timeAmount value for this FWTCaseTaskNewManualTaskDuration.
     * 
     * @return timeAmount
     */
    public int getTimeAmount() {
        return timeAmount;
    }


    /**
     * Sets the timeAmount value for this FWTCaseTaskNewManualTaskDuration.
     * 
     * @param timeAmount
     */
    public void setTimeAmount(int timeAmount) {
        this.timeAmount = timeAmount;
    }


    /**
     * Gets the workingTime value for this FWTCaseTaskNewManualTaskDuration.
     * 
     * @return workingTime
     */
    public boolean isWorkingTime() {
        return workingTime;
    }


    /**
     * Sets the workingTime value for this FWTCaseTaskNewManualTaskDuration.
     * 
     * @param workingTime
     */
    public void setWorkingTime(boolean workingTime) {
        this.workingTime = workingTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseTaskNewManualTaskDuration)) return false;
        FWTCaseTaskNewManualTaskDuration other = (FWTCaseTaskNewManualTaskDuration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeUnit==null && other.getTimeUnit()==null) || 
             (this.timeUnit!=null &&
              this.timeUnit.equals(other.getTimeUnit()))) &&
            this.timeAmount == other.getTimeAmount() &&
            this.workingTime == other.isWorkingTime();
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
        if (getTimeUnit() != null) {
            _hashCode += getTimeUnit().hashCode();
        }
        _hashCode += getTimeAmount();
        _hashCode += (isWorkingTime() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTCaseTaskNewManualTaskDuration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>>FWTCaseTaskNew>ManualTask>Duration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TimeUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TimeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkingTime"));
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
