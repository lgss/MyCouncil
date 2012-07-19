/**
 * FWTOrganisationName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTOrganisationName  implements java.io.Serializable {
    /* This element is ignored on a create
     *                                 operation. */
    private java.lang.Long nameID;

    private java.lang.String fullName;

    private java.lang.String displayType;

    private java.util.Calendar dateChange;

    private java.lang.String[] userDefined;

    private long[] userDefinedNum;

    private java.lang.String[] userDefinedText;

    private java.util.Date[] userDefinedDate;

    private lagan.api.main.FWTAuditDetails auditDetails;

    private boolean preferred;

    public FWTOrganisationName() {
    }

    public FWTOrganisationName(
           java.lang.Long nameID,
           java.lang.String fullName,
           java.lang.String displayType,
           java.util.Calendar dateChange,
           java.lang.String[] userDefined,
           long[] userDefinedNum,
           java.lang.String[] userDefinedText,
           java.util.Date[] userDefinedDate,
           lagan.api.main.FWTAuditDetails auditDetails,
           boolean preferred) {
           this.nameID = nameID;
           this.fullName = fullName;
           this.displayType = displayType;
           this.dateChange = dateChange;
           this.userDefined = userDefined;
           this.userDefinedNum = userDefinedNum;
           this.userDefinedText = userDefinedText;
           this.userDefinedDate = userDefinedDate;
           this.auditDetails = auditDetails;
           this.preferred = preferred;
    }


    /**
     * Gets the nameID value for this FWTOrganisationName.
     * 
     * @return nameID   * This element is ignored on a create
     *                                 operation.
     */
    public java.lang.Long getNameID() {
        return nameID;
    }


    /**
     * Sets the nameID value for this FWTOrganisationName.
     * 
     * @param nameID   * This element is ignored on a create
     *                                 operation.
     */
    public void setNameID(java.lang.Long nameID) {
        this.nameID = nameID;
    }


    /**
     * Gets the fullName value for this FWTOrganisationName.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this FWTOrganisationName.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the displayType value for this FWTOrganisationName.
     * 
     * @return displayType
     */
    public java.lang.String getDisplayType() {
        return displayType;
    }


    /**
     * Sets the displayType value for this FWTOrganisationName.
     * 
     * @param displayType
     */
    public void setDisplayType(java.lang.String displayType) {
        this.displayType = displayType;
    }


    /**
     * Gets the dateChange value for this FWTOrganisationName.
     * 
     * @return dateChange
     */
    public java.util.Calendar getDateChange() {
        return dateChange;
    }


    /**
     * Sets the dateChange value for this FWTOrganisationName.
     * 
     * @param dateChange
     */
    public void setDateChange(java.util.Calendar dateChange) {
        this.dateChange = dateChange;
    }


    /**
     * Gets the userDefined value for this FWTOrganisationName.
     * 
     * @return userDefined
     */
    public java.lang.String[] getUserDefined() {
        return userDefined;
    }


    /**
     * Sets the userDefined value for this FWTOrganisationName.
     * 
     * @param userDefined
     */
    public void setUserDefined(java.lang.String[] userDefined) {
        this.userDefined = userDefined;
    }

    public java.lang.String getUserDefined(int i) {
        return this.userDefined[i];
    }

    public void setUserDefined(int i, java.lang.String _value) {
        this.userDefined[i] = _value;
    }


    /**
     * Gets the userDefinedNum value for this FWTOrganisationName.
     * 
     * @return userDefinedNum
     */
    public long[] getUserDefinedNum() {
        return userDefinedNum;
    }


    /**
     * Sets the userDefinedNum value for this FWTOrganisationName.
     * 
     * @param userDefinedNum
     */
    public void setUserDefinedNum(long[] userDefinedNum) {
        this.userDefinedNum = userDefinedNum;
    }

    public long getUserDefinedNum(int i) {
        return this.userDefinedNum[i];
    }

    public void setUserDefinedNum(int i, long _value) {
        this.userDefinedNum[i] = _value;
    }


    /**
     * Gets the userDefinedText value for this FWTOrganisationName.
     * 
     * @return userDefinedText
     */
    public java.lang.String[] getUserDefinedText() {
        return userDefinedText;
    }


    /**
     * Sets the userDefinedText value for this FWTOrganisationName.
     * 
     * @param userDefinedText
     */
    public void setUserDefinedText(java.lang.String[] userDefinedText) {
        this.userDefinedText = userDefinedText;
    }

    public java.lang.String getUserDefinedText(int i) {
        return this.userDefinedText[i];
    }

    public void setUserDefinedText(int i, java.lang.String _value) {
        this.userDefinedText[i] = _value;
    }


    /**
     * Gets the userDefinedDate value for this FWTOrganisationName.
     * 
     * @return userDefinedDate
     */
    public java.util.Date[] getUserDefinedDate() {
        return userDefinedDate;
    }


    /**
     * Sets the userDefinedDate value for this FWTOrganisationName.
     * 
     * @param userDefinedDate
     */
    public void setUserDefinedDate(java.util.Date[] userDefinedDate) {
        this.userDefinedDate = userDefinedDate;
    }

    public java.util.Date getUserDefinedDate(int i) {
        return this.userDefinedDate[i];
    }

    public void setUserDefinedDate(int i, java.util.Date _value) {
        this.userDefinedDate[i] = _value;
    }


    /**
     * Gets the auditDetails value for this FWTOrganisationName.
     * 
     * @return auditDetails
     */
    public lagan.api.main.FWTAuditDetails getAuditDetails() {
        return auditDetails;
    }


    /**
     * Sets the auditDetails value for this FWTOrganisationName.
     * 
     * @param auditDetails
     */
    public void setAuditDetails(lagan.api.main.FWTAuditDetails auditDetails) {
        this.auditDetails = auditDetails;
    }


    /**
     * Gets the preferred value for this FWTOrganisationName.
     * 
     * @return preferred
     */
    public boolean isPreferred() {
        return preferred;
    }


    /**
     * Sets the preferred value for this FWTOrganisationName.
     * 
     * @param preferred
     */
    public void setPreferred(boolean preferred) {
        this.preferred = preferred;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTOrganisationName)) return false;
        FWTOrganisationName other = (FWTOrganisationName) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nameID==null && other.getNameID()==null) || 
             (this.nameID!=null &&
              this.nameID.equals(other.getNameID()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.displayType==null && other.getDisplayType()==null) || 
             (this.displayType!=null &&
              this.displayType.equals(other.getDisplayType()))) &&
            ((this.dateChange==null && other.getDateChange()==null) || 
             (this.dateChange!=null &&
              this.dateChange.equals(other.getDateChange()))) &&
            ((this.userDefined==null && other.getUserDefined()==null) || 
             (this.userDefined!=null &&
              java.util.Arrays.equals(this.userDefined, other.getUserDefined()))) &&
            ((this.userDefinedNum==null && other.getUserDefinedNum()==null) || 
             (this.userDefinedNum!=null &&
              java.util.Arrays.equals(this.userDefinedNum, other.getUserDefinedNum()))) &&
            ((this.userDefinedText==null && other.getUserDefinedText()==null) || 
             (this.userDefinedText!=null &&
              java.util.Arrays.equals(this.userDefinedText, other.getUserDefinedText()))) &&
            ((this.userDefinedDate==null && other.getUserDefinedDate()==null) || 
             (this.userDefinedDate!=null &&
              java.util.Arrays.equals(this.userDefinedDate, other.getUserDefinedDate()))) &&
            ((this.auditDetails==null && other.getAuditDetails()==null) || 
             (this.auditDetails!=null &&
              this.auditDetails.equals(other.getAuditDetails()))) &&
            this.preferred == other.isPreferred();
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
        if (getNameID() != null) {
            _hashCode += getNameID().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getDisplayType() != null) {
            _hashCode += getDisplayType().hashCode();
        }
        if (getDateChange() != null) {
            _hashCode += getDateChange().hashCode();
        }
        if (getUserDefined() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserDefined());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserDefined(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserDefinedNum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserDefinedNum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserDefinedNum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserDefinedText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserDefinedText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserDefinedText(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserDefinedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserDefinedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserDefinedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuditDetails() != null) {
            _hashCode += getAuditDetails().hashCode();
        }
        _hashCode += (isPreferred() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTOrganisationName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTOrganisationName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NameID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DisplayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateChange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTOrganisationName>UserDefined"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefinedNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefinedText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTOrganisationName>UserDefinedText"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefinedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
