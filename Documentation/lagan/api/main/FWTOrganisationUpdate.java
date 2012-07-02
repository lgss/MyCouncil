/**
 * FWTOrganisationUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTOrganisationUpdate  implements java.io.Serializable {
    private lagan.api.main.FWTObjectBriefDetails briefDetails;

    private lagan.api.main.FWTOrganisationNameUpdate[] name;

    private lagan.api.main.FWTContactPostalUpdate[] contactPostals;

    private lagan.api.main.FWTContactPhoneUpdate[] contactPhones;

    private lagan.api.main.FWTContactEmailUpdate[] contactEmails;

    private lagan.api.main.FWTLegalEntityUpdate legalEntityUpdate;

    private lagan.api.main.FWTCreationDateUpdate creationDateUpdate;

    private lagan.api.main.FWTDissolutionDateUpdate dissolutionDateUpdate;

    private lagan.api.main.FWTCompanyReferenceNumberUpdate companyReferenceNumberUpdate;

    private lagan.api.main.FWTOrganisationCodeUpdate organisationCodeUpdate;

    private lagan.api.main.FWTVATNumberUpdate VATNumberUpdate;

    private lagan.api.main.FWTVATNumberPatternIDUpdate VATNumberPatternIDUpdate;

    private lagan.api.main.FWTIndustryClassificationUpdate industryClassificationUpdate;

    private lagan.api.main.FWTValidFromDateUpdate validFromDateUpdate;

    private lagan.api.main.FWTValidToDateUpdate validToDateUpdate;

    private lagan.api.main.FWTUserDefinedUpdate[] userDefinedUpdate;

    private lagan.api.main.FWTUserDefinedNumUpdate[] userDefinedNumUpdate;

    private lagan.api.main.FWTUserDefinedTextUpdate[] userDefinedTextUpdate;

    private lagan.api.main.FWTUserDefinedDateUpdate[] userDefinedDateUpdate;

    private lagan.api.main.FWTGenericSmallUpdate[] genericSmallUpdates;

    private lagan.api.main.FWTGenericBigUpdate[] genericBigUpdates;

    /* Values: cdi . This element is only
     *                                     used for updating an organisation's
     * record. */
    private java.lang.String[] option;

    private lagan.api.main.FWTExtensionChildSet[] childSet;

    private lagan.api.main.FWTKeyValue[] extraData;

    public FWTOrganisationUpdate() {
    }

    public FWTOrganisationUpdate(
           lagan.api.main.FWTObjectBriefDetails briefDetails,
           lagan.api.main.FWTOrganisationNameUpdate[] name,
           lagan.api.main.FWTContactPostalUpdate[] contactPostals,
           lagan.api.main.FWTContactPhoneUpdate[] contactPhones,
           lagan.api.main.FWTContactEmailUpdate[] contactEmails,
           lagan.api.main.FWTLegalEntityUpdate legalEntityUpdate,
           lagan.api.main.FWTCreationDateUpdate creationDateUpdate,
           lagan.api.main.FWTDissolutionDateUpdate dissolutionDateUpdate,
           lagan.api.main.FWTCompanyReferenceNumberUpdate companyReferenceNumberUpdate,
           lagan.api.main.FWTOrganisationCodeUpdate organisationCodeUpdate,
           lagan.api.main.FWTVATNumberUpdate VATNumberUpdate,
           lagan.api.main.FWTVATNumberPatternIDUpdate VATNumberPatternIDUpdate,
           lagan.api.main.FWTIndustryClassificationUpdate industryClassificationUpdate,
           lagan.api.main.FWTValidFromDateUpdate validFromDateUpdate,
           lagan.api.main.FWTValidToDateUpdate validToDateUpdate,
           lagan.api.main.FWTUserDefinedUpdate[] userDefinedUpdate,
           lagan.api.main.FWTUserDefinedNumUpdate[] userDefinedNumUpdate,
           lagan.api.main.FWTUserDefinedTextUpdate[] userDefinedTextUpdate,
           lagan.api.main.FWTUserDefinedDateUpdate[] userDefinedDateUpdate,
           lagan.api.main.FWTGenericSmallUpdate[] genericSmallUpdates,
           lagan.api.main.FWTGenericBigUpdate[] genericBigUpdates,
           java.lang.String[] option,
           lagan.api.main.FWTExtensionChildSet[] childSet,
           lagan.api.main.FWTKeyValue[] extraData) {
           this.briefDetails = briefDetails;
           this.name = name;
           this.contactPostals = contactPostals;
           this.contactPhones = contactPhones;
           this.contactEmails = contactEmails;
           this.legalEntityUpdate = legalEntityUpdate;
           this.creationDateUpdate = creationDateUpdate;
           this.dissolutionDateUpdate = dissolutionDateUpdate;
           this.companyReferenceNumberUpdate = companyReferenceNumberUpdate;
           this.organisationCodeUpdate = organisationCodeUpdate;
           this.VATNumberUpdate = VATNumberUpdate;
           this.VATNumberPatternIDUpdate = VATNumberPatternIDUpdate;
           this.industryClassificationUpdate = industryClassificationUpdate;
           this.validFromDateUpdate = validFromDateUpdate;
           this.validToDateUpdate = validToDateUpdate;
           this.userDefinedUpdate = userDefinedUpdate;
           this.userDefinedNumUpdate = userDefinedNumUpdate;
           this.userDefinedTextUpdate = userDefinedTextUpdate;
           this.userDefinedDateUpdate = userDefinedDateUpdate;
           this.genericSmallUpdates = genericSmallUpdates;
           this.genericBigUpdates = genericBigUpdates;
           this.option = option;
           this.childSet = childSet;
           this.extraData = extraData;
    }


    /**
     * Gets the briefDetails value for this FWTOrganisationUpdate.
     * 
     * @return briefDetails
     */
    public lagan.api.main.FWTObjectBriefDetails getBriefDetails() {
        return briefDetails;
    }


    /**
     * Sets the briefDetails value for this FWTOrganisationUpdate.
     * 
     * @param briefDetails
     */
    public void setBriefDetails(lagan.api.main.FWTObjectBriefDetails briefDetails) {
        this.briefDetails = briefDetails;
    }


    /**
     * Gets the name value for this FWTOrganisationUpdate.
     * 
     * @return name
     */
    public lagan.api.main.FWTOrganisationNameUpdate[] getName() {
        return name;
    }


    /**
     * Sets the name value for this FWTOrganisationUpdate.
     * 
     * @param name
     */
    public void setName(lagan.api.main.FWTOrganisationNameUpdate[] name) {
        this.name = name;
    }

    public lagan.api.main.FWTOrganisationNameUpdate getName(int i) {
        return this.name[i];
    }

    public void setName(int i, lagan.api.main.FWTOrganisationNameUpdate _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the contactPostals value for this FWTOrganisationUpdate.
     * 
     * @return contactPostals
     */
    public lagan.api.main.FWTContactPostalUpdate[] getContactPostals() {
        return contactPostals;
    }


    /**
     * Sets the contactPostals value for this FWTOrganisationUpdate.
     * 
     * @param contactPostals
     */
    public void setContactPostals(lagan.api.main.FWTContactPostalUpdate[] contactPostals) {
        this.contactPostals = contactPostals;
    }

    public lagan.api.main.FWTContactPostalUpdate getContactPostals(int i) {
        return this.contactPostals[i];
    }

    public void setContactPostals(int i, lagan.api.main.FWTContactPostalUpdate _value) {
        this.contactPostals[i] = _value;
    }


    /**
     * Gets the contactPhones value for this FWTOrganisationUpdate.
     * 
     * @return contactPhones
     */
    public lagan.api.main.FWTContactPhoneUpdate[] getContactPhones() {
        return contactPhones;
    }


    /**
     * Sets the contactPhones value for this FWTOrganisationUpdate.
     * 
     * @param contactPhones
     */
    public void setContactPhones(lagan.api.main.FWTContactPhoneUpdate[] contactPhones) {
        this.contactPhones = contactPhones;
    }

    public lagan.api.main.FWTContactPhoneUpdate getContactPhones(int i) {
        return this.contactPhones[i];
    }

    public void setContactPhones(int i, lagan.api.main.FWTContactPhoneUpdate _value) {
        this.contactPhones[i] = _value;
    }


    /**
     * Gets the contactEmails value for this FWTOrganisationUpdate.
     * 
     * @return contactEmails
     */
    public lagan.api.main.FWTContactEmailUpdate[] getContactEmails() {
        return contactEmails;
    }


    /**
     * Sets the contactEmails value for this FWTOrganisationUpdate.
     * 
     * @param contactEmails
     */
    public void setContactEmails(lagan.api.main.FWTContactEmailUpdate[] contactEmails) {
        this.contactEmails = contactEmails;
    }

    public lagan.api.main.FWTContactEmailUpdate getContactEmails(int i) {
        return this.contactEmails[i];
    }

    public void setContactEmails(int i, lagan.api.main.FWTContactEmailUpdate _value) {
        this.contactEmails[i] = _value;
    }


    /**
     * Gets the legalEntityUpdate value for this FWTOrganisationUpdate.
     * 
     * @return legalEntityUpdate
     */
    public lagan.api.main.FWTLegalEntityUpdate getLegalEntityUpdate() {
        return legalEntityUpdate;
    }


    /**
     * Sets the legalEntityUpdate value for this FWTOrganisationUpdate.
     * 
     * @param legalEntityUpdate
     */
    public void setLegalEntityUpdate(lagan.api.main.FWTLegalEntityUpdate legalEntityUpdate) {
        this.legalEntityUpdate = legalEntityUpdate;
    }


    /**
     * Gets the creationDateUpdate value for this FWTOrganisationUpdate.
     * 
     * @return creationDateUpdate
     */
    public lagan.api.main.FWTCreationDateUpdate getCreationDateUpdate() {
        return creationDateUpdate;
    }


    /**
     * Sets the creationDateUpdate value for this FWTOrganisationUpdate.
     * 
     * @param creationDateUpdate
     */
    public void setCreationDateUpdate(lagan.api.main.FWTCreationDateUpdate creationDateUpdate) {
        this.creationDateUpdate = creationDateUpdate;
    }


    /**
     * Gets the dissolutionDateUpdate value for this FWTOrganisationUpdate.
     * 
     * @return dissolutionDateUpdate
     */
    public lagan.api.main.FWTDissolutionDateUpdate getDissolutionDateUpdate() {
        return dissolutionDateUpdate;
    }


    /**
     * Sets the dissolutionDateUpdate value for this FWTOrganisationUpdate.
     * 
     * @param dissolutionDateUpdate
     */
    public void setDissolutionDateUpdate(lagan.api.main.FWTDissolutionDateUpdate dissolutionDateUpdate) {
        this.dissolutionDateUpdate = dissolutionDateUpdate;
    }


    /**
     * Gets the companyReferenceNumberUpdate value for this FWTOrganisationUpdate.
     * 
     * @return companyReferenceNumberUpdate
     */
    public lagan.api.main.FWTCompanyReferenceNumberUpdate getCompanyReferenceNumberUpdate() {
        return companyReferenceNumberUpdate;
    }


    /**
     * Sets the companyReferenceNumberUpdate value for this FWTOrganisationUpdate.
     * 
     * @param companyReferenceNumberUpdate
     */
    public void setCompanyReferenceNumberUpdate(lagan.api.main.FWTCompanyReferenceNumberUpdate companyReferenceNumberUpdate) {
        this.companyReferenceNumberUpdate = companyReferenceNumberUpdate;
    }


    /**
     * Gets the organisationCodeUpdate value for this FWTOrganisationUpdate.
     * 
     * @return organisationCodeUpdate
     */
    public lagan.api.main.FWTOrganisationCodeUpdate getOrganisationCodeUpdate() {
        return organisationCodeUpdate;
    }


    /**
     * Sets the organisationCodeUpdate value for this FWTOrganisationUpdate.
     * 
     * @param organisationCodeUpdate
     */
    public void setOrganisationCodeUpdate(lagan.api.main.FWTOrganisationCodeUpdate organisationCodeUpdate) {
        this.organisationCodeUpdate = organisationCodeUpdate;
    }


    /**
     * Gets the VATNumberUpdate value for this FWTOrganisationUpdate.
     * 
     * @return VATNumberUpdate
     */
    public lagan.api.main.FWTVATNumberUpdate getVATNumberUpdate() {
        return VATNumberUpdate;
    }


    /**
     * Sets the VATNumberUpdate value for this FWTOrganisationUpdate.
     * 
     * @param VATNumberUpdate
     */
    public void setVATNumberUpdate(lagan.api.main.FWTVATNumberUpdate VATNumberUpdate) {
        this.VATNumberUpdate = VATNumberUpdate;
    }


    /**
     * Gets the VATNumberPatternIDUpdate value for this FWTOrganisationUpdate.
     * 
     * @return VATNumberPatternIDUpdate
     */
    public lagan.api.main.FWTVATNumberPatternIDUpdate getVATNumberPatternIDUpdate() {
        return VATNumberPatternIDUpdate;
    }


    /**
     * Sets the VATNumberPatternIDUpdate value for this FWTOrganisationUpdate.
     * 
     * @param VATNumberPatternIDUpdate
     */
    public void setVATNumberPatternIDUpdate(lagan.api.main.FWTVATNumberPatternIDUpdate VATNumberPatternIDUpdate) {
        this.VATNumberPatternIDUpdate = VATNumberPatternIDUpdate;
    }


    /**
     * Gets the industryClassificationUpdate value for this FWTOrganisationUpdate.
     * 
     * @return industryClassificationUpdate
     */
    public lagan.api.main.FWTIndustryClassificationUpdate getIndustryClassificationUpdate() {
        return industryClassificationUpdate;
    }


    /**
     * Sets the industryClassificationUpdate value for this FWTOrganisationUpdate.
     * 
     * @param industryClassificationUpdate
     */
    public void setIndustryClassificationUpdate(lagan.api.main.FWTIndustryClassificationUpdate industryClassificationUpdate) {
        this.industryClassificationUpdate = industryClassificationUpdate;
    }


    /**
     * Gets the validFromDateUpdate value for this FWTOrganisationUpdate.
     * 
     * @return validFromDateUpdate
     */
    public lagan.api.main.FWTValidFromDateUpdate getValidFromDateUpdate() {
        return validFromDateUpdate;
    }


    /**
     * Sets the validFromDateUpdate value for this FWTOrganisationUpdate.
     * 
     * @param validFromDateUpdate
     */
    public void setValidFromDateUpdate(lagan.api.main.FWTValidFromDateUpdate validFromDateUpdate) {
        this.validFromDateUpdate = validFromDateUpdate;
    }


    /**
     * Gets the validToDateUpdate value for this FWTOrganisationUpdate.
     * 
     * @return validToDateUpdate
     */
    public lagan.api.main.FWTValidToDateUpdate getValidToDateUpdate() {
        return validToDateUpdate;
    }


    /**
     * Sets the validToDateUpdate value for this FWTOrganisationUpdate.
     * 
     * @param validToDateUpdate
     */
    public void setValidToDateUpdate(lagan.api.main.FWTValidToDateUpdate validToDateUpdate) {
        this.validToDateUpdate = validToDateUpdate;
    }


    /**
     * Gets the userDefinedUpdate value for this FWTOrganisationUpdate.
     * 
     * @return userDefinedUpdate
     */
    public lagan.api.main.FWTUserDefinedUpdate[] getUserDefinedUpdate() {
        return userDefinedUpdate;
    }


    /**
     * Sets the userDefinedUpdate value for this FWTOrganisationUpdate.
     * 
     * @param userDefinedUpdate
     */
    public void setUserDefinedUpdate(lagan.api.main.FWTUserDefinedUpdate[] userDefinedUpdate) {
        this.userDefinedUpdate = userDefinedUpdate;
    }

    public lagan.api.main.FWTUserDefinedUpdate getUserDefinedUpdate(int i) {
        return this.userDefinedUpdate[i];
    }

    public void setUserDefinedUpdate(int i, lagan.api.main.FWTUserDefinedUpdate _value) {
        this.userDefinedUpdate[i] = _value;
    }


    /**
     * Gets the userDefinedNumUpdate value for this FWTOrganisationUpdate.
     * 
     * @return userDefinedNumUpdate
     */
    public lagan.api.main.FWTUserDefinedNumUpdate[] getUserDefinedNumUpdate() {
        return userDefinedNumUpdate;
    }


    /**
     * Sets the userDefinedNumUpdate value for this FWTOrganisationUpdate.
     * 
     * @param userDefinedNumUpdate
     */
    public void setUserDefinedNumUpdate(lagan.api.main.FWTUserDefinedNumUpdate[] userDefinedNumUpdate) {
        this.userDefinedNumUpdate = userDefinedNumUpdate;
    }

    public lagan.api.main.FWTUserDefinedNumUpdate getUserDefinedNumUpdate(int i) {
        return this.userDefinedNumUpdate[i];
    }

    public void setUserDefinedNumUpdate(int i, lagan.api.main.FWTUserDefinedNumUpdate _value) {
        this.userDefinedNumUpdate[i] = _value;
    }


    /**
     * Gets the userDefinedTextUpdate value for this FWTOrganisationUpdate.
     * 
     * @return userDefinedTextUpdate
     */
    public lagan.api.main.FWTUserDefinedTextUpdate[] getUserDefinedTextUpdate() {
        return userDefinedTextUpdate;
    }


    /**
     * Sets the userDefinedTextUpdate value for this FWTOrganisationUpdate.
     * 
     * @param userDefinedTextUpdate
     */
    public void setUserDefinedTextUpdate(lagan.api.main.FWTUserDefinedTextUpdate[] userDefinedTextUpdate) {
        this.userDefinedTextUpdate = userDefinedTextUpdate;
    }

    public lagan.api.main.FWTUserDefinedTextUpdate getUserDefinedTextUpdate(int i) {
        return this.userDefinedTextUpdate[i];
    }

    public void setUserDefinedTextUpdate(int i, lagan.api.main.FWTUserDefinedTextUpdate _value) {
        this.userDefinedTextUpdate[i] = _value;
    }


    /**
     * Gets the userDefinedDateUpdate value for this FWTOrganisationUpdate.
     * 
     * @return userDefinedDateUpdate
     */
    public lagan.api.main.FWTUserDefinedDateUpdate[] getUserDefinedDateUpdate() {
        return userDefinedDateUpdate;
    }


    /**
     * Sets the userDefinedDateUpdate value for this FWTOrganisationUpdate.
     * 
     * @param userDefinedDateUpdate
     */
    public void setUserDefinedDateUpdate(lagan.api.main.FWTUserDefinedDateUpdate[] userDefinedDateUpdate) {
        this.userDefinedDateUpdate = userDefinedDateUpdate;
    }

    public lagan.api.main.FWTUserDefinedDateUpdate getUserDefinedDateUpdate(int i) {
        return this.userDefinedDateUpdate[i];
    }

    public void setUserDefinedDateUpdate(int i, lagan.api.main.FWTUserDefinedDateUpdate _value) {
        this.userDefinedDateUpdate[i] = _value;
    }


    /**
     * Gets the genericSmallUpdates value for this FWTOrganisationUpdate.
     * 
     * @return genericSmallUpdates
     */
    public lagan.api.main.FWTGenericSmallUpdate[] getGenericSmallUpdates() {
        return genericSmallUpdates;
    }


    /**
     * Sets the genericSmallUpdates value for this FWTOrganisationUpdate.
     * 
     * @param genericSmallUpdates
     */
    public void setGenericSmallUpdates(lagan.api.main.FWTGenericSmallUpdate[] genericSmallUpdates) {
        this.genericSmallUpdates = genericSmallUpdates;
    }

    public lagan.api.main.FWTGenericSmallUpdate getGenericSmallUpdates(int i) {
        return this.genericSmallUpdates[i];
    }

    public void setGenericSmallUpdates(int i, lagan.api.main.FWTGenericSmallUpdate _value) {
        this.genericSmallUpdates[i] = _value;
    }


    /**
     * Gets the genericBigUpdates value for this FWTOrganisationUpdate.
     * 
     * @return genericBigUpdates
     */
    public lagan.api.main.FWTGenericBigUpdate[] getGenericBigUpdates() {
        return genericBigUpdates;
    }


    /**
     * Sets the genericBigUpdates value for this FWTOrganisationUpdate.
     * 
     * @param genericBigUpdates
     */
    public void setGenericBigUpdates(lagan.api.main.FWTGenericBigUpdate[] genericBigUpdates) {
        this.genericBigUpdates = genericBigUpdates;
    }

    public lagan.api.main.FWTGenericBigUpdate getGenericBigUpdates(int i) {
        return this.genericBigUpdates[i];
    }

    public void setGenericBigUpdates(int i, lagan.api.main.FWTGenericBigUpdate _value) {
        this.genericBigUpdates[i] = _value;
    }


    /**
     * Gets the option value for this FWTOrganisationUpdate.
     * 
     * @return option   * Values: cdi . This element is only
     *                                     used for updating an organisation's
     * record.
     */
    public java.lang.String[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this FWTOrganisationUpdate.
     * 
     * @param option   * Values: cdi . This element is only
     *                                     used for updating an organisation's
     * record.
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
     * Gets the childSet value for this FWTOrganisationUpdate.
     * 
     * @return childSet
     */
    public lagan.api.main.FWTExtensionChildSet[] getChildSet() {
        return childSet;
    }


    /**
     * Sets the childSet value for this FWTOrganisationUpdate.
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
     * Gets the extraData value for this FWTOrganisationUpdate.
     * 
     * @return extraData
     */
    public lagan.api.main.FWTKeyValue[] getExtraData() {
        return extraData;
    }


    /**
     * Sets the extraData value for this FWTOrganisationUpdate.
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
        if (!(obj instanceof FWTOrganisationUpdate)) return false;
        FWTOrganisationUpdate other = (FWTOrganisationUpdate) obj;
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
            ((this.legalEntityUpdate==null && other.getLegalEntityUpdate()==null) || 
             (this.legalEntityUpdate!=null &&
              this.legalEntityUpdate.equals(other.getLegalEntityUpdate()))) &&
            ((this.creationDateUpdate==null && other.getCreationDateUpdate()==null) || 
             (this.creationDateUpdate!=null &&
              this.creationDateUpdate.equals(other.getCreationDateUpdate()))) &&
            ((this.dissolutionDateUpdate==null && other.getDissolutionDateUpdate()==null) || 
             (this.dissolutionDateUpdate!=null &&
              this.dissolutionDateUpdate.equals(other.getDissolutionDateUpdate()))) &&
            ((this.companyReferenceNumberUpdate==null && other.getCompanyReferenceNumberUpdate()==null) || 
             (this.companyReferenceNumberUpdate!=null &&
              this.companyReferenceNumberUpdate.equals(other.getCompanyReferenceNumberUpdate()))) &&
            ((this.organisationCodeUpdate==null && other.getOrganisationCodeUpdate()==null) || 
             (this.organisationCodeUpdate!=null &&
              this.organisationCodeUpdate.equals(other.getOrganisationCodeUpdate()))) &&
            ((this.VATNumberUpdate==null && other.getVATNumberUpdate()==null) || 
             (this.VATNumberUpdate!=null &&
              this.VATNumberUpdate.equals(other.getVATNumberUpdate()))) &&
            ((this.VATNumberPatternIDUpdate==null && other.getVATNumberPatternIDUpdate()==null) || 
             (this.VATNumberPatternIDUpdate!=null &&
              this.VATNumberPatternIDUpdate.equals(other.getVATNumberPatternIDUpdate()))) &&
            ((this.industryClassificationUpdate==null && other.getIndustryClassificationUpdate()==null) || 
             (this.industryClassificationUpdate!=null &&
              this.industryClassificationUpdate.equals(other.getIndustryClassificationUpdate()))) &&
            ((this.validFromDateUpdate==null && other.getValidFromDateUpdate()==null) || 
             (this.validFromDateUpdate!=null &&
              this.validFromDateUpdate.equals(other.getValidFromDateUpdate()))) &&
            ((this.validToDateUpdate==null && other.getValidToDateUpdate()==null) || 
             (this.validToDateUpdate!=null &&
              this.validToDateUpdate.equals(other.getValidToDateUpdate()))) &&
            ((this.userDefinedUpdate==null && other.getUserDefinedUpdate()==null) || 
             (this.userDefinedUpdate!=null &&
              java.util.Arrays.equals(this.userDefinedUpdate, other.getUserDefinedUpdate()))) &&
            ((this.userDefinedNumUpdate==null && other.getUserDefinedNumUpdate()==null) || 
             (this.userDefinedNumUpdate!=null &&
              java.util.Arrays.equals(this.userDefinedNumUpdate, other.getUserDefinedNumUpdate()))) &&
            ((this.userDefinedTextUpdate==null && other.getUserDefinedTextUpdate()==null) || 
             (this.userDefinedTextUpdate!=null &&
              java.util.Arrays.equals(this.userDefinedTextUpdate, other.getUserDefinedTextUpdate()))) &&
            ((this.userDefinedDateUpdate==null && other.getUserDefinedDateUpdate()==null) || 
             (this.userDefinedDateUpdate!=null &&
              java.util.Arrays.equals(this.userDefinedDateUpdate, other.getUserDefinedDateUpdate()))) &&
            ((this.genericSmallUpdates==null && other.getGenericSmallUpdates()==null) || 
             (this.genericSmallUpdates!=null &&
              java.util.Arrays.equals(this.genericSmallUpdates, other.getGenericSmallUpdates()))) &&
            ((this.genericBigUpdates==null && other.getGenericBigUpdates()==null) || 
             (this.genericBigUpdates!=null &&
              java.util.Arrays.equals(this.genericBigUpdates, other.getGenericBigUpdates()))) &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              java.util.Arrays.equals(this.option, other.getOption()))) &&
            ((this.childSet==null && other.getChildSet()==null) || 
             (this.childSet!=null &&
              java.util.Arrays.equals(this.childSet, other.getChildSet()))) &&
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
        if (getLegalEntityUpdate() != null) {
            _hashCode += getLegalEntityUpdate().hashCode();
        }
        if (getCreationDateUpdate() != null) {
            _hashCode += getCreationDateUpdate().hashCode();
        }
        if (getDissolutionDateUpdate() != null) {
            _hashCode += getDissolutionDateUpdate().hashCode();
        }
        if (getCompanyReferenceNumberUpdate() != null) {
            _hashCode += getCompanyReferenceNumberUpdate().hashCode();
        }
        if (getOrganisationCodeUpdate() != null) {
            _hashCode += getOrganisationCodeUpdate().hashCode();
        }
        if (getVATNumberUpdate() != null) {
            _hashCode += getVATNumberUpdate().hashCode();
        }
        if (getVATNumberPatternIDUpdate() != null) {
            _hashCode += getVATNumberPatternIDUpdate().hashCode();
        }
        if (getIndustryClassificationUpdate() != null) {
            _hashCode += getIndustryClassificationUpdate().hashCode();
        }
        if (getValidFromDateUpdate() != null) {
            _hashCode += getValidFromDateUpdate().hashCode();
        }
        if (getValidToDateUpdate() != null) {
            _hashCode += getValidToDateUpdate().hashCode();
        }
        if (getUserDefinedUpdate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserDefinedUpdate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserDefinedUpdate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserDefinedNumUpdate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserDefinedNumUpdate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserDefinedNumUpdate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserDefinedTextUpdate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserDefinedTextUpdate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserDefinedTextUpdate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserDefinedDateUpdate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserDefinedDateUpdate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserDefinedDateUpdate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGenericSmallUpdates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGenericSmallUpdates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGenericSmallUpdates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGenericBigUpdates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGenericBigUpdates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGenericBigUpdates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(FWTOrganisationUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTOrganisationUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("briefDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BriefDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectBriefDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTOrganisationNameUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPostals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactPostals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTContactPostalUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPhones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactPhones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTContactPhoneUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTContactEmailUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalEntityUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LegalEntityUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTLegalEntityUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreationDateUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCreationDateUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dissolutionDateUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DissolutionDateUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTDissolutionDateUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyReferenceNumberUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CompanyReferenceNumberUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCompanyReferenceNumberUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organisationCodeUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrganisationCodeUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTOrganisationCodeUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VATNumberUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VATNumberUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTVATNumberUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VATNumberPatternIDUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VATNumberPatternIDUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTVATNumberPatternIDUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryClassificationUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IndustryClassificationUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTIndustryClassificationUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFromDateUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidFromDateUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTValidFromDateUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validToDateUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidToDateUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTValidToDateUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefinedUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTUserDefinedUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedNumUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefinedNumUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTUserDefinedNumUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedTextUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefinedTextUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTUserDefinedTextUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedDateUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefinedDateUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTUserDefinedDateUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericSmallUpdates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenericSmallUpdates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTGenericSmallUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericBigUpdates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenericBigUpdates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTGenericBigUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTOrganisationUpdate>Option"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
