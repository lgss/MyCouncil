/**
 * FWTIndividualName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTIndividualName  implements java.io.Serializable {
    /* This element is ignored on a create
     *                                 operation. */
    private java.lang.Long nameID;

    private java.lang.String title;

    private java.lang.String[] forename;

    private java.lang.String initials;

    private java.lang.String surname;

    private java.lang.String[] suffix;

    /* This field is ignored as the full name
     *                                 field is populated by a database trigger
     * using the relevent name fields. */
    private java.lang.String fullName;

    private java.lang.String requestedName;

    /* This field is not currently used. */
    private java.lang.String displayType;

    private java.util.Calendar dateChange;

    private java.lang.String[] userDefined;

    private long[] userDefinedNum;

    private java.lang.String[] userDefinedText;

    private java.util.Date[] userDefinedDate;

    private lagan.api.main.FWTAuditDetails auditDetails;

    private boolean preferred;

    private lagan.api.main.FWTKeyValue[] extraData;

    public FWTIndividualName() {
    }

    public FWTIndividualName(
           java.lang.Long nameID,
           java.lang.String title,
           java.lang.String[] forename,
           java.lang.String initials,
           java.lang.String surname,
           java.lang.String[] suffix,
           java.lang.String fullName,
           java.lang.String requestedName,
           java.lang.String displayType,
           java.util.Calendar dateChange,
           java.lang.String[] userDefined,
           long[] userDefinedNum,
           java.lang.String[] userDefinedText,
           java.util.Date[] userDefinedDate,
           lagan.api.main.FWTAuditDetails auditDetails,
           boolean preferred,
           lagan.api.main.FWTKeyValue[] extraData) {
           this.nameID = nameID;
           this.title = title;
           this.forename = forename;
           this.initials = initials;
           this.surname = surname;
           this.suffix = suffix;
           this.fullName = fullName;
           this.requestedName = requestedName;
           this.displayType = displayType;
           this.dateChange = dateChange;
           this.userDefined = userDefined;
           this.userDefinedNum = userDefinedNum;
           this.userDefinedText = userDefinedText;
           this.userDefinedDate = userDefinedDate;
           this.auditDetails = auditDetails;
           this.preferred = preferred;
           this.extraData = extraData;
    }


    /**
     * Gets the nameID value for this FWTIndividualName.
     * 
     * @return nameID   * This element is ignored on a create
     *                                 operation.
     */
    public java.lang.Long getNameID() {
        return nameID;
    }


    /**
     * Sets the nameID value for this FWTIndividualName.
     * 
     * @param nameID   * This element is ignored on a create
     *                                 operation.
     */
    public void setNameID(java.lang.Long nameID) {
        this.nameID = nameID;
    }


    /**
     * Gets the title value for this FWTIndividualName.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this FWTIndividualName.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the forename value for this FWTIndividualName.
     * 
     * @return forename
     */
    public java.lang.String[] getForename() {
        return forename;
    }


    /**
     * Sets the forename value for this FWTIndividualName.
     * 
     * @param forename
     */
    public void setForename(java.lang.String[] forename) {
        this.forename = forename;
    }

    public java.lang.String getForename(int i) {
        return this.forename[i];
    }

    public void setForename(int i, java.lang.String _value) {
        this.forename[i] = _value;
    }


    /**
     * Gets the initials value for this FWTIndividualName.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this FWTIndividualName.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the surname value for this FWTIndividualName.
     * 
     * @return surname
     */
    public java.lang.String getSurname() {
        return surname;
    }


    /**
     * Sets the surname value for this FWTIndividualName.
     * 
     * @param surname
     */
    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }


    /**
     * Gets the suffix value for this FWTIndividualName.
     * 
     * @return suffix
     */
    public java.lang.String[] getSuffix() {
        return suffix;
    }


    /**
     * Sets the suffix value for this FWTIndividualName.
     * 
     * @param suffix
     */
    public void setSuffix(java.lang.String[] suffix) {
        this.suffix = suffix;
    }

    public java.lang.String getSuffix(int i) {
        return this.suffix[i];
    }

    public void setSuffix(int i, java.lang.String _value) {
        this.suffix[i] = _value;
    }


    /**
     * Gets the fullName value for this FWTIndividualName.
     * 
     * @return fullName   * This field is ignored as the full name
     *                                 field is populated by a database trigger
     * using the relevent name fields.
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this FWTIndividualName.
     * 
     * @param fullName   * This field is ignored as the full name
     *                                 field is populated by a database trigger
     * using the relevent name fields.
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the requestedName value for this FWTIndividualName.
     * 
     * @return requestedName
     */
    public java.lang.String getRequestedName() {
        return requestedName;
    }


    /**
     * Sets the requestedName value for this FWTIndividualName.
     * 
     * @param requestedName
     */
    public void setRequestedName(java.lang.String requestedName) {
        this.requestedName = requestedName;
    }


    /**
     * Gets the displayType value for this FWTIndividualName.
     * 
     * @return displayType   * This field is not currently used.
     */
    public java.lang.String getDisplayType() {
        return displayType;
    }


    /**
     * Sets the displayType value for this FWTIndividualName.
     * 
     * @param displayType   * This field is not currently used.
     */
    public void setDisplayType(java.lang.String displayType) {
        this.displayType = displayType;
    }


    /**
     * Gets the dateChange value for this FWTIndividualName.
     * 
     * @return dateChange
     */
    public java.util.Calendar getDateChange() {
        return dateChange;
    }


    /**
     * Sets the dateChange value for this FWTIndividualName.
     * 
     * @param dateChange
     */
    public void setDateChange(java.util.Calendar dateChange) {
        this.dateChange = dateChange;
    }


    /**
     * Gets the userDefined value for this FWTIndividualName.
     * 
     * @return userDefined
     */
    public java.lang.String[] getUserDefined() {
        return userDefined;
    }


    /**
     * Sets the userDefined value for this FWTIndividualName.
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
     * Gets the userDefinedNum value for this FWTIndividualName.
     * 
     * @return userDefinedNum
     */
    public long[] getUserDefinedNum() {
        return userDefinedNum;
    }


    /**
     * Sets the userDefinedNum value for this FWTIndividualName.
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
     * Gets the userDefinedText value for this FWTIndividualName.
     * 
     * @return userDefinedText
     */
    public java.lang.String[] getUserDefinedText() {
        return userDefinedText;
    }


    /**
     * Sets the userDefinedText value for this FWTIndividualName.
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
     * Gets the userDefinedDate value for this FWTIndividualName.
     * 
     * @return userDefinedDate
     */
    public java.util.Date[] getUserDefinedDate() {
        return userDefinedDate;
    }


    /**
     * Sets the userDefinedDate value for this FWTIndividualName.
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
     * Gets the auditDetails value for this FWTIndividualName.
     * 
     * @return auditDetails
     */
    public lagan.api.main.FWTAuditDetails getAuditDetails() {
        return auditDetails;
    }


    /**
     * Sets the auditDetails value for this FWTIndividualName.
     * 
     * @param auditDetails
     */
    public void setAuditDetails(lagan.api.main.FWTAuditDetails auditDetails) {
        this.auditDetails = auditDetails;
    }


    /**
     * Gets the preferred value for this FWTIndividualName.
     * 
     * @return preferred
     */
    public boolean isPreferred() {
        return preferred;
    }


    /**
     * Sets the preferred value for this FWTIndividualName.
     * 
     * @param preferred
     */
    public void setPreferred(boolean preferred) {
        this.preferred = preferred;
    }


    /**
     * Gets the extraData value for this FWTIndividualName.
     * 
     * @return extraData
     */
    public lagan.api.main.FWTKeyValue[] getExtraData() {
        return extraData;
    }


    /**
     * Sets the extraData value for this FWTIndividualName.
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
        if (!(obj instanceof FWTIndividualName)) return false;
        FWTIndividualName other = (FWTIndividualName) obj;
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
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.forename==null && other.getForename()==null) || 
             (this.forename!=null &&
              java.util.Arrays.equals(this.forename, other.getForename()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.surname==null && other.getSurname()==null) || 
             (this.surname!=null &&
              this.surname.equals(other.getSurname()))) &&
            ((this.suffix==null && other.getSuffix()==null) || 
             (this.suffix!=null &&
              java.util.Arrays.equals(this.suffix, other.getSuffix()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.requestedName==null && other.getRequestedName()==null) || 
             (this.requestedName!=null &&
              this.requestedName.equals(other.getRequestedName()))) &&
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
        if (getNameID() != null) {
            _hashCode += getNameID().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getForename() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForename());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForename(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getSurname() != null) {
            _hashCode += getSurname().hashCode();
        }
        if (getSuffix() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuffix());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuffix(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getRequestedName() != null) {
            _hashCode += getRequestedName().hashCode();
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
        new org.apache.axis.description.TypeDesc(FWTIndividualName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTIndividualName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NameID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Forename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTIndividualName>Forename"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Initials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Surname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Suffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTIndividualName>Suffix"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTIndividualName>UserDefined"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTIndividualName>UserDefinedText"));
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
