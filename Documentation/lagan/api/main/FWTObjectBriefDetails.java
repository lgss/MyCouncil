/**
 * FWTObjectBriefDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTObjectBriefDetails  implements java.io.Serializable {
    private lagan.api.main.FWTObjectID objectID;

    private java.lang.String objectDescription;

    private java.lang.String details;

    private java.lang.Integer category;

    public FWTObjectBriefDetails() {
    }

    public FWTObjectBriefDetails(
           lagan.api.main.FWTObjectID objectID,
           java.lang.String objectDescription,
           java.lang.String details,
           java.lang.Integer category) {
           this.objectID = objectID;
           this.objectDescription = objectDescription;
           this.details = details;
           this.category = category;
    }


    /**
     * Gets the objectID value for this FWTObjectBriefDetails.
     * 
     * @return objectID
     */
    public lagan.api.main.FWTObjectID getObjectID() {
        return objectID;
    }


    /**
     * Sets the objectID value for this FWTObjectBriefDetails.
     * 
     * @param objectID
     */
    public void setObjectID(lagan.api.main.FWTObjectID objectID) {
        this.objectID = objectID;
    }


    /**
     * Gets the objectDescription value for this FWTObjectBriefDetails.
     * 
     * @return objectDescription
     */
    public java.lang.String getObjectDescription() {
        return objectDescription;
    }


    /**
     * Sets the objectDescription value for this FWTObjectBriefDetails.
     * 
     * @param objectDescription
     */
    public void setObjectDescription(java.lang.String objectDescription) {
        this.objectDescription = objectDescription;
    }


    /**
     * Gets the details value for this FWTObjectBriefDetails.
     * 
     * @return details
     */
    public java.lang.String getDetails() {
        return details;
    }


    /**
     * Sets the details value for this FWTObjectBriefDetails.
     * 
     * @param details
     */
    public void setDetails(java.lang.String details) {
        this.details = details;
    }


    /**
     * Gets the category value for this FWTObjectBriefDetails.
     * 
     * @return category
     */
    public java.lang.Integer getCategory() {
        return category;
    }


    /**
     * Sets the category value for this FWTObjectBriefDetails.
     * 
     * @param category
     */
    public void setCategory(java.lang.Integer category) {
        this.category = category;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTObjectBriefDetails)) return false;
        FWTObjectBriefDetails other = (FWTObjectBriefDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectID==null && other.getObjectID()==null) || 
             (this.objectID!=null &&
              this.objectID.equals(other.getObjectID()))) &&
            ((this.objectDescription==null && other.getObjectDescription()==null) || 
             (this.objectDescription!=null &&
              this.objectDescription.equals(other.getObjectDescription()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory())));
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
        if (getObjectID() != null) {
            _hashCode += getObjectID().hashCode();
        }
        if (getObjectDescription() != null) {
            _hashCode += getObjectDescription().hashCode();
        }
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTObjectBriefDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectBriefDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ObjectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "ObjectDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">ObjectDescription"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Category"));
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
