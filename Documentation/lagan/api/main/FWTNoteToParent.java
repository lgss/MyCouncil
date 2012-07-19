/**
 * FWTNoteToParent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTNoteToParent  implements java.io.Serializable {
    private long parentId;

    /* 0: for case
     *                                 1: for interaction */
    private int parentType;

    private lagan.api.main.FWTNoteDetail noteDetails;

    private java.lang.Integer eventCode;

    private java.lang.String[] eventInformationList;

    public FWTNoteToParent() {
    }

    public FWTNoteToParent(
           long parentId,
           int parentType,
           lagan.api.main.FWTNoteDetail noteDetails,
           java.lang.Integer eventCode,
           java.lang.String[] eventInformationList) {
           this.parentId = parentId;
           this.parentType = parentType;
           this.noteDetails = noteDetails;
           this.eventCode = eventCode;
           this.eventInformationList = eventInformationList;
    }


    /**
     * Gets the parentId value for this FWTNoteToParent.
     * 
     * @return parentId
     */
    public long getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this FWTNoteToParent.
     * 
     * @param parentId
     */
    public void setParentId(long parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the parentType value for this FWTNoteToParent.
     * 
     * @return parentType   * 0: for case
     *                                 1: for interaction
     */
    public int getParentType() {
        return parentType;
    }


    /**
     * Sets the parentType value for this FWTNoteToParent.
     * 
     * @param parentType   * 0: for case
     *                                 1: for interaction
     */
    public void setParentType(int parentType) {
        this.parentType = parentType;
    }


    /**
     * Gets the noteDetails value for this FWTNoteToParent.
     * 
     * @return noteDetails
     */
    public lagan.api.main.FWTNoteDetail getNoteDetails() {
        return noteDetails;
    }


    /**
     * Sets the noteDetails value for this FWTNoteToParent.
     * 
     * @param noteDetails
     */
    public void setNoteDetails(lagan.api.main.FWTNoteDetail noteDetails) {
        this.noteDetails = noteDetails;
    }


    /**
     * Gets the eventCode value for this FWTNoteToParent.
     * 
     * @return eventCode
     */
    public java.lang.Integer getEventCode() {
        return eventCode;
    }


    /**
     * Sets the eventCode value for this FWTNoteToParent.
     * 
     * @param eventCode
     */
    public void setEventCode(java.lang.Integer eventCode) {
        this.eventCode = eventCode;
    }


    /**
     * Gets the eventInformationList value for this FWTNoteToParent.
     * 
     * @return eventInformationList
     */
    public java.lang.String[] getEventInformationList() {
        return eventInformationList;
    }


    /**
     * Sets the eventInformationList value for this FWTNoteToParent.
     * 
     * @param eventInformationList
     */
    public void setEventInformationList(java.lang.String[] eventInformationList) {
        this.eventInformationList = eventInformationList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTNoteToParent)) return false;
        FWTNoteToParent other = (FWTNoteToParent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.parentId == other.getParentId() &&
            this.parentType == other.getParentType() &&
            ((this.noteDetails==null && other.getNoteDetails()==null) || 
             (this.noteDetails!=null &&
              this.noteDetails.equals(other.getNoteDetails()))) &&
            ((this.eventCode==null && other.getEventCode()==null) || 
             (this.eventCode!=null &&
              this.eventCode.equals(other.getEventCode()))) &&
            ((this.eventInformationList==null && other.getEventInformationList()==null) || 
             (this.eventInformationList!=null &&
              java.util.Arrays.equals(this.eventInformationList, other.getEventInformationList())));
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
        _hashCode += new Long(getParentId()).hashCode();
        _hashCode += getParentType();
        if (getNoteDetails() != null) {
            _hashCode += getNoteDetails().hashCode();
        }
        if (getEventCode() != null) {
            _hashCode += getEventCode().hashCode();
        }
        if (getEventInformationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventInformationList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventInformationList(), i);
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
        new org.apache.axis.description.TypeDesc(FWTNoteToParent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTNoteToParent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NoteDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTNoteDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EventCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventInformationList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EventInformationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTEventInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "EventInformation"));
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
