/**
 * FWTReopenCaseRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;


/**
 * Reopening of case
 */
public class FWTReopenCaseRequest  implements java.io.Serializable {
    private java.lang.String caseReference;

    private java.lang.String allocateToUser;

    private java.lang.String allocateToQueueByName;

    private java.lang.String reason;

    private java.lang.Boolean resetTaskSLAs;

    public FWTReopenCaseRequest() {
    }

    public FWTReopenCaseRequest(
           java.lang.String caseReference,
           java.lang.String allocateToUser,
           java.lang.String allocateToQueueByName,
           java.lang.String reason,
           java.lang.Boolean resetTaskSLAs) {
           this.caseReference = caseReference;
           this.allocateToUser = allocateToUser;
           this.allocateToQueueByName = allocateToQueueByName;
           this.reason = reason;
           this.resetTaskSLAs = resetTaskSLAs;
    }


    /**
     * Gets the caseReference value for this FWTReopenCaseRequest.
     * 
     * @return caseReference
     */
    public java.lang.String getCaseReference() {
        return caseReference;
    }


    /**
     * Sets the caseReference value for this FWTReopenCaseRequest.
     * 
     * @param caseReference
     */
    public void setCaseReference(java.lang.String caseReference) {
        this.caseReference = caseReference;
    }


    /**
     * Gets the allocateToUser value for this FWTReopenCaseRequest.
     * 
     * @return allocateToUser
     */
    public java.lang.String getAllocateToUser() {
        return allocateToUser;
    }


    /**
     * Sets the allocateToUser value for this FWTReopenCaseRequest.
     * 
     * @param allocateToUser
     */
    public void setAllocateToUser(java.lang.String allocateToUser) {
        this.allocateToUser = allocateToUser;
    }


    /**
     * Gets the allocateToQueueByName value for this FWTReopenCaseRequest.
     * 
     * @return allocateToQueueByName
     */
    public java.lang.String getAllocateToQueueByName() {
        return allocateToQueueByName;
    }


    /**
     * Sets the allocateToQueueByName value for this FWTReopenCaseRequest.
     * 
     * @param allocateToQueueByName
     */
    public void setAllocateToQueueByName(java.lang.String allocateToQueueByName) {
        this.allocateToQueueByName = allocateToQueueByName;
    }


    /**
     * Gets the reason value for this FWTReopenCaseRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this FWTReopenCaseRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the resetTaskSLAs value for this FWTReopenCaseRequest.
     * 
     * @return resetTaskSLAs
     */
    public java.lang.Boolean getResetTaskSLAs() {
        return resetTaskSLAs;
    }


    /**
     * Sets the resetTaskSLAs value for this FWTReopenCaseRequest.
     * 
     * @param resetTaskSLAs
     */
    public void setResetTaskSLAs(java.lang.Boolean resetTaskSLAs) {
        this.resetTaskSLAs = resetTaskSLAs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTReopenCaseRequest)) return false;
        FWTReopenCaseRequest other = (FWTReopenCaseRequest) obj;
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
            ((this.allocateToUser==null && other.getAllocateToUser()==null) || 
             (this.allocateToUser!=null &&
              this.allocateToUser.equals(other.getAllocateToUser()))) &&
            ((this.allocateToQueueByName==null && other.getAllocateToQueueByName()==null) || 
             (this.allocateToQueueByName!=null &&
              this.allocateToQueueByName.equals(other.getAllocateToQueueByName()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.resetTaskSLAs==null && other.getResetTaskSLAs()==null) || 
             (this.resetTaskSLAs!=null &&
              this.resetTaskSLAs.equals(other.getResetTaskSLAs())));
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
        if (getAllocateToUser() != null) {
            _hashCode += getAllocateToUser().hashCode();
        }
        if (getAllocateToQueueByName() != null) {
            _hashCode += getAllocateToQueueByName().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getResetTaskSLAs() != null) {
            _hashCode += getResetTaskSLAs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTReopenCaseRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTReopenCaseRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CaseReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocateToUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllocateToUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocateToQueueByName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllocateToQueueByName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resetTaskSLAs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resetTaskSLAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
