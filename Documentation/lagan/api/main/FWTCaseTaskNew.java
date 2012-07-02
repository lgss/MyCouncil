/**
 * FWTCaseTaskNew.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseTaskNew  implements java.io.Serializable {
    private java.lang.String caseReference;

    private java.lang.Integer taskDefinitionID;

    private lagan.api.main.FWTCaseTaskNewManualTask manualTask;

    public FWTCaseTaskNew() {
    }

    public FWTCaseTaskNew(
           java.lang.String caseReference,
           java.lang.Integer taskDefinitionID,
           lagan.api.main.FWTCaseTaskNewManualTask manualTask) {
           this.caseReference = caseReference;
           this.taskDefinitionID = taskDefinitionID;
           this.manualTask = manualTask;
    }


    /**
     * Gets the caseReference value for this FWTCaseTaskNew.
     * 
     * @return caseReference
     */
    public java.lang.String getCaseReference() {
        return caseReference;
    }


    /**
     * Sets the caseReference value for this FWTCaseTaskNew.
     * 
     * @param caseReference
     */
    public void setCaseReference(java.lang.String caseReference) {
        this.caseReference = caseReference;
    }


    /**
     * Gets the taskDefinitionID value for this FWTCaseTaskNew.
     * 
     * @return taskDefinitionID
     */
    public java.lang.Integer getTaskDefinitionID() {
        return taskDefinitionID;
    }


    /**
     * Sets the taskDefinitionID value for this FWTCaseTaskNew.
     * 
     * @param taskDefinitionID
     */
    public void setTaskDefinitionID(java.lang.Integer taskDefinitionID) {
        this.taskDefinitionID = taskDefinitionID;
    }


    /**
     * Gets the manualTask value for this FWTCaseTaskNew.
     * 
     * @return manualTask
     */
    public lagan.api.main.FWTCaseTaskNewManualTask getManualTask() {
        return manualTask;
    }


    /**
     * Sets the manualTask value for this FWTCaseTaskNew.
     * 
     * @param manualTask
     */
    public void setManualTask(lagan.api.main.FWTCaseTaskNewManualTask manualTask) {
        this.manualTask = manualTask;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseTaskNew)) return false;
        FWTCaseTaskNew other = (FWTCaseTaskNew) obj;
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
              this.caseReference.equals(other.getCaseReference()))) &&
            ((this.taskDefinitionID==null && other.getTaskDefinitionID()==null) || 
             (this.taskDefinitionID!=null &&
              this.taskDefinitionID.equals(other.getTaskDefinitionID()))) &&
            ((this.manualTask==null && other.getManualTask()==null) || 
             (this.manualTask!=null &&
              this.manualTask.equals(other.getManualTask())));
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
            _hashCode += getCaseReference().hashCode();
        }
        if (getTaskDefinitionID() != null) {
            _hashCode += getTaskDefinitionID().hashCode();
        }
        if (getManualTask() != null) {
            _hashCode += getManualTask().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTCaseTaskNew.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTCaseTaskNew"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CaseReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskDefinitionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskDefinitionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualTask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ManualTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTCaseTaskNew>ManualTask"));
        elemField.setMinOccurs(0);
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
