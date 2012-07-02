/**
 * FWTCaseEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseEvent  implements java.io.Serializable {
    private java.lang.String eventTitle;

    private java.util.Calendar created;

    private lagan.api.main.FWTUser handledBy;

    private java.lang.String additionalInfo;

    private java.lang.String caseQueue;

    public FWTCaseEvent() {
    }

    public FWTCaseEvent(
           java.lang.String eventTitle,
           java.util.Calendar created,
           lagan.api.main.FWTUser handledBy,
           java.lang.String additionalInfo,
           java.lang.String caseQueue) {
           this.eventTitle = eventTitle;
           this.created = created;
           this.handledBy = handledBy;
           this.additionalInfo = additionalInfo;
           this.caseQueue = caseQueue;
    }


    /**
     * Gets the eventTitle value for this FWTCaseEvent.
     * 
     * @return eventTitle
     */
    public java.lang.String getEventTitle() {
        return eventTitle;
    }


    /**
     * Sets the eventTitle value for this FWTCaseEvent.
     * 
     * @param eventTitle
     */
    public void setEventTitle(java.lang.String eventTitle) {
        this.eventTitle = eventTitle;
    }


    /**
     * Gets the created value for this FWTCaseEvent.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this FWTCaseEvent.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the handledBy value for this FWTCaseEvent.
     * 
     * @return handledBy
     */
    public lagan.api.main.FWTUser getHandledBy() {
        return handledBy;
    }


    /**
     * Sets the handledBy value for this FWTCaseEvent.
     * 
     * @param handledBy
     */
    public void setHandledBy(lagan.api.main.FWTUser handledBy) {
        this.handledBy = handledBy;
    }


    /**
     * Gets the additionalInfo value for this FWTCaseEvent.
     * 
     * @return additionalInfo
     */
    public java.lang.String getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this FWTCaseEvent.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(java.lang.String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the caseQueue value for this FWTCaseEvent.
     * 
     * @return caseQueue
     */
    public java.lang.String getCaseQueue() {
        return caseQueue;
    }


    /**
     * Sets the caseQueue value for this FWTCaseEvent.
     * 
     * @param caseQueue
     */
    public void setCaseQueue(java.lang.String caseQueue) {
        this.caseQueue = caseQueue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseEvent)) return false;
        FWTCaseEvent other = (FWTCaseEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventTitle==null && other.getEventTitle()==null) || 
             (this.eventTitle!=null &&
              this.eventTitle.equals(other.getEventTitle()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.handledBy==null && other.getHandledBy()==null) || 
             (this.handledBy!=null &&
              this.handledBy.equals(other.getHandledBy()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              this.additionalInfo.equals(other.getAdditionalInfo()))) &&
            ((this.caseQueue==null && other.getCaseQueue()==null) || 
             (this.caseQueue!=null &&
              this.caseQueue.equals(other.getCaseQueue())));
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
        if (getEventTitle() != null) {
            _hashCode += getEventTitle().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getHandledBy() != null) {
            _hashCode += getHandledBy().hashCode();
        }
        if (getAdditionalInfo() != null) {
            _hashCode += getAdditionalInfo().hashCode();
        }
        if (getCaseQueue() != null) {
            _hashCode += getCaseQueue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTCaseEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EventTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handledBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HandledBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTUser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseQueue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaseQueue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
