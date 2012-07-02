/**
 * FWTRelationshipNew.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTRelationshipNew  implements java.io.Serializable {
    private java.lang.String relationshipType;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private lagan.api.main.FWTObjectID ownerObject;

    private lagan.api.main.FWTObjectID relatedObject;

    private lagan.api.main.FWTCaseForm extraData;

    public FWTRelationshipNew() {
    }

    public FWTRelationshipNew(
           java.lang.String relationshipType,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           lagan.api.main.FWTObjectID ownerObject,
           lagan.api.main.FWTObjectID relatedObject,
           lagan.api.main.FWTCaseForm extraData) {
           this.relationshipType = relationshipType;
           this.startDate = startDate;
           this.endDate = endDate;
           this.ownerObject = ownerObject;
           this.relatedObject = relatedObject;
           this.extraData = extraData;
    }


    /**
     * Gets the relationshipType value for this FWTRelationshipNew.
     * 
     * @return relationshipType
     */
    public java.lang.String getRelationshipType() {
        return relationshipType;
    }


    /**
     * Sets the relationshipType value for this FWTRelationshipNew.
     * 
     * @param relationshipType
     */
    public void setRelationshipType(java.lang.String relationshipType) {
        this.relationshipType = relationshipType;
    }


    /**
     * Gets the startDate value for this FWTRelationshipNew.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this FWTRelationshipNew.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this FWTRelationshipNew.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this FWTRelationshipNew.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the ownerObject value for this FWTRelationshipNew.
     * 
     * @return ownerObject
     */
    public lagan.api.main.FWTObjectID getOwnerObject() {
        return ownerObject;
    }


    /**
     * Sets the ownerObject value for this FWTRelationshipNew.
     * 
     * @param ownerObject
     */
    public void setOwnerObject(lagan.api.main.FWTObjectID ownerObject) {
        this.ownerObject = ownerObject;
    }


    /**
     * Gets the relatedObject value for this FWTRelationshipNew.
     * 
     * @return relatedObject
     */
    public lagan.api.main.FWTObjectID getRelatedObject() {
        return relatedObject;
    }


    /**
     * Sets the relatedObject value for this FWTRelationshipNew.
     * 
     * @param relatedObject
     */
    public void setRelatedObject(lagan.api.main.FWTObjectID relatedObject) {
        this.relatedObject = relatedObject;
    }


    /**
     * Gets the extraData value for this FWTRelationshipNew.
     * 
     * @return extraData
     */
    public lagan.api.main.FWTCaseForm getExtraData() {
        return extraData;
    }


    /**
     * Sets the extraData value for this FWTRelationshipNew.
     * 
     * @param extraData
     */
    public void setExtraData(lagan.api.main.FWTCaseForm extraData) {
        this.extraData = extraData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTRelationshipNew)) return false;
        FWTRelationshipNew other = (FWTRelationshipNew) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relationshipType==null && other.getRelationshipType()==null) || 
             (this.relationshipType!=null &&
              this.relationshipType.equals(other.getRelationshipType()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.ownerObject==null && other.getOwnerObject()==null) || 
             (this.ownerObject!=null &&
              this.ownerObject.equals(other.getOwnerObject()))) &&
            ((this.relatedObject==null && other.getRelatedObject()==null) || 
             (this.relatedObject!=null &&
              this.relatedObject.equals(other.getRelatedObject()))) &&
            ((this.extraData==null && other.getExtraData()==null) || 
             (this.extraData!=null &&
              this.extraData.equals(other.getExtraData())));
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
        if (getRelationshipType() != null) {
            _hashCode += getRelationshipType().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getOwnerObject() != null) {
            _hashCode += getOwnerObject().hashCode();
        }
        if (getRelatedObject() != null) {
            _hashCode += getRelatedObject().hashCode();
        }
        if (getExtraData() != null) {
            _hashCode += getExtraData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTRelationshipNew.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTRelationshipNew"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("ownerObject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OwnerObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectID"));
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
