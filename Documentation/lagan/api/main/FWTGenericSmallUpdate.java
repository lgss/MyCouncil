/**
 * FWTGenericSmallUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTGenericSmallUpdate  implements java.io.Serializable {
    private lagan.api.main.FWTGenericSmall genericSmallDetails;

    private java.lang.String listItemUpdateType;

    public FWTGenericSmallUpdate() {
    }

    public FWTGenericSmallUpdate(
           lagan.api.main.FWTGenericSmall genericSmallDetails,
           java.lang.String listItemUpdateType) {
           this.genericSmallDetails = genericSmallDetails;
           this.listItemUpdateType = listItemUpdateType;
    }


    /**
     * Gets the genericSmallDetails value for this FWTGenericSmallUpdate.
     * 
     * @return genericSmallDetails
     */
    public lagan.api.main.FWTGenericSmall getGenericSmallDetails() {
        return genericSmallDetails;
    }


    /**
     * Sets the genericSmallDetails value for this FWTGenericSmallUpdate.
     * 
     * @param genericSmallDetails
     */
    public void setGenericSmallDetails(lagan.api.main.FWTGenericSmall genericSmallDetails) {
        this.genericSmallDetails = genericSmallDetails;
    }


    /**
     * Gets the listItemUpdateType value for this FWTGenericSmallUpdate.
     * 
     * @return listItemUpdateType
     */
    public java.lang.String getListItemUpdateType() {
        return listItemUpdateType;
    }


    /**
     * Sets the listItemUpdateType value for this FWTGenericSmallUpdate.
     * 
     * @param listItemUpdateType
     */
    public void setListItemUpdateType(java.lang.String listItemUpdateType) {
        this.listItemUpdateType = listItemUpdateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTGenericSmallUpdate)) return false;
        FWTGenericSmallUpdate other = (FWTGenericSmallUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.genericSmallDetails==null && other.getGenericSmallDetails()==null) || 
             (this.genericSmallDetails!=null &&
              this.genericSmallDetails.equals(other.getGenericSmallDetails()))) &&
            ((this.listItemUpdateType==null && other.getListItemUpdateType()==null) || 
             (this.listItemUpdateType!=null &&
              this.listItemUpdateType.equals(other.getListItemUpdateType())));
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
        if (getGenericSmallDetails() != null) {
            _hashCode += getGenericSmallDetails().hashCode();
        }
        if (getListItemUpdateType() != null) {
            _hashCode += getListItemUpdateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTGenericSmallUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTGenericSmallUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericSmallDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenericSmallDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTGenericSmall"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listItemUpdateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "ListItemUpdateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
