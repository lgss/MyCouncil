/**
 * FWTContactPostal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTContactPostal  implements java.io.Serializable {
    /* This element is ignored on a create
     *                                 operation. */
    private java.lang.Long addressID;

    private java.lang.String addressNumber;

    /* Only 3 address lines should be supplied
     *                                 for US addresses */
    private java.lang.String[] addressLine;

    /* Not applicable for US addresses */
    private java.lang.String postcode;

    private java.lang.String usage;

    /* Not applicable for US addresses */
    private java.lang.String UPRN;

    /* For US addresses only */
    private java.lang.String city;

    /* For US addresses only */
    private java.lang.String stateCode;

    /* For US addresses only */
    private java.lang.String zipcode;

    /* For US addresses only */
    private java.lang.String propertyID;

    private java.lang.String POBox;

    private java.lang.String propertyStatus;

    private java.lang.String addressType;

    private java.lang.String[] userDefined;

    private long[] userDefinedNum;

    private java.lang.String[] userDefinedText;

    private java.util.Date[] userDefinedDate;

    private java.util.Date startDate;

    private java.util.Date endDate;

    private lagan.api.main.FWTAuditDetails auditDetails;

    private boolean preferred;

    /* Values: use_uprn_for_address,
     *                                 ignore_invalid_uprn. */
    private java.lang.String[] option;

    private lagan.api.main.FWTKeyValue[] extraData;

    public FWTContactPostal() {
    }

    public FWTContactPostal(
           java.lang.Long addressID,
           java.lang.String addressNumber,
           java.lang.String[] addressLine,
           java.lang.String postcode,
           java.lang.String usage,
           java.lang.String UPRN,
           java.lang.String city,
           java.lang.String stateCode,
           java.lang.String zipcode,
           java.lang.String propertyID,
           java.lang.String POBox,
           java.lang.String propertyStatus,
           java.lang.String addressType,
           java.lang.String[] userDefined,
           long[] userDefinedNum,
           java.lang.String[] userDefinedText,
           java.util.Date[] userDefinedDate,
           java.util.Date startDate,
           java.util.Date endDate,
           lagan.api.main.FWTAuditDetails auditDetails,
           boolean preferred,
           java.lang.String[] option,
           lagan.api.main.FWTKeyValue[] extraData) {
           this.addressID = addressID;
           this.addressNumber = addressNumber;
           this.addressLine = addressLine;
           this.postcode = postcode;
           this.usage = usage;
           this.UPRN = UPRN;
           this.city = city;
           this.stateCode = stateCode;
           this.zipcode = zipcode;
           this.propertyID = propertyID;
           this.POBox = POBox;
           this.propertyStatus = propertyStatus;
           this.addressType = addressType;
           this.userDefined = userDefined;
           this.userDefinedNum = userDefinedNum;
           this.userDefinedText = userDefinedText;
           this.userDefinedDate = userDefinedDate;
           this.startDate = startDate;
           this.endDate = endDate;
           this.auditDetails = auditDetails;
           this.preferred = preferred;
           this.option = option;
           this.extraData = extraData;
    }


    /**
     * Gets the addressID value for this FWTContactPostal.
     * 
     * @return addressID   * This element is ignored on a create
     *                                 operation.
     */
    public java.lang.Long getAddressID() {
        return addressID;
    }


    /**
     * Sets the addressID value for this FWTContactPostal.
     * 
     * @param addressID   * This element is ignored on a create
     *                                 operation.
     */
    public void setAddressID(java.lang.Long addressID) {
        this.addressID = addressID;
    }


    /**
     * Gets the addressNumber value for this FWTContactPostal.
     * 
     * @return addressNumber
     */
    public java.lang.String getAddressNumber() {
        return addressNumber;
    }


    /**
     * Sets the addressNumber value for this FWTContactPostal.
     * 
     * @param addressNumber
     */
    public void setAddressNumber(java.lang.String addressNumber) {
        this.addressNumber = addressNumber;
    }


    /**
     * Gets the addressLine value for this FWTContactPostal.
     * 
     * @return addressLine   * Only 3 address lines should be supplied
     *                                 for US addresses
     */
    public java.lang.String[] getAddressLine() {
        return addressLine;
    }


    /**
     * Sets the addressLine value for this FWTContactPostal.
     * 
     * @param addressLine   * Only 3 address lines should be supplied
     *                                 for US addresses
     */
    public void setAddressLine(java.lang.String[] addressLine) {
        this.addressLine = addressLine;
    }

    public java.lang.String getAddressLine(int i) {
        return this.addressLine[i];
    }

    public void setAddressLine(int i, java.lang.String _value) {
        this.addressLine[i] = _value;
    }


    /**
     * Gets the postcode value for this FWTContactPostal.
     * 
     * @return postcode   * Not applicable for US addresses
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this FWTContactPostal.
     * 
     * @param postcode   * Not applicable for US addresses
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the usage value for this FWTContactPostal.
     * 
     * @return usage
     */
    public java.lang.String getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this FWTContactPostal.
     * 
     * @param usage
     */
    public void setUsage(java.lang.String usage) {
        this.usage = usage;
    }


    /**
     * Gets the UPRN value for this FWTContactPostal.
     * 
     * @return UPRN   * Not applicable for US addresses
     */
    public java.lang.String getUPRN() {
        return UPRN;
    }


    /**
     * Sets the UPRN value for this FWTContactPostal.
     * 
     * @param UPRN   * Not applicable for US addresses
     */
    public void setUPRN(java.lang.String UPRN) {
        this.UPRN = UPRN;
    }


    /**
     * Gets the city value for this FWTContactPostal.
     * 
     * @return city   * For US addresses only
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this FWTContactPostal.
     * 
     * @param city   * For US addresses only
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the stateCode value for this FWTContactPostal.
     * 
     * @return stateCode   * For US addresses only
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this FWTContactPostal.
     * 
     * @param stateCode   * For US addresses only
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }


    /**
     * Gets the zipcode value for this FWTContactPostal.
     * 
     * @return zipcode   * For US addresses only
     */
    public java.lang.String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this FWTContactPostal.
     * 
     * @param zipcode   * For US addresses only
     */
    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the propertyID value for this FWTContactPostal.
     * 
     * @return propertyID   * For US addresses only
     */
    public java.lang.String getPropertyID() {
        return propertyID;
    }


    /**
     * Sets the propertyID value for this FWTContactPostal.
     * 
     * @param propertyID   * For US addresses only
     */
    public void setPropertyID(java.lang.String propertyID) {
        this.propertyID = propertyID;
    }


    /**
     * Gets the POBox value for this FWTContactPostal.
     * 
     * @return POBox
     */
    public java.lang.String getPOBox() {
        return POBox;
    }


    /**
     * Sets the POBox value for this FWTContactPostal.
     * 
     * @param POBox
     */
    public void setPOBox(java.lang.String POBox) {
        this.POBox = POBox;
    }


    /**
     * Gets the propertyStatus value for this FWTContactPostal.
     * 
     * @return propertyStatus
     */
    public java.lang.String getPropertyStatus() {
        return propertyStatus;
    }


    /**
     * Sets the propertyStatus value for this FWTContactPostal.
     * 
     * @param propertyStatus
     */
    public void setPropertyStatus(java.lang.String propertyStatus) {
        this.propertyStatus = propertyStatus;
    }


    /**
     * Gets the addressType value for this FWTContactPostal.
     * 
     * @return addressType
     */
    public java.lang.String getAddressType() {
        return addressType;
    }


    /**
     * Sets the addressType value for this FWTContactPostal.
     * 
     * @param addressType
     */
    public void setAddressType(java.lang.String addressType) {
        this.addressType = addressType;
    }


    /**
     * Gets the userDefined value for this FWTContactPostal.
     * 
     * @return userDefined
     */
    public java.lang.String[] getUserDefined() {
        return userDefined;
    }


    /**
     * Sets the userDefined value for this FWTContactPostal.
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
     * Gets the userDefinedNum value for this FWTContactPostal.
     * 
     * @return userDefinedNum
     */
    public long[] getUserDefinedNum() {
        return userDefinedNum;
    }


    /**
     * Sets the userDefinedNum value for this FWTContactPostal.
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
     * Gets the userDefinedText value for this FWTContactPostal.
     * 
     * @return userDefinedText
     */
    public java.lang.String[] getUserDefinedText() {
        return userDefinedText;
    }


    /**
     * Sets the userDefinedText value for this FWTContactPostal.
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
     * Gets the userDefinedDate value for this FWTContactPostal.
     * 
     * @return userDefinedDate
     */
    public java.util.Date[] getUserDefinedDate() {
        return userDefinedDate;
    }


    /**
     * Sets the userDefinedDate value for this FWTContactPostal.
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
     * Gets the startDate value for this FWTContactPostal.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this FWTContactPostal.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this FWTContactPostal.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this FWTContactPostal.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the auditDetails value for this FWTContactPostal.
     * 
     * @return auditDetails
     */
    public lagan.api.main.FWTAuditDetails getAuditDetails() {
        return auditDetails;
    }


    /**
     * Sets the auditDetails value for this FWTContactPostal.
     * 
     * @param auditDetails
     */
    public void setAuditDetails(lagan.api.main.FWTAuditDetails auditDetails) {
        this.auditDetails = auditDetails;
    }


    /**
     * Gets the preferred value for this FWTContactPostal.
     * 
     * @return preferred
     */
    public boolean isPreferred() {
        return preferred;
    }


    /**
     * Sets the preferred value for this FWTContactPostal.
     * 
     * @param preferred
     */
    public void setPreferred(boolean preferred) {
        this.preferred = preferred;
    }


    /**
     * Gets the option value for this FWTContactPostal.
     * 
     * @return option   * Values: use_uprn_for_address,
     *                                 ignore_invalid_uprn.
     */
    public java.lang.String[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this FWTContactPostal.
     * 
     * @param option   * Values: use_uprn_for_address,
     *                                 ignore_invalid_uprn.
     */
    public void setOption(java.lang.String[] option) {
        this.option = option;
    }

    public java.lang.String getOption(int i) {
        return this.option[i];
    }

    public void setOption(int i, java.lang.String _value) {
        this.option[i] = _value;
    }


    /**
     * Gets the extraData value for this FWTContactPostal.
     * 
     * @return extraData
     */
    public lagan.api.main.FWTKeyValue[] getExtraData() {
        return extraData;
    }


    /**
     * Sets the extraData value for this FWTContactPostal.
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
        if (!(obj instanceof FWTContactPostal)) return false;
        FWTContactPostal other = (FWTContactPostal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressID==null && other.getAddressID()==null) || 
             (this.addressID!=null &&
              this.addressID.equals(other.getAddressID()))) &&
            ((this.addressNumber==null && other.getAddressNumber()==null) || 
             (this.addressNumber!=null &&
              this.addressNumber.equals(other.getAddressNumber()))) &&
            ((this.addressLine==null && other.getAddressLine()==null) || 
             (this.addressLine!=null &&
              java.util.Arrays.equals(this.addressLine, other.getAddressLine()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.usage==null && other.getUsage()==null) || 
             (this.usage!=null &&
              this.usage.equals(other.getUsage()))) &&
            ((this.UPRN==null && other.getUPRN()==null) || 
             (this.UPRN!=null &&
              this.UPRN.equals(other.getUPRN()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode()))) &&
            ((this.zipcode==null && other.getZipcode()==null) || 
             (this.zipcode!=null &&
              this.zipcode.equals(other.getZipcode()))) &&
            ((this.propertyID==null && other.getPropertyID()==null) || 
             (this.propertyID!=null &&
              this.propertyID.equals(other.getPropertyID()))) &&
            ((this.POBox==null && other.getPOBox()==null) || 
             (this.POBox!=null &&
              this.POBox.equals(other.getPOBox()))) &&
            ((this.propertyStatus==null && other.getPropertyStatus()==null) || 
             (this.propertyStatus!=null &&
              this.propertyStatus.equals(other.getPropertyStatus()))) &&
            ((this.addressType==null && other.getAddressType()==null) || 
             (this.addressType!=null &&
              this.addressType.equals(other.getAddressType()))) &&
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
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.auditDetails==null && other.getAuditDetails()==null) || 
             (this.auditDetails!=null &&
              this.auditDetails.equals(other.getAuditDetails()))) &&
            this.preferred == other.isPreferred() &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              java.util.Arrays.equals(this.option, other.getOption()))) &&
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
        if (getAddressID() != null) {
            _hashCode += getAddressID().hashCode();
        }
        if (getAddressNumber() != null) {
            _hashCode += getAddressNumber().hashCode();
        }
        if (getAddressLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getUsage() != null) {
            _hashCode += getUsage().hashCode();
        }
        if (getUPRN() != null) {
            _hashCode += getUPRN().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getStateCode() != null) {
            _hashCode += getStateCode().hashCode();
        }
        if (getZipcode() != null) {
            _hashCode += getZipcode().hashCode();
        }
        if (getPropertyID() != null) {
            _hashCode += getPropertyID().hashCode();
        }
        if (getPOBox() != null) {
            _hashCode += getPOBox().hashCode();
        }
        if (getPropertyStatus() != null) {
            _hashCode += getPropertyStatus().hashCode();
        }
        if (getAddressType() != null) {
            _hashCode += getAddressType().hashCode();
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getAuditDetails() != null) {
            _hashCode += getAuditDetails().hashCode();
        }
        _hashCode += (isPreferred() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        new org.apache.axis.description.TypeDesc(FWTContactPostal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTContactPostal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTContactPostal>AddressLine"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "Usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UPRN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UPRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StateCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Zipcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PropertyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POBox");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PropertyStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTContactPostal>UserDefined"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTContactPostal>UserDefinedText"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTContactPostal>Option"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
