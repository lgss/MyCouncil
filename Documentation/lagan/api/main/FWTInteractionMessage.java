/**
 * FWTInteractionMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTInteractionMessage  implements java.io.Serializable {
    private java.lang.String from;

    private java.lang.String to;

    private java.util.Calendar sent;

    private java.util.Calendar received;

    private java.lang.String subject;

    private java.lang.String content;

    /* Possible Values: LETTER=0(Default), EMAIL=1, FAX=2, SMS=3,
     * GENERATED_LETTER=4 */
    private java.lang.Integer messageType;

    private lagan.api.main.FWTAttachedDocument[] attachedDocuments;

    public FWTInteractionMessage() {
    }

    public FWTInteractionMessage(
           java.lang.String from,
           java.lang.String to,
           java.util.Calendar sent,
           java.util.Calendar received,
           java.lang.String subject,
           java.lang.String content,
           java.lang.Integer messageType,
           lagan.api.main.FWTAttachedDocument[] attachedDocuments) {
           this.from = from;
           this.to = to;
           this.sent = sent;
           this.received = received;
           this.subject = subject;
           this.content = content;
           this.messageType = messageType;
           this.attachedDocuments = attachedDocuments;
    }


    /**
     * Gets the from value for this FWTInteractionMessage.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this FWTInteractionMessage.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the to value for this FWTInteractionMessage.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this FWTInteractionMessage.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the sent value for this FWTInteractionMessage.
     * 
     * @return sent
     */
    public java.util.Calendar getSent() {
        return sent;
    }


    /**
     * Sets the sent value for this FWTInteractionMessage.
     * 
     * @param sent
     */
    public void setSent(java.util.Calendar sent) {
        this.sent = sent;
    }


    /**
     * Gets the received value for this FWTInteractionMessage.
     * 
     * @return received
     */
    public java.util.Calendar getReceived() {
        return received;
    }


    /**
     * Sets the received value for this FWTInteractionMessage.
     * 
     * @param received
     */
    public void setReceived(java.util.Calendar received) {
        this.received = received;
    }


    /**
     * Gets the subject value for this FWTInteractionMessage.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this FWTInteractionMessage.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the content value for this FWTInteractionMessage.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this FWTInteractionMessage.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the messageType value for this FWTInteractionMessage.
     * 
     * @return messageType   * Possible Values: LETTER=0(Default), EMAIL=1, FAX=2, SMS=3,
     * GENERATED_LETTER=4
     */
    public java.lang.Integer getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this FWTInteractionMessage.
     * 
     * @param messageType   * Possible Values: LETTER=0(Default), EMAIL=1, FAX=2, SMS=3,
     * GENERATED_LETTER=4
     */
    public void setMessageType(java.lang.Integer messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the attachedDocuments value for this FWTInteractionMessage.
     * 
     * @return attachedDocuments
     */
    public lagan.api.main.FWTAttachedDocument[] getAttachedDocuments() {
        return attachedDocuments;
    }


    /**
     * Sets the attachedDocuments value for this FWTInteractionMessage.
     * 
     * @param attachedDocuments
     */
    public void setAttachedDocuments(lagan.api.main.FWTAttachedDocument[] attachedDocuments) {
        this.attachedDocuments = attachedDocuments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTInteractionMessage)) return false;
        FWTInteractionMessage other = (FWTInteractionMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.sent==null && other.getSent()==null) || 
             (this.sent!=null &&
              this.sent.equals(other.getSent()))) &&
            ((this.received==null && other.getReceived()==null) || 
             (this.received!=null &&
              this.received.equals(other.getReceived()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.attachedDocuments==null && other.getAttachedDocuments()==null) || 
             (this.attachedDocuments!=null &&
              java.util.Arrays.equals(this.attachedDocuments, other.getAttachedDocuments())));
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
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getSent() != null) {
            _hashCode += getSent().hashCode();
        }
        if (getReceived() != null) {
            _hashCode += getReceived().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getAttachedDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachedDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachedDocuments(), i);
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
        new org.apache.axis.description.TypeDesc(FWTInteractionMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTInteractionMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("received");
        elemField.setXmlName(new javax.xml.namespace.QName("", "received"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachedDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttachedDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTAttachedDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "AttachedDocument"));
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
