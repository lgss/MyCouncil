/**
 * FWTCaseWorkflow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseWorkflow  implements java.io.Serializable {
    private java.lang.String flowName;

    private java.lang.String[] queue;

    private java.lang.String exceptionQueue;

    public FWTCaseWorkflow() {
    }

    public FWTCaseWorkflow(
           java.lang.String flowName,
           java.lang.String[] queue,
           java.lang.String exceptionQueue) {
           this.flowName = flowName;
           this.queue = queue;
           this.exceptionQueue = exceptionQueue;
    }


    /**
     * Gets the flowName value for this FWTCaseWorkflow.
     * 
     * @return flowName
     */
    public java.lang.String getFlowName() {
        return flowName;
    }


    /**
     * Sets the flowName value for this FWTCaseWorkflow.
     * 
     * @param flowName
     */
    public void setFlowName(java.lang.String flowName) {
        this.flowName = flowName;
    }


    /**
     * Gets the queue value for this FWTCaseWorkflow.
     * 
     * @return queue
     */
    public java.lang.String[] getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this FWTCaseWorkflow.
     * 
     * @param queue
     */
    public void setQueue(java.lang.String[] queue) {
        this.queue = queue;
    }

    public java.lang.String getQueue(int i) {
        return this.queue[i];
    }

    public void setQueue(int i, java.lang.String _value) {
        this.queue[i] = _value;
    }


    /**
     * Gets the exceptionQueue value for this FWTCaseWorkflow.
     * 
     * @return exceptionQueue
     */
    public java.lang.String getExceptionQueue() {
        return exceptionQueue;
    }


    /**
     * Sets the exceptionQueue value for this FWTCaseWorkflow.
     * 
     * @param exceptionQueue
     */
    public void setExceptionQueue(java.lang.String exceptionQueue) {
        this.exceptionQueue = exceptionQueue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseWorkflow)) return false;
        FWTCaseWorkflow other = (FWTCaseWorkflow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flowName==null && other.getFlowName()==null) || 
             (this.flowName!=null &&
              this.flowName.equals(other.getFlowName()))) &&
            ((this.queue==null && other.getQueue()==null) || 
             (this.queue!=null &&
              java.util.Arrays.equals(this.queue, other.getQueue()))) &&
            ((this.exceptionQueue==null && other.getExceptionQueue()==null) || 
             (this.exceptionQueue!=null &&
              this.exceptionQueue.equals(other.getExceptionQueue())));
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
        if (getFlowName() != null) {
            _hashCode += getFlowName().hashCode();
        }
        if (getQueue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExceptionQueue() != null) {
            _hashCode += getExceptionQueue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTCaseWorkflow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseWorkflow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FlowName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseQueue"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionQueue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExceptionQueue"));
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
