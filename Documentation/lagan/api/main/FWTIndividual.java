/**
 * FWTIndividual.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTIndividual  implements java.io.Serializable {
    private lagan.api.main.FWTExtensionChildSet[] childSet;

    private lagan.api.main.FWTObjectBriefDetails briefDetails;

    private lagan.api.main.FWTIndividualName[] name;

    private lagan.api.main.FWTContactPostal[] contactPostals;

    private lagan.api.main.FWTContactPhone[] contactPhones;

    private lagan.api.main.FWTContactEmail[] contactEmails;

    /* F=Female M=Male U=Unknown */
    private java.lang.String gender;

    /* F=Female M=Male U=Unknown */
    private java.lang.String genderAtBirth;

    private java.lang.String placeOfBirth;

    private java.lang.String countryOfBirth;

    private java.lang.String nationality;

    /* S=Single M=Married D=Divorced
     *                                     W=Widowed N=Not Disclosed
     *                                     P=Separated */
    private java.lang.String maritalStatus;

    private java.lang.String drivingLicenceNumber;

    private java.lang.Integer drivingLicencePatternID;

    private java.lang.Boolean additionalDrivingLicences;

    private java.lang.String passportNumber;

    private java.lang.Integer passportNumberPatternID;

    private java.lang.Boolean additionalPassports;

    /* Not applicable for US individuals */
    private java.lang.String healthNumber;

    /* Not applicable for US individuals */
    private java.lang.String nationalInsuranceNumber;

    /* For US individuals only */
    private java.lang.String socialSecurityNumber;

    private java.lang.String ethnicity;

    private java.lang.Boolean disabilities;

    private java.lang.String disabilityRegNumber;

    private java.util.Date dateOfBirth;

    private java.lang.String occupation;

    private java.lang.Boolean additionalOccupations;

    private java.util.Date dateOfDeath;

    private java.lang.String preferredLanguage;

    private java.util.Date validFromDate;

    private java.util.Date validToDate;

    /* 0=Does not consent, 1=Does Consent */
    private java.lang.String surveyConsent;

    private java.lang.String registrationDetails;

    private java.lang.String authenticationDetails;

    private java.lang.String LGCode;

    private java.lang.String authorisedView;

    private java.lang.String category;

    private java.lang.String freeText;

    private java.lang.String[] userDefined;

    private long[] userDefinedNum;

    private java.lang.String[] userDefinedText;

    private java.util.Date[] userDefinedDate;

    private lagan.api.main.FWTGenericSmall[] genericSmalls;

    private lagan.api.main.FWTGenericBig[] genericBigs;

    private lagan.api.main.FWTAuditDetails auditDetails;

    private lagan.api.main.FWTObjectID[] mergePartyList;

    /* Values: cdi .This element is only
     *                                     used for creating an individual
     * record and is not populated when
     *                                     used for retrieving an individual's
     * details. */
    private java.lang.String[] option;

    private lagan.api.main.FWTKeyValue[] extraData;

    public FWTIndividual() {
    }

    public FWTIndividual(
           lagan.api.main.FWTExtensionChildSet[] childSet,
           lagan.api.main.FWTObjectBriefDetails briefDetails,
           lagan.api.main.FWTIndividualName[] name,
           lagan.api.main.FWTContactPostal[] contactPostals,
           lagan.api.main.FWTContactPhone[] contactPhones,
           lagan.api.main.FWTContactEmail[] contactEmails,
           java.lang.String gender,
           java.lang.String genderAtBirth,
           java.lang.String placeOfBirth,
           java.lang.String countryOfBirth,
           java.lang.String nationality,
           java.lang.String maritalStatus,
           java.lang.String drivingLicenceNumber,
           java.lang.Integer drivingLicencePatternID,
           java.lang.Boolean additionalDrivingLicences,
           java.lang.String passportNumber,
           java.lang.Integer passportNumberPatternID,
           java.lang.Boolean additionalPassports,
           java.lang.String healthNumber,
           java.lang.String nationalInsuranceNumber,
           java.lang.String socialSecurityNumber,
           java.lang.String ethnicity,
           java.lang.Boolean disabilities,
           java.lang.String disabilityRegNumber,
           java.util.Date dateOfBirth,
           java.lang.String occupation,
           java.lang.Boolean additionalOccupations,
           java.util.Date dateOfDeath,
           java.lang.String preferredLanguage,
           java.util.Date validFromDate,
           java.util.Date validToDate,
           java.lang.String surveyConsent,
           java.lang.String registrationDetails,
           java.lang.String authenticationDetails,
           java.lang.String LGCode,
           java.lang.String authorisedView,
           java.lang.String category,
           java.lang.String freeText,
           java.lang.String[] userDefined,
           long[] userDefinedNum,
           java.lang.String[] userDefinedText,
           java.util.Date[] userDefinedDate,
           lagan.api.main.FWTGenericSmall[] genericSmalls,
           lagan.api.main.FWTGenericBig[] genericBigs,
           lagan.api.main.FWTAuditDetails auditDetails,
           lagan.api.main.FWTObjectID[] mergePartyList,
           java.lang.String[] option,
           lagan.api.main.FWTKeyValue[] extraData) {
           this.childSet = childSet;
           this.briefDetails = briefDetails;
           this.name = name;
           this.contactPostals = contactPostals;
           this.contactPhones = contactPhones;
           this.contactEmails = contactEmails;
           this.gender = gender;
           this.genderAtBirth = genderAtBirth;
           this.placeOfBirth = placeOfBirth;
           this.countryOfBirth = countryOfBirth;
           this.nationality = nationality;
           this.maritalStatus = maritalStatus;
           this.drivingLicenceNumber = drivingLicenceNumber;
           this.drivingLicencePatternID = drivingLicencePatternID;
           this.additionalDrivingLicences = additionalDrivingLicences;
           this.passportNumber = passportNumber;
           this.passportNumberPatternID = passportNumberPatternID;
           this.additionalPassports = additionalPassports;
           this.healthNumber = healthNumber;
           this.nationalInsuranceNumber = nationalInsuranceNumber;
           this.socialSecurityNumber = socialSecurityNumber;
           this.ethnicity = ethnicity;
           this.disabilities = disabilities;
           this.disabilityRegNumber = disabilityRegNumber;
           this.dateOfBirth = dateOfBirth;
           this.occupation = occupation;
           this.additionalOccupations = additionalOccupations;
           this.dateOfDeath = dateOfDeath;
           this.preferredLanguage = preferredLanguage;
           this.validFromDate = validFromDate;
           this.validToDate = validToDate;
           this.surveyConsent = surveyConsent;
           this.registrationDetails = registrationDetails;
           this.authenticationDetails = authenticationDetails;
           this.LGCode = LGCode;
           this.authorisedView = authorisedView;
           this.category = category;
           this.freeText = freeText;
           this.userDefined = userDefined;
           this.userDefinedNum = userDefinedNum;
           this.userDefinedText = userDefinedText;
           this.userDefinedDate = userDefinedDate;
           this.genericSmalls = genericSmalls;
           this.genericBigs = genericBigs;
           this.auditDetails = auditDetails;
           this.mergePartyList = mergePartyList;
           this.option = option;
           this.extraData = extraData;
    }


    /**
     * Gets the childSet value for this FWTIndividual.
     * 
     * @return childSet
     */
    public lagan.api.main.FWTExtensionChildSet[] getChildSet() {
        return childSet;
    }


    /**
     * Sets the childSet value for this FWTIndividual.
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
     * Gets the briefDetails value for this FWTIndividual.
     * 
     * @return briefDetails
     */
    public lagan.api.main.FWTObjectBriefDetails getBriefDetails() {
        return briefDetails;
    }


    /**
     * Sets the briefDetails value for this FWTIndividual.
     * 
     * @param briefDetails
     */
    public void setBriefDetails(lagan.api.main.FWTObjectBriefDetails briefDetails) {
        this.briefDetails = briefDetails;
    }


    /**
     * Gets the name value for this FWTIndividual.
     * 
     * @return name
     */
    public lagan.api.main.FWTIndividualName[] getName() {
        return name;
    }


    /**
     * Sets the name value for this FWTIndividual.
     * 
     * @param name
     */
    public void setName(lagan.api.main.FWTIndividualName[] name) {
        this.name = name;
    }

    public lagan.api.main.FWTIndividualName getName(int i) {
        return this.name[i];
    }

    public void setName(int i, lagan.api.main.FWTIndividualName _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the contactPostals value for this FWTIndividual.
     * 
     * @return contactPostals
     */
    public lagan.api.main.FWTContactPostal[] getContactPostals() {
        return contactPostals;
    }


    /**
     * Sets the contactPostals value for this FWTIndividual.
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
     * Gets the contactPhones value for this FWTIndividual.
     * 
     * @return contactPhones
     */
    public lagan.api.main.FWTContactPhone[] getContactPhones() {
        return contactPhones;
    }


    /**
     * Sets the contactPhones value for this FWTIndividual.
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
     * Gets the contactEmails value for this FWTIndividual.
     * 
     * @return contactEmails
     */
    public lagan.api.main.FWTContactEmail[] getContactEmails() {
        return contactEmails;
    }


    /**
     * Sets the contactEmails value for this FWTIndividual.
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
     * Gets the gender value for this FWTIndividual.
     * 
     * @return gender   * F=Female M=Male U=Unknown
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this FWTIndividual.
     * 
     * @param gender   * F=Female M=Male U=Unknown
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the genderAtBirth value for this FWTIndividual.
     * 
     * @return genderAtBirth   * F=Female M=Male U=Unknown
     */
    public java.lang.String getGenderAtBirth() {
        return genderAtBirth;
    }


    /**
     * Sets the genderAtBirth value for this FWTIndividual.
     * 
     * @param genderAtBirth   * F=Female M=Male U=Unknown
     */
    public void setGenderAtBirth(java.lang.String genderAtBirth) {
        this.genderAtBirth = genderAtBirth;
    }


    /**
     * Gets the placeOfBirth value for this FWTIndividual.
     * 
     * @return placeOfBirth
     */
    public java.lang.String getPlaceOfBirth() {
        return placeOfBirth;
    }


    /**
     * Sets the placeOfBirth value for this FWTIndividual.
     * 
     * @param placeOfBirth
     */
    public void setPlaceOfBirth(java.lang.String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }


    /**
     * Gets the countryOfBirth value for this FWTIndividual.
     * 
     * @return countryOfBirth
     */
    public java.lang.String getCountryOfBirth() {
        return countryOfBirth;
    }


    /**
     * Sets the countryOfBirth value for this FWTIndividual.
     * 
     * @param countryOfBirth
     */
    public void setCountryOfBirth(java.lang.String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }


    /**
     * Gets the nationality value for this FWTIndividual.
     * 
     * @return nationality
     */
    public java.lang.String getNationality() {
        return nationality;
    }


    /**
     * Sets the nationality value for this FWTIndividual.
     * 
     * @param nationality
     */
    public void setNationality(java.lang.String nationality) {
        this.nationality = nationality;
    }


    /**
     * Gets the maritalStatus value for this FWTIndividual.
     * 
     * @return maritalStatus   * S=Single M=Married D=Divorced
     *                                     W=Widowed N=Not Disclosed
     *                                     P=Separated
     */
    public java.lang.String getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this FWTIndividual.
     * 
     * @param maritalStatus   * S=Single M=Married D=Divorced
     *                                     W=Widowed N=Not Disclosed
     *                                     P=Separated
     */
    public void setMaritalStatus(java.lang.String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the drivingLicenceNumber value for this FWTIndividual.
     * 
     * @return drivingLicenceNumber
     */
    public java.lang.String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }


    /**
     * Sets the drivingLicenceNumber value for this FWTIndividual.
     * 
     * @param drivingLicenceNumber
     */
    public void setDrivingLicenceNumber(java.lang.String drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }


    /**
     * Gets the drivingLicencePatternID value for this FWTIndividual.
     * 
     * @return drivingLicencePatternID
     */
    public java.lang.Integer getDrivingLicencePatternID() {
        return drivingLicencePatternID;
    }


    /**
     * Sets the drivingLicencePatternID value for this FWTIndividual.
     * 
     * @param drivingLicencePatternID
     */
    public void setDrivingLicencePatternID(java.lang.Integer drivingLicencePatternID) {
        this.drivingLicencePatternID = drivingLicencePatternID;
    }


    /**
     * Gets the additionalDrivingLicences value for this FWTIndividual.
     * 
     * @return additionalDrivingLicences
     */
    public java.lang.Boolean getAdditionalDrivingLicences() {
        return additionalDrivingLicences;
    }


    /**
     * Sets the additionalDrivingLicences value for this FWTIndividual.
     * 
     * @param additionalDrivingLicences
     */
    public void setAdditionalDrivingLicences(java.lang.Boolean additionalDrivingLicences) {
        this.additionalDrivingLicences = additionalDrivingLicences;
    }


    /**
     * Gets the passportNumber value for this FWTIndividual.
     * 
     * @return passportNumber
     */
    public java.lang.String getPassportNumber() {
        return passportNumber;
    }


    /**
     * Sets the passportNumber value for this FWTIndividual.
     * 
     * @param passportNumber
     */
    public void setPassportNumber(java.lang.String passportNumber) {
        this.passportNumber = passportNumber;
    }


    /**
     * Gets the passportNumberPatternID value for this FWTIndividual.
     * 
     * @return passportNumberPatternID
     */
    public java.lang.Integer getPassportNumberPatternID() {
        return passportNumberPatternID;
    }


    /**
     * Sets the passportNumberPatternID value for this FWTIndividual.
     * 
     * @param passportNumberPatternID
     */
    public void setPassportNumberPatternID(java.lang.Integer passportNumberPatternID) {
        this.passportNumberPatternID = passportNumberPatternID;
    }


    /**
     * Gets the additionalPassports value for this FWTIndividual.
     * 
     * @return additionalPassports
     */
    public java.lang.Boolean getAdditionalPassports() {
        return additionalPassports;
    }


    /**
     * Sets the additionalPassports value for this FWTIndividual.
     * 
     * @param additionalPassports
     */
    public void setAdditionalPassports(java.lang.Boolean additionalPassports) {
        this.additionalPassports = additionalPassports;
    }


    /**
     * Gets the healthNumber value for this FWTIndividual.
     * 
     * @return healthNumber   * Not applicable for US individuals
     */
    public java.lang.String getHealthNumber() {
        return healthNumber;
    }


    /**
     * Sets the healthNumber value for this FWTIndividual.
     * 
     * @param healthNumber   * Not applicable for US individuals
     */
    public void setHealthNumber(java.lang.String healthNumber) {
        this.healthNumber = healthNumber;
    }


    /**
     * Gets the nationalInsuranceNumber value for this FWTIndividual.
     * 
     * @return nationalInsuranceNumber   * Not applicable for US individuals
     */
    public java.lang.String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }


    /**
     * Sets the nationalInsuranceNumber value for this FWTIndividual.
     * 
     * @param nationalInsuranceNumber   * Not applicable for US individuals
     */
    public void setNationalInsuranceNumber(java.lang.String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }


    /**
     * Gets the socialSecurityNumber value for this FWTIndividual.
     * 
     * @return socialSecurityNumber   * For US individuals only
     */
    public java.lang.String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    /**
     * Sets the socialSecurityNumber value for this FWTIndividual.
     * 
     * @param socialSecurityNumber   * For US individuals only
     */
    public void setSocialSecurityNumber(java.lang.String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    /**
     * Gets the ethnicity value for this FWTIndividual.
     * 
     * @return ethnicity
     */
    public java.lang.String getEthnicity() {
        return ethnicity;
    }


    /**
     * Sets the ethnicity value for this FWTIndividual.
     * 
     * @param ethnicity
     */
    public void setEthnicity(java.lang.String ethnicity) {
        this.ethnicity = ethnicity;
    }


    /**
     * Gets the disabilities value for this FWTIndividual.
     * 
     * @return disabilities
     */
    public java.lang.Boolean getDisabilities() {
        return disabilities;
    }


    /**
     * Sets the disabilities value for this FWTIndividual.
     * 
     * @param disabilities
     */
    public void setDisabilities(java.lang.Boolean disabilities) {
        this.disabilities = disabilities;
    }


    /**
     * Gets the disabilityRegNumber value for this FWTIndividual.
     * 
     * @return disabilityRegNumber
     */
    public java.lang.String getDisabilityRegNumber() {
        return disabilityRegNumber;
    }


    /**
     * Sets the disabilityRegNumber value for this FWTIndividual.
     * 
     * @param disabilityRegNumber
     */
    public void setDisabilityRegNumber(java.lang.String disabilityRegNumber) {
        this.disabilityRegNumber = disabilityRegNumber;
    }


    /**
     * Gets the dateOfBirth value for this FWTIndividual.
     * 
     * @return dateOfBirth
     */
    public java.util.Date getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this FWTIndividual.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the occupation value for this FWTIndividual.
     * 
     * @return occupation
     */
    public java.lang.String getOccupation() {
        return occupation;
    }


    /**
     * Sets the occupation value for this FWTIndividual.
     * 
     * @param occupation
     */
    public void setOccupation(java.lang.String occupation) {
        this.occupation = occupation;
    }


    /**
     * Gets the additionalOccupations value for this FWTIndividual.
     * 
     * @return additionalOccupations
     */
    public java.lang.Boolean getAdditionalOccupations() {
        return additionalOccupations;
    }


    /**
     * Sets the additionalOccupations value for this FWTIndividual.
     * 
     * @param additionalOccupations
     */
    public void setAdditionalOccupations(java.lang.Boolean additionalOccupations) {
        this.additionalOccupations = additionalOccupations;
    }


    /**
     * Gets the dateOfDeath value for this FWTIndividual.
     * 
     * @return dateOfDeath
     */
    public java.util.Date getDateOfDeath() {
        return dateOfDeath;
    }


    /**
     * Sets the dateOfDeath value for this FWTIndividual.
     * 
     * @param dateOfDeath
     */
    public void setDateOfDeath(java.util.Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }


    /**
     * Gets the preferredLanguage value for this FWTIndividual.
     * 
     * @return preferredLanguage
     */
    public java.lang.String getPreferredLanguage() {
        return preferredLanguage;
    }


    /**
     * Sets the preferredLanguage value for this FWTIndividual.
     * 
     * @param preferredLanguage
     */
    public void setPreferredLanguage(java.lang.String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }


    /**
     * Gets the validFromDate value for this FWTIndividual.
     * 
     * @return validFromDate
     */
    public java.util.Date getValidFromDate() {
        return validFromDate;
    }


    /**
     * Sets the validFromDate value for this FWTIndividual.
     * 
     * @param validFromDate
     */
    public void setValidFromDate(java.util.Date validFromDate) {
        this.validFromDate = validFromDate;
    }


    /**
     * Gets the validToDate value for this FWTIndividual.
     * 
     * @return validToDate
     */
    public java.util.Date getValidToDate() {
        return validToDate;
    }


    /**
     * Sets the validToDate value for this FWTIndividual.
     * 
     * @param validToDate
     */
    public void setValidToDate(java.util.Date validToDate) {
        this.validToDate = validToDate;
    }


    /**
     * Gets the surveyConsent value for this FWTIndividual.
     * 
     * @return surveyConsent   * 0=Does not consent, 1=Does Consent
     */
    public java.lang.String getSurveyConsent() {
        return surveyConsent;
    }


    /**
     * Sets the surveyConsent value for this FWTIndividual.
     * 
     * @param surveyConsent   * 0=Does not consent, 1=Does Consent
     */
    public void setSurveyConsent(java.lang.String surveyConsent) {
        this.surveyConsent = surveyConsent;
    }


    /**
     * Gets the registrationDetails value for this FWTIndividual.
     * 
     * @return registrationDetails
     */
    public java.lang.String getRegistrationDetails() {
        return registrationDetails;
    }


    /**
     * Sets the registrationDetails value for this FWTIndividual.
     * 
     * @param registrationDetails
     */
    public void setRegistrationDetails(java.lang.String registrationDetails) {
        this.registrationDetails = registrationDetails;
    }


    /**
     * Gets the authenticationDetails value for this FWTIndividual.
     * 
     * @return authenticationDetails
     */
    public java.lang.String getAuthenticationDetails() {
        return authenticationDetails;
    }


    /**
     * Sets the authenticationDetails value for this FWTIndividual.
     * 
     * @param authenticationDetails
     */
    public void setAuthenticationDetails(java.lang.String authenticationDetails) {
        this.authenticationDetails = authenticationDetails;
    }


    /**
     * Gets the LGCode value for this FWTIndividual.
     * 
     * @return LGCode
     */
    public java.lang.String getLGCode() {
        return LGCode;
    }


    /**
     * Sets the LGCode value for this FWTIndividual.
     * 
     * @param LGCode
     */
    public void setLGCode(java.lang.String LGCode) {
        this.LGCode = LGCode;
    }


    /**
     * Gets the authorisedView value for this FWTIndividual.
     * 
     * @return authorisedView
     */
    public java.lang.String getAuthorisedView() {
        return authorisedView;
    }


    /**
     * Sets the authorisedView value for this FWTIndividual.
     * 
     * @param authorisedView
     */
    public void setAuthorisedView(java.lang.String authorisedView) {
        this.authorisedView = authorisedView;
    }


    /**
     * Gets the category value for this FWTIndividual.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this FWTIndividual.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the freeText value for this FWTIndividual.
     * 
     * @return freeText
     */
    public java.lang.String getFreeText() {
        return freeText;
    }


    /**
     * Sets the freeText value for this FWTIndividual.
     * 
     * @param freeText
     */
    public void setFreeText(java.lang.String freeText) {
        this.freeText = freeText;
    }


    /**
     * Gets the userDefined value for this FWTIndividual.
     * 
     * @return userDefined
     */
    public java.lang.String[] getUserDefined() {
        return userDefined;
    }


    /**
     * Sets the userDefined value for this FWTIndividual.
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
     * Gets the userDefinedNum value for this FWTIndividual.
     * 
     * @return userDefinedNum
     */
    public long[] getUserDefinedNum() {
        return userDefinedNum;
    }


    /**
     * Sets the userDefinedNum value for this FWTIndividual.
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
     * Gets the userDefinedText value for this FWTIndividual.
     * 
     * @return userDefinedText
     */
    public java.lang.String[] getUserDefinedText() {
        return userDefinedText;
    }


    /**
     * Sets the userDefinedText value for this FWTIndividual.
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
     * Gets the userDefinedDate value for this FWTIndividual.
     * 
     * @return userDefinedDate
     */
    public java.util.Date[] getUserDefinedDate() {
        return userDefinedDate;
    }


    /**
     * Sets the userDefinedDate value for this FWTIndividual.
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
     * Gets the genericSmalls value for this FWTIndividual.
     * 
     * @return genericSmalls
     */
    public lagan.api.main.FWTGenericSmall[] getGenericSmalls() {
        return genericSmalls;
    }


    /**
     * Sets the genericSmalls value for this FWTIndividual.
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
     * Gets the genericBigs value for this FWTIndividual.
     * 
     * @return genericBigs
     */
    public lagan.api.main.FWTGenericBig[] getGenericBigs() {
        return genericBigs;
    }


    /**
     * Sets the genericBigs value for this FWTIndividual.
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
     * Gets the auditDetails value for this FWTIndividual.
     * 
     * @return auditDetails
     */
    public lagan.api.main.FWTAuditDetails getAuditDetails() {
        return auditDetails;
    }


    /**
     * Sets the auditDetails value for this FWTIndividual.
     * 
     * @param auditDetails
     */
    public void setAuditDetails(lagan.api.main.FWTAuditDetails auditDetails) {
        this.auditDetails = auditDetails;
    }


    /**
     * Gets the mergePartyList value for this FWTIndividual.
     * 
     * @return mergePartyList
     */
    public lagan.api.main.FWTObjectID[] getMergePartyList() {
        return mergePartyList;
    }


    /**
     * Sets the mergePartyList value for this FWTIndividual.
     * 
     * @param mergePartyList
     */
    public void setMergePartyList(lagan.api.main.FWTObjectID[] mergePartyList) {
        this.mergePartyList = mergePartyList;
    }


    /**
     * Gets the option value for this FWTIndividual.
     * 
     * @return option   * Values: cdi .This element is only
     *                                     used for creating an individual
     * record and is not populated when
     *                                     used for retrieving an individual's
     * details.
     */
    public java.lang.String[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this FWTIndividual.
     * 
     * @param option   * Values: cdi .This element is only
     *                                     used for creating an individual
     * record and is not populated when
     *                                     used for retrieving an individual's
     * details.
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
     * Gets the extraData value for this FWTIndividual.
     * 
     * @return extraData
     */
    public lagan.api.main.FWTKeyValue[] getExtraData() {
        return extraData;
    }


    /**
     * Sets the extraData value for this FWTIndividual.
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
        if (!(obj instanceof FWTIndividual)) return false;
        FWTIndividual other = (FWTIndividual) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.childSet==null && other.getChildSet()==null) || 
             (this.childSet!=null &&
              java.util.Arrays.equals(this.childSet, other.getChildSet()))) &&
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
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.genderAtBirth==null && other.getGenderAtBirth()==null) || 
             (this.genderAtBirth!=null &&
              this.genderAtBirth.equals(other.getGenderAtBirth()))) &&
            ((this.placeOfBirth==null && other.getPlaceOfBirth()==null) || 
             (this.placeOfBirth!=null &&
              this.placeOfBirth.equals(other.getPlaceOfBirth()))) &&
            ((this.countryOfBirth==null && other.getCountryOfBirth()==null) || 
             (this.countryOfBirth!=null &&
              this.countryOfBirth.equals(other.getCountryOfBirth()))) &&
            ((this.nationality==null && other.getNationality()==null) || 
             (this.nationality!=null &&
              this.nationality.equals(other.getNationality()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.drivingLicenceNumber==null && other.getDrivingLicenceNumber()==null) || 
             (this.drivingLicenceNumber!=null &&
              this.drivingLicenceNumber.equals(other.getDrivingLicenceNumber()))) &&
            ((this.drivingLicencePatternID==null && other.getDrivingLicencePatternID()==null) || 
             (this.drivingLicencePatternID!=null &&
              this.drivingLicencePatternID.equals(other.getDrivingLicencePatternID()))) &&
            ((this.additionalDrivingLicences==null && other.getAdditionalDrivingLicences()==null) || 
             (this.additionalDrivingLicences!=null &&
              this.additionalDrivingLicences.equals(other.getAdditionalDrivingLicences()))) &&
            ((this.passportNumber==null && other.getPassportNumber()==null) || 
             (this.passportNumber!=null &&
              this.passportNumber.equals(other.getPassportNumber()))) &&
            ((this.passportNumberPatternID==null && other.getPassportNumberPatternID()==null) || 
             (this.passportNumberPatternID!=null &&
              this.passportNumberPatternID.equals(other.getPassportNumberPatternID()))) &&
            ((this.additionalPassports==null && other.getAdditionalPassports()==null) || 
             (this.additionalPassports!=null &&
              this.additionalPassports.equals(other.getAdditionalPassports()))) &&
            ((this.healthNumber==null && other.getHealthNumber()==null) || 
             (this.healthNumber!=null &&
              this.healthNumber.equals(other.getHealthNumber()))) &&
            ((this.nationalInsuranceNumber==null && other.getNationalInsuranceNumber()==null) || 
             (this.nationalInsuranceNumber!=null &&
              this.nationalInsuranceNumber.equals(other.getNationalInsuranceNumber()))) &&
            ((this.socialSecurityNumber==null && other.getSocialSecurityNumber()==null) || 
             (this.socialSecurityNumber!=null &&
              this.socialSecurityNumber.equals(other.getSocialSecurityNumber()))) &&
            ((this.ethnicity==null && other.getEthnicity()==null) || 
             (this.ethnicity!=null &&
              this.ethnicity.equals(other.getEthnicity()))) &&
            ((this.disabilities==null && other.getDisabilities()==null) || 
             (this.disabilities!=null &&
              this.disabilities.equals(other.getDisabilities()))) &&
            ((this.disabilityRegNumber==null && other.getDisabilityRegNumber()==null) || 
             (this.disabilityRegNumber!=null &&
              this.disabilityRegNumber.equals(other.getDisabilityRegNumber()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.occupation==null && other.getOccupation()==null) || 
             (this.occupation!=null &&
              this.occupation.equals(other.getOccupation()))) &&
            ((this.additionalOccupations==null && other.getAdditionalOccupations()==null) || 
             (this.additionalOccupations!=null &&
              this.additionalOccupations.equals(other.getAdditionalOccupations()))) &&
            ((this.dateOfDeath==null && other.getDateOfDeath()==null) || 
             (this.dateOfDeath!=null &&
              this.dateOfDeath.equals(other.getDateOfDeath()))) &&
            ((this.preferredLanguage==null && other.getPreferredLanguage()==null) || 
             (this.preferredLanguage!=null &&
              this.preferredLanguage.equals(other.getPreferredLanguage()))) &&
            ((this.validFromDate==null && other.getValidFromDate()==null) || 
             (this.validFromDate!=null &&
              this.validFromDate.equals(other.getValidFromDate()))) &&
            ((this.validToDate==null && other.getValidToDate()==null) || 
             (this.validToDate!=null &&
              this.validToDate.equals(other.getValidToDate()))) &&
            ((this.surveyConsent==null && other.getSurveyConsent()==null) || 
             (this.surveyConsent!=null &&
              this.surveyConsent.equals(other.getSurveyConsent()))) &&
            ((this.registrationDetails==null && other.getRegistrationDetails()==null) || 
             (this.registrationDetails!=null &&
              this.registrationDetails.equals(other.getRegistrationDetails()))) &&
            ((this.authenticationDetails==null && other.getAuthenticationDetails()==null) || 
             (this.authenticationDetails!=null &&
              this.authenticationDetails.equals(other.getAuthenticationDetails()))) &&
            ((this.LGCode==null && other.getLGCode()==null) || 
             (this.LGCode!=null &&
              this.LGCode.equals(other.getLGCode()))) &&
            ((this.authorisedView==null && other.getAuthorisedView()==null) || 
             (this.authorisedView!=null &&
              this.authorisedView.equals(other.getAuthorisedView()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.freeText==null && other.getFreeText()==null) || 
             (this.freeText!=null &&
              this.freeText.equals(other.getFreeText()))) &&
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
            ((this.mergePartyList==null && other.getMergePartyList()==null) || 
             (this.mergePartyList!=null &&
              java.util.Arrays.equals(this.mergePartyList, other.getMergePartyList()))) &&
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
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getGenderAtBirth() != null) {
            _hashCode += getGenderAtBirth().hashCode();
        }
        if (getPlaceOfBirth() != null) {
            _hashCode += getPlaceOfBirth().hashCode();
        }
        if (getCountryOfBirth() != null) {
            _hashCode += getCountryOfBirth().hashCode();
        }
        if (getNationality() != null) {
            _hashCode += getNationality().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getDrivingLicenceNumber() != null) {
            _hashCode += getDrivingLicenceNumber().hashCode();
        }
        if (getDrivingLicencePatternID() != null) {
            _hashCode += getDrivingLicencePatternID().hashCode();
        }
        if (getAdditionalDrivingLicences() != null) {
            _hashCode += getAdditionalDrivingLicences().hashCode();
        }
        if (getPassportNumber() != null) {
            _hashCode += getPassportNumber().hashCode();
        }
        if (getPassportNumberPatternID() != null) {
            _hashCode += getPassportNumberPatternID().hashCode();
        }
        if (getAdditionalPassports() != null) {
            _hashCode += getAdditionalPassports().hashCode();
        }
        if (getHealthNumber() != null) {
            _hashCode += getHealthNumber().hashCode();
        }
        if (getNationalInsuranceNumber() != null) {
            _hashCode += getNationalInsuranceNumber().hashCode();
        }
        if (getSocialSecurityNumber() != null) {
            _hashCode += getSocialSecurityNumber().hashCode();
        }
        if (getEthnicity() != null) {
            _hashCode += getEthnicity().hashCode();
        }
        if (getDisabilities() != null) {
            _hashCode += getDisabilities().hashCode();
        }
        if (getDisabilityRegNumber() != null) {
            _hashCode += getDisabilityRegNumber().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getOccupation() != null) {
            _hashCode += getOccupation().hashCode();
        }
        if (getAdditionalOccupations() != null) {
            _hashCode += getAdditionalOccupations().hashCode();
        }
        if (getDateOfDeath() != null) {
            _hashCode += getDateOfDeath().hashCode();
        }
        if (getPreferredLanguage() != null) {
            _hashCode += getPreferredLanguage().hashCode();
        }
        if (getValidFromDate() != null) {
            _hashCode += getValidFromDate().hashCode();
        }
        if (getValidToDate() != null) {
            _hashCode += getValidToDate().hashCode();
        }
        if (getSurveyConsent() != null) {
            _hashCode += getSurveyConsent().hashCode();
        }
        if (getRegistrationDetails() != null) {
            _hashCode += getRegistrationDetails().hashCode();
        }
        if (getAuthenticationDetails() != null) {
            _hashCode += getAuthenticationDetails().hashCode();
        }
        if (getLGCode() != null) {
            _hashCode += getLGCode().hashCode();
        }
        if (getAuthorisedView() != null) {
            _hashCode += getAuthorisedView().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getFreeText() != null) {
            _hashCode += getFreeText().hashCode();
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
        if (getMergePartyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMergePartyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMergePartyList(), i);
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
        new org.apache.axis.description.TypeDesc(FWTIndividual.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTIndividual"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChildSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTExtensionChildSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("briefDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BriefDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectBriefDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTIndividualName"));
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
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genderAtBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenderAtBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PlaceOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CountryOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Nationality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drivingLicenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DrivingLicenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drivingLicencePatternID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DrivingLicencePatternID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalDrivingLicences");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdditionalDrivingLicences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passportNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PassportNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passportNumberPatternID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PassportNumberPatternID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalPassports");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdditionalPassports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HealthNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalInsuranceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NationalInsuranceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SocialSecurityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethnicity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Ethnicity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Disabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabilityRegNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DisabilityRegNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Occupation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalOccupations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdditionalOccupations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfDeath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateOfDeath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreferredLanguage"));
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
        elemField.setFieldName("surveyConsent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SurveyConsent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RegistrationDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthenticationDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LGCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LGCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorisedView");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthorisedView"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FreeText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTIndividual>UserDefined"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTIndividual>UserDefinedText"));
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
        elemField.setFieldName("mergePartyList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MergePartyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "MergeParties"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTIndividual>Option"));
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
