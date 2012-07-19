/**
 * FWTCaseWorkflowInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseWorkflowInstance  implements java.io.Serializable {
    private lagan.api.main.FWTCaseWorkflow workflow;

    private int currentStep;

    public FWTCaseWorkflowInstance() {
    }

    public FWTCaseWorkflowInstance(
           lagan.api.main.FWTCaseWorkflow workflow,
           int currentStep) {
           this.workflow = workflow;
           this.currentStep = currentStep;
    }


    /**
     * Gets the workflow value for this FWTCaseWorkflowInstance.
     * 
     * @return workflow
     */
    public lagan.api.main.FWTCaseWorkflow getWorkflow() {
        return workflow;
    }


    /**
     * Sets the workflow value for this FWTCaseWorkflowInstance.
     * 
     * @param workflow
     */
    public void setWorkflow(lagan.api.main.FWTCaseWorkflow workflow) {
        this.workflow = workflow;
    }


    /**
     * Gets the currentStep value for this FWTCaseWorkflowInstance.
     * 
     * @return currentStep
     */
    public int getCurrentStep() {
        return currentStep;
    }


    /**
     * Sets the currentStep value for this FWTCaseWorkflowInstance.
     * 
     * @param currentStep
     */
    public void setCurrentStep(int currentStep) {
        this.currentStep = currentStep;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseWorkflowInstance)) return false;
        FWTCaseWorkflowInstance other = (FWTCaseWorkflowInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workflow==null && other.getWorkflow()==null) || 
             (this.workflow!=null &&
              this.workflow.equals(other.getWorkflow()))) &&
            this.currentStep == other.getCurrentStep();
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
        if (getWorkflow() != null) {
            _hashCode += getWorkflow().hashCode();
        }
        _hashCode += getCurrentStep();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTCaseWorkflowInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseWorkflowInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Workflow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseWorkflow"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentStep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrentStep"));
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
