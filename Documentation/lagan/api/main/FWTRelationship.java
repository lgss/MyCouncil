/**
 * FWTRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTRelationship  implements java.io.Serializable {
    private long relationshipID;

    private java.lang.String relationshipType;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private lagan.api.main.FWTObjectID relatedObject;

    private lagan.api.main.FWTCaseForm extraData;

    private lagan.api.main.FWTObjectID ownerObject;

    public FWTRelationship() {
    }

    public FWTRelationship(
           long relationshipID,
           java.lang.String relationshipType,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           lagan.api.main.FWTObjectID relatedObject,
           lagan.api.main.FWTCaseForm extraData,
           lagan.api.main.FWTObjectID ownerObject) {
           this.relationshipID = relationshipID;
           this.relationshipType = relationshipType;
           this.startDate = startDate;
           this.endDate = endDate;
           this.relatedObject = relatedObject;
           this.extraData = extraData;
           this.ownerObject = ownerObject;
    }


    /**
     * Gets the relationshipID value for this FWTRelationship.
     * 
     * @return relationshipID
     */
    public long getRelationshipID() {
        return relationshipID;
    }


    /**
     * Sets the relationshipID value for this FWTRelationship.
     * 
     * @param relationshipID
     */
    public void setRelationshipID(long relationshipID) {
        this.relationshipID = relationshipID;
    }


    /**
     * Gets the relationshipType value for this FWTRelationship.
     * 
     * @return relationshipType
     */
    public java.lang.String getRelationshipType() {
        return relationshipType;
    }


    /**
     * Sets the relationshipType value for this FWTRelationship.
     * 
     * @param relationshipType
     */
    public void setRelationshipType(java.lang.String relationshipType) {
        this.relationshipType = relationshipType;
    }


    /**
     * Gets the startDate value for this FWTRelationship.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this FWTRelationship.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this FWTRelationship.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this FWTRelationship.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the relatedObject value for this FWTRelationship.
     * 
     * @return relatedObject
     */
    public lagan.api.main.FWTObjectID getRelatedObject() {
        return relatedObject;
    }


    /**
     * Sets the relatedObject value for this FWTRelationship.
     * 
     * @param relatedObject
     */
    public void setRelatedObject(lagan.api.main.FWTObjectID relatedObject) {
        this.relatedObject = relatedObject;
    }


    /**
     * Gets the extraData value for this FWTRelationship.
     * 
     * @return extraData
     */
    public lagan.api.main.FWTCaseForm getExtraData() {
        return extraData;
    }


    /**
     * Sets the extraData value for this FWTRelationship.
     * 
     * @param extraData
     */
    public void setExtraData(lagan.api.main.FWTCaseForm extraData) {
        this.extraData = extraData;
    }


    /**
     * Gets the ownerObject value for this FWTRelationship.
     * 
     * @return ownerObject
     */
    public lagan.api.main.FWTObjectID getOwnerObject() {
        return ownerObject;
    }


    /**
     * Sets the ownerObject value for this FWTRelationship.
     * 
     * @param ownerObject
     */
    public void setOwnerObject(lagan.api.main.FWTObjectID ownerObject) {
        this.ownerObject = ownerObject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTRelationship)) return false;
        FWTRelationship other = (FWTRelationship) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.relationshipID == other.getRelationshipID() &&
            ((this.relationshipType==null && other.getRelationshipType()==null) || 
             (this.relationshipType!=null &&
              this.relationshipType.equals(other.getRelationshipType()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.relatedObject==null && other.getRelatedObject()==null) || 
             (this.relatedObject!=null &&
              this.relatedObject.equals(other.getRelatedObject()))) &&
            ((this.extraData==null && other.getExtraData()==null) || 
             (this.extraData!=null &&
              this.extraData.equals(other.getExtraData()))) &&
            ((this.ownerObject==null && other.getOwnerObject()==null) || 
             (this.ownerObject!=null &&
              this.ownerObject.equals(other.getOwnerObject())));
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
        _hashCode += new Long(getRelationshipID()).hashCode();
        if (getRelationshipType() != null) {
            _hashCode += getRelationshipType().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getRelatedObject() != null) {
            _hashCode += getRelatedObject().hashCode();
        }
        if (getExtraData() != null) {
            _hashCode += getExtraData().hashCode();
        }
        if (getOwnerObject() != null) {
            _hashCode += getOwnerObject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTRelationship.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTRelationship"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RelationshipID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "RelationshipType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">RelationshipType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedObject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RelatedObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExtraData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseForm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerObject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OwnerObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectID"));
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
