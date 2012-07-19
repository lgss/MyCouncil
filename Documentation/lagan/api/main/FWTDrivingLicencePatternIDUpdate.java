/**
 * FWTDrivingLicencePatternIDUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTDrivingLicencePatternIDUpdate  implements java.io.Serializable {
    private java.lang.Integer drivingLicencePatternID;

    private java.lang.String updateType;

    public FWTDrivingLicencePatternIDUpdate() {
    }

    public FWTDrivingLicencePatternIDUpdate(
           java.lang.Integer drivingLicencePatternID,
           java.lang.String updateType) {
           this.drivingLicencePatternID = drivingLicencePatternID;
           this.updateType = updateType;
    }


    /**
     * Gets the drivingLicencePatternID value for this FWTDrivingLicencePatternIDUpdate.
     * 
     * @return drivingLicencePatternID
     */
    public java.lang.Integer getDrivingLicencePatternID() {
        return drivingLicencePatternID;
    }


    /**
     * Sets the drivingLicencePatternID value for this FWTDrivingLicencePatternIDUpdate.
     * 
     * @param drivingLicencePatternID
     */
    public void setDrivingLicencePatternID(java.lang.Integer drivingLicencePatternID) {
        this.drivingLicencePatternID = drivingLicencePatternID;
    }


    /**
     * Gets the updateType value for this FWTDrivingLicencePatternIDUpdate.
     * 
     * @return updateType
     */
    public java.lang.String getUpdateType() {
        return updateType;
    }


    /**
     * Sets the updateType value for this FWTDrivingLicencePatternIDUpdate.
     * 
     * @param updateType
     */
    public void setUpdateType(java.lang.String updateType) {
        this.updateType = updateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTDrivingLicencePatternIDUpdate)) return false;
        FWTDrivingLicencePatternIDUpdate other = (FWTDrivingLicencePatternIDUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.drivingLicencePatternID==null && other.getDrivingLicencePatternID()==null) || 
             (this.drivingLicencePatternID!=null &&
              this.drivingLicencePatternID.equals(other.getDrivingLicencePatternID()))) &&
            ((this.updateType==null && other.getUpdateType()==null) || 
             (this.updateType!=null &&
              this.updateType.equals(other.getUpdateType())));
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
        if (getDrivingLicencePatternID() != null) {
            _hashCode += getDrivingLicencePatternID().hashCode();
        }
        if (getUpdateType() != null) {
            _hashCode += getUpdateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTDrivingLicencePatternIDUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTDrivingLicencePatternIDUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drivingLicencePatternID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DrivingLicencePatternID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "UpdateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
