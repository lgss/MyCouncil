/**
 * FWTIndividualUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTIndividualUpdate  implements java.io.Serializable {
    private lagan.api.main.FWTExtensionChildSet[] childSet;

    private lagan.api.main.FWTObjectBriefDetails briefDetails;

    private lagan.api.main.FWTIndividualNameUpdate[] name;

    private lagan.api.main.FWTContactPostalUpdate[] contactPostals;

    private lagan.api.main.FWTContactPhoneUpdate[] contactPhones;

    private lagan.api.main.FWTContactEmailUpdate[] contactEmails;

    private lagan.api.main.FWTGenderUpdate genderUpdate;

    private lagan.api.main.FWTGenderAtBirthUpdate genderAtBirthUpdate;

    private lagan.api.main.FWTPlaceOfBirthUpdate placeOfBirthUpdate;

    private lagan.api.main.FWTCountryOfBirthUpdate countryOfBirthUpdate;

    private lagan.api.main.FWTNationalityUpdate nationalityUpdate;

    private lagan.api.main.FWTMaritalStatusUpdate maritalStatusUpdate;

    private lagan.api.main.FWTDrivingLicenceNumberUpdate drivingLicenceNumberUpdate;

    private lagan.api.main.FWTDrivingLicencePatternIDUpdate drivingLicencePatternIDUpdate;

    private lagan.api.main.FWTAdditionalDrivingLicencesUpdate additionalDrivingLicencesUpdate;

    private lagan.api.main.FWTPassportNumberUpdate passportNumberUpdate;

    private lagan.api.main.FWTPassportNumberPatternIDUpdate passportNumberPatternIDUpdate;

    private lagan.api.main.FWTAdditionalPassportsUpdate additionalPassportsUpdate;

    private lagan.api.main.FWTHealthNumberUpdate healthNumberUpdate;

    private lagan.api.main.FWTNationalInsuranceNumberUpdate nationalInsuranceNumberUpdate;

    private lagan.api.main.FWTSocialSecurityNumberUpdate socialSecurityNumberUpdate;

    private lagan.api.main.FWTEthnicityUpdate ethnicityUpdate;

    private lagan.api.main.FWTDisabilitiesUpdate disabilitiesUpdate;

    private lagan.api.main.FWTDisabilityRegNumberUpdate disabilityRegNumberUpdate;

    private lagan.api.main.FWTDateOfBirthUpdate dateOfBirthUpdate;

    private lagan.api.main.FWTOccupationUpdate occupationUpdate;

    private lagan.api.main.FWTAdditionalOccupationsUpdate additionalOccupationsUpdate;

    private lagan.api.main.FWTDateOfDeathUpdate dateOfDeathUpdate;

    private lagan.api.main.FWTPreferredLanguageUpdate preferredLanguageUpdate;

    private lagan.api.main.FWTValidFromDateUpdate validFromDateUpdate;

    private lagan.api.main.FWTValidToDateUpdate validToDateUpdate;

    private lagan.api.main.FWTSurveyConsentUpdate surveyConsentUpdate;

    private lagan.api.main.FWTRegistrationDetailsUpdate registrationDetailsUpdate;

    private lagan.api.main.FWTAuthenticationDetailsUpdate authenticationDetailsUpdate;

    private lagan.api.main.FWTLGCodeUpdate LGCodeUpdate;

    private lagan.api.main.FWTAuthorisedViewUpdate authorisedViewUpdate;

    private lagan.api.main.FWTCategoryUpdate categoryUpdate;

    private lagan.api.main.FWTFreeTextUpdate freeTextUpdate;

    private lagan.api.main.FWTUserDefinedUpdate[] userDefinedUpdate;

    private lagan.api.main.FWTUserDefinedNumUpdate[] userDefinedNumUpdate;

    private lagan.api.main.FWTUserDefinedTextUpdate[] userDefinedTextUpdate;

    private lagan.api.main.FWTUserDefinedDateUpdate[] userDefinedDateUpdate;

    private lagan.api.main.FWTGenericSmallUpdate[] genericSmallUpdates;

    private lagan.api.main.FWTGenericBigUpdate[] genericBigUpdates;

    /* Values: cdi. This element is only
     *                                     used for updating an individual
     * record. */
    private java.lang.String[] option;

    private lagan.api.main.FWTKeyValue[] extraData;

    public FWTIndividualUpdate() {
    }

    public FWTIndividualUpdate(
           lagan.api.main.FWTExtensionChildSet[] childSet,
           lagan.api.main.FWTObjectBriefDetails briefDetails,
           lagan.api.main.FWTIndividualNameUpdate[] name,
           lagan.api.main.FWTContactPostalUpdate[] contactPostals,
           lagan.api.main.FWTContactPhoneUpdate[] contactPhones,
           lagan.api.main.FWTContactEmailUpdate[] contactEmails,
           lagan.api.main.FWTGenderUpdate genderUpdate,
           lagan.api.main.FWTGenderAtBirthUpdate genderAtBirthUpdate,
           lagan.api.main.FWTPlaceOfBirthUpdate placeOfBirthUpdate,
           lagan.api.main.FWTCountryOfBirthUpdate countryOfBirthUpdate,
           lagan.api.main.FWTNationalityUpdate nationalityUpdate,
           lagan.api.main.FWTMaritalStatusUpdate maritalStatusUpdate,
           lagan.api.main.FWTDrivingLicenceNumberUpdate drivingLicenceNumberUpdate,
           lagan.api.main.FWTDrivingLicencePatternIDUpdate drivingLicencePatternIDUpdate,
           lagan.api.main.FWTAdditionalDrivingLicencesUpdate additionalDrivingLicencesUpdate,
           lagan.api.main.FWTPassportNumberUpdate passportNumberUpdate,
           lagan.api.main.FWTPassportNumberPatternIDUpdate passportNumberPatternIDUpdate,
           lagan.api.main.FWTAdditionalPassportsUpdate additionalPassportsUpdate,
           lagan.api.main.FWTHealthNumberUpdate healthNumberUpdate,
           lagan.api.main.FWTNationalInsuranceNumberUpdate nationalInsuranceNumberUpdate,
           lagan.api.main.FWTSocialSecurityNumberUpdate socialSecurityNumberUpdate,
           lagan.api.main.FWTEthnicityUpdate ethnicityUpdate,
           lagan.api.main.FWTDisabilitiesUpdate disabilitiesUpdate,
           lagan.api.main.FWTDisabilityRegNumberUpdate disabilityRegNumberUpdate,
           lagan.api.main.FWTDateOfBirthUpdate dateOfBirthUpdate,
           lagan.api.main.FWTOccupationUpdate occupationUpdate,
           lagan.api.main.FWTAdditionalOccupationsUpdate additionalOccupationsUpdate,
           lagan.api.main.FWTDateOfDeathUpdate dateOfDeathUpdate,
           lagan.api.main.FWTPreferredLanguageUpdate preferredLanguageUpdate,
           lagan.api.main.FWTValidFromDateUpdate validFromDateUpdate,
           lagan.api.main.FWTValidToDateUpdate validToDateUpdate,
           lagan.api.main.FWTSurveyConsentUpdate surveyConsentUpdate,
           lagan.api.main.FWTRegistrationDetailsUpdate registrationDetailsUpdate,
           lagan.api.main.FWTAuthenticationDetailsUpdate authenticationDetailsUpdate,
           lagan.api.main.FWTLGCodeUpdate LGCodeUpdate,
           lagan.api.main.FWTAuthorisedViewUpdate authorisedViewUpdate,
           lagan.api.main.FWTCategoryUpdate categoryUpdate,
           lagan.api.main.FWTFreeTextUpdate freeTextUpdate,
           lagan.api.main.FWTUserDefinedUpdate[] userDefinedUpdate,
           lagan.api.main.FWTUserDefinedNumUpdate[] userDefinedNumUpdate,
           lagan.api.main.FWTUserDefinedTextUpdate[] userDefinedTextUpdate,
           lagan.api.main.FWTUserDefinedDateUpdate[] userDefinedDateUpdate,
           lagan.api.main.FWTGenericSmallUpdate[] genericSmallUpdates,
           lagan.api.main.FWTGenericBigUpdate[] genericBigUpdates,
           java.lang.String[] option,
           lagan.api.main.FWTKeyValue[] extraData) {
           this.childSet = childSet;
           this.briefDetails = briefDetails;
           this.name = name;
           this.contactPostals = contactPostals;
           this.contactPhones = contactPhones;
           this.contactEmails = contactEmails;
           this.genderUpdate = genderUpdate;
           this.genderAtBirthUpdate = genderAtBirthUpdate;
           this.placeOfBirthUpdate = placeOfBirthUpdate;
           this.countryOfBirthUpdate = countryOfBirthUpdate;
           this.nationalityUpdate = nationalityUpdate;
           this.maritalStatusUpdate = maritalStatusUpdate;
           this.drivingLicenceNumberUpdate = drivingLicenceNumberUpdate;
           this.drivingLicencePatternIDUpdate = drivingLicencePatternIDUpdate;
           this.additionalDrivingLicencesUpdate = additionalDrivingLicencesUpdate;
           this.passportNumberUpdate = passportNumberUpdate;
           this.passportNumberPatternIDUpdate = passportNumberPatternIDUpdate;
           this.additionalPassportsUpdate = additionalPassportsUpdate;
           this.healthNumberUpdate = healthNumberUpdate;
           this.nationalInsuranceNumberUpdate = nationalInsuranceNumberUpdate;
           this.socialSecurityNumberUpdate = socialSecurityNumberUpdate;
           this.ethnicityUpdate = ethnicityUpdate;
           this.disabilitiesUpdate = disabilitiesUpdate;
           this.disabilityRegNumberUpdate = disabilityRegNumberUpdate;
           this.dateOfBirthUpdate = dateOfBirthUpdate;
           this.occupationUpdate = occupationUpdate;
           this.additionalOccupationsUpdate = additionalOccupationsUpdate;
           this.dateOfDeathUpdate = dateOfDeathUpdate;
           this.preferredLanguageUpdate = preferredLanguageUpdate;
           this.validFromDateUpdate = validFromDateUpdate;
           this.validToDateUpdate = validToDateUpdate;
           this.surveyConsentUpdate = surveyConsentUpdate;
           this.registrationDetailsUpdate = registrationDetailsUpdate;
           this.authenticationDetailsUpdate = authenticationDetailsUpdate;
           this.LGCodeUpdate = LGCodeUpdate;
           this.authorisedViewUpdate = authorisedViewUpdate;
           this.categoryUpdate = categoryUpdate;
           this.freeTextUpdate = freeTextUpdate;
           this.userDefinedUpdate = userDefinedUpdate;
           this.userDefinedNumUpdate = userDefinedNumUpdate;
           this.userDefinedTextUpdate = userDefinedTextUpdate;
           this.userDefinedDateUpdate = userDefinedDateUpdate;
           this.genericSmallUpdates = genericSmallUpdates;
           this.genericBigUpdates = genericBigUpdates;
           this.option = option;
           this.extraData = extraData;
    }


    /**
     * Gets the childSet value for this FWTIndividualUpdate.
     * 
     * @return childSet
     */
    public lagan.api.main.FWTExtensionChildSet[] getChildSet() {
        return childSet;
    }


    /**
     * Sets the childSet value for this FWTIndividualUpdate.
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
     * Gets the briefDetails value for this FWTIndividualUpdate.
     * 
     * @return briefDetails
     */
    public lagan.api.main.FWTObjectBriefDetails getBriefDetails() {
        return briefDetails;
    }


    /**
     * Sets the briefDetails value for this FWTIndividualUpdate.
     * 
     * @param briefDetails
     */
    public void setBriefDetails(lagan.api.main.FWTObjectBriefDetails briefDetails) {
        this.briefDetails = briefDetails;
    }


    /**
     * Gets the name value for this FWTIndividualUpdate.
     * 
     * @return name
     */
    public lagan.api.main.FWTIndividualNameUpdate[] getName() {
        return name;
    }


    /**
     * Sets the name value for this FWTIndividualUpdate.
     * 
     * @param name
     */
    public void setName(lagan.api.main.FWTIndividualNameUpdate[] name) {
        this.name = name;
    }

    public lagan.api.main.FWTIndividualNameUpdate getName(int i) {
        return this.name[i];
    }

    public void setName(int i, lagan.api.main.FWTIndividualNameUpdate _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the contactPostals value for this FWTIndividualUpdate.
     * 
     * @return contactPostals
     */
    public lagan.api.main.FWTContactPostalUpdate[] getContactPostals() {
        return contactPostals;
    }


    /**
     * Sets the contactPostals value for this FWTIndividualUpdate.
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
     * Gets the contactPhones value for this FWTIndividualUpdate.
     * 
     * @return contactPhones
     */
    public lagan.api.main.FWTContactPhoneUpdate[] getContactPhones() {
        return contactPhones;
    }


    /**
     * Sets the contactPhones value for this FWTIndividualUpdate.
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
     * Gets the contactEmails value for this FWTIndividualUpdate.
     * 
     * @return contactEmails
     */
    public lagan.api.main.FWTContactEmailUpdate[] getContactEmails() {
        return contactEmails;
    }


    /**
     * Sets the contactEmails value for this FWTIndividualUpdate.
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
     * Gets the genderUpdate value for this FWTIndividualUpdate.
     * 
     * @return genderUpdate
     */
    public lagan.api.main.FWTGenderUpdate getGenderUpdate() {
        return genderUpdate;
    }


    /**
     * Sets the genderUpdate value for this FWTIndividualUpdate.
     * 
     * @param genderUpdate
     */
    public void setGenderUpdate(lagan.api.main.FWTGenderUpdate genderUpdate) {
        this.genderUpdate = genderUpdate;
    }


    /**
     * Gets the genderAtBirthUpdate value for this FWTIndividualUpdate.
     * 
     * @return genderAtBirthUpdate
     */
    public lagan.api.main.FWTGenderAtBirthUpdate getGenderAtBirthUpdate() {
        return genderAtBirthUpdate;
    }


    /**
     * Sets the genderAtBirthUpdate value for this FWTIndividualUpdate.
     * 
     * @param genderAtBirthUpdate
     */
    public void setGenderAtBirthUpdate(lagan.api.main.FWTGenderAtBirthUpdate genderAtBirthUpdate) {
        this.genderAtBirthUpdate = genderAtBirthUpdate;
    }


    /**
     * Gets the placeOfBirthUpdate value for this FWTIndividualUpdate.
     * 
     * @return placeOfBirthUpdate
     */
    public lagan.api.main.FWTPlaceOfBirthUpdate getPlaceOfBirthUpdate() {
        return placeOfBirthUpdate;
    }


    /**
     * Sets the placeOfBirthUpdate value for this FWTIndividualUpdate.
     * 
     * @param placeOfBirthUpdate
     */
    public void setPlaceOfBirthUpdate(lagan.api.main.FWTPlaceOfBirthUpdate placeOfBirthUpdate) {
        this.placeOfBirthUpdate = placeOfBirthUpdate;
    }


    /**
     * Gets the countryOfBirthUpdate value for this FWTIndividualUpdate.
     * 
     * @return countryOfBirthUpdate
     */
    public lagan.api.main.FWTCountryOfBirthUpdate getCountryOfBirthUpdate() {
        return countryOfBirthUpdate;
    }


    /**
     * Sets the countryOfBirthUpdate value for this FWTIndividualUpdate.
     * 
     * @param countryOfBirthUpdate
     */
    public void setCountryOfBirthUpdate(lagan.api.main.FWTCountryOfBirthUpdate countryOfBirthUpdate) {
        this.countryOfBirthUpdate = countryOfBirthUpdate;
    }


    /**
     * Gets the nationalityUpdate value for this FWTIndividualUpdate.
     * 
     * @return nationalityUpdate
     */
    public lagan.api.main.FWTNationalityUpdate getNationalityUpdate() {
        return nationalityUpdate;
    }


    /**
     * Sets the nationalityUpdate value for this FWTIndividualUpdate.
     * 
     * @param nationalityUpdate
     */
    public void setNationalityUpdate(lagan.api.main.FWTNationalityUpdate nationalityUpdate) {
        this.nationalityUpdate = nationalityUpdate;
    }


    /**
     * Gets the maritalStatusUpdate value for this FWTIndividualUpdate.
     * 
     * @return maritalStatusUpdate
     */
    public lagan.api.main.FWTMaritalStatusUpdate getMaritalStatusUpdate() {
        return maritalStatusUpdate;
    }


    /**
     * Sets the maritalStatusUpdate value for this FWTIndividualUpdate.
     * 
     * @param maritalStatusUpdate
     */
    public void setMaritalStatusUpdate(lagan.api.main.FWTMaritalStatusUpdate maritalStatusUpdate) {
        this.maritalStatusUpdate = maritalStatusUpdate;
    }


    /**
     * Gets the drivingLicenceNumberUpdate value for this FWTIndividualUpdate.
     * 
     * @return drivingLicenceNumberUpdate
     */
    public lagan.api.main.FWTDrivingLicenceNumberUpdate getDrivingLicenceNumberUpdate() {
        return drivingLicenceNumberUpdate;
    }


    /**
     * Sets the drivingLicenceNumberUpdate value for this FWTIndividualUpdate.
     * 
     * @param drivingLicenceNumberUpdate
     */
    public void setDrivingLicenceNumberUpdate(lagan.api.main.FWTDrivingLicenceNumberUpdate drivingLicenceNumberUpdate) {
        this.drivingLicenceNumberUpdate = drivingLicenceNumberUpdate;
    }


    /**
     * Gets the drivingLicencePatternIDUpdate value for this FWTIndividualUpdate.
     * 
     * @return drivingLicencePatternIDUpdate
     */
    public lagan.api.main.FWTDrivingLicencePatternIDUpdate getDrivingLicencePatternIDUpdate() {
        return drivingLicencePatternIDUpdate;
    }


    /**
     * Sets the drivingLicencePatternIDUpdate value for this FWTIndividualUpdate.
     * 
     * @param drivingLicencePatternIDUpdate
     */
    public void setDrivingLicencePatternIDUpdate(lagan.api.main.FWTDrivingLicencePatternIDUpdate drivingLicencePatternIDUpdate) {
        this.drivingLicencePatternIDUpdate = drivingLicencePatternIDUpdate;
    }


    /**
     * Gets the additionalDrivingLicencesUpdate value for this FWTIndividualUpdate.
     * 
     * @return additionalDrivingLicencesUpdate
     */
    public lagan.api.main.FWTAdditionalDrivingLicencesUpdate getAdditionalDrivingLicencesUpdate() {
        return additionalDrivingLicencesUpdate;
    }


    /**
     * Sets the additionalDrivingLicencesUpdate value for this FWTIndividualUpdate.
     * 
     * @param additionalDrivingLicencesUpdate
     */
    public void setAdditionalDrivingLicencesUpdate(lagan.api.main.FWTAdditionalDrivingLicencesUpdate additionalDrivingLicencesUpdate) {
        this.additionalDrivingLicencesUpdate = additionalDrivingLicencesUpdate;
    }


    /**
     * Gets the passportNumberUpdate value for this FWTIndividualUpdate.
     * 
     * @return passportNumberUpdate
     */
    public lagan.api.main.FWTPassportNumberUpdate getPassportNumberUpdate() {
        return passportNumberUpdate;
    }


    /**
     * Sets the passportNumberUpdate value for this FWTIndividualUpdate.
     * 
     * @param passportNumberUpdate
     */
    public void setPassportNumberUpdate(lagan.api.main.FWTPassportNumberUpdate passportNumberUpdate) {
        this.passportNumberUpdate = passportNumberUpdate;
    }


    /**
     * Gets the passportNumberPatternIDUpdate value for this FWTIndividualUpdate.
     * 
     * @return passportNumberPatternIDUpdate
     */
    public lagan.api.main.FWTPassportNumberPatternIDUpdate getPassportNumberPatternIDUpdate() {
        return passportNumberPatternIDUpdate;
    }


    /**
     * Sets the passportNumberPatternIDUpdate value for this FWTIndividualUpdate.
     * 
     * @param passportNumberPatternIDUpdate
     */
    public void setPassportNumberPatternIDUpdate(lagan.api.main.FWTPassportNumberPatternIDUpdate passportNumberPatternIDUpdate) {
        this.passportNumberPatternIDUpdate = passportNumberPatternIDUpdate;
    }


    /**
     * Gets the additionalPassportsUpdate value for this FWTIndividualUpdate.
     * 
     * @return additionalPassportsUpdate
     */
    public lagan.api.main.FWTAdditionalPassportsUpdate getAdditionalPassportsUpdate() {
        return additionalPassportsUpdate;
    }


    /**
     * Sets the additionalPassportsUpdate value for this FWTIndividualUpdate.
     * 
     * @param additionalPassportsUpdate
     */
    public void setAdditionalPassportsUpdate(lagan.api.main.FWTAdditionalPassportsUpdate additionalPassportsUpdate) {
        this.additionalPassportsUpdate = additionalPassportsUpdate;
    }


    /**
     * Gets the healthNumberUpdate value for this FWTIndividualUpdate.
     * 
     * @return healthNumberUpdate
     */
    public lagan.api.main.FWTHealthNumberUpdate getHealthNumberUpdate() {
        return healthNumberUpdate;
    }


    /**
     * Sets the healthNumberUpdate value for this FWTIndividualUpdate.
     * 
     * @param healthNumberUpdate
     */
    public void setHealthNumberUpdate(lagan.api.main.FWTHealthNumberUpdate healthNumberUpdate) {
        this.healthNumberUpdate = healthNumberUpdate;
    }


    /**
     * Gets the nationalInsuranceNumberUpdate value for this FWTIndividualUpdate.
     * 
     * @return nationalInsuranceNumberUpdate
     */
    public lagan.api.main.FWTNationalInsuranceNumberUpdate getNationalInsuranceNumberUpdate() {
        return nationalInsuranceNumberUpdate;
    }


    /**
     * Sets the nationalInsuranceNumberUpdate value for this FWTIndividualUpdate.
     * 
     * @param nationalInsuranceNumberUpdate
     */
    public void setNationalInsuranceNumberUpdate(lagan.api.main.FWTNationalInsuranceNumberUpdate nationalInsuranceNumberUpdate) {
        this.nationalInsuranceNumberUpdate = nationalInsuranceNumberUpdate;
    }


    /**
     * Gets the socialSecurityNumberUpdate value for this FWTIndividualUpdate.
     * 
     * @return socialSecurityNumberUpdate
     */
    public lagan.api.main.FWTSocialSecurityNumberUpdate getSocialSecurityNumberUpdate() {
        return socialSecurityNumberUpdate;
    }


    /**
     * Sets the socialSecurityNumberUpdate value for this FWTIndividualUpdate.
     * 
     * @param socialSecurityNumberUpdate
     */
    public void setSocialSecurityNumberUpdate(lagan.api.main.FWTSocialSecurityNumberUpdate socialSecurityNumberUpdate) {
        this.socialSecurityNumberUpdate = socialSecurityNumberUpdate;
    }


    /**
     * Gets the ethnicityUpdate value for this FWTIndividualUpdate.
     * 
     * @return ethnicityUpdate
     */
    public lagan.api.main.FWTEthnicityUpdate getEthnicityUpdate() {
        return ethnicityUpdate;
    }


    /**
     * Sets the ethnicityUpdate value for this FWTIndividualUpdate.
     * 
     * @param ethnicityUpdate
     */
    public void setEthnicityUpdate(lagan.api.main.FWTEthnicityUpdate ethnicityUpdate) {
        this.ethnicityUpdate = ethnicityUpdate;
    }


    /**
     * Gets the disabilitiesUpdate value for this FWTIndividualUpdate.
     * 
     * @return disabilitiesUpdate
     */
    public lagan.api.main.FWTDisabilitiesUpdate getDisabilitiesUpdate() {
        return disabilitiesUpdate;
    }


    /**
     * Sets the disabilitiesUpdate value for this FWTIndividualUpdate.
     * 
     * @param disabilitiesUpdate
     */
    public void setDisabilitiesUpdate(lagan.api.main.FWTDisabilitiesUpdate disabilitiesUpdate) {
        this.disabilitiesUpdate = disabilitiesUpdate;
    }


    /**
     * Gets the disabilityRegNumberUpdate value for this FWTIndividualUpdate.
     * 
     * @return disabilityRegNumberUpdate
     */
    public lagan.api.main.FWTDisabilityRegNumberUpdate getDisabilityRegNumberUpdate() {
        return disabilityRegNumberUpdate;
    }


    /**
     * Sets the disabilityRegNumberUpdate value for this FWTIndividualUpdate.
     * 
     * @param disabilityRegNumberUpdate
     */
    public void setDisabilityRegNumberUpdate(lagan.api.main.FWTDisabilityRegNumberUpdate disabilityRegNumberUpdate) {
        this.disabilityRegNumberUpdate = disabilityRegNumberUpdate;
    }


    /**
     * Gets the dateOfBirthUpdate value for this FWTIndividualUpdate.
     * 
     * @return dateOfBirthUpdate
     */
    public lagan.api.main.FWTDateOfBirthUpdate getDateOfBirthUpdate() {
        return dateOfBirthUpdate;
    }


    /**
     * Sets the dateOfBirthUpdate value for this FWTIndividualUpdate.
     * 
     * @param dateOfBirthUpdate
     */
    public void setDateOfBirthUpdate(lagan.api.main.FWTDateOfBirthUpdate dateOfBirthUpdate) {
        this.dateOfBirthUpdate = dateOfBirthUpdate;
    }


    /**
     * Gets the occupationUpdate value for this FWTIndividualUpdate.
     * 
     * @return occupationUpdate
     */
    public lagan.api.main.FWTOccupationUpdate getOccupationUpdate() {
        return occupationUpdate;
    }


    /**
     * Sets the occupationUpdate value for this FWTIndividualUpdate.
     * 
     * @param occupationUpdate
     */
    public void setOccupationUpdate(lagan.api.main.FWTOccupationUpdate occupationUpdate) {
        this.occupationUpdate = occupationUpdate;
    }


    /**
     * Gets the additionalOccupationsUpdate value for this FWTIndividualUpdate.
     * 
     * @return additionalOccupationsUpdate
     */
    public lagan.api.main.FWTAdditionalOccupationsUpdate getAdditionalOccupationsUpdate() {
        return additionalOccupationsUpdate;
    }


    /**
     * Sets the additionalOccupationsUpdate value for this FWTIndividualUpdate.
     * 
     * @param additionalOccupationsUpdate
     */
    public void setAdditionalOccupationsUpdate(lagan.api.main.FWTAdditionalOccupationsUpdate additionalOccupationsUpdate) {
        this.additionalOccupationsUpdate = additionalOccupationsUpdate;
    }


    /**
     * Gets the dateOfDeathUpdate value for this FWTIndividualUpdate.
     * 
     * @return dateOfDeathUpdate
     */
    public lagan.api.main.FWTDateOfDeathUpdate getDateOfDeathUpdate() {
        return dateOfDeathUpdate;
    }


    /**
     * Sets the dateOfDeathUpdate value for this FWTIndividualUpdate.
     * 
     * @param dateOfDeathUpdate
     */
    public void setDateOfDeathUpdate(lagan.api.main.FWTDateOfDeathUpdate dateOfDeathUpdate) {
        this.dateOfDeathUpdate = dateOfDeathUpdate;
    }


    /**
     * Gets the preferredLanguageUpdate value for this FWTIndividualUpdate.
     * 
     * @return preferredLanguageUpdate
     */
    public lagan.api.main.FWTPreferredLanguageUpdate getPreferredLanguageUpdate() {
        return preferredLanguageUpdate;
    }


    /**
     * Sets the preferredLanguageUpdate value for this FWTIndividualUpdate.
     * 
     * @param preferredLanguageUpdate
     */
    public void setPreferredLanguageUpdate(lagan.api.main.FWTPreferredLanguageUpdate preferredLanguageUpdate) {
        this.preferredLanguageUpdate = preferredLanguageUpdate;
    }


    /**
     * Gets the validFromDateUpdate value for this FWTIndividualUpdate.
     * 
     * @return validFromDateUpdate
     */
    public lagan.api.main.FWTValidFromDateUpdate getValidFromDateUpdate() {
        return validFromDateUpdate;
    }


    /**
     * Sets the validFromDateUpdate value for this FWTIndividualUpdate.
     * 
     * @param validFromDateUpdate
     */
    public void setValidFromDateUpdate(lagan.api.main.FWTValidFromDateUpdate validFromDateUpdate) {
        this.validFromDateUpdate = validFromDateUpdate;
    }


    /**
     * Gets the validToDateUpdate value for this FWTIndividualUpdate.
     * 
     * @return validToDateUpdate
     */
    public lagan.api.main.FWTValidToDateUpdate getValidToDateUpdate() {
        return validToDateUpdate;
    }


    /**
     * Sets the validToDateUpdate value for this FWTIndividualUpdate.
     * 
     * @param validToDateUpdate
     */
    public void setValidToDateUpdate(lagan.api.main.FWTValidToDateUpdate validToDateUpdate) {
        this.validToDateUpdate = validToDateUpdate;
    }


    /**
     * Gets the surveyConsentUpdate value for this FWTIndividualUpdate.
     * 
     * @return surveyConsentUpdate
     */
    public lagan.api.main.FWTSurveyConsentUpdate getSurveyConsentUpdate() {
        return surveyConsentUpdate;
    }


    /**
     * Sets the surveyConsentUpdate value for this FWTIndividualUpdate.
     * 
     * @param surveyConsentUpdate
     */
    public void setSurveyConsentUpdate(lagan.api.main.FWTSurveyConsentUpdate surveyConsentUpdate) {
        this.surveyConsentUpdate = surveyConsentUpdate;
    }


    /**
     * Gets the registrationDetailsUpdate value for this FWTIndividualUpdate.
     * 
     * @return registrationDetailsUpdate
     */
    public lagan.api.main.FWTRegistrationDetailsUpdate getRegistrationDetailsUpdate() {
        return registrationDetailsUpdate;
    }


    /**
     * Sets the registrationDetailsUpdate value for this FWTIndividualUpdate.
     * 
     * @param registrationDetailsUpdate
     */
    public void setRegistrationDetailsUpdate(lagan.api.main.FWTRegistrationDetailsUpdate registrationDetailsUpdate) {
        this.registrationDetailsUpdate = registrationDetailsUpdate;
    }


    /**
     * Gets the authenticationDetailsUpdate value for this FWTIndividualUpdate.
     * 
     * @return authenticationDetailsUpdate
     */
    public lagan.api.main.FWTAuthenticationDetailsUpdate getAuthenticationDetailsUpdate() {
        return authenticationDetailsUpdate;
    }


    /**
     * Sets the authenticationDetailsUpdate value for this FWTIndividualUpdate.
     * 
     * @param authenticationDetailsUpdate
     */
    public void setAuthenticationDetailsUpdate(lagan.api.main.FWTAuthenticationDetailsUpdate authenticationDetailsUpdate) {
        this.authenticationDetailsUpdate = authenticationDetailsUpdate;
    }


    /**
     * Gets the LGCodeUpdate value for this FWTIndividualUpdate.
     * 
     * @return LGCodeUpdate
     */
    public lagan.api.main.FWTLGCodeUpdate getLGCodeUpdate() {
        return LGCodeUpdate;
    }


    /**
     * Sets the LGCodeUpdate value for this FWTIndividualUpdate.
     * 
     * @param LGCodeUpdate
     */
    public void setLGCodeUpdate(lagan.api.main.FWTLGCodeUpdate LGCodeUpdate) {
        this.LGCodeUpdate = LGCodeUpdate;
    }


    /**
     * Gets the authorisedViewUpdate value for this FWTIndividualUpdate.
     * 
     * @return authorisedViewUpdate
     */
    public lagan.api.main.FWTAuthorisedViewUpdate getAuthorisedViewUpdate() {
        return authorisedViewUpdate;
    }


    /**
     * Sets the authorisedViewUpdate value for this FWTIndividualUpdate.
     * 
     * @param authorisedViewUpdate
     */
    public void setAuthorisedViewUpdate(lagan.api.main.FWTAuthorisedViewUpdate authorisedViewUpdate) {
        this.authorisedViewUpdate = authorisedViewUpdate;
    }


    /**
     * Gets the categoryUpdate value for this FWTIndividualUpdate.
     * 
     * @return categoryUpdate
     */
    public lagan.api.main.FWTCategoryUpdate getCategoryUpdate() {
        return categoryUpdate;
    }


    /**
     * Sets the categoryUpdate value for this FWTIndividualUpdate.
     * 
     * @param categoryUpdate
     */
    public void setCategoryUpdate(lagan.api.main.FWTCategoryUpdate categoryUpdate) {
        this.categoryUpdate = categoryUpdate;
    }


    /**
     * Gets the freeTextUpdate value for this FWTIndividualUpdate.
     * 
     * @return freeTextUpdate
     */
    public lagan.api.main.FWTFreeTextUpdate getFreeTextUpdate() {
        return freeTextUpdate;
    }


    /**
     * Sets the freeTextUpdate value for this FWTIndividualUpdate.
     * 
     * @param freeTextUpdate
     */
    public void setFreeTextUpdate(lagan.api.main.FWTFreeTextUpdate freeTextUpdate) {
        this.freeTextUpdate = freeTextUpdate;
    }


    /**
     * Gets the userDefinedUpdate value for this FWTIndividualUpdate.
     * 
     * @return userDefinedUpdate
     */
    public lagan.api.main.FWTUserDefinedUpdate[] getUserDefinedUpdate() {
        return userDefinedUpdate;
    }


    /**
     * Sets the userDefinedUpdate value for this FWTIndividualUpdate.
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
     * Gets the userDefinedNumUpdate value for this FWTIndividualUpdate.
     * 
     * @return userDefinedNumUpdate
     */
    public lagan.api.main.FWTUserDefinedNumUpdate[] getUserDefinedNumUpdate() {
        return userDefinedNumUpdate;
    }


    /**
     * Sets the userDefinedNumUpdate value for this FWTIndividualUpdate.
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
     * Gets the userDefinedTextUpdate value for this FWTIndividualUpdate.
     * 
     * @return userDefinedTextUpdate
     */
    public lagan.api.main.FWTUserDefinedTextUpdate[] getUserDefinedTextUpdate() {
        return userDefinedTextUpdate;
    }


    /**
     * Sets the userDefinedTextUpdate value for this FWTIndividualUpdate.
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
     * Gets the userDefinedDateUpdate value for this FWTIndividualUpdate.
     * 
     * @return userDefinedDateUpdate
     */
    public lagan.api.main.FWTUserDefinedDateUpdate[] getUserDefinedDateUpdate() {
        return userDefinedDateUpdate;
    }


    /**
     * Sets the userDefinedDateUpdate value for this FWTIndividualUpdate.
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
     * Gets the genericSmallUpdates value for this FWTIndividualUpdate.
     * 
     * @return genericSmallUpdates
     */
    public lagan.api.main.FWTGenericSmallUpdate[] getGenericSmallUpdates() {
        return genericSmallUpdates;
    }


    /**
     * Sets the genericSmallUpdates value for this FWTIndividualUpdate.
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
     * Gets the genericBigUpdates value for this FWTIndividualUpdate.
     * 
     * @return genericBigUpdates
     */
    public lagan.api.main.FWTGenericBigUpdate[] getGenericBigUpdates() {
        return genericBigUpdates;
    }


    /**
     * Sets the genericBigUpdates value for this FWTIndividualUpdate.
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
     * Gets the option value for this FWTIndividualUpdate.
     * 
     * @return option   * Values: cdi. This element is only
     *                                     used for updating an individual
     * record.
     */
    public java.lang.String[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this FWTIndividualUpdate.
     * 
     * @param option   * Values: cdi. This element is only
     *                                     used for updating an individual
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
     * Gets the extraData value for this FWTIndividualUpdate.
     * 
     * @return extraData
     */
    public lagan.api.main.FWTKeyValue[] getExtraData() {
        return extraData;
    }


    /**
     * Sets the extraData value for this FWTIndividualUpdate.
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
        if (!(obj instanceof FWTIndividualUpdate)) return false;
        FWTIndividualUpdate other = (FWTIndividualUpdate) obj;
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
            ((this.genderUpdate==null && other.getGenderUpdate()==null) || 
             (this.genderUpdate!=null &&
              this.genderUpdate.equals(other.getGenderUpdate()))) &&
            ((this.genderAtBirthUpdate==null && other.getGenderAtBirthUpdate()==null) || 
             (this.genderAtBirthUpdate!=null &&
              this.genderAtBirthUpdate.equals(other.getGenderAtBirthUpdate()))) &&
            ((this.placeOfBirthUpdate==null && other.getPlaceOfBirthUpdate()==null) || 
             (this.placeOfBirthUpdate!=null &&
              this.placeOfBirthUpdate.equals(other.getPlaceOfBirthUpdate()))) &&
            ((this.countryOfBirthUpdate==null && other.getCountryOfBirthUpdate()==null) || 
             (this.countryOfBirthUpdate!=null &&
              this.countryOfBirthUpdate.equals(other.getCountryOfBirthUpdate()))) &&
            ((this.nationalityUpdate==null && other.getNationalityUpdate()==null) || 
             (this.nationalityUpdate!=null &&
              this.nationalityUpdate.equals(other.getNationalityUpdate()))) &&
            ((this.maritalStatusUpdate==null && other.getMaritalStatusUpdate()==null) || 
             (this.maritalStatusUpdate!=null &&
              this.maritalStatusUpdate.equals(other.getMaritalStatusUpdate()))) &&
            ((this.drivingLicenceNumberUpdate==null && other.getDrivingLicenceNumberUpdate()==null) || 
             (this.drivingLicenceNumberUpdate!=null &&
              this.drivingLicenceNumberUpdate.equals(other.getDrivingLicenceNumberUpdate()))) &&
            ((this.drivingLicencePatternIDUpdate==null && other.getDrivingLicencePatternIDUpdate()==null) || 
             (this.drivingLicencePatternIDUpdate!=null &&
              this.drivingLicencePatternIDUpdate.equals(other.getDrivingLicencePatternIDUpdate()))) &&
            ((this.additionalDrivingLicencesUpdate==null && other.getAdditionalDrivingLicencesUpdate()==null) || 
             (this.additionalDrivingLicencesUpdate!=null &&
              this.additionalDrivingLicencesUpdate.equals(other.getAdditionalDrivingLicencesUpdate()))) &&
            ((this.passportNumberUpdate==null && other.getPassportNumberUpdate()==null) || 
             (this.passportNumberUpdate!=null &&
              this.passportNumberUpdate.equals(other.getPassportNumberUpdate()))) &&
            ((this.passportNumberPatternIDUpdate==null && other.getPassportNumberPatternIDUpdate()==null) || 
             (this.passportNumberPatternIDUpdate!=null &&
              this.passportNumberPatternIDUpdate.equals(other.getPassportNumberPatternIDUpdate()))) &&
            ((this.additionalPassportsUpdate==null && other.getAdditionalPassportsUpdate()==null) || 
             (this.additionalPassportsUpdate!=null &&
              this.additionalPassportsUpdate.equals(other.getAdditionalPassportsUpdate()))) &&
            ((this.healthNumberUpdate==null && other.getHealthNumberUpdate()==null) || 
             (this.healthNumberUpdate!=null &&
              this.healthNumberUpdate.equals(other.getHealthNumberUpdate()))) &&
            ((this.nationalInsuranceNumberUpdate==null && other.getNationalInsuranceNumberUpdate()==null) || 
             (this.nationalInsuranceNumberUpdate!=null &&
              this.nationalInsuranceNumberUpdate.equals(other.getNationalInsuranceNumberUpdate()))) &&
            ((this.socialSecurityNumberUpdate==null && other.getSocialSecurityNumberUpdate()==null) || 
             (this.socialSecurityNumberUpdate!=null &&
              this.socialSecurityNumberUpdate.equals(other.getSocialSecurityNumberUpdate()))) &&
            ((this.ethnicityUpdate==null && other.getEthnicityUpdate()==null) || 
             (this.ethnicityUpdate!=null &&
              this.ethnicityUpdate.equals(other.getEthnicityUpdate()))) &&
            ((this.disabilitiesUpdate==null && other.getDisabilitiesUpdate()==null) || 
             (this.disabilitiesUpdate!=null &&
              this.disabilitiesUpdate.equals(other.getDisabilitiesUpdate()))) &&
            ((this.disabilityRegNumberUpdate==null && other.getDisabilityRegNumberUpdate()==null) || 
             (this.disabilityRegNumberUpdate!=null &&
              this.disabilityRegNumberUpdate.equals(other.getDisabilityRegNumberUpdate()))) &&
            ((this.dateOfBirthUpdate==null && other.getDateOfBirthUpdate()==null) || 
             (this.dateOfBirthUpdate!=null &&
              this.dateOfBirthUpdate.equals(other.getDateOfBirthUpdate()))) &&
            ((this.occupationUpdate==null && other.getOccupationUpdate()==null) || 
             (this.occupationUpdate!=null &&
              this.occupationUpdate.equals(other.getOccupationUpdate()))) &&
            ((this.additionalOccupationsUpdate==null && other.getAdditionalOccupationsUpdate()==null) || 
             (this.additionalOccupationsUpdate!=null &&
              this.additionalOccupationsUpdate.equals(other.getAdditionalOccupationsUpdate()))) &&
            ((this.dateOfDeathUpdate==null && other.getDateOfDeathUpdate()==null) || 
             (this.dateOfDeathUpdate!=null &&
              this.dateOfDeathUpdate.equals(other.getDateOfDeathUpdate()))) &&
            ((this.preferredLanguageUpdate==null && other.getPreferredLanguageUpdate()==null) || 
             (this.preferredLanguageUpdate!=null &&
              this.preferredLanguageUpdate.equals(other.getPreferredLanguageUpdate()))) &&
            ((this.validFromDateUpdate==null && other.getValidFromDateUpdate()==null) || 
             (this.validFromDateUpdate!=null &&
              this.validFromDateUpdate.equals(other.getValidFromDateUpdate()))) &&
            ((this.validToDateUpdate==null && other.getValidToDateUpdate()==null) || 
             (this.validToDateUpdate!=null &&
              this.validToDateUpdate.equals(other.getValidToDateUpdate()))) &&
            ((this.surveyConsentUpdate==null && other.getSurveyConsentUpdate()==null) || 
             (this.surveyConsentUpdate!=null &&
              this.surveyConsentUpdate.equals(other.getSurveyConsentUpdate()))) &&
            ((this.registrationDetailsUpdate==null && other.getRegistrationDetailsUpdate()==null) || 
             (this.registrationDetailsUpdate!=null &&
              this.registrationDetailsUpdate.equals(other.getRegistrationDetailsUpdate()))) &&
            ((this.authenticationDetailsUpdate==null && other.getAuthenticationDetailsUpdate()==null) || 
             (this.authenticationDetailsUpdate!=null &&
              this.authenticationDetailsUpdate.equals(other.getAuthenticationDetailsUpdate()))) &&
            ((this.LGCodeUpdate==null && other.getLGCodeUpdate()==null) || 
             (this.LGCodeUpdate!=null &&
              this.LGCodeUpdate.equals(other.getLGCodeUpdate()))) &&
            ((this.authorisedViewUpdate==null && other.getAuthorisedViewUpdate()==null) || 
             (this.authorisedViewUpdate!=null &&
              this.authorisedViewUpdate.equals(other.getAuthorisedViewUpdate()))) &&
            ((this.categoryUpdate==null && other.getCategoryUpdate()==null) || 
             (this.categoryUpdate!=null &&
              this.categoryUpdate.equals(other.getCategoryUpdate()))) &&
            ((this.freeTextUpdate==null && other.getFreeTextUpdate()==null) || 
             (this.freeTextUpdate!=null &&
              this.freeTextUpdate.equals(other.getFreeTextUpdate()))) &&
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
        if (getGenderUpdate() != null) {
            _hashCode += getGenderUpdate().hashCode();
        }
        if (getGenderAtBirthUpdate() != null) {
            _hashCode += getGenderAtBirthUpdate().hashCode();
        }
        if (getPlaceOfBirthUpdate() != null) {
            _hashCode += getPlaceOfBirthUpdate().hashCode();
        }
        if (getCountryOfBirthUpdate() != null) {
            _hashCode += getCountryOfBirthUpdate().hashCode();
        }
        if (getNationalityUpdate() != null) {
            _hashCode += getNationalityUpdate().hashCode();
        }
        if (getMaritalStatusUpdate() != null) {
            _hashCode += getMaritalStatusUpdate().hashCode();
        }
        if (getDrivingLicenceNumberUpdate() != null) {
            _hashCode += getDrivingLicenceNumberUpdate().hashCode();
        }
        if (getDrivingLicencePatternIDUpdate() != null) {
            _hashCode += getDrivingLicencePatternIDUpdate().hashCode();
        }
        if (getAdditionalDrivingLicencesUpdate() != null) {
            _hashCode += getAdditionalDrivingLicencesUpdate().hashCode();
        }
        if (getPassportNumberUpdate() != null) {
            _hashCode += getPassportNumberUpdate().hashCode();
        }
        if (getPassportNumberPatternIDUpdate() != null) {
            _hashCode += getPassportNumberPatternIDUpdate().hashCode();
        }
        if (getAdditionalPassportsUpdate() != null) {
            _hashCode += getAdditionalPassportsUpdate().hashCode();
        }
        if (getHealthNumberUpdate() != null) {
            _hashCode += getHealthNumberUpdate().hashCode();
        }
        if (getNationalInsuranceNumberUpdate() != null) {
            _hashCode += getNationalInsuranceNumberUpdate().hashCode();
        }
        if (getSocialSecurityNumberUpdate() != null) {
            _hashCode += getSocialSecurityNumberUpdate().hashCode();
        }
        if (getEthnicityUpdate() != null) {
            _hashCode += getEthnicityUpdate().hashCode();
        }
        if (getDisabilitiesUpdate() != null) {
            _hashCode += getDisabilitiesUpdate().hashCode();
        }
        if (getDisabilityRegNumberUpdate() != null) {
            _hashCode += getDisabilityRegNumberUpdate().hashCode();
        }
        if (getDateOfBirthUpdate() != null) {
            _hashCode += getDateOfBirthUpdate().hashCode();
        }
        if (getOccupationUpdate() != null) {
            _hashCode += getOccupationUpdate().hashCode();
        }
        if (getAdditionalOccupationsUpdate() != null) {
            _hashCode += getAdditionalOccupationsUpdate().hashCode();
        }
        if (getDateOfDeathUpdate() != null) {
            _hashCode += getDateOfDeathUpdate().hashCode();
        }
        if (getPreferredLanguageUpdate() != null) {
            _hashCode += getPreferredLanguageUpdate().hashCode();
        }
        if (getValidFromDateUpdate() != null) {
            _hashCode += getValidFromDateUpdate().hashCode();
        }
        if (getValidToDateUpdate() != null) {
            _hashCode += getValidToDateUpdate().hashCode();
        }
        if (getSurveyConsentUpdate() != null) {
            _hashCode += getSurveyConsentUpdate().hashCode();
        }
        if (getRegistrationDetailsUpdate() != null) {
            _hashCode += getRegistrationDetailsUpdate().hashCode();
        }
        if (getAuthenticationDetailsUpdate() != null) {
            _hashCode += getAuthenticationDetailsUpdate().hashCode();
        }
        if (getLGCodeUpdate() != null) {
            _hashCode += getLGCodeUpdate().hashCode();
        }
        if (getAuthorisedViewUpdate() != null) {
            _hashCode += getAuthorisedViewUpdate().hashCode();
        }
        if (getCategoryUpdate() != null) {
            _hashCode += getCategoryUpdate().hashCode();
        }
        if (getFreeTextUpdate() != null) {
            _hashCode += getFreeTextUpdate().hashCode();
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
        new org.apache.axis.description.TypeDesc(FWTIndividualUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTIndividualUpdate"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTIndividualNameUpdate"));
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
        elemField.setFieldName("genderUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenderUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTGenderUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genderAtBirthUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenderAtBirthUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTGenderAtBirthUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeOfBirthUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PlaceOfBirthUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTPlaceOfBirthUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfBirthUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CountryOfBirthUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCountryOfBirthUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalityUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NationalityUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTNationalityUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatusUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaritalStatusUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTMaritalStatusUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drivingLicenceNumberUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DrivingLicenceNumberUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTDrivingLicenceNumberUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drivingLicencePatternIDUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DrivingLicencePatternIDUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTDrivingLicencePatternIDUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalDrivingLicencesUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdditionalDrivingLicencesUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTAdditionalDrivingLicencesUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passportNumberUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PassportNumberUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTPassportNumberUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passportNumberPatternIDUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PassportNumberPatternIDUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTPassportNumberPatternIDUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalPassportsUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdditionalPassportsUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTAdditionalPassportsUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthNumberUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HealthNumberUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTHealthNumberUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalInsuranceNumberUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NationalInsuranceNumberUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTNationalInsuranceNumberUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialSecurityNumberUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SocialSecurityNumberUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTSocialSecurityNumberUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethnicityUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EthnicityUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTEthnicityUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabilitiesUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DisabilitiesUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTDisabilitiesUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabilityRegNumberUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DisabilityRegNumberUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTDisabilityRegNumberUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirthUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateOfBirthUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTDateOfBirthUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupationUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OccupationUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTOccupationUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalOccupationsUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdditionalOccupationsUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTAdditionalOccupationsUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfDeathUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateOfDeathUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTDateOfDeathUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLanguageUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreferredLanguageUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTPreferredLanguageUpdate"));
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
        elemField.setFieldName("surveyConsentUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SurveyConsentUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTSurveyConsentUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationDetailsUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RegistrationDetailsUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTRegistrationDetailsUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationDetailsUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthenticationDetailsUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTAuthenticationDetailsUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LGCodeUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LGCodeUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTLGCodeUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorisedViewUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthorisedViewUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTAuthorisedViewUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CategoryUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCategoryUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeTextUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FreeTextUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTFreeTextUpdate"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTIndividualUpdate>Option"));
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
