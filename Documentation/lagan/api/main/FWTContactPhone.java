/**
 * FWTContactPhone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTContactPhone  implements java.io.Serializable {
    /* This element is ignored on a create
     *                                 operation. */
    private java.lang.Long phoneID;

    private java.lang.String number;

    /* fax, telephone, mobile, unknown */
    private java.lang.String deviceType;

    private java.lang.String usage;

    private lagan.api.main.FWTAuditDetails auditDetails;

    private boolean preferred;

    private lagan.api.main.FWTKeyValue[] extraData;

    public FWTContactPhone() {
    }

    public FWTContactPhone(
           java.lang.Long phoneID,
           java.lang.String number,
           java.lang.String deviceType,
           java.lang.String usage,
           lagan.api.main.FWTAuditDetails auditDetails,
           boolean preferred,
           lagan.api.main.FWTKeyValue[] extraData) {
           this.phoneID = phoneID;
           this.number = number;
           this.deviceType = deviceType;
           this.usage = usage;
           this.auditDetails = auditDetails;
           this.preferred = preferred;
           this.extraData = extraData;
    }


    /**
     * Gets the phoneID value for this FWTContactPhone.
     * 
     * @return phoneID   * This element is ignored on a create
     *                                 operation.
     */
    public java.lang.Long getPhoneID() {
        return phoneID;
    }


    /**
     * Sets the phoneID value for this FWTContactPhone.
     * 
     * @param phoneID   * This element is ignored on a create
     *                                 operation.
     */
    public void setPhoneID(java.lang.Long phoneID) {
        this.phoneID = phoneID;
    }


    /**
     * Gets the number value for this FWTContactPhone.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this FWTContactPhone.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the deviceType value for this FWTContactPhone.
     * 
     * @return deviceType   * fax, telephone, mobile, unknown
     */
    public java.lang.String getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this FWTContactPhone.
     * 
     * @param deviceType   * fax, telephone, mobile, unknown
     */
    public void setDeviceType(java.lang.String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the usage value for this FWTContactPhone.
     * 
     * @return usage
     */
    public java.lang.String getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this FWTContactPhone.
     * 
     * @param usage
     */
    public void setUsage(java.lang.String usage) {
        this.usage = usage;
    }


    /**
     * Gets the auditDetails value for this FWTContactPhone.
     * 
     * @return auditDetails
     */
    public lagan.api.main.FWTAuditDetails getAuditDetails() {
        return auditDetails;
    }


    /**
     * Sets the auditDetails value for this FWTContactPhone.
     * 
     * @param auditDetails
     */
    public void setAuditDetails(lagan.api.main.FWTAuditDetails auditDetails) {
        this.auditDetails = auditDetails;
    }


    /**
     * Gets the preferred value for this FWTContactPhone.
     * 
     * @return preferred
     */
    public boolean isPreferred() {
        return preferred;
    }


    /**
     * Sets the preferred value for this FWTContactPhone.
     * 
     * @param preferred
     */
    public void setPreferred(boolean preferred) {
        this.preferred = preferred;
    }


    /**
     * Gets the extraData value for this FWTContactPhone.
     * 
     * @return extraData
     */
    public lagan.api.main.FWTKeyValue[] getExtraData() {
        return extraData;
    }


    /**
     * Sets the extraData value for this FWTContactPhone.
     * 
     * @param extraData
     */
    public void setExtraData(lagan.api.main.FWTKeyValue[] extraData) {
        this.extraData = extraData;
    }

    public lagan.api.main.FWTKeyValue getExtraData(int i) {
        return this.extraData[i];
    }

    public void setExtraData(int i, lagan.api.main.FWTKeyValue _value) {
        this.extraData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTContactPhone)) return false;
        FWTContactPhone other = (FWTContactPhone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneID==null && other.getPhoneID()==null) || 
             (this.phoneID!=null &&
              this.phoneID.equals(other.getPhoneID()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.usage==null && other.getUsage()==null) || 
             (this.usage!=null &&
              this.usage.equals(other.getUsage()))) &&
            ((this.auditDetails==null && other.getAuditDetails()==null) || 
             (this.auditDetails!=null &&
              this.auditDetails.equals(other.getAuditDetails()))) &&
            this.preferred == other.isPreferred() &&
            ((this.extraData==null && other.getExtraData()==null) || 
             (this.extraData!=null &&
              java.util.Arrays.equals(this.extraData, other.getExtraData())));
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
        if (getPhoneID() != null) {
            _hashCode += getPhoneID().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getUsage() != null) {
            _hashCode += getUsage().hashCode();
        }
        if (getAuditDetails() != null) {
            _hashCode += getAuditDetails().hashCode();
        }
        _hashCode += (isPreferred() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExtraData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtraData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtraData(), i);
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
        new org.apache.axis.description.TypeDesc(FWTContactPhone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTContactPhone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PhoneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "Usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuditDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTAuditDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferred");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "Preferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExtraData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTKeyValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
