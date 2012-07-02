/**
 * FWTContactPostalUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTContactPostalUpdate  implements java.io.Serializable {
    private lagan.api.main.FWTContactPostal postalDetails;

    private java.lang.String listItemUpdateType;

    public FWTContactPostalUpdate() {
    }

    public FWTContactPostalUpdate(
           lagan.api.main.FWTContactPostal postalDetails,
           java.lang.String listItemUpdateType) {
           this.postalDetails = postalDetails;
           this.listItemUpdateType = listItemUpdateType;
    }


    /**
     * Gets the postalDetails value for this FWTContactPostalUpdate.
     * 
     * @return postalDetails
     */
    public lagan.api.main.FWTContactPostal getPostalDetails() {
        return postalDetails;
    }


    /**
     * Sets the postalDetails value for this FWTContactPostalUpdate.
     * 
     * @param postalDetails
     */
    public void setPostalDetails(lagan.api.main.FWTContactPostal postalDetails) {
        this.postalDetails = postalDetails;
    }


    /**
     * Gets the listItemUpdateType value for this FWTContactPostalUpdate.
     * 
     * @return listItemUpdateType
     */
    public java.lang.String getListItemUpdateType() {
        return listItemUpdateType;
    }


    /**
     * Sets the listItemUpdateType value for this FWTContactPostalUpdate.
     * 
     * @param listItemUpdateType
     */
    public void setListItemUpdateType(java.lang.String listItemUpdateType) {
        this.listItemUpdateType = listItemUpdateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTContactPostalUpdate)) return false;
        FWTContactPostalUpdate other = (FWTContactPostalUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postalDetails==null && other.getPostalDetails()==null) || 
             (this.postalDetails!=null &&
              this.postalDetails.equals(other.getPostalDetails()))) &&
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
        if (getPostalDetails() != null) {
            _hashCode += getPostalDetails().hashCode();
        }
        if (getListItemUpdateType() != null) {
            _hashCode += getListItemUpdateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTContactPostalUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTContactPostalUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PostalDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTContactPostal"));
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
