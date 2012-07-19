/**
 * FWTGenericBigUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTGenericBigUpdate  implements java.io.Serializable {
    private lagan.api.main.FWTGenericBig genericBigDetails;

    private java.lang.String listItemUpdateType;

    public FWTGenericBigUpdate() {
    }

    public FWTGenericBigUpdate(
           lagan.api.main.FWTGenericBig genericBigDetails,
           java.lang.String listItemUpdateType) {
           this.genericBigDetails = genericBigDetails;
           this.listItemUpdateType = listItemUpdateType;
    }


    /**
     * Gets the genericBigDetails value for this FWTGenericBigUpdate.
     * 
     * @return genericBigDetails
     */
    public lagan.api.main.FWTGenericBig getGenericBigDetails() {
        return genericBigDetails;
    }


    /**
     * Sets the genericBigDetails value for this FWTGenericBigUpdate.
     * 
     * @param genericBigDetails
     */
    public void setGenericBigDetails(lagan.api.main.FWTGenericBig genericBigDetails) {
        this.genericBigDetails = genericBigDetails;
    }


    /**
     * Gets the listItemUpdateType value for this FWTGenericBigUpdate.
     * 
     * @return listItemUpdateType
     */
    public java.lang.String getListItemUpdateType() {
        return listItemUpdateType;
    }


    /**
     * Sets the listItemUpdateType value for this FWTGenericBigUpdate.
     * 
     * @param listItemUpdateType
     */
    public void setListItemUpdateType(java.lang.String listItemUpdateType) {
        this.listItemUpdateType = listItemUpdateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTGenericBigUpdate)) return false;
        FWTGenericBigUpdate other = (FWTGenericBigUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.genericBigDetails==null && other.getGenericBigDetails()==null) || 
             (this.genericBigDetails!=null &&
              this.genericBigDetails.equals(other.getGenericBigDetails()))) &&
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
        if (getGenericBigDetails() != null) {
            _hashCode += getGenericBigDetails().hashCode();
        }
        if (getListItemUpdateType() != null) {
            _hashCode += getListItemUpdateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTGenericBigUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTGenericBigUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericBigDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenericBigDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTGenericBig"));
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
