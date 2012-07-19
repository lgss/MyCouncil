/**
 * FWTOrganisation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTOrganisation  implements java.io.Serializable {
    private lagan.api.main.FWTObjectBriefDetails briefDetails;

    private lagan.api.main.FWTOrganisationName[] name;

    private lagan.api.main.FWTContactPostal[] contactPostals;

    private lagan.api.main.FWTContactPhone[] contactPhones;

    private lagan.api.main.FWTContactEmail[] contactEmails;

    private java.lang.Boolean legalEntity;

    private java.util.Date creationDate;

    private java.util.Date dissolutionDate;

    private lagan.api.main.FWTExtensionChildSet[] childSet;

    private java.lang.String companyReferenceNumber;

    private java.lang.String organisationCode;

    /* Not applicable for US organisations */
    private java.lang.String VATNumber;

    /* Not applicable for US organisations */
    private java.lang.Integer VATNumberPatternID;

    private java.lang.String industryClassification;

    private java.util.Date validFromDate;

    private java.util.Date validToDate;

    private java.lang.String[] userDefined;

    private long[] userDefinedNum;

    private java.lang.String[] userDefinedText;

    private java.util.Date[] userDefinedDate;

    private lagan.api.main.FWTGenericSmall[] genericSmalls;

    private lagan.api.main.FWTGenericBig[] genericBigs;

    private lagan.api.main.FWTAuditDetails auditDetails;

    /* Values: cdi. This element is only
     *                                     used for creating an organisation
     * record and is not populated when
     *                                     used for retrieving an
     *                                     organisation's details. */
    private java.lang.String[] option;

    private lagan.api.main.FWTKeyValue[] extraData;

    public FWTOrganisation() {
    }

    public FWTOrganisation(
           lagan.api.main.FWTObjectBriefDetails briefDetails,
           lagan.api.main.FWTOrganisationName[] name,
           lagan.api.main.FWTContactPostal[] contactPostals,
           lagan.api.main.FWTContactPhone[] contactPhones,
           lagan.api.main.FWTContactEmail[] contactEmails,
           java.lang.Boolean legalEntity,
           java.util.Date creationDate,
           java.util.Date dissolutionDate,
           lagan.api.main.FWTExtensionChildSet[] childSet,
           java.lang.String companyReferenceNumber,
           java.lang.String organisationCode,
           java.lang.String VATNumber,
           java.lang.Integer VATNumberPatternID,
           java.lang.String industryClassification,
           java.util.Date validFromDate,
           java.util.Date validToDate,
           java.lang.String[] userDefined,
           long[] userDefinedNum,
           java.lang.String[] userDefinedText,
           java.util.Date[] userDefinedDate,
           lagan.api.main.FWTGenericSmall[] genericSmalls,
           lagan.api.main.FWTGenericBig[] genericBigs,
           lagan.api.main.FWTAuditDetails auditDetails,
           java.lang.String[] option,
           lagan.api.main.FWTKeyValue[] extraData) {
           this.briefDetails = briefDetails;
           this.name = name;
           this.contactPostals = contactPostals;
           this.contactPhones = contactPhones;
           this.contactEmails = contactEmails;
           this.legalEntity = legalEntity;
           this.creationDate = creationDate;
           this.dissolutionDate = dissolutionDate;
           this.childSet = childSet;
           this.companyReferenceNumber = companyReferenceNumber;
           this.organisationCode = organisationCode;
           this.VATNumber = VATNumber;
           this.VATNumberPatternID = VATNumberPatternID;
           this.industryClassification = industryClassification;
           this.validFromDate = validFromDate;
           this.validToDate = validToDate;
           this.userDefined = userDefined;
           this.userDefinedNum = userDefinedNum;
           this.userDefinedText = userDefinedText;
           this.userDefinedDate = userDefinedDate;
           this.genericSmalls = genericSmalls;
           this.genericBigs = genericBigs;
           this.auditDetails = auditDetails;
           this.option = option;
           this.extraData = extraData;
    }


    /**
     * Gets the briefDetails value for this FWTOrganisation.
     * 
     * @return briefDetails
     */
    public lagan.api.main.FWTObjectBriefDetails getBriefDetails() {
        return briefDetails;
    }


    /**
     * Sets the briefDetails value for this FWTOrganisation.
     * 
     * @param briefDetails
     */
    public void setBriefDetails(lagan.api.main.FWTObjectBriefDetails briefDetails) {
        this.briefDetails = briefDetails;
    }


    /**
     * Gets the name value for this FWTOrganisation.
     * 
     * @return name
     */
    public lagan.api.main.FWTOrganisationName[] getName() {
        return name;
    }


    /**
     * Sets the name value for this FWTOrganisation.
     * 
     * @param name
     */
    public void setName(lagan.api.main.FWTOrganisationName[] name) {
        this.name = name;
    }

    public lagan.api.main.FWTOrganisationName getName(int i) {
        return this.name[i];
    }

    public void setName(int i, lagan.api.main.FWTOrganisationName _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the contactPostals value for this FWTOrganisation.
     * 
     * @return contactPostals
     */
    public lagan.api.main.FWTContactPostal[] getContactPostals() {
        return contactPostals;
    }


    /**
     * Sets the contactPostals value for this FWTOrganisation.
     * 
     * @param contactPostals
     */
    public void setContactPostals(lagan.api.main.FWTContactPostal[] contactPostals) {
        this.contactPostals = contactPostals;
    }

    public lagan.api.main.FWTContactPostal getContactPostals(int i) {
        return this.contactPostals[i];
    }

    public void setContactPostals(int i, lagan.api.main.FWTContactPostal _value) {
        this.contactPostals[i] = _value;
    }


    /**
     * Gets the contactPhones value for this FWTOrganisation.
     * 
     * @return contactPhones
     */
    public lagan.api.main.FWTContactPhone[] getContactPhones() {
        return contactPhones;
    }


    /**
     * Sets the contactPhones value for this FWTOrganisation.
     * 
     * @param contactPhones
     */
    public void setContactPhones(lagan.api.main.FWTContactPhone[] contactPhones) {
        this.contactPhones = contactPhones;
    }

    public lagan.api.main.FWTContactPhone getContactPhones(int i) {
        return this.contactPhones[i];
    }

    public void setContactPhones(int i, lagan.api.main.FWTContactPhone _value) {
        this.contactPhones[i] = _value;
    }


    /**
     * Gets the contactEmails value for this FWTOrganisation.
     * 
     * @return contactEmails
     */
    public lagan.api.main.FWTContactEmail[] getContactEmails() {
        return contactEmails;
    }


    /**
     * Sets the contactEmails value for this FWTOrganisation.
     * 
     * @param contactEmails
     */
    public void setContactEmails(lagan.api.main.FWTContactEmail[] contactEmails) {
        this.contactEmails = contactEmails;
    }

    public lagan.api.main.FWTContactEmail getContactEmails(int i) {
        return this.contactEmails[i];
    }

    public void setContactEmails(int i, lagan.api.main.FWTContactEmail _value) {
        this.contactEmails[i] = _value;
    }


    /**
     * Gets the legalEntity value for this FWTOrganisation.
     * 
     * @return legalEntity
     */
    public java.lang.Boolean getLegalEntity() {
        return legalEntity;
    }


    /**
     * Sets the legalEntity value for this FWTOrganisation.
     * 
     * @param legalEntity
     */
    public void setLegalEntity(java.lang.Boolean legalEntity) {
        this.legalEntity = legalEntity;
    }


    /**
     * Gets the creationDate value for this FWTOrganisation.
     * 
     * @return creationDate
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this FWTOrganisation.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the dissolutionDate value for this FWTOrganisation.
     * 
     * @return dissolutionDate
     */
    public java.util.Date getDissolutionDate() {
        return dissolutionDate;
    }


    /**
     * Sets the dissolutionDate value for this FWTOrganisation.
     * 
     * @param dissolutionDate
     */
    public void setDissolutionDate(java.util.Date dissolutionDate) {
        this.dissolutionDate = dissolutionDate;
    }


    /**
     * Gets the childSet value for this FWTOrganisation.
     * 
     * @return childSet
     */
    public lagan.api.main.FWTExtensionChildSet[] getChildSet() {
        return childSet;
    }


    /**
     * Sets the childSet value for this FWTOrganisation.
     * 
     * @param childSet
     */
    public void setChildSet(lagan.api.main.FWTExtensionChildSet[] childSet) {
        this.childSet = childSet;
    }

    public lagan.api.main.FWTExtensionChildSet getChildSet(int i) {
        return this.childSet[i];
    }

    public void setChildSet(int i, lagan.api.main.FWTExtensionChildSet _value) {
        this.childSet[i] = _value;
    }


    /**
     * Gets the companyReferenceNumber value for this FWTOrganisation.
     * 
     * @return companyReferenceNumber
     */
    public java.lang.String getCompanyReferenceNumber() {
        return companyReferenceNumber;
    }


    /**
     * Sets the companyReferenceNumber value for this FWTOrganisation.
     * 
     * @param companyReferenceNumber
     */
    public void setCompanyReferenceNumber(java.lang.String companyReferenceNumber) {
        this.companyReferenceNumber = companyReferenceNumber;
    }


    /**
     * Gets the organisationCode value for this FWTOrganisation.
     * 
     * @return organisationCode
     */
    public java.lang.String getOrganisationCode() {
        return organisationCode;
    }


    /**
     * Sets the organisationCode value for this FWTOrganisation.
     * 
     * @param organisationCode
     */
    public void setOrganisationCode(java.lang.String organisationCode) {
        this.organisationCode = organisationCode;
    }


    /**
     * Gets the VATNumber value for this FWTOrganisation.
     * 
     * @return VATNumber   * Not applicable for US organisations
     */
    public java.lang.String getVATNumber() {
        return VATNumber;
    }


    /**
     * Sets the VATNumber value for this FWTOrganisation.
     * 
     * @param VATNumber   * Not applicable for US organisations
     */
    public void setVATNumber(java.lang.String VATNumber) {
        this.VATNumber = VATNumber;
    }


    /**
     * Gets the VATNumberPatternID value for this FWTOrganisation.
     * 
     * @return VATNumberPatternID   * Not applicable for US organisations
     */
    public java.lang.Integer getVATNumberPatternID() {
        return VATNumberPatternID;
    }


    /**
     * Sets the VATNumberPatternID value for this FWTOrganisation.
     * 
     * @param VATNumberPatternID   * Not applicable for US organisations
     */
    public void setVATNumberPatternID(java.lang.Integer VATNumberPatternID) {
        this.VATNumberPatternID = VATNumberPatternID;
    }


    /**
     * Gets the industryClassification value for this FWTOrganisation.
     * 
     * @return industryClassification
     */
    public java.lang.String getIndustryClassification() {
        return industryClassification;
    }


    /**
     * Sets the industryClassification value for this FWTOrganisation.
     * 
     * @param industryClassification
     */
    public void setIndustryClassification(java.lang.String industryClassification) {
        this.industryClassification = industryClassification;
    }


    /**
     * Gets the validFromDate value for this FWTOrganisation.
     * 
     * @return validFromDate
     */
    public java.util.Date getValidFromDate() {
        return validFromDate;
    }


    /**
     * Sets the validFromDate value for this FWTOrganisation.
     * 
     * @param validFromDate
     */
    public void setValidFromDate(java.util.Date validFromDate) {
        this.validFromDate = validFromDate;
    }


    /**
     * Gets the validToDate value for this FWTOrganisation.
     * 
     * @return validToDate
     */
    public java.util.Date getValidToDate() {
        return validToDate;
    }


    /**
     * Sets the validToDate value for this FWTOrganisation.
     * 
     * @param validToDate
     */
    public void setValidToDate(java.util.Date validToDate) {
        this.validToDate = validToDate;
    }


    /**
     * Gets the userDefined value for this FWTOrganisation.
     * 
     * @return userDefined
     */
    public java.lang.String[] getUserDefined() {
        return userDefined;
    }


    /**
     * Sets the userDefined value for this FWTOrganisation.
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
     * Gets the userDefinedNum value for this FWTOrganisation.
     * 
     * @return userDefinedNum
     */
    public long[] getUserDefinedNum() {
        return userDefinedNum;
    }


    /**
     * Sets the userDefinedNum value for this FWTOrganisation.
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
     * Gets the userDefinedText value for this FWTOrganisation.
     * 
     * @return userDefinedText
     */
    public java.lang.String[] getUserDefinedText() {
        return userDefinedText;
    }


    /**
     * Sets the userDefinedText value for this FWTOrganisation.
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
     * Gets the userDefinedDate value for this FWTOrganisation.
     * 
     * @return userDefinedDate
     */
    public java.util.Date[] getUserDefinedDate() {
        return userDefinedDate;
    }


    /**
     * Sets the userDefinedDate value for this FWTOrganisation.
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
     * Gets the genericSmalls value for this FWTOrganisation.
     * 
     * @return genericSmalls
     */
    public lagan.api.main.FWTGenericSmall[] getGenericSmalls() {
        return genericSmalls;
    }


    /**
     * Sets the genericSmalls value for this FWTOrganisation.
     * 
     * @param genericSmalls
     */
    public void setGenericSmalls(lagan.api.main.FWTGenericSmall[] genericSmalls) {
        this.genericSmalls = genericSmalls;
    }

    public lagan.api.main.FWTGenericSmall getGenericSmalls(int i) {
        return this.genericSmalls[i];
    }

    public void setGenericSmalls(int i, lagan.api.main.FWTGenericSmall _value) {
        this.genericSmalls[i] = _value;
    }


    /**
     * Gets the genericBigs value for this FWTOrganisation.
     * 
     * @return genericBigs
     */
    public lagan.api.main.FWTGenericBig[] getGenericBigs() {
        return genericBigs;
    }


    /**
     * Sets the genericBigs value for this FWTOrganisation.
     * 
     * @param genericBigs
     */
    public void setGenericBigs(lagan.api.main.FWTGenericBig[] genericBigs) {
        this.genericBigs = genericBigs;
    }

    public lagan.api.main.FWTGenericBig getGenericBigs(int i) {
        return this.genericBigs[i];
    }

    public void setGenericBigs(int i, lagan.api.main.FWTGenericBig _value) {
        this.genericBigs[i] = _value;
    }


    /**
     * Gets the auditDetails value for this FWTOrganisation.
     * 
     * @return auditDetails
     */
    public lagan.api.main.FWTAuditDetails getAuditDetails() {
        return auditDetails;
    }


    /**
     * Sets the auditDetails value for this FWTOrganisation.
     * 
     * @param auditDetails
     */
    public void setAuditDetails(lagan.api.main.FWTAuditDetails auditDetails) {
        this.auditDetails = auditDetails;
    }


    /**
     * Gets the option value for this FWTOrganisation.
     * 
     * @return option   * Values: cdi. This element is only
     *                                     used for creating an organisation
     * record and is not populated when
     *                                     used for retrieving an
     *                                     organisation's details.
     */
    public java.lang.String[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this FWTOrganisation.
     * 
     * @param option   * Values: cdi. This element is only
     *                                     used for creating an organisation
     * record and is not populated when
     *                                     used for retrieving an
     *                                     organisation's details.
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
     * Gets the extraData value for this FWTOrganisation.
     * 
     * @return extraData
     */
    public lagan.api.main.FWTKeyValue[] getExtraData() {
        return extraData;
    }


    /**
     * Sets the extraData value for this FWTOrganisation.
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
        if (!(obj instanceof FWTOrganisation)) return false;
        FWTOrganisation other = (FWTOrganisation) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.contactPostals==null && other.getContactPostals()==null) || 
             (this.contactPostals!=null &&
              java.util.Arrays.equals(this.contactPostals, other.getContactPostals()))) &&
            ((this.contactPhones==null && other.getContactPhones()==null) || 
             (this.contactPhones!=null &&
              java.util.Arrays.equals(this.contactPhones, other.getContactPhones()))) &&
            ((this.contactEmails==null && other.getContactEmails()==null) || 
             (this.contactEmails!=null &&
              java.util.Arrays.equals(this.contactEmails, other.getContactEmails()))) &&
            ((this.legalEntity==null && other.getLegalEntity()==null) || 
             (this.legalEntity!=null &&
              this.legalEntity.equals(other.getLegalEntity()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.dissolutionDate==null && other.getDissolutionDate()==null) || 
             (this.dissolutionDate!=null &&
              this.dissolutionDate.equals(other.getDissolutionDate()))) &&
            ((this.childSet==null && other.getChildSet()==null) || 
             (this.childSet!=null &&
              java.util.Arrays.equals(this.childSet, other.getChildSet()))) &&
            ((this.companyReferenceNumber==null && other.getCompanyReferenceNumber()==null) || 
             (this.companyReferenceNumber!=null &&
              this.companyReferenceNumber.equals(other.getCompanyReferenceNumber()))) &&
            ((this.organisationCode==null && other.getOrganisationCode()==null) || 
             (this.organisationCode!=null &&
              this.organisationCode.equals(other.getOrganisationCode()))) &&
            ((this.VATNumber==null && other.getVATNumber()==null) || 
             (this.VATNumber!=null &&
              this.VATNumber.equals(other.getVATNumber()))) &&
            ((this.VATNumberPatternID==null && other.getVATNumberPatternID()==null) || 
             (this.VATNumberPatternID!=null &&
              this.VATNumberPatternID.equals(other.getVATNumberPatternID()))) &&
            ((this.industryClassification==null && other.getIndustryClassification()==null) || 
             (this.industryClassification!=null &&
              this.industryClassification.equals(other.getIndustryClassification()))) &&
            ((this.validFromDate==null && other.getValidFromDate()==null) || 
             (this.validFromDate!=null &&
              this.validFromDate.equals(other.getValidFromDate()))) &&
            ((this.validToDate==null && other.getValidToDate()==null) || 
             (this.validToDate!=null &&
              this.validToDate.equals(other.getValidToDate()))) &&
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
            ((this.genericSmalls==null && other.getGenericSmalls()==null) || 
             (this.genericSmalls!=null &&
              java.util.Arrays.equals(this.genericSmalls, other.getGenericSmalls()))) &&
            ((this.genericBigs==null && other.getGenericBigs()==null) || 
             (this.genericBigs!=null &&
              java.util.Arrays.equals(this.genericBigs, other.getGenericBigs()))) &&
            ((this.auditDetails==null && other.getAuditDetails()==null) || 
             (this.auditDetails!=null &&
              this.auditDetails.equals(other.getAuditDetails()))) &&
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
        if (getBriefDetails() != null) {
            _hashCode += getBriefDetails().hashCode();
        }
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContactPostals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactPostals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContactPostals(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContactPhones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactPhones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContactPhones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContactEmails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactEmails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContactEmails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLegalEntity() != null) {
            _hashCode += getLegalEntity().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getDissolutionDate() != null) {
            _hashCode += getDissolutionDate().hashCode();
        }
        if (getChildSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompanyReferenceNumber() != null) {
            _hashCode += getCompanyReferenceNumber().hashCode();
        }
        if (getOrganisationCode() != null) {
            _hashCode += getOrganisationCode().hashCode();
        }
        if (getVATNumber() != null) {
            _hashCode += getVATNumber().hashCode();
        }
        if (getVATNumberPatternID() != null) {
            _hashCode += getVATNumberPatternID().hashCode();
        }
        if (getIndustryClassification() != null) {
            _hashCode += getIndustryClassification().hashCode();
        }
        if (getValidFromDate() != null) {
            _hashCode += getValidFromDate().hashCode();
        }
        if (getValidToDate() != null) {
            _hashCode += getValidToDate().hashCode();
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
        if (getGenericSmalls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGenericSmalls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGenericSmalls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGenericBigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGenericBigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGenericBigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuditDetails() != null) {
            _hashCode += getAuditDetails().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(FWTOrganisation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTOrganisation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("briefDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BriefDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectBriefDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTOrganisationName"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPostals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactPostals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTContactPostal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPhones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactPhones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTContactPhone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTContactEmail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LegalEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dissolutionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DissolutionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChildSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTExtensionChildSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CompanyReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organisationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrganisationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VATNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VATNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VATNumberPatternID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VATNumberPatternID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryClassification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IndustryClassification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidFromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validToDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTOrganisation>UserDefined"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTOrganisation>UserDefinedText"));
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
        elemField.setFieldName("genericSmalls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenericSmalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTGenericSmall"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericBigs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenericBigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTGenericBig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuditDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTAuditDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTOrganisation>Option"));
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
