/**
 * FWTIndividualNameUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTIndividualNameUpdate  implements java.io.Serializable {
    private lagan.api.main.FWTIndividualName individualNameDetails;

    private java.lang.String listItemUpdateType;

    public FWTIndividualNameUpdate() {
    }

    public FWTIndividualNameUpdate(
           lagan.api.main.FWTIndividualName individualNameDetails,
           java.lang.String listItemUpdateType) {
           this.individualNameDetails = individualNameDetails;
           this.listItemUpdateType = listItemUpdateType;
    }


    /**
     * Gets the individualNameDetails value for this FWTIndividualNameUpdate.
     * 
     * @return individualNameDetails
     */
    public lagan.api.main.FWTIndividualName getIndividualNameDetails() {
        return individualNameDetails;
    }


    /**
     * Sets the individualNameDetails value for this FWTIndividualNameUpdate.
     * 
     * @param individualNameDetails
     */
    public void setIndividualNameDetails(lagan.api.main.FWTIndividualName individualNameDetails) {
        this.individualNameDetails = individualNameDetails;
    }


    /**
     * Gets the listItemUpdateType value for this FWTIndividualNameUpdate.
     * 
     * @return listItemUpdateType
     */
    public java.lang.String getListItemUpdateType() {
        return listItemUpdateType;
    }


    /**
     * Sets the listItemUpdateType value for this FWTIndividualNameUpdate.
     * 
     * @param listItemUpdateType
     */
    public void setListItemUpdateType(java.lang.String listItemUpdateType) {
        this.listItemUpdateType = listItemUpdateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTIndividualNameUpdate)) return false;
        FWTIndividualNameUpdate other = (FWTIndividualNameUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.individualNameDetails==null && other.getIndividualNameDetails()==null) || 
             (this.individualNameDetails!=null &&
              this.individualNameDetails.equals(other.getIndividualNameDetails()))) &&
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
        if (getIndividualNameDetails() != null) {
            _hashCode += getIndividualNameDetails().hashCode();
        }
        if (getListItemUpdateType() != null) {
            _hashCode += getListItemUpdateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTIndividualNameUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTIndividualNameUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualNameDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IndividualNameDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTIndividualName"));
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
