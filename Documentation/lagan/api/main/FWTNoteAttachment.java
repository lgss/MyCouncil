/**
 * FWTNoteAttachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTNoteAttachment  implements java.io.Serializable {
    private java.lang.String noteText;

    private java.lang.String attachmentName;

    private java.lang.String attachmentIdentifier;

    private java.lang.Integer attachmentType;

    public FWTNoteAttachment() {
    }

    public FWTNoteAttachment(
           java.lang.String noteText,
           java.lang.String attachmentName,
           java.lang.String attachmentIdentifier,
           java.lang.Integer attachmentType) {
           this.noteText = noteText;
           this.attachmentName = attachmentName;
           this.attachmentIdentifier = attachmentIdentifier;
           this.attachmentType = attachmentType;
    }


    /**
     * Gets the noteText value for this FWTNoteAttachment.
     * 
     * @return noteText
     */
    public java.lang.String getNoteText() {
        return noteText;
    }


    /**
     * Sets the noteText value for this FWTNoteAttachment.
     * 
     * @param noteText
     */
    public void setNoteText(java.lang.String noteText) {
        this.noteText = noteText;
    }


    /**
     * Gets the attachmentName value for this FWTNoteAttachment.
     * 
     * @return attachmentName
     */
    public java.lang.String getAttachmentName() {
        return attachmentName;
    }


    /**
     * Sets the attachmentName value for this FWTNoteAttachment.
     * 
     * @param attachmentName
     */
    public void setAttachmentName(java.lang.String attachmentName) {
        this.attachmentName = attachmentName;
    }


    /**
     * Gets the attachmentIdentifier value for this FWTNoteAttachment.
     * 
     * @return attachmentIdentifier
     */
    public java.lang.String getAttachmentIdentifier() {
        return attachmentIdentifier;
    }


    /**
     * Sets the attachmentIdentifier value for this FWTNoteAttachment.
     * 
     * @param attachmentIdentifier
     */
    public void setAttachmentIdentifier(java.lang.String attachmentIdentifier) {
        this.attachmentIdentifier = attachmentIdentifier;
    }


    /**
     * Gets the attachmentType value for this FWTNoteAttachment.
     * 
     * @return attachmentType
     */
    public java.lang.Integer getAttachmentType() {
        return attachmentType;
    }


    /**
     * Sets the attachmentType value for this FWTNoteAttachment.
     * 
     * @param attachmentType
     */
    public void setAttachmentType(java.lang.Integer attachmentType) {
        this.attachmentType = attachmentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTNoteAttachment)) return false;
        FWTNoteAttachment other = (FWTNoteAttachment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.noteText==null && other.getNoteText()==null) || 
             (this.noteText!=null &&
              this.noteText.equals(other.getNoteText()))) &&
            ((this.attachmentName==null && other.getAttachmentName()==null) || 
             (this.attachmentName!=null &&
              this.attachmentName.equals(other.getAttachmentName()))) &&
            ((this.attachmentIdentifier==null && other.getAttachmentIdentifier()==null) || 
             (this.attachmentIdentifier!=null &&
              this.attachmentIdentifier.equals(other.getAttachmentIdentifier()))) &&
            ((this.attachmentType==null && other.getAttachmentType()==null) || 
             (this.attachmentType!=null &&
              this.attachmentType.equals(other.getAttachmentType())));
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
        if (getNoteText() != null) {
            _hashCode += getNoteText().hashCode();
        }
        if (getAttachmentName() != null) {
            _hashCode += getAttachmentName().hashCode();
        }
        if (getAttachmentIdentifier() != null) {
            _hashCode += getAttachmentIdentifier().hashCode();
        }
        if (getAttachmentType() != null) {
            _hashCode += getAttachmentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTNoteAttachment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTNoteAttachment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NoteText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttachmentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttachmentIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttachmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
