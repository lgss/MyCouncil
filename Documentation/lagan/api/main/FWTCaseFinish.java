/**
 * FWTCaseFinish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseFinish  implements java.io.Serializable {
    private java.lang.String[] caseReference;

    private java.util.Calendar rescheduleDate;

    private java.lang.String reallocateQueue;

    /* complete, incomplete, reschedule */
    private java.lang.String workFlowCompletionStatus;

    private lagan.api.main.FWTCaseActionReason reason;

    public FWTCaseFinish() {
    }

    public FWTCaseFinish(
           java.lang.String[] caseReference,
           java.util.Calendar rescheduleDate,
           java.lang.String reallocateQueue,
           java.lang.String workFlowCompletionStatus,
           lagan.api.main.FWTCaseActionReason reason) {
           this.caseReference = caseReference;
           this.rescheduleDate = rescheduleDate;
           this.reallocateQueue = reallocateQueue;
           this.workFlowCompletionStatus = workFlowCompletionStatus;
           this.reason = reason;
    }


    /**
     * Gets the caseReference value for this FWTCaseFinish.
     * 
     * @return caseReference
     */
    public java.lang.String[] getCaseReference() {
        return caseReference;
    }


    /**
     * Sets the caseReference value for this FWTCaseFinish.
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
     * Gets the rescheduleDate value for this FWTCaseFinish.
     * 
     * @return rescheduleDate
     */
    public java.util.Calendar getRescheduleDate() {
        return rescheduleDate;
    }


    /**
     * Sets the rescheduleDate value for this FWTCaseFinish.
     * 
     * @param rescheduleDate
     */
    public void setRescheduleDate(java.util.Calendar rescheduleDate) {
        this.rescheduleDate = rescheduleDate;
    }


    /**
     * Gets the reallocateQueue value for this FWTCaseFinish.
     * 
     * @return reallocateQueue
     */
    public java.lang.String getReallocateQueue() {
        return reallocateQueue;
    }


    /**
     * Sets the reallocateQueue value for this FWTCaseFinish.
     * 
     * @param reallocateQueue
     */
    public void setReallocateQueue(java.lang.String reallocateQueue) {
        this.reallocateQueue = reallocateQueue;
    }


    /**
     * Gets the workFlowCompletionStatus value for this FWTCaseFinish.
     * 
     * @return workFlowCompletionStatus   * complete, incomplete, reschedule
     */
    public java.lang.String getWorkFlowCompletionStatus() {
        return workFlowCompletionStatus;
    }


    /**
     * Sets the workFlowCompletionStatus value for this FWTCaseFinish.
     * 
     * @param workFlowCompletionStatus   * complete, incomplete, reschedule
     */
    public void setWorkFlowCompletionStatus(java.lang.String workFlowCompletionStatus) {
        this.workFlowCompletionStatus = workFlowCompletionStatus;
    }


    /**
     * Gets the reason value for this FWTCaseFinish.
     * 
     * @return reason
     */
    public lagan.api.main.FWTCaseActionReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this FWTCaseFinish.
     * 
     * @param reason
     */
    public void setReason(lagan.api.main.FWTCaseActionReason reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseFinish)) return false;
        FWTCaseFinish other = (FWTCaseFinish) obj;
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
            ((this.rescheduleDate==null && other.getRescheduleDate()==null) || 
             (this.rescheduleDate!=null &&
              this.rescheduleDate.equals(other.getRescheduleDate()))) &&
            ((this.reallocateQueue==null && other.getReallocateQueue()==null) || 
             (this.reallocateQueue!=null &&
              this.reallocateQueue.equals(other.getReallocateQueue()))) &&
            ((this.workFlowCompletionStatus==null && other.getWorkFlowCompletionStatus()==null) || 
             (this.workFlowCompletionStatus!=null &&
              this.workFlowCompletionStatus.equals(other.getWorkFlowCompletionStatus()))) &&
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
        if (getRescheduleDate() != null) {
            _hashCode += getRescheduleDate().hashCode();
        }
        if (getReallocateQueue() != null) {
            _hashCode += getReallocateQueue().hashCode();
        }
        if (getWorkFlowCompletionStatus() != null) {
            _hashCode += getWorkFlowCompletionStatus().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTCaseFinish.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTCaseFinish"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CaseReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CaseReference"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rescheduleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RescheduleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reallocateQueue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReallocateQueue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workFlowCompletionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkFlowCompletionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
