/**
 * FWTNoteDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTNoteDetail  implements java.io.Serializable {
    private java.lang.Long noteId;

    private java.util.Calendar created;

    private lagan.api.main.FWTUser createdBy;

    private java.lang.String text;

    private lagan.api.main.FWTNoteDetailAttachment[] noteAttachments;

    public FWTNoteDetail() {
    }

    public FWTNoteDetail(
           java.lang.Long noteId,
           java.util.Calendar created,
           lagan.api.main.FWTUser createdBy,
           java.lang.String text,
           lagan.api.main.FWTNoteDetailAttachment[] noteAttachments) {
           this.noteId = noteId;
           this.created = created;
           this.createdBy = createdBy;
           this.text = text;
           this.noteAttachments = noteAttachments;
    }


    /**
     * Gets the noteId value for this FWTNoteDetail.
     * 
     * @return noteId
     */
    public java.lang.Long getNoteId() {
        return noteId;
    }


    /**
     * Sets the noteId value for this FWTNoteDetail.
     * 
     * @param noteId
     */
    public void setNoteId(java.lang.Long noteId) {
        this.noteId = noteId;
    }


    /**
     * Gets the created value for this FWTNoteDetail.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this FWTNoteDetail.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the createdBy value for this FWTNoteDetail.
     * 
     * @return createdBy
     */
    public lagan.api.main.FWTUser getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this FWTNoteDetail.
     * 
     * @param createdBy
     */
    public void setCreatedBy(lagan.api.main.FWTUser createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the text value for this FWTNoteDetail.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this FWTNoteDetail.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the noteAttachments value for this FWTNoteDetail.
     * 
     * @return noteAttachments
     */
    public lagan.api.main.FWTNoteDetailAttachment[] getNoteAttachments() {
        return noteAttachments;
    }


    /**
     * Sets the noteAttachments value for this FWTNoteDetail.
     * 
     * @param noteAttachments
     */
    public void setNoteAttachments(lagan.api.main.FWTNoteDetailAttachment[] noteAttachments) {
        this.noteAttachments = noteAttachments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTNoteDetail)) return false;
        FWTNoteDetail other = (FWTNoteDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.noteId==null && other.getNoteId()==null) || 
             (this.noteId!=null &&
              this.noteId.equals(other.getNoteId()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.noteAttachments==null && other.getNoteAttachments()==null) || 
             (this.noteAttachments!=null &&
              java.util.Arrays.equals(this.noteAttachments, other.getNoteAttachments())));
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
        if (getNoteId() != null) {
            _hashCode += getNoteId().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getNoteAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNoteAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNoteAttachments(), i);
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
        new org.apache.axis.description.TypeDesc(FWTNoteDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTNoteDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NoteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTUser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NoteAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTNoteDetailAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "NoteAttachmentList"));
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
