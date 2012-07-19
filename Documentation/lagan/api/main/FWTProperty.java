/**
 * FWTProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTProperty  implements java.io.Serializable {
    private lagan.api.main.FWTObjectBriefDetails briefDetails;

    /* Not applicable for US addresses */
    private java.lang.String UPRN;

    /* Not applicable for US addresses */
    private java.lang.String USRN;

    private java.lang.String PAO;

    private java.lang.String SAO;

    /* For US addresses only */
    private java.lang.String propertyID;

    private java.lang.String addressNumber;

    private java.lang.String addressLine1;

    private java.lang.String addressLine2;

    private java.lang.String primaryStreetName;

    private java.lang.String locality;

    /* Not applicable for US addresses -
     *                                     use City */
    private java.lang.String town;

    /* Not applicable for US addresses */
    private java.lang.String postcode;

    /* For US addresses only */
    private java.lang.String city;

    /* For US addresses only */
    private java.lang.String stateCode;

    /* For US addresses only */
    private java.lang.String zipcode;

    private java.lang.String county;

    private java.lang.String country;

    private java.lang.String POBox;

    private java.lang.String buildingName;

    private java.lang.String[] primaryStreetAltName;

    private java.lang.String secondaryStreetName;

    private java.lang.String[] secondaryStreetAltName;

    private java.lang.String IGGeoCode;

    private java.lang.String GPSItmGeoCode;

    private java.lang.String GPSUtmGeoCode;

    private java.lang.Long localCouncilCode;

    private java.lang.String localCouncilName;

    private java.lang.Long regionalCouncilCode;

    private java.lang.String regionalCouncilName;

    private java.lang.Long wardRef;

    private java.lang.String wardName;

    private java.lang.String localityType;

    private java.lang.String secondaryLocality;

    private java.lang.Long townlandRef;

    private java.lang.String townlandName;

    private java.lang.Long postTownRef;

    /* For US addresses only */
    private java.lang.Long cityRef;

    private java.lang.Long countyRef;

    private java.lang.Long countryRef;

    private java.lang.String buildingUse;

    private java.lang.String buildingStatus;

    private java.lang.String[] PAOUserDefined;

    private long[] PAOUserDefinedNum;

    private java.lang.String[] PAOUserDefinedText;

    private java.util.Date[] PAOUserDefinedDate;

    private java.util.Date PAOStartDate;

    private java.util.Date PAOEndDate;

    private java.lang.String subBuildingName;

    private java.lang.String organisationName;

    private java.lang.String businessAlias;

    private java.lang.String departmentName;

    /* Not applicable for US addresses */
    private java.lang.String largeUserPostCode;

    private java.lang.String subBuildingStatus;

    private java.lang.String businessUse;

    private java.lang.String RMDeliveryPointSuffix;

    private java.lang.Integer RMAddressKey;

    private java.lang.Integer VLARef;

    private java.lang.Long ordnanceSurveyRef;

    private java.lang.String deliveryPointStatus;

    private java.lang.String recordStatusIndicator;

    private java.lang.String[] SAOUserDefined;

    private long[] SAOUserDefinedNum;

    private java.lang.String[] SAOUserDefinedText;

    private java.util.Date[] SAOUserDefinedDate;

    private java.util.Date SAOStartDate;

    private java.util.Date SAOEndDate;

    private lagan.api.main.FWTAuditDetails PAOAuditDetails;

    private lagan.api.main.FWTAuditDetails SAOAuditDetails;

    public FWTProperty() {
    }

    public FWTProperty(
           lagan.api.main.FWTObjectBriefDetails briefDetails,
           java.lang.String UPRN,
           java.lang.String USRN,
           java.lang.String PAO,
           java.lang.String SAO,
           java.lang.String propertyID,
           java.lang.String addressNumber,
           java.lang.String addressLine1,
           java.lang.String addressLine2,
           java.lang.String primaryStreetName,
           java.lang.String locality,
           java.lang.String town,
           java.lang.String postcode,
           java.lang.String city,
           java.lang.String stateCode,
           java.lang.String zipcode,
           java.lang.String county,
           java.lang.String country,
           java.lang.String POBox,
           java.lang.String buildingName,
           java.lang.String[] primaryStreetAltName,
           java.lang.String secondaryStreetName,
           java.lang.String[] secondaryStreetAltName,
           java.lang.String IGGeoCode,
           java.lang.String GPSItmGeoCode,
           java.lang.String GPSUtmGeoCode,
           java.lang.Long localCouncilCode,
           java.lang.String localCouncilName,
           java.lang.Long regionalCouncilCode,
           java.lang.String regionalCouncilName,
           java.lang.Long wardRef,
           java.lang.String wardName,
           java.lang.String localityType,
           java.lang.String secondaryLocality,
           java.lang.Long townlandRef,
           java.lang.String townlandName,
           java.lang.Long postTownRef,
           java.lang.Long cityRef,
           java.lang.Long countyRef,
           java.lang.Long countryRef,
           java.lang.String buildingUse,
           java.lang.String buildingStatus,
           java.lang.String[] PAOUserDefined,
           long[] PAOUserDefinedNum,
           java.lang.String[] PAOUserDefinedText,
           java.util.Date[] PAOUserDefinedDate,
           java.util.Date PAOStartDate,
           java.util.Date PAOEndDate,
           java.lang.String subBuildingName,
           java.lang.String organisationName,
           java.lang.String businessAlias,
           java.lang.String departmentName,
           java.lang.String largeUserPostCode,
           java.lang.String subBuildingStatus,
           java.lang.String businessUse,
           java.lang.String RMDeliveryPointSuffix,
           java.lang.Integer RMAddressKey,
           java.lang.Integer VLARef,
           java.lang.Long ordnanceSurveyRef,
           java.lang.String deliveryPointStatus,
           java.lang.String recordStatusIndicator,
           java.lang.String[] SAOUserDefined,
           long[] SAOUserDefinedNum,
           java.lang.String[] SAOUserDefinedText,
           java.util.Date[] SAOUserDefinedDate,
           java.util.Date SAOStartDate,
           java.util.Date SAOEndDate,
           lagan.api.main.FWTAuditDetails PAOAuditDetails,
           lagan.api.main.FWTAuditDetails SAOAuditDetails) {
           this.briefDetails = briefDetails;
           this.UPRN = UPRN;
           this.USRN = USRN;
           this.PAO = PAO;
           this.SAO = SAO;
           this.propertyID = propertyID;
           this.addressNumber = addressNumber;
           this.addressLine1 = addressLine1;
           this.addressLine2 = addressLine2;
           this.primaryStreetName = primaryStreetName;
           this.locality = locality;
           this.town = town;
           this.postcode = postcode;
           this.city = city;
           this.stateCode = stateCode;
           this.zipcode = zipcode;
           this.county = county;
           this.country = country;
           this.POBox = POBox;
           this.buildingName = buildingName;
           this.primaryStreetAltName = primaryStreetAltName;
           this.secondaryStreetName = secondaryStreetName;
           this.secondaryStreetAltName = secondaryStreetAltName;
           this.IGGeoCode = IGGeoCode;
           this.GPSItmGeoCode = GPSItmGeoCode;
           this.GPSUtmGeoCode = GPSUtmGeoCode;
           this.localCouncilCode = localCouncilCode;
           this.localCouncilName = localCouncilName;
           this.regionalCouncilCode = regionalCouncilCode;
           this.regionalCouncilName = regionalCouncilName;
           this.wardRef = wardRef;
           this.wardName = wardName;
           this.localityType = localityType;
           this.secondaryLocality = secondaryLocality;
           this.townlandRef = townlandRef;
           this.townlandName = townlandName;
           this.postTownRef = postTownRef;
           this.cityRef = cityRef;
           this.countyRef = countyRef;
           this.countryRef = countryRef;
           this.buildingUse = buildingUse;
           this.buildingStatus = buildingStatus;
           this.PAOUserDefined = PAOUserDefined;
           this.PAOUserDefinedNum = PAOUserDefinedNum;
           this.PAOUserDefinedText = PAOUserDefinedText;
           this.PAOUserDefinedDate = PAOUserDefinedDate;
           this.PAOStartDate = PAOStartDate;
           this.PAOEndDate = PAOEndDate;
           this.subBuildingName = subBuildingName;
           this.organisationName = organisationName;
           this.businessAlias = businessAlias;
           this.departmentName = departmentName;
           this.largeUserPostCode = largeUserPostCode;
           this.subBuildingStatus = subBuildingStatus;
           this.businessUse = businessUse;
           this.RMDeliveryPointSuffix = RMDeliveryPointSuffix;
           this.RMAddressKey = RMAddressKey;
           this.VLARef = VLARef;
           this.ordnanceSurveyRef = ordnanceSurveyRef;
           this.deliveryPointStatus = deliveryPointStatus;
           this.recordStatusIndicator = recordStatusIndicator;
           this.SAOUserDefined = SAOUserDefined;
           this.SAOUserDefinedNum = SAOUserDefinedNum;
           this.SAOUserDefinedText = SAOUserDefinedText;
           this.SAOUserDefinedDate = SAOUserDefinedDate;
           this.SAOStartDate = SAOStartDate;
           this.SAOEndDate = SAOEndDate;
           this.PAOAuditDetails = PAOAuditDetails;
           this.SAOAuditDetails = SAOAuditDetails;
    }


    /**
     * Gets the briefDetails value for this FWTProperty.
     * 
     * @return briefDetails
     */
    public lagan.api.main.FWTObjectBriefDetails getBriefDetails() {
        return briefDetails;
    }


    /**
     * Sets the briefDetails value for this FWTProperty.
     * 
     * @param briefDetails
     */
    public void setBriefDetails(lagan.api.main.FWTObjectBriefDetails briefDetails) {
        this.briefDetails = briefDetails;
    }


    /**
     * Gets the UPRN value for this FWTProperty.
     * 
     * @return UPRN   * Not applicable for US addresses
     */
    public java.lang.String getUPRN() {
        return UPRN;
    }


    /**
     * Sets the UPRN value for this FWTProperty.
     * 
     * @param UPRN   * Not applicable for US addresses
     */
    public void setUPRN(java.lang.String UPRN) {
        this.UPRN = UPRN;
    }


    /**
     * Gets the USRN value for this FWTProperty.
     * 
     * @return USRN   * Not applicable for US addresses
     */
    public java.lang.String getUSRN() {
        return USRN;
    }


    /**
     * Sets the USRN value for this FWTProperty.
     * 
     * @param USRN   * Not applicable for US addresses
     */
    public void setUSRN(java.lang.String USRN) {
        this.USRN = USRN;
    }


    /**
     * Gets the PAO value for this FWTProperty.
     * 
     * @return PAO
     */
    public java.lang.String getPAO() {
        return PAO;
    }


    /**
     * Sets the PAO value for this FWTProperty.
     * 
     * @param PAO
     */
    public void setPAO(java.lang.String PAO) {
        this.PAO = PAO;
    }


    /**
     * Gets the SAO value for this FWTProperty.
     * 
     * @return SAO
     */
    public java.lang.String getSAO() {
        return SAO;
    }


    /**
     * Sets the SAO value for this FWTProperty.
     * 
     * @param SAO
     */
    public void setSAO(java.lang.String SAO) {
        this.SAO = SAO;
    }


    /**
     * Gets the propertyID value for this FWTProperty.
     * 
     * @return propertyID   * For US addresses only
     */
    public java.lang.String getPropertyID() {
        return propertyID;
    }


    /**
     * Sets the propertyID value for this FWTProperty.
     * 
     * @param propertyID   * For US addresses only
     */
    public void setPropertyID(java.lang.String propertyID) {
        this.propertyID = propertyID;
    }


    /**
     * Gets the addressNumber value for this FWTProperty.
     * 
     * @return addressNumber
     */
    public java.lang.String getAddressNumber() {
        return addressNumber;
    }


    /**
     * Sets the addressNumber value for this FWTProperty.
     * 
     * @param addressNumber
     */
    public void setAddressNumber(java.lang.String addressNumber) {
        this.addressNumber = addressNumber;
    }


    /**
     * Gets the addressLine1 value for this FWTProperty.
     * 
     * @return addressLine1
     */
    public java.lang.String getAddressLine1() {
        return addressLine1;
    }


    /**
     * Sets the addressLine1 value for this FWTProperty.
     * 
     * @param addressLine1
     */
    public void setAddressLine1(java.lang.String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    /**
     * Gets the addressLine2 value for this FWTProperty.
     * 
     * @return addressLine2
     */
    public java.lang.String getAddressLine2() {
        return addressLine2;
    }


    /**
     * Sets the addressLine2 value for this FWTProperty.
     * 
     * @param addressLine2
     */
    public void setAddressLine2(java.lang.String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    /**
     * Gets the primaryStreetName value for this FWTProperty.
     * 
     * @return primaryStreetName
     */
    public java.lang.String getPrimaryStreetName() {
        return primaryStreetName;
    }


    /**
     * Sets the primaryStreetName value for this FWTProperty.
     * 
     * @param primaryStreetName
     */
    public void setPrimaryStreetName(java.lang.String primaryStreetName) {
        this.primaryStreetName = primaryStreetName;
    }


    /**
     * Gets the locality value for this FWTProperty.
     * 
     * @return locality
     */
    public java.lang.String getLocality() {
        return locality;
    }


    /**
     * Sets the locality value for this FWTProperty.
     * 
     * @param locality
     */
    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }


    /**
     * Gets the town value for this FWTProperty.
     * 
     * @return town   * Not applicable for US addresses -
     *                                     use City
     */
    public java.lang.String getTown() {
        return town;
    }


    /**
     * Sets the town value for this FWTProperty.
     * 
     * @param town   * Not applicable for US addresses -
     *                                     use City
     */
    public void setTown(java.lang.String town) {
        this.town = town;
    }


    /**
     * Gets the postcode value for this FWTProperty.
     * 
     * @return postcode   * Not applicable for US addresses
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this FWTProperty.
     * 
     * @param postcode   * Not applicable for US addresses
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the city value for this FWTProperty.
     * 
     * @return city   * For US addresses only
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this FWTProperty.
     * 
     * @param city   * For US addresses only
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the stateCode value for this FWTProperty.
     * 
     * @return stateCode   * For US addresses only
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this FWTProperty.
     * 
     * @param stateCode   * For US addresses only
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }


    /**
     * Gets the zipcode value for this FWTProperty.
     * 
     * @return zipcode   * For US addresses only
     */
    public java.lang.String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this FWTProperty.
     * 
     * @param zipcode   * For US addresses only
     */
    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the county value for this FWTProperty.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this FWTProperty.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the country value for this FWTProperty.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this FWTProperty.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the POBox value for this FWTProperty.
     * 
     * @return POBox
     */
    public java.lang.String getPOBox() {
        return POBox;
    }


    /**
     * Sets the POBox value for this FWTProperty.
     * 
     * @param POBox
     */
    public void setPOBox(java.lang.String POBox) {
        this.POBox = POBox;
    }


    /**
     * Gets the buildingName value for this FWTProperty.
     * 
     * @return buildingName
     */
    public java.lang.String getBuildingName() {
        return buildingName;
    }


    /**
     * Sets the buildingName value for this FWTProperty.
     * 
     * @param buildingName
     */
    public void setBuildingName(java.lang.String buildingName) {
        this.buildingName = buildingName;
    }


    /**
     * Gets the primaryStreetAltName value for this FWTProperty.
     * 
     * @return primaryStreetAltName
     */
    public java.lang.String[] getPrimaryStreetAltName() {
        return primaryStreetAltName;
    }


    /**
     * Sets the primaryStreetAltName value for this FWTProperty.
     * 
     * @param primaryStreetAltName
     */
    public void setPrimaryStreetAltName(java.lang.String[] primaryStreetAltName) {
        this.primaryStreetAltName = primaryStreetAltName;
    }

    public java.lang.String getPrimaryStreetAltName(int i) {
        return this.primaryStreetAltName[i];
    }

    public void setPrimaryStreetAltName(int i, java.lang.String _value) {
        this.primaryStreetAltName[i] = _value;
    }


    /**
     * Gets the secondaryStreetName value for this FWTProperty.
     * 
     * @return secondaryStreetName
     */
    public java.lang.String getSecondaryStreetName() {
        return secondaryStreetName;
    }


    /**
     * Sets the secondaryStreetName value for this FWTProperty.
     * 
     * @param secondaryStreetName
     */
    public void setSecondaryStreetName(java.lang.String secondaryStreetName) {
        this.secondaryStreetName = secondaryStreetName;
    }


    /**
     * Gets the secondaryStreetAltName value for this FWTProperty.
     * 
     * @return secondaryStreetAltName
     */
    public java.lang.String[] getSecondaryStreetAltName() {
        return secondaryStreetAltName;
    }


    /**
     * Sets the secondaryStreetAltName value for this FWTProperty.
     * 
     * @param secondaryStreetAltName
     */
    public void setSecondaryStreetAltName(java.lang.String[] secondaryStreetAltName) {
        this.secondaryStreetAltName = secondaryStreetAltName;
    }

    public java.lang.String getSecondaryStreetAltName(int i) {
        return this.secondaryStreetAltName[i];
    }

    public void setSecondaryStreetAltName(int i, java.lang.String _value) {
        this.secondaryStreetAltName[i] = _value;
    }


    /**
     * Gets the IGGeoCode value for this FWTProperty.
     * 
     * @return IGGeoCode
     */
    public java.lang.String getIGGeoCode() {
        return IGGeoCode;
    }


    /**
     * Sets the IGGeoCode value for this FWTProperty.
     * 
     * @param IGGeoCode
     */
    public void setIGGeoCode(java.lang.String IGGeoCode) {
        this.IGGeoCode = IGGeoCode;
    }


    /**
     * Gets the GPSItmGeoCode value for this FWTProperty.
     * 
     * @return GPSItmGeoCode
     */
    public java.lang.String getGPSItmGeoCode() {
        return GPSItmGeoCode;
    }


    /**
     * Sets the GPSItmGeoCode value for this FWTProperty.
     * 
     * @param GPSItmGeoCode
     */
    public void setGPSItmGeoCode(java.lang.String GPSItmGeoCode) {
        this.GPSItmGeoCode = GPSItmGeoCode;
    }


    /**
     * Gets the GPSUtmGeoCode value for this FWTProperty.
     * 
     * @return GPSUtmGeoCode
     */
    public java.lang.String getGPSUtmGeoCode() {
        return GPSUtmGeoCode;
    }


    /**
     * Sets the GPSUtmGeoCode value for this FWTProperty.
     * 
     * @param GPSUtmGeoCode
     */
    public void setGPSUtmGeoCode(java.lang.String GPSUtmGeoCode) {
        this.GPSUtmGeoCode = GPSUtmGeoCode;
    }


    /**
     * Gets the localCouncilCode value for this FWTProperty.
     * 
     * @return localCouncilCode
     */
    public java.lang.Long getLocalCouncilCode() {
        return localCouncilCode;
    }


    /**
     * Sets the localCouncilCode value for this FWTProperty.
     * 
     * @param localCouncilCode
     */
    public void setLocalCouncilCode(java.lang.Long localCouncilCode) {
        this.localCouncilCode = localCouncilCode;
    }


    /**
     * Gets the localCouncilName value for this FWTProperty.
     * 
     * @return localCouncilName
     */
    public java.lang.String getLocalCouncilName() {
        return localCouncilName;
    }


    /**
     * Sets the localCouncilName value for this FWTProperty.
     * 
     * @param localCouncilName
     */
    public void setLocalCouncilName(java.lang.String localCouncilName) {
        this.localCouncilName = localCouncilName;
    }


    /**
     * Gets the regionalCouncilCode value for this FWTProperty.
     * 
     * @return regionalCouncilCode
     */
    public java.lang.Long getRegionalCouncilCode() {
        return regionalCouncilCode;
    }


    /**
     * Sets the regionalCouncilCode value for this FWTProperty.
     * 
     * @param regionalCouncilCode
     */
    public void setRegionalCouncilCode(java.lang.Long regionalCouncilCode) {
        this.regionalCouncilCode = regionalCouncilCode;
    }


    /**
     * Gets the regionalCouncilName value for this FWTProperty.
     * 
     * @return regionalCouncilName
     */
    public java.lang.String getRegionalCouncilName() {
        return regionalCouncilName;
    }


    /**
     * Sets the regionalCouncilName value for this FWTProperty.
     * 
     * @param regionalCouncilName
     */
    public void setRegionalCouncilName(java.lang.String regionalCouncilName) {
        this.regionalCouncilName = regionalCouncilName;
    }


    /**
     * Gets the wardRef value for this FWTProperty.
     * 
     * @return wardRef
     */
    public java.lang.Long getWardRef() {
        return wardRef;
    }


    /**
     * Sets the wardRef value for this FWTProperty.
     * 
     * @param wardRef
     */
    public void setWardRef(java.lang.Long wardRef) {
        this.wardRef = wardRef;
    }


    /**
     * Gets the wardName value for this FWTProperty.
     * 
     * @return wardName
     */
    public java.lang.String getWardName() {
        return wardName;
    }


    /**
     * Sets the wardName value for this FWTProperty.
     * 
     * @param wardName
     */
    public void setWardName(java.lang.String wardName) {
        this.wardName = wardName;
    }


    /**
     * Gets the localityType value for this FWTProperty.
     * 
     * @return localityType
     */
    public java.lang.String getLocalityType() {
        return localityType;
    }


    /**
     * Sets the localityType value for this FWTProperty.
     * 
     * @param localityType
     */
    public void setLocalityType(java.lang.String localityType) {
        this.localityType = localityType;
    }


    /**
     * Gets the secondaryLocality value for this FWTProperty.
     * 
     * @return secondaryLocality
     */
    public java.lang.String getSecondaryLocality() {
        return secondaryLocality;
    }


    /**
     * Sets the secondaryLocality value for this FWTProperty.
     * 
     * @param secondaryLocality
     */
    public void setSecondaryLocality(java.lang.String secondaryLocality) {
        this.secondaryLocality = secondaryLocality;
    }


    /**
     * Gets the townlandRef value for this FWTProperty.
     * 
     * @return townlandRef
     */
    public java.lang.Long getTownlandRef() {
        return townlandRef;
    }


    /**
     * Sets the townlandRef value for this FWTProperty.
     * 
     * @param townlandRef
     */
    public void setTownlandRef(java.lang.Long townlandRef) {
        this.townlandRef = townlandRef;
    }


    /**
     * Gets the townlandName value for this FWTProperty.
     * 
     * @return townlandName
     */
    public java.lang.String getTownlandName() {
        return townlandName;
    }


    /**
     * Sets the townlandName value for this FWTProperty.
     * 
     * @param townlandName
     */
    public void setTownlandName(java.lang.String townlandName) {
        this.townlandName = townlandName;
    }


    /**
     * Gets the postTownRef value for this FWTProperty.
     * 
     * @return postTownRef
     */
    public java.lang.Long getPostTownRef() {
        return postTownRef;
    }


    /**
     * Sets the postTownRef value for this FWTProperty.
     * 
     * @param postTownRef
     */
    public void setPostTownRef(java.lang.Long postTownRef) {
        this.postTownRef = postTownRef;
    }


    /**
     * Gets the cityRef value for this FWTProperty.
     * 
     * @return cityRef   * For US addresses only
     */
    public java.lang.Long getCityRef() {
        return cityRef;
    }


    /**
     * Sets the cityRef value for this FWTProperty.
     * 
     * @param cityRef   * For US addresses only
     */
    public void setCityRef(java.lang.Long cityRef) {
        this.cityRef = cityRef;
    }


    /**
     * Gets the countyRef value for this FWTProperty.
     * 
     * @return countyRef
     */
    public java.lang.Long getCountyRef() {
        return countyRef;
    }


    /**
     * Sets the countyRef value for this FWTProperty.
     * 
     * @param countyRef
     */
    public void setCountyRef(java.lang.Long countyRef) {
        this.countyRef = countyRef;
    }


    /**
     * Gets the countryRef value for this FWTProperty.
     * 
     * @return countryRef
     */
    public java.lang.Long getCountryRef() {
        return countryRef;
    }


    /**
     * Sets the countryRef value for this FWTProperty.
     * 
     * @param countryRef
     */
    public void setCountryRef(java.lang.Long countryRef) {
        this.countryRef = countryRef;
    }


    /**
     * Gets the buildingUse value for this FWTProperty.
     * 
     * @return buildingUse
     */
    public java.lang.String getBuildingUse() {
        return buildingUse;
    }


    /**
     * Sets the buildingUse value for this FWTProperty.
     * 
     * @param buildingUse
     */
    public void setBuildingUse(java.lang.String buildingUse) {
        this.buildingUse = buildingUse;
    }


    /**
     * Gets the buildingStatus value for this FWTProperty.
     * 
     * @return buildingStatus
     */
    public java.lang.String getBuildingStatus() {
        return buildingStatus;
    }


    /**
     * Sets the buildingStatus value for this FWTProperty.
     * 
     * @param buildingStatus
     */
    public void setBuildingStatus(java.lang.String buildingStatus) {
        this.buildingStatus = buildingStatus;
    }


    /**
     * Gets the PAOUserDefined value for this FWTProperty.
     * 
     * @return PAOUserDefined
     */
    public java.lang.String[] getPAOUserDefined() {
        return PAOUserDefined;
    }


    /**
     * Sets the PAOUserDefined value for this FWTProperty.
     * 
     * @param PAOUserDefined
     */
    public void setPAOUserDefined(java.lang.String[] PAOUserDefined) {
        this.PAOUserDefined = PAOUserDefined;
    }

    public java.lang.String getPAOUserDefined(int i) {
        return this.PAOUserDefined[i];
    }

    public void setPAOUserDefined(int i, java.lang.String _value) {
        this.PAOUserDefined[i] = _value;
    }


    /**
     * Gets the PAOUserDefinedNum value for this FWTProperty.
     * 
     * @return PAOUserDefinedNum
     */
    public long[] getPAOUserDefinedNum() {
        return PAOUserDefinedNum;
    }


    /**
     * Sets the PAOUserDefinedNum value for this FWTProperty.
     * 
     * @param PAOUserDefinedNum
     */
    public void setPAOUserDefinedNum(long[] PAOUserDefinedNum) {
        this.PAOUserDefinedNum = PAOUserDefinedNum;
    }

    public long getPAOUserDefinedNum(int i) {
        return this.PAOUserDefinedNum[i];
    }

    public void setPAOUserDefinedNum(int i, long _value) {
        this.PAOUserDefinedNum[i] = _value;
    }


    /**
     * Gets the PAOUserDefinedText value for this FWTProperty.
     * 
     * @return PAOUserDefinedText
     */
    public java.lang.String[] getPAOUserDefinedText() {
        return PAOUserDefinedText;
    }


    /**
     * Sets the PAOUserDefinedText value for this FWTProperty.
     * 
     * @param PAOUserDefinedText
     */
    public void setPAOUserDefinedText(java.lang.String[] PAOUserDefinedText) {
        this.PAOUserDefinedText = PAOUserDefinedText;
    }

    public java.lang.String getPAOUserDefinedText(int i) {
        return this.PAOUserDefinedText[i];
    }

    public void setPAOUserDefinedText(int i, java.lang.String _value) {
        this.PAOUserDefinedText[i] = _value;
    }


    /**
     * Gets the PAOUserDefinedDate value for this FWTProperty.
     * 
     * @return PAOUserDefinedDate
     */
    public java.util.Date[] getPAOUserDefinedDate() {
        return PAOUserDefinedDate;
    }


    /**
     * Sets the PAOUserDefinedDate value for this FWTProperty.
     * 
     * @param PAOUserDefinedDate
     */
    public void setPAOUserDefinedDate(java.util.Date[] PAOUserDefinedDate) {
        this.PAOUserDefinedDate = PAOUserDefinedDate;
    }

    public java.util.Date getPAOUserDefinedDate(int i) {
        return this.PAOUserDefinedDate[i];
    }

    public void setPAOUserDefinedDate(int i, java.util.Date _value) {
        this.PAOUserDefinedDate[i] = _value;
    }


    /**
     * Gets the PAOStartDate value for this FWTProperty.
     * 
     * @return PAOStartDate
     */
    public java.util.Date getPAOStartDate() {
        return PAOStartDate;
    }


    /**
     * Sets the PAOStartDate value for this FWTProperty.
     * 
     * @param PAOStartDate
     */
    public void setPAOStartDate(java.util.Date PAOStartDate) {
        this.PAOStartDate = PAOStartDate;
    }


    /**
     * Gets the PAOEndDate value for this FWTProperty.
     * 
     * @return PAOEndDate
     */
    public java.util.Date getPAOEndDate() {
        return PAOEndDate;
    }


    /**
     * Sets the PAOEndDate value for this FWTProperty.
     * 
     * @param PAOEndDate
     */
    public void setPAOEndDate(java.util.Date PAOEndDate) {
        this.PAOEndDate = PAOEndDate;
    }


    /**
     * Gets the subBuildingName value for this FWTProperty.
     * 
     * @return subBuildingName
     */
    public java.lang.String getSubBuildingName() {
        return subBuildingName;
    }


    /**
     * Sets the subBuildingName value for this FWTProperty.
     * 
     * @param subBuildingName
     */
    public void setSubBuildingName(java.lang.String subBuildingName) {
        this.subBuildingName = subBuildingName;
    }


    /**
     * Gets the organisationName value for this FWTProperty.
     * 
     * @return organisationName
     */
    public java.lang.String getOrganisationName() {
        return organisationName;
    }


    /**
     * Sets the organisationName value for this FWTProperty.
     * 
     * @param organisationName
     */
    public void setOrganisationName(java.lang.String organisationName) {
        this.organisationName = organisationName;
    }


    /**
     * Gets the businessAlias value for this FWTProperty.
     * 
     * @return businessAlias
     */
    public java.lang.String getBusinessAlias() {
        return businessAlias;
    }


    /**
     * Sets the businessAlias value for this FWTProperty.
     * 
     * @param businessAlias
     */
    public void setBusinessAlias(java.lang.String businessAlias) {
        this.businessAlias = businessAlias;
    }


    /**
     * Gets the departmentName value for this FWTProperty.
     * 
     * @return departmentName
     */
    public java.lang.String getDepartmentName() {
        return departmentName;
    }


    /**
     * Sets the departmentName value for this FWTProperty.
     * 
     * @param departmentName
     */
    public void setDepartmentName(java.lang.String departmentName) {
        this.departmentName = departmentName;
    }


    /**
     * Gets the largeUserPostCode value for this FWTProperty.
     * 
     * @return largeUserPostCode   * Not applicable for US addresses
     */
    public java.lang.String getLargeUserPostCode() {
        return largeUserPostCode;
    }


    /**
     * Sets the largeUserPostCode value for this FWTProperty.
     * 
     * @param largeUserPostCode   * Not applicable for US addresses
     */
    public void setLargeUserPostCode(java.lang.String largeUserPostCode) {
        this.largeUserPostCode = largeUserPostCode;
    }


    /**
     * Gets the subBuildingStatus value for this FWTProperty.
     * 
     * @return subBuildingStatus
     */
    public java.lang.String getSubBuildingStatus() {
        return subBuildingStatus;
    }


    /**
     * Sets the subBuildingStatus value for this FWTProperty.
     * 
     * @param subBuildingStatus
     */
    public void setSubBuildingStatus(java.lang.String subBuildingStatus) {
        this.subBuildingStatus = subBuildingStatus;
    }


    /**
     * Gets the businessUse value for this FWTProperty.
     * 
     * @return businessUse
     */
    public java.lang.String getBusinessUse() {
        return businessUse;
    }


    /**
     * Sets the businessUse value for this FWTProperty.
     * 
     * @param businessUse
     */
    public void setBusinessUse(java.lang.String businessUse) {
        this.businessUse = businessUse;
    }


    /**
     * Gets the RMDeliveryPointSuffix value for this FWTProperty.
     * 
     * @return RMDeliveryPointSuffix
     */
    public java.lang.String getRMDeliveryPointSuffix() {
        return RMDeliveryPointSuffix;
    }


    /**
     * Sets the RMDeliveryPointSuffix value for this FWTProperty.
     * 
     * @param RMDeliveryPointSuffix
     */
    public void setRMDeliveryPointSuffix(java.lang.String RMDeliveryPointSuffix) {
        this.RMDeliveryPointSuffix = RMDeliveryPointSuffix;
    }


    /**
     * Gets the RMAddressKey value for this FWTProperty.
     * 
     * @return RMAddressKey
     */
    public java.lang.Integer getRMAddressKey() {
        return RMAddressKey;
    }


    /**
     * Sets the RMAddressKey value for this FWTProperty.
     * 
     * @param RMAddressKey
     */
    public void setRMAddressKey(java.lang.Integer RMAddressKey) {
        this.RMAddressKey = RMAddressKey;
    }


    /**
     * Gets the VLARef value for this FWTProperty.
     * 
     * @return VLARef
     */
    public java.lang.Integer getVLARef() {
        return VLARef;
    }


    /**
     * Sets the VLARef value for this FWTProperty.
     * 
     * @param VLARef
     */
    public void setVLARef(java.lang.Integer VLARef) {
        this.VLARef = VLARef;
    }


    /**
     * Gets the ordnanceSurveyRef value for this FWTProperty.
     * 
     * @return ordnanceSurveyRef
     */
    public java.lang.Long getOrdnanceSurveyRef() {
        return ordnanceSurveyRef;
    }


    /**
     * Sets the ordnanceSurveyRef value for this FWTProperty.
     * 
     * @param ordnanceSurveyRef
     */
    public void setOrdnanceSurveyRef(java.lang.Long ordnanceSurveyRef) {
        this.ordnanceSurveyRef = ordnanceSurveyRef;
    }


    /**
     * Gets the deliveryPointStatus value for this FWTProperty.
     * 
     * @return deliveryPointStatus
     */
    public java.lang.String getDeliveryPointStatus() {
        return deliveryPointStatus;
    }


    /**
     * Sets the deliveryPointStatus value for this FWTProperty.
     * 
     * @param deliveryPointStatus
     */
    public void setDeliveryPointStatus(java.lang.String deliveryPointStatus) {
        this.deliveryPointStatus = deliveryPointStatus;
    }


    /**
     * Gets the recordStatusIndicator value for this FWTProperty.
     * 
     * @return recordStatusIndicator
     */
    public java.lang.String getRecordStatusIndicator() {
        return recordStatusIndicator;
    }


    /**
     * Sets the recordStatusIndicator value for this FWTProperty.
     * 
     * @param recordStatusIndicator
     */
    public void setRecordStatusIndicator(java.lang.String recordStatusIndicator) {
        this.recordStatusIndicator = recordStatusIndicator;
    }


    /**
     * Gets the SAOUserDefined value for this FWTProperty.
     * 
     * @return SAOUserDefined
     */
    public java.lang.String[] getSAOUserDefined() {
        return SAOUserDefined;
    }


    /**
     * Sets the SAOUserDefined value for this FWTProperty.
     * 
     * @param SAOUserDefined
     */
    public void setSAOUserDefined(java.lang.String[] SAOUserDefined) {
        this.SAOUserDefined = SAOUserDefined;
    }

    public java.lang.String getSAOUserDefined(int i) {
        return this.SAOUserDefined[i];
    }

    public void setSAOUserDefined(int i, java.lang.String _value) {
        this.SAOUserDefined[i] = _value;
    }


    /**
     * Gets the SAOUserDefinedNum value for this FWTProperty.
     * 
     * @return SAOUserDefinedNum
     */
    public long[] getSAOUserDefinedNum() {
        return SAOUserDefinedNum;
    }


    /**
     * Sets the SAOUserDefinedNum value for this FWTProperty.
     * 
     * @param SAOUserDefinedNum
     */
    public void setSAOUserDefinedNum(long[] SAOUserDefinedNum) {
        this.SAOUserDefinedNum = SAOUserDefinedNum;
    }

    public long getSAOUserDefinedNum(int i) {
        return this.SAOUserDefinedNum[i];
    }

    public void setSAOUserDefinedNum(int i, long _value) {
        this.SAOUserDefinedNum[i] = _value;
    }


    /**
     * Gets the SAOUserDefinedText value for this FWTProperty.
     * 
     * @return SAOUserDefinedText
     */
    public java.lang.String[] getSAOUserDefinedText() {
        return SAOUserDefinedText;
    }


    /**
     * Sets the SAOUserDefinedText value for this FWTProperty.
     * 
     * @param SAOUserDefinedText
     */
    public void setSAOUserDefinedText(java.lang.String[] SAOUserDefinedText) {
        this.SAOUserDefinedText = SAOUserDefinedText;
    }

    public java.lang.String getSAOUserDefinedText(int i) {
        return this.SAOUserDefinedText[i];
    }

    public void setSAOUserDefinedText(int i, java.lang.String _value) {
        this.SAOUserDefinedText[i] = _value;
    }


    /**
     * Gets the SAOUserDefinedDate value for this FWTProperty.
     * 
     * @return SAOUserDefinedDate
     */
    public java.util.Date[] getSAOUserDefinedDate() {
        return SAOUserDefinedDate;
    }


    /**
     * Sets the SAOUserDefinedDate value for this FWTProperty.
     * 
     * @param SAOUserDefinedDate
     */
    public void setSAOUserDefinedDate(java.util.Date[] SAOUserDefinedDate) {
        this.SAOUserDefinedDate = SAOUserDefinedDate;
    }

    public java.util.Date getSAOUserDefinedDate(int i) {
        return this.SAOUserDefinedDate[i];
    }

    public void setSAOUserDefinedDate(int i, java.util.Date _value) {
        this.SAOUserDefinedDate[i] = _value;
    }


    /**
     * Gets the SAOStartDate value for this FWTProperty.
     * 
     * @return SAOStartDate
     */
    public java.util.Date getSAOStartDate() {
        return SAOStartDate;
    }


    /**
     * Sets the SAOStartDate value for this FWTProperty.
     * 
     * @param SAOStartDate
     */
    public void setSAOStartDate(java.util.Date SAOStartDate) {
        this.SAOStartDate = SAOStartDate;
    }


    /**
     * Gets the SAOEndDate value for this FWTProperty.
     * 
     * @return SAOEndDate
     */
    public java.util.Date getSAOEndDate() {
        return SAOEndDate;
    }


    /**
     * Sets the SAOEndDate value for this FWTProperty.
     * 
     * @param SAOEndDate
     */
    public void setSAOEndDate(java.util.Date SAOEndDate) {
        this.SAOEndDate = SAOEndDate;
    }


    /**
     * Gets the PAOAuditDetails value for this FWTProperty.
     * 
     * @return PAOAuditDetails
     */
    public lagan.api.main.FWTAuditDetails getPAOAuditDetails() {
        return PAOAuditDetails;
    }


    /**
     * Sets the PAOAuditDetails value for this FWTProperty.
     * 
     * @param PAOAuditDetails
     */
    public void setPAOAuditDetails(lagan.api.main.FWTAuditDetails PAOAuditDetails) {
        this.PAOAuditDetails = PAOAuditDetails;
    }


    /**
     * Gets the SAOAuditDetails value for this FWTProperty.
     * 
     * @return SAOAuditDetails
     */
    public lagan.api.main.FWTAuditDetails getSAOAuditDetails() {
        return SAOAuditDetails;
    }


    /**
     * Sets the SAOAuditDetails value for this FWTProperty.
     * 
     * @param SAOAuditDetails
     */
    public void setSAOAuditDetails(lagan.api.main.FWTAuditDetails SAOAuditDetails) {
        this.SAOAuditDetails = SAOAuditDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTProperty)) return false;
        FWTProperty other = (FWTProperty) obj;
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
            ((this.UPRN==null && other.getUPRN()==null) || 
             (this.UPRN!=null &&
              this.UPRN.equals(other.getUPRN()))) &&
            ((this.USRN==null && other.getUSRN()==null) || 
             (this.USRN!=null &&
              this.USRN.equals(other.getUSRN()))) &&
            ((this.PAO==null && other.getPAO()==null) || 
             (this.PAO!=null &&
              this.PAO.equals(other.getPAO()))) &&
            ((this.SAO==null && other.getSAO()==null) || 
             (this.SAO!=null &&
              this.SAO.equals(other.getSAO()))) &&
            ((this.propertyID==null && other.getPropertyID()==null) || 
             (this.propertyID!=null &&
              this.propertyID.equals(other.getPropertyID()))) &&
            ((this.addressNumber==null && other.getAddressNumber()==null) || 
             (this.addressNumber!=null &&
              this.addressNumber.equals(other.getAddressNumber()))) &&
            ((this.addressLine1==null && other.getAddressLine1()==null) || 
             (this.addressLine1!=null &&
              this.addressLine1.equals(other.getAddressLine1()))) &&
            ((this.addressLine2==null && other.getAddressLine2()==null) || 
             (this.addressLine2!=null &&
              this.addressLine2.equals(other.getAddressLine2()))) &&
            ((this.primaryStreetName==null && other.getPrimaryStreetName()==null) || 
             (this.primaryStreetName!=null &&
              this.primaryStreetName.equals(other.getPrimaryStreetName()))) &&
            ((this.locality==null && other.getLocality()==null) || 
             (this.locality!=null &&
              this.locality.equals(other.getLocality()))) &&
            ((this.town==null && other.getTown()==null) || 
             (this.town!=null &&
              this.town.equals(other.getTown()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode()))) &&
            ((this.zipcode==null && other.getZipcode()==null) || 
             (this.zipcode!=null &&
              this.zipcode.equals(other.getZipcode()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.POBox==null && other.getPOBox()==null) || 
             (this.POBox!=null &&
              this.POBox.equals(other.getPOBox()))) &&
            ((this.buildingName==null && other.getBuildingName()==null) || 
             (this.buildingName!=null &&
              this.buildingName.equals(other.getBuildingName()))) &&
            ((this.primaryStreetAltName==null && other.getPrimaryStreetAltName()==null) || 
             (this.primaryStreetAltName!=null &&
              java.util.Arrays.equals(this.primaryStreetAltName, other.getPrimaryStreetAltName()))) &&
            ((this.secondaryStreetName==null && other.getSecondaryStreetName()==null) || 
             (this.secondaryStreetName!=null &&
              this.secondaryStreetName.equals(other.getSecondaryStreetName()))) &&
            ((this.secondaryStreetAltName==null && other.getSecondaryStreetAltName()==null) || 
             (this.secondaryStreetAltName!=null &&
              java.util.Arrays.equals(this.secondaryStreetAltName, other.getSecondaryStreetAltName()))) &&
            ((this.IGGeoCode==null && other.getIGGeoCode()==null) || 
             (this.IGGeoCode!=null &&
              this.IGGeoCode.equals(other.getIGGeoCode()))) &&
            ((this.GPSItmGeoCode==null && other.getGPSItmGeoCode()==null) || 
             (this.GPSItmGeoCode!=null &&
              this.GPSItmGeoCode.equals(other.getGPSItmGeoCode()))) &&
            ((this.GPSUtmGeoCode==null && other.getGPSUtmGeoCode()==null) || 
             (this.GPSUtmGeoCode!=null &&
              this.GPSUtmGeoCode.equals(other.getGPSUtmGeoCode()))) &&
            ((this.localCouncilCode==null && other.getLocalCouncilCode()==null) || 
             (this.localCouncilCode!=null &&
              this.localCouncilCode.equals(other.getLocalCouncilCode()))) &&
            ((this.localCouncilName==null && other.getLocalCouncilName()==null) || 
             (this.localCouncilName!=null &&
              this.localCouncilName.equals(other.getLocalCouncilName()))) &&
            ((this.regionalCouncilCode==null && other.getRegionalCouncilCode()==null) || 
             (this.regionalCouncilCode!=null &&
              this.regionalCouncilCode.equals(other.getRegionalCouncilCode()))) &&
            ((this.regionalCouncilName==null && other.getRegionalCouncilName()==null) || 
             (this.regionalCouncilName!=null &&
              this.regionalCouncilName.equals(other.getRegionalCouncilName()))) &&
            ((this.wardRef==null && other.getWardRef()==null) || 
             (this.wardRef!=null &&
              this.wardRef.equals(other.getWardRef()))) &&
            ((this.wardName==null && other.getWardName()==null) || 
             (this.wardName!=null &&
              this.wardName.equals(other.getWardName()))) &&
            ((this.localityType==null && other.getLocalityType()==null) || 
             (this.localityType!=null &&
              this.localityType.equals(other.getLocalityType()))) &&
            ((this.secondaryLocality==null && other.getSecondaryLocality()==null) || 
             (this.secondaryLocality!=null &&
              this.secondaryLocality.equals(other.getSecondaryLocality()))) &&
            ((this.townlandRef==null && other.getTownlandRef()==null) || 
             (this.townlandRef!=null &&
              this.townlandRef.equals(other.getTownlandRef()))) &&
            ((this.townlandName==null && other.getTownlandName()==null) || 
             (this.townlandName!=null &&
              this.townlandName.equals(other.getTownlandName()))) &&
            ((this.postTownRef==null && other.getPostTownRef()==null) || 
             (this.postTownRef!=null &&
              this.postTownRef.equals(other.getPostTownRef()))) &&
            ((this.cityRef==null && other.getCityRef()==null) || 
             (this.cityRef!=null &&
              this.cityRef.equals(other.getCityRef()))) &&
            ((this.countyRef==null && other.getCountyRef()==null) || 
             (this.countyRef!=null &&
              this.countyRef.equals(other.getCountyRef()))) &&
            ((this.countryRef==null && other.getCountryRef()==null) || 
             (this.countryRef!=null &&
              this.countryRef.equals(other.getCountryRef()))) &&
            ((this.buildingUse==null && other.getBuildingUse()==null) || 
             (this.buildingUse!=null &&
              this.buildingUse.equals(other.getBuildingUse()))) &&
            ((this.buildingStatus==null && other.getBuildingStatus()==null) || 
             (this.buildingStatus!=null &&
              this.buildingStatus.equals(other.getBuildingStatus()))) &&
            ((this.PAOUserDefined==null && other.getPAOUserDefined()==null) || 
             (this.PAOUserDefined!=null &&
              java.util.Arrays.equals(this.PAOUserDefined, other.getPAOUserDefined()))) &&
            ((this.PAOUserDefinedNum==null && other.getPAOUserDefinedNum()==null) || 
             (this.PAOUserDefinedNum!=null &&
              java.util.Arrays.equals(this.PAOUserDefinedNum, other.getPAOUserDefinedNum()))) &&
            ((this.PAOUserDefinedText==null && other.getPAOUserDefinedText()==null) || 
             (this.PAOUserDefinedText!=null &&
              java.util.Arrays.equals(this.PAOUserDefinedText, other.getPAOUserDefinedText()))) &&
            ((this.PAOUserDefinedDate==null && other.getPAOUserDefinedDate()==null) || 
             (this.PAOUserDefinedDate!=null &&
              java.util.Arrays.equals(this.PAOUserDefinedDate, other.getPAOUserDefinedDate()))) &&
            ((this.PAOStartDate==null && other.getPAOStartDate()==null) || 
             (this.PAOStartDate!=null &&
              this.PAOStartDate.equals(other.getPAOStartDate()))) &&
            ((this.PAOEndDate==null && other.getPAOEndDate()==null) || 
             (this.PAOEndDate!=null &&
              this.PAOEndDate.equals(other.getPAOEndDate()))) &&
            ((this.subBuildingName==null && other.getSubBuildingName()==null) || 
             (this.subBuildingName!=null &&
              this.subBuildingName.equals(other.getSubBuildingName()))) &&
            ((this.organisationName==null && other.getOrganisationName()==null) || 
             (this.organisationName!=null &&
              this.organisationName.equals(other.getOrganisationName()))) &&
            ((this.businessAlias==null && other.getBusinessAlias()==null) || 
             (this.businessAlias!=null &&
              this.businessAlias.equals(other.getBusinessAlias()))) &&
            ((this.departmentName==null && other.getDepartmentName()==null) || 
             (this.departmentName!=null &&
              this.departmentName.equals(other.getDepartmentName()))) &&
            ((this.largeUserPostCode==null && other.getLargeUserPostCode()==null) || 
             (this.largeUserPostCode!=null &&
              this.largeUserPostCode.equals(other.getLargeUserPostCode()))) &&
            ((this.subBuildingStatus==null && other.getSubBuildingStatus()==null) || 
             (this.subBuildingStatus!=null &&
              this.subBuildingStatus.equals(other.getSubBuildingStatus()))) &&
            ((this.businessUse==null && other.getBusinessUse()==null) || 
             (this.businessUse!=null &&
              this.businessUse.equals(other.getBusinessUse()))) &&
            ((this.RMDeliveryPointSuffix==null && other.getRMDeliveryPointSuffix()==null) || 
             (this.RMDeliveryPointSuffix!=null &&
              this.RMDeliveryPointSuffix.equals(other.getRMDeliveryPointSuffix()))) &&
            ((this.RMAddressKey==null && other.getRMAddressKey()==null) || 
             (this.RMAddressKey!=null &&
              this.RMAddressKey.equals(other.getRMAddressKey()))) &&
            ((this.VLARef==null && other.getVLARef()==null) || 
             (this.VLARef!=null &&
              this.VLARef.equals(other.getVLARef()))) &&
            ((this.ordnanceSurveyRef==null && other.getOrdnanceSurveyRef()==null) || 
             (this.ordnanceSurveyRef!=null &&
              this.ordnanceSurveyRef.equals(other.getOrdnanceSurveyRef()))) &&
            ((this.deliveryPointStatus==null && other.getDeliveryPointStatus()==null) || 
             (this.deliveryPointStatus!=null &&
              this.deliveryPointStatus.equals(other.getDeliveryPointStatus()))) &&
            ((this.recordStatusIndicator==null && other.getRecordStatusIndicator()==null) || 
             (this.recordStatusIndicator!=null &&
              this.recordStatusIndicator.equals(other.getRecordStatusIndicator()))) &&
            ((this.SAOUserDefined==null && other.getSAOUserDefined()==null) || 
             (this.SAOUserDefined!=null &&
              java.util.Arrays.equals(this.SAOUserDefined, other.getSAOUserDefined()))) &&
            ((this.SAOUserDefinedNum==null && other.getSAOUserDefinedNum()==null) || 
             (this.SAOUserDefinedNum!=null &&
              java.util.Arrays.equals(this.SAOUserDefinedNum, other.getSAOUserDefinedNum()))) &&
            ((this.SAOUserDefinedText==null && other.getSAOUserDefinedText()==null) || 
             (this.SAOUserDefinedText!=null &&
              java.util.Arrays.equals(this.SAOUserDefinedText, other.getSAOUserDefinedText()))) &&
            ((this.SAOUserDefinedDate==null && other.getSAOUserDefinedDate()==null) || 
             (this.SAOUserDefinedDate!=null &&
              java.util.Arrays.equals(this.SAOUserDefinedDate, other.getSAOUserDefinedDate()))) &&
            ((this.SAOStartDate==null && other.getSAOStartDate()==null) || 
             (this.SAOStartDate!=null &&
              this.SAOStartDate.equals(other.getSAOStartDate()))) &&
            ((this.SAOEndDate==null && other.getSAOEndDate()==null) || 
             (this.SAOEndDate!=null &&
              this.SAOEndDate.equals(other.getSAOEndDate()))) &&
            ((this.PAOAuditDetails==null && other.getPAOAuditDetails()==null) || 
             (this.PAOAuditDetails!=null &&
              this.PAOAuditDetails.equals(other.getPAOAuditDetails()))) &&
            ((this.SAOAuditDetails==null && other.getSAOAuditDetails()==null) || 
             (this.SAOAuditDetails!=null &&
              this.SAOAuditDetails.equals(other.getSAOAuditDetails())));
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
        if (getUPRN() != null) {
            _hashCode += getUPRN().hashCode();
        }
        if (getUSRN() != null) {
            _hashCode += getUSRN().hashCode();
        }
        if (getPAO() != null) {
            _hashCode += getPAO().hashCode();
        }
        if (getSAO() != null) {
            _hashCode += getSAO().hashCode();
        }
        if (getPropertyID() != null) {
            _hashCode += getPropertyID().hashCode();
        }
        if (getAddressNumber() != null) {
            _hashCode += getAddressNumber().hashCode();
        }
        if (getAddressLine1() != null) {
            _hashCode += getAddressLine1().hashCode();
        }
        if (getAddressLine2() != null) {
            _hashCode += getAddressLine2().hashCode();
        }
        if (getPrimaryStreetName() != null) {
            _hashCode += getPrimaryStreetName().hashCode();
        }
        if (getLocality() != null) {
            _hashCode += getLocality().hashCode();
        }
        if (getTown() != null) {
            _hashCode += getTown().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
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
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getPOBox() != null) {
            _hashCode += getPOBox().hashCode();
        }
        if (getBuildingName() != null) {
            _hashCode += getBuildingName().hashCode();
        }
        if (getPrimaryStreetAltName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrimaryStreetAltName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrimaryStreetAltName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecondaryStreetName() != null) {
            _hashCode += getSecondaryStreetName().hashCode();
        }
        if (getSecondaryStreetAltName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondaryStreetAltName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondaryStreetAltName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIGGeoCode() != null) {
            _hashCode += getIGGeoCode().hashCode();
        }
        if (getGPSItmGeoCode() != null) {
            _hashCode += getGPSItmGeoCode().hashCode();
        }
        if (getGPSUtmGeoCode() != null) {
            _hashCode += getGPSUtmGeoCode().hashCode();
        }
        if (getLocalCouncilCode() != null) {
            _hashCode += getLocalCouncilCode().hashCode();
        }
        if (getLocalCouncilName() != null) {
            _hashCode += getLocalCouncilName().hashCode();
        }
        if (getRegionalCouncilCode() != null) {
            _hashCode += getRegionalCouncilCode().hashCode();
        }
        if (getRegionalCouncilName() != null) {
            _hashCode += getRegionalCouncilName().hashCode();
        }
        if (getWardRef() != null) {
            _hashCode += getWardRef().hashCode();
        }
        if (getWardName() != null) {
            _hashCode += getWardName().hashCode();
        }
        if (getLocalityType() != null) {
            _hashCode += getLocalityType().hashCode();
        }
        if (getSecondaryLocality() != null) {
            _hashCode += getSecondaryLocality().hashCode();
        }
        if (getTownlandRef() != null) {
            _hashCode += getTownlandRef().hashCode();
        }
        if (getTownlandName() != null) {
            _hashCode += getTownlandName().hashCode();
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
        if (getCountryRef() != null) {
            _hashCode += getCountryRef().hashCode();
        }
        if (getBuildingUse() != null) {
            _hashCode += getBuildingUse().hashCode();
        }
        if (getBuildingStatus() != null) {
            _hashCode += getBuildingStatus().hashCode();
        }
        if (getPAOUserDefined() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPAOUserDefined());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPAOUserDefined(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPAOUserDefinedNum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPAOUserDefinedNum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPAOUserDefinedNum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPAOUserDefinedText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPAOUserDefinedText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPAOUserDefinedText(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPAOUserDefinedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPAOUserDefinedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPAOUserDefinedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPAOStartDate() != null) {
            _hashCode += getPAOStartDate().hashCode();
        }
        if (getPAOEndDate() != null) {
            _hashCode += getPAOEndDate().hashCode();
        }
        if (getSubBuildingName() != null) {
            _hashCode += getSubBuildingName().hashCode();
        }
        if (getOrganisationName() != null) {
            _hashCode += getOrganisationName().hashCode();
        }
        if (getBusinessAlias() != null) {
            _hashCode += getBusinessAlias().hashCode();
        }
        if (getDepartmentName() != null) {
            _hashCode += getDepartmentName().hashCode();
        }
        if (getLargeUserPostCode() != null) {
            _hashCode += getLargeUserPostCode().hashCode();
        }
        if (getSubBuildingStatus() != null) {
            _hashCode += getSubBuildingStatus().hashCode();
        }
        if (getBusinessUse() != null) {
            _hashCode += getBusinessUse().hashCode();
        }
        if (getRMDeliveryPointSuffix() != null) {
            _hashCode += getRMDeliveryPointSuffix().hashCode();
        }
        if (getRMAddressKey() != null) {
            _hashCode += getRMAddressKey().hashCode();
        }
        if (getVLARef() != null) {
            _hashCode += getVLARef().hashCode();
        }
        if (getOrdnanceSurveyRef() != null) {
            _hashCode += getOrdnanceSurveyRef().hashCode();
        }
        if (getDeliveryPointStatus() != null) {
            _hashCode += getDeliveryPointStatus().hashCode();
        }
        if (getRecordStatusIndicator() != null) {
            _hashCode += getRecordStatusIndicator().hashCode();
        }
        if (getSAOUserDefined() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSAOUserDefined());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSAOUserDefined(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSAOUserDefinedNum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSAOUserDefinedNum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSAOUserDefinedNum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSAOUserDefinedText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSAOUserDefinedText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSAOUserDefinedText(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSAOUserDefinedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSAOUserDefinedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSAOUserDefinedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSAOStartDate() != null) {
            _hashCode += getSAOStartDate().hashCode();
        }
        if (getSAOEndDate() != null) {
            _hashCode += getSAOEndDate().hashCode();
        }
        if (getPAOAuditDetails() != null) {
            _hashCode += getPAOAuditDetails().hashCode();
        }
        if (getSAOAuditDetails() != null) {
            _hashCode += getSAOAuditDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTProperty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTProperty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("briefDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BriefDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectBriefDetails"));
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
        elemField.setFieldName("USRN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "USRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAO"));
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
        elemField.setFieldName("addressNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressLine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryStreetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrimaryStreetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Locality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("town");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Town"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Postcode"));
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
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("", "County"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Country"));
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
        elemField.setFieldName("buildingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BuildingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryStreetAltName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrimaryStreetAltName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTProperty>PrimaryStreetAltName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryStreetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SecondaryStreetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryStreetAltName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SecondaryStreetAltName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTProperty>SecondaryStreetAltName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGGeoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IGGeoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GPSItmGeoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GPSItmGeoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GPSUtmGeoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GPSUtmGeoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("regionalCouncilCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RegionalCouncilCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalCouncilName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RegionalCouncilName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wardRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WardRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wardName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WardName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LocalityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryLocality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SecondaryLocality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("townlandRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TownlandRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("townlandName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TownlandName"));
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
        elemField.setFieldName("countryRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CountryRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildingUse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BuildingUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BuildingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOUserDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTProperty>PAOUserDefined"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOUserDefinedNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefinedNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOUserDefinedText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefinedText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTProperty>PAOUserDefinedText"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOUserDefinedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefinedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subBuildingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubBuildingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organisationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrganisationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BusinessAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DepartmentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largeUserPostCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LargeUserPostCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subBuildingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubBuildingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BusinessUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMDeliveryPointSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RMDeliveryPointSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMAddressKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RMAddressKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VLARef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VLARef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordnanceSurveyRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrdnanceSurveyRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryPointStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeliveryPointStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordStatusIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RecordStatusIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTProperty>SAOUserDefined"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefinedNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefinedNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefinedText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefinedText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTProperty>SAOUserDefinedText"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefinedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefinedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOAuditDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOAuditDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTAuditDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOAuditDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOAuditDetails"));
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
