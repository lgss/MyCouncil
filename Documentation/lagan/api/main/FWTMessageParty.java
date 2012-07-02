/**
 * FWTMessageParty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTMessageParty  implements java.io.Serializable {
    private int messageID;

    private java.lang.String subject;

    private java.lang.String text;

    private java.util.Calendar created;

    private lagan.api.main.FWTUser createdBy;

    private lagan.api.main.FWTObjectID party;

    private boolean highPriority;

    public FWTMessageParty() {
    }

    public FWTMessageParty(
           int messageID,
           java.lang.String subject,
           java.lang.String text,
           java.util.Calendar created,
           lagan.api.main.FWTUser createdBy,
           lagan.api.main.FWTObjectID party,
           boolean highPriority) {
           this.messageID = messageID;
           this.subject = subject;
           this.text = text;
           this.created = created;
           this.createdBy = createdBy;
           this.party = party;
           this.highPriority = highPriority;
    }


    /**
     * Gets the messageID value for this FWTMessageParty.
     * 
     * @return messageID
     */
    public int getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this FWTMessageParty.
     * 
     * @param messageID
     */
    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the subject value for this FWTMessageParty.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this FWTMessageParty.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the text value for this FWTMessageParty.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this FWTMessageParty.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the created value for this FWTMessageParty.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this FWTMessageParty.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the createdBy value for this FWTMessageParty.
     * 
     * @return createdBy
     */
    public lagan.api.main.FWTUser getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this FWTMessageParty.
     * 
     * @param createdBy
     */
    public void setCreatedBy(lagan.api.main.FWTUser createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the party value for this FWTMessageParty.
     * 
     * @return party
     */
    public lagan.api.main.FWTObjectID getParty() {
        return party;
    }


    /**
     * Sets the party value for this FWTMessageParty.
     * 
     * @param party
     */
    public void setParty(lagan.api.main.FWTObjectID party) {
        this.party = party;
    }


    /**
     * Gets the highPriority value for this FWTMessageParty.
     * 
     * @return highPriority
     */
    public boolean isHighPriority() {
        return highPriority;
    }


    /**
     * Sets the highPriority value for this FWTMessageParty.
     * 
     * @param highPriority
     */
    public void setHighPriority(boolean highPriority) {
        this.highPriority = highPriority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTMessageParty)) return false;
        FWTMessageParty other = (FWTMessageParty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.messageID == other.getMessageID() &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.party==null && other.getParty()==null) || 
             (this.party!=null &&
              this.party.equals(other.getParty()))) &&
            this.highPriority == other.isHighPriority();
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
        _hashCode += getMessageID();
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getParty() != null) {
            _hashCode += getParty().hashCode();
        }
        _hashCode += (isHighPriority() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTMessageParty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTMessageParty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "MessageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">Subject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">Text"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTUser"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("party");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Party"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HighPriority"));
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
