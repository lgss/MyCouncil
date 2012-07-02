/**
 * FWTStreet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTStreet  implements java.io.Serializable {
    private lagan.api.main.FWTObjectBriefDetails briefDetails;

    /* Not applicable for US addresses */
    private java.lang.String USRN;

    private java.lang.String streetName;

    private java.lang.String primaryLocality;

    /* Not applicable for US addresses -
     *                                     use City */
    private java.lang.String postTownName;

    private java.lang.String countyName;

    /* For US addresses only */
    private java.lang.String city;

    /* For US addresses only */
    private java.lang.String stateCode;

    private boolean primary;

    private java.lang.String[] alternativeStreetName;

    private java.lang.String localityType;

    /* Not applicable for US addresses -
     *                                     use CityRef */
    private java.lang.Long postTownRef;

    /* For US addresses only */
    private java.lang.Long cityRef;

    private java.lang.Long countyRef;

    private java.lang.Long localCouncilCode;

    private java.lang.String localCouncilName;

    private java.lang.String[] userDefined;

    private long[] userDefinedNum;

    private java.lang.String[] userDefinedText;

    private java.util.Date[] userDefinedDate;

    private lagan.api.main.FWTAuditDetails auditDetails;

    public FWTStreet() {
    }

    public FWTStreet(
           lagan.api.main.FWTObjectBriefDetails briefDetails,
           java.lang.String USRN,
           java.lang.String streetName,
           java.lang.String primaryLocality,
           java.lang.String postTownName,
           java.lang.String countyName,
           java.lang.String city,
           java.lang.String stateCode,
           boolean primary,
           java.lang.String[] alternativeStreetName,
           java.lang.String localityType,
           java.lang.Long postTownRef,
           java.lang.Long cityRef,
           java.lang.Long countyRef,
           java.lang.Long localCouncilCode,
           java.lang.String localCouncilName,
           java.lang.String[] userDefined,
           long[] userDefinedNum,
           java.lang.String[] userDefinedText,
           java.util.Date[] userDefinedDate,
           lagan.api.main.FWTAuditDetails auditDetails) {
           this.briefDetails = briefDetails;
           this.USRN = USRN;
           this.streetName = streetName;
           this.primaryLocality = primaryLocality;
           this.postTownName = postTownName;
           this.countyName = countyName;
           this.city = city;
           this.stateCode = stateCode;
           this.primary = primary;
           this.alternativeStreetName = alternativeStreetName;
           this.localityType = localityType;
           this.postTownRef = postTownRef;
           this.cityRef = cityRef;
           this.countyRef = countyRef;
           this.localCouncilCode = localCouncilCode;
           this.localCouncilName = localCouncilName;
           this.userDefined = userDefined;
           this.userDefinedNum = userDefinedNum;
           this.userDefinedText = userDefinedText;
           this.userDefinedDate = userDefinedDate;
           this.auditDetails = auditDetails;
    }


    /**
     * Gets the briefDetails value for this FWTStreet.
     * 
     * @return briefDetails
     */
    public lagan.api.main.FWTObjectBriefDetails getBriefDetails() {
        return briefDetails;
    }


    /**
     * Sets the briefDetails value for this FWTStreet.
     * 
     * @param briefDetails
     */
    public void setBriefDetails(lagan.api.main.FWTObjectBriefDetails briefDetails) {
        this.briefDetails = briefDetails;
    }


    /**
     * Gets the USRN value for this FWTStreet.
     * 
     * @return USRN   * Not applicable for US addresses
     */
    public java.lang.String getUSRN() {
        return USRN;
    }


    /**
     * Sets the USRN value for this FWTStreet.
     * 
     * @param USRN   * Not applicable for US addresses
     */
    public void setUSRN(java.lang.String USRN) {
        this.USRN = USRN;
    }


    /**
     * Gets the streetName value for this FWTStreet.
     * 
     * @return streetName
     */
    public java.lang.String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this FWTStreet.
     * 
     * @param streetName
     */
    public void setStreetName(java.lang.String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the primaryLocality value for this FWTStreet.
     * 
     * @return primaryLocality
     */
    public java.lang.String getPrimaryLocality() {
        return primaryLocality;
    }


    /**
     * Sets the primaryLocality value for this FWTStreet.
     * 
     * @param primaryLocality
     */
    public void setPrimaryLocality(java.lang.String primaryLocality) {
        this.primaryLocality = primaryLocality;
    }


    /**
     * Gets the postTownName value for this FWTStreet.
     * 
     * @return postTownName   * Not applicable for US addresses -
     *                                     use City
     */
    public java.lang.String getPostTownName() {
        return postTownName;
    }


    /**
     * Sets the postTownName value for this FWTStreet.
     * 
     * @param postTownName   * Not applicable for US addresses -
     *                                     use City
     */
    public void setPostTownName(java.lang.String postTownName) {
        this.postTownName = postTownName;
    }


    /**
     * Gets the countyName value for this FWTStreet.
     * 
     * @return countyName
     */
    public java.lang.String getCountyName() {
        return countyName;
    }


    /**
     * Sets the countyName value for this FWTStreet.
     * 
     * @param countyName
     */
    public void setCountyName(java.lang.String countyName) {
        this.countyName = countyName;
    }


    /**
     * Gets the city value for this FWTStreet.
     * 
     * @return city   * For US addresses only
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this FWTStreet.
     * 
     * @param city   * For US addresses only
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the stateCode value for this FWTStreet.
     * 
     * @return stateCode   * For US addresses only
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this FWTStreet.
     * 
     * @param stateCode   * For US addresses only
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }


    /**
     * Gets the primary value for this FWTStreet.
     * 
     * @return primary
     */
    public boolean isPrimary() {
        return primary;
    }


    /**
     * Sets the primary value for this FWTStreet.
     * 
     * @param primary
     */
    public void setPrimary(boolean primary) {
        this.primary = primary;
    }


    /**
     * Gets the alternativeStreetName value for this FWTStreet.
     * 
     * @return alternativeStreetName
     */
    public java.lang.String[] getAlternativeStreetName() {
        return alternativeStreetName;
    }


    /**
     * Sets the alternativeStreetName value for this FWTStreet.
     * 
     * @param alternativeStreetName
     */
    public void setAlternativeStreetName(java.lang.String[] alternativeStreetName) {
        this.alternativeStreetName = alternativeStreetName;
    }

    public java.lang.String getAlternativeStreetName(int i) {
        return this.alternativeStreetName[i];
    }

    public void setAlternativeStreetName(int i, java.lang.String _value) {
        this.alternativeStreetName[i] = _value;
    }


    /**
     * Gets the localityType value for this FWTStreet.
     * 
     * @return localityType
     */
    public java.lang.String getLocalityType() {
        return localityType;
    }


    /**
     * Sets the localityType value for this FWTStreet.
     * 
     * @param localityType
     */
    public void setLocalityType(java.lang.String localityType) {
        this.localityType = localityType;
    }


    /**
     * Gets the postTownRef value for this FWTStreet.
     * 
     * @return postTownRef   * Not applicable for US addresses -
     *                                     use CityRef
     */
    public java.lang.Long getPostTownRef() {
        return postTownRef;
    }


    /**
     * Sets the postTownRef value for this FWTStreet.
     * 
     * @param postTownRef   * Not applicable for US addresses -
     *                                     use CityRef
     */
    public void setPostTownRef(java.lang.Long postTownRef) {
        this.postTownRef = postTownRef;
    }


    /**
     * Gets the cityRef value for this FWTStreet.
     * 
     * @return cityRef   * For US addresses only
     */
    public java.lang.Long getCityRef() {
        return cityRef;
    }


    /**
     * Sets the cityRef value for this FWTStreet.
     * 
     * @param cityRef   * For US addresses only
     */
    public void setCityRef(java.lang.Long cityRef) {
        this.cityRef = cityRef;
    }


    /**
     * Gets the countyRef value for this FWTStreet.
     * 
     * @return countyRef
     */
    public java.lang.Long getCountyRef() {
        return countyRef;
    }


    /**
     * Sets the countyRef value for this FWTStreet.
     * 
     * @param countyRef
     */
    public void setCountyRef(java.lang.Long countyRef) {
        this.countyRef = countyRef;
    }


    /**
     * Gets the localCouncilCode value for this FWTStreet.
     * 
     * @return localCouncilCode
     */
    public java.lang.Long getLocalCouncilCode() {
        return localCouncilCode;
    }


    /**
     * Sets the localCouncilCode value for this FWTStreet.
     * 
     * @param localCouncilCode
     */
    public void setLocalCouncilCode(java.lang.Long localCouncilCode) {
        this.localCouncilCode = localCouncilCode;
    }


    /**
     * Gets the localCouncilName value for this FWTStreet.
     * 
     * @return localCouncilName
     */
    public java.lang.String getLocalCouncilName() {
        return localCouncilName;
    }


    /**
     * Sets the localCouncilName value for this FWTStreet.
     * 
     * @param localCouncilName
     */
    public void setLocalCouncilName(java.lang.String localCouncilName) {
        this.localCouncilName = localCouncilName;
    }


    /**
     * Gets the userDefined value for this FWTStreet.
     * 
     * @return userDefined
     */
    public java.lang.String[] getUserDefined() {
        return userDefined;
    }


    /**
     * Sets the userDefined value for this FWTStreet.
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
     * Gets the userDefinedNum value for this FWTStreet.
     * 
     * @return userDefinedNum
     */
    public long[] getUserDefinedNum() {
        return userDefinedNum;
    }


    /**
     * Sets the userDefinedNum value for this FWTStreet.
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
     * Gets the userDefinedText value for this FWTStreet.
     * 
     * @return userDefinedText
     */
    public java.lang.String[] getUserDefinedText() {
        return userDefinedText;
    }


    /**
     * Sets the userDefinedText value for this FWTStreet.
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
     * Gets the userDefinedDate value for this FWTStreet.
     * 
     * @return userDefinedDate
     */
    public java.util.Date[] getUserDefinedDate() {
        return userDefinedDate;
    }


    /**
     * Sets the userDefinedDate value for this FWTStreet.
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
     * Gets the auditDetails value for this FWTStreet.
     * 
     * @return auditDetails
     */
    public lagan.api.main.FWTAuditDetails getAuditDetails() {
        return auditDetails;
    }


    /**
     * Sets the auditDetails value for this FWTStreet.
     * 
     * @param auditDetails
     */
    public void setAuditDetails(lagan.api.main.FWTAuditDetails auditDetails) {
        this.auditDetails = auditDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTStreet)) return false;
        FWTStreet other = (FWTStreet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.briefDetails==null && other.getBriefDetails()==null) || 
             (this.briefDetails!=null &&
              this.briefDetails.equals(other.getBriefDetails()))) &&
            ((this.USRN==null && other.getUSRN()==null) || 
             (this.USRN!=null &&
              this.USRN.equals(other.getUSRN()))) &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.primaryLocality==null && other.getPrimaryLocality()==null) || 
             (this.primaryLocality!=null &&
              this.primaryLocality.equals(other.getPrimaryLocality()))) &&
            ((this.postTownName==null && other.getPostTownName()==null) || 
             (this.postTownName!=null &&
              this.postTownName.equals(other.getPostTownName()))) &&
            ((this.countyName==null && other.getCountyName()==null) || 
             (this.countyName!=null &&
              this.countyName.equals(other.getCountyName()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode()))) &&
            this.primary == other.isPrimary() &&
            ((this.alternativeStreetName==null && other.getAlternativeStreetName()==null) || 
             (this.alternativeStreetName!=null &&
              java.util.Arrays.equals(this.alternativeStreetName, other.getAlternativeStreetName()))) &&
            ((this.localityType==null && other.getLocalityType()==null) || 
             (this.localityType!=null &&
              this.localityType.equals(other.getLocalityType()))) &&
            ((this.postTownRef==null && other.getPostTownRef()==null) || 
             (this.postTownRef!=null &&
              this.postTownRef.equals(other.getPostTownRef()))) &&
            ((this.cityRef==null && other.getCityRef()==null) || 
             (this.cityRef!=null &&
              this.cityRef.equals(other.getCityRef()))) &&
            ((this.countyRef==null && other.getCountyRef()==null) || 
             (this.countyRef!=null &&
              this.countyRef.equals(other.getCountyRef()))) &&
            ((this.localCouncilCode==null && other.getLocalCouncilCode()==null) || 
             (this.localCouncilCode!=null &&
              this.localCouncilCode.equals(other.getLocalCouncilCode()))) &&
            ((this.localCouncilName==null && other.getLocalCouncilName()==null) || 
             (this.localCouncilName!=null &&
              this.localCouncilName.equals(other.getLocalCouncilName()))) &&
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
              this.auditDetails.equals(other.getAuditDetails())));
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
        if (getBriefDetails() != null) {
            _hashCode += getBriefDetails().hashCode();
        }
        if (getUSRN() != null) {
            _hashCode += getUSRN().hashCode();
        }
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        if (getPrimaryLocality() != null) {
            _hashCode += getPrimaryLocality().hashCode();
        }
        if (getPostTownName() != null) {
            _hashCode += getPostTownName().hashCode();
        }
        if (getCountyName() != null) {
            _hashCode += getCountyName().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getStateCode() != null) {
            _hashCode += getStateCode().hashCode();
        }
        _hashCode += (isPrimary() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAlternativeStreetName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternativeStreetName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternativeStreetName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalityType() != null) {
            _hashCode += getLocalityType().hashCode();
        }
        if (getPostTownRef() != null) {
            _hashCode += getPostTownRef().hashCode();
        }
        if (getCityRef() != null) {
            _hashCode += getCityRef().hashCode();
        }
        if (getCountyRef() != null) {
            _hashCode += getCountyRef().hashCode();
        }
        if (getLocalCouncilCode() != null) {
            _hashCode += getLocalCouncilCode().hashCode();
        }
        if (getLocalCouncilName() != null) {
            _hashCode += getLocalCouncilName().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTStreet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTStreet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("briefDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BriefDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectBriefDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USRN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "USRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StreetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryLocality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrimaryLocality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postTownName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PostTownName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CountyName"));
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
        elemField.setFieldName("primary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Primary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternativeStreetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AlternativeStreetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTStreet>AlternativeStreetName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LocalityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postTownRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PostTownRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CityRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CountyRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localCouncilCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LocalCouncilCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localCouncilName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LocalCouncilName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTStreet>UserDefined"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTStreet>UserDefinedText"));
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
