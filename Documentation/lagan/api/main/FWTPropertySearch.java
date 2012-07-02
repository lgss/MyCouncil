/**
 * FWTPropertySearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTPropertySearch  implements java.io.Serializable {
    private java.lang.String searchMatch;

    private java.lang.String addressNumber;

    /* Not applicable for US addresses */
    private java.lang.String postcode;

    /* Not applicable for US addresses */
    private java.lang.String UPRN;

    private java.lang.String SAO;

    private java.lang.String streetName;

    private java.lang.String locality;

    private java.lang.String PAO;

    /* Not applicable for US addresses -
     *                                     use City */
    private java.lang.String town;

    /* Not applicable for US addresses */
    private java.lang.String USRN;

    /* For US addresses only */
    private java.lang.String propertyID;

    /* For US addresses only */
    private java.lang.String streetName2;

    /* For US addresses only */
    private java.lang.String city;

    /* For US addresses only */
    private java.lang.String stateCode;

    /* For US addresses only */
    private java.lang.String zipcode;

    private java.lang.String buildingName;

    private java.lang.String subBuildingName;

    private java.lang.String PAOUserDefined1;

    private java.lang.String PAOUserDefined2;

    private java.lang.String PAOUserDefined3;

    private java.lang.String PAOUserDefined4;

    private java.lang.String PAOUserDefined5;

    private java.lang.String PAOUserDefined6;

    private java.lang.String PAOUserDefined7;

    private java.lang.String PAOUserDefined8;

    private java.lang.String PAOUserDefined9;

    private java.lang.String PAOUserDefined10;

    private java.lang.String SAOUserDefined1;

    private java.lang.String SAOUserDefined2;

    private java.lang.String SAOUserDefined3;

    private java.lang.String SAOUserDefined4;

    private java.lang.String SAOUserDefined5;

    private java.lang.String SAOUserDefined6;

    private java.lang.String SAOUserDefined7;

    private java.lang.String SAOUserDefined8;

    private java.lang.String SAOUserDefined9;

    private java.lang.String SAOUserDefined10;

    public FWTPropertySearch() {
    }

    public FWTPropertySearch(
           java.lang.String searchMatch,
           java.lang.String addressNumber,
           java.lang.String postcode,
           java.lang.String UPRN,
           java.lang.String SAO,
           java.lang.String streetName,
           java.lang.String locality,
           java.lang.String PAO,
           java.lang.String town,
           java.lang.String USRN,
           java.lang.String propertyID,
           java.lang.String streetName2,
           java.lang.String city,
           java.lang.String stateCode,
           java.lang.String zipcode,
           java.lang.String buildingName,
           java.lang.String subBuildingName,
           java.lang.String PAOUserDefined1,
           java.lang.String PAOUserDefined2,
           java.lang.String PAOUserDefined3,
           java.lang.String PAOUserDefined4,
           java.lang.String PAOUserDefined5,
           java.lang.String PAOUserDefined6,
           java.lang.String PAOUserDefined7,
           java.lang.String PAOUserDefined8,
           java.lang.String PAOUserDefined9,
           java.lang.String PAOUserDefined10,
           java.lang.String SAOUserDefined1,
           java.lang.String SAOUserDefined2,
           java.lang.String SAOUserDefined3,
           java.lang.String SAOUserDefined4,
           java.lang.String SAOUserDefined5,
           java.lang.String SAOUserDefined6,
           java.lang.String SAOUserDefined7,
           java.lang.String SAOUserDefined8,
           java.lang.String SAOUserDefined9,
           java.lang.String SAOUserDefined10) {
           this.searchMatch = searchMatch;
           this.addressNumber = addressNumber;
           this.postcode = postcode;
           this.UPRN = UPRN;
           this.SAO = SAO;
           this.streetName = streetName;
           this.locality = locality;
           this.PAO = PAO;
           this.town = town;
           this.USRN = USRN;
           this.propertyID = propertyID;
           this.streetName2 = streetName2;
           this.city = city;
           this.stateCode = stateCode;
           this.zipcode = zipcode;
           this.buildingName = buildingName;
           this.subBuildingName = subBuildingName;
           this.PAOUserDefined1 = PAOUserDefined1;
           this.PAOUserDefined2 = PAOUserDefined2;
           this.PAOUserDefined3 = PAOUserDefined3;
           this.PAOUserDefined4 = PAOUserDefined4;
           this.PAOUserDefined5 = PAOUserDefined5;
           this.PAOUserDefined6 = PAOUserDefined6;
           this.PAOUserDefined7 = PAOUserDefined7;
           this.PAOUserDefined8 = PAOUserDefined8;
           this.PAOUserDefined9 = PAOUserDefined9;
           this.PAOUserDefined10 = PAOUserDefined10;
           this.SAOUserDefined1 = SAOUserDefined1;
           this.SAOUserDefined2 = SAOUserDefined2;
           this.SAOUserDefined3 = SAOUserDefined3;
           this.SAOUserDefined4 = SAOUserDefined4;
           this.SAOUserDefined5 = SAOUserDefined5;
           this.SAOUserDefined6 = SAOUserDefined6;
           this.SAOUserDefined7 = SAOUserDefined7;
           this.SAOUserDefined8 = SAOUserDefined8;
           this.SAOUserDefined9 = SAOUserDefined9;
           this.SAOUserDefined10 = SAOUserDefined10;
    }


    /**
     * Gets the searchMatch value for this FWTPropertySearch.
     * 
     * @return searchMatch
     */
    public java.lang.String getSearchMatch() {
        return searchMatch;
    }


    /**
     * Sets the searchMatch value for this FWTPropertySearch.
     * 
     * @param searchMatch
     */
    public void setSearchMatch(java.lang.String searchMatch) {
        this.searchMatch = searchMatch;
    }


    /**
     * Gets the addressNumber value for this FWTPropertySearch.
     * 
     * @return addressNumber
     */
    public java.lang.String getAddressNumber() {
        return addressNumber;
    }


    /**
     * Sets the addressNumber value for this FWTPropertySearch.
     * 
     * @param addressNumber
     */
    public void setAddressNumber(java.lang.String addressNumber) {
        this.addressNumber = addressNumber;
    }


    /**
     * Gets the postcode value for this FWTPropertySearch.
     * 
     * @return postcode   * Not applicable for US addresses
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this FWTPropertySearch.
     * 
     * @param postcode   * Not applicable for US addresses
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the UPRN value for this FWTPropertySearch.
     * 
     * @return UPRN   * Not applicable for US addresses
     */
    public java.lang.String getUPRN() {
        return UPRN;
    }


    /**
     * Sets the UPRN value for this FWTPropertySearch.
     * 
     * @param UPRN   * Not applicable for US addresses
     */
    public void setUPRN(java.lang.String UPRN) {
        this.UPRN = UPRN;
    }


    /**
     * Gets the SAO value for this FWTPropertySearch.
     * 
     * @return SAO
     */
    public java.lang.String getSAO() {
        return SAO;
    }


    /**
     * Sets the SAO value for this FWTPropertySearch.
     * 
     * @param SAO
     */
    public void setSAO(java.lang.String SAO) {
        this.SAO = SAO;
    }


    /**
     * Gets the streetName value for this FWTPropertySearch.
     * 
     * @return streetName
     */
    public java.lang.String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this FWTPropertySearch.
     * 
     * @param streetName
     */
    public void setStreetName(java.lang.String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the locality value for this FWTPropertySearch.
     * 
     * @return locality
     */
    public java.lang.String getLocality() {
        return locality;
    }


    /**
     * Sets the locality value for this FWTPropertySearch.
     * 
     * @param locality
     */
    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }


    /**
     * Gets the PAO value for this FWTPropertySearch.
     * 
     * @return PAO
     */
    public java.lang.String getPAO() {
        return PAO;
    }


    /**
     * Sets the PAO value for this FWTPropertySearch.
     * 
     * @param PAO
     */
    public void setPAO(java.lang.String PAO) {
        this.PAO = PAO;
    }


    /**
     * Gets the town value for this FWTPropertySearch.
     * 
     * @return town   * Not applicable for US addresses -
     *                                     use City
     */
    public java.lang.String getTown() {
        return town;
    }


    /**
     * Sets the town value for this FWTPropertySearch.
     * 
     * @param town   * Not applicable for US addresses -
     *                                     use City
     */
    public void setTown(java.lang.String town) {
        this.town = town;
    }


    /**
     * Gets the USRN value for this FWTPropertySearch.
     * 
     * @return USRN   * Not applicable for US addresses
     */
    public java.lang.String getUSRN() {
        return USRN;
    }


    /**
     * Sets the USRN value for this FWTPropertySearch.
     * 
     * @param USRN   * Not applicable for US addresses
     */
    public void setUSRN(java.lang.String USRN) {
        this.USRN = USRN;
    }


    /**
     * Gets the propertyID value for this FWTPropertySearch.
     * 
     * @return propertyID   * For US addresses only
     */
    public java.lang.String getPropertyID() {
        return propertyID;
    }


    /**
     * Sets the propertyID value for this FWTPropertySearch.
     * 
     * @param propertyID   * For US addresses only
     */
    public void setPropertyID(java.lang.String propertyID) {
        this.propertyID = propertyID;
    }


    /**
     * Gets the streetName2 value for this FWTPropertySearch.
     * 
     * @return streetName2   * For US addresses only
     */
    public java.lang.String getStreetName2() {
        return streetName2;
    }


    /**
     * Sets the streetName2 value for this FWTPropertySearch.
     * 
     * @param streetName2   * For US addresses only
     */
    public void setStreetName2(java.lang.String streetName2) {
        this.streetName2 = streetName2;
    }


    /**
     * Gets the city value for this FWTPropertySearch.
     * 
     * @return city   * For US addresses only
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this FWTPropertySearch.
     * 
     * @param city   * For US addresses only
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the stateCode value for this FWTPropertySearch.
     * 
     * @return stateCode   * For US addresses only
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this FWTPropertySearch.
     * 
     * @param stateCode   * For US addresses only
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }


    /**
     * Gets the zipcode value for this FWTPropertySearch.
     * 
     * @return zipcode   * For US addresses only
     */
    public java.lang.String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this FWTPropertySearch.
     * 
     * @param zipcode   * For US addresses only
     */
    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the buildingName value for this FWTPropertySearch.
     * 
     * @return buildingName
     */
    public java.lang.String getBuildingName() {
        return buildingName;
    }


    /**
     * Sets the buildingName value for this FWTPropertySearch.
     * 
     * @param buildingName
     */
    public void setBuildingName(java.lang.String buildingName) {
        this.buildingName = buildingName;
    }


    /**
     * Gets the subBuildingName value for this FWTPropertySearch.
     * 
     * @return subBuildingName
     */
    public java.lang.String getSubBuildingName() {
        return subBuildingName;
    }


    /**
     * Sets the subBuildingName value for this FWTPropertySearch.
     * 
     * @param subBuildingName
     */
    public void setSubBuildingName(java.lang.String subBuildingName) {
        this.subBuildingName = subBuildingName;
    }


    /**
     * Gets the PAOUserDefined1 value for this FWTPropertySearch.
     * 
     * @return PAOUserDefined1
     */
    public java.lang.String getPAOUserDefined1() {
        return PAOUserDefined1;
    }


    /**
     * Sets the PAOUserDefined1 value for this FWTPropertySearch.
     * 
     * @param PAOUserDefined1
     */
    public void setPAOUserDefined1(java.lang.String PAOUserDefined1) {
        this.PAOUserDefined1 = PAOUserDefined1;
    }


    /**
     * Gets the PAOUserDefined2 value for this FWTPropertySearch.
     * 
     * @return PAOUserDefined2
     */
    public java.lang.String getPAOUserDefined2() {
        return PAOUserDefined2;
    }


    /**
     * Sets the PAOUserDefined2 value for this FWTPropertySearch.
     * 
     * @param PAOUserDefined2
     */
    public void setPAOUserDefined2(java.lang.String PAOUserDefined2) {
        this.PAOUserDefined2 = PAOUserDefined2;
    }


    /**
     * Gets the PAOUserDefined3 value for this FWTPropertySearch.
     * 
     * @return PAOUserDefined3
     */
    public java.lang.String getPAOUserDefined3() {
        return PAOUserDefined3;
    }


    /**
     * Sets the PAOUserDefined3 value for this FWTPropertySearch.
     * 
     * @param PAOUserDefined3
     */
    public void setPAOUserDefined3(java.lang.String PAOUserDefined3) {
        this.PAOUserDefined3 = PAOUserDefined3;
    }


    /**
     * Gets the PAOUserDefined4 value for this FWTPropertySearch.
     * 
     * @return PAOUserDefined4
     */
    public java.lang.String getPAOUserDefined4() {
        return PAOUserDefined4;
    }


    /**
     * Sets the PAOUserDefined4 value for this FWTPropertySearch.
     * 
     * @param PAOUserDefined4
     */
    public void setPAOUserDefined4(java.lang.String PAOUserDefined4) {
        this.PAOUserDefined4 = PAOUserDefined4;
    }


    /**
     * Gets the PAOUserDefined5 value for this FWTPropertySearch.
     * 
     * @return PAOUserDefined5
     */
    public java.lang.String getPAOUserDefined5() {
        return PAOUserDefined5;
    }


    /**
     * Sets the PAOUserDefined5 value for this FWTPropertySearch.
     * 
     * @param PAOUserDefined5
     */
    public void setPAOUserDefined5(java.lang.String PAOUserDefined5) {
        this.PAOUserDefined5 = PAOUserDefined5;
    }


    /**
     * Gets the PAOUserDefined6 value for this FWTPropertySearch.
     * 
     * @return PAOUserDefined6
     */
    public java.lang.String getPAOUserDefined6() {
        return PAOUserDefined6;
    }


    /**
     * Sets the PAOUserDefined6 value for this FWTPropertySearch.
     * 
     * @param PAOUserDefined6
     */
    public void setPAOUserDefined6(java.lang.String PAOUserDefined6) {
        this.PAOUserDefined6 = PAOUserDefined6;
    }


    /**
     * Gets the PAOUserDefined7 value for this FWTPropertySearch.
     * 
     * @return PAOUserDefined7
     */
    public java.lang.String getPAOUserDefined7() {
        return PAOUserDefined7;
    }


    /**
     * Sets the PAOUserDefined7 value for this FWTPropertySearch.
     * 
     * @param PAOUserDefined7
     */
    public void setPAOUserDefined7(java.lang.String PAOUserDefined7) {
        this.PAOUserDefined7 = PAOUserDefined7;
    }


    /**
     * Gets the PAOUserDefined8 value for this FWTPropertySearch.
     * 
     * @return PAOUserDefined8
     */
    public java.lang.String getPAOUserDefined8() {
        return PAOUserDefined8;
    }


    /**
     * Sets the PAOUserDefined8 value for this FWTPropertySearch.
     * 
     * @param PAOUserDefined8
     */
    public void setPAOUserDefined8(java.lang.String PAOUserDefined8) {
        this.PAOUserDefined8 = PAOUserDefined8;
    }


    /**
     * Gets the PAOUserDefined9 value for this FWTPropertySearch.
     * 
     * @return PAOUserDefined9
     */
    public java.lang.String getPAOUserDefined9() {
        return PAOUserDefined9;
    }


    /**
     * Sets the PAOUserDefined9 value for this FWTPropertySearch.
     * 
     * @param PAOUserDefined9
     */
    public void setPAOUserDefined9(java.lang.String PAOUserDefined9) {
        this.PAOUserDefined9 = PAOUserDefined9;
    }


    /**
     * Gets the PAOUserDefined10 value for this FWTPropertySearch.
     * 
     * @return PAOUserDefined10
     */
    public java.lang.String getPAOUserDefined10() {
        return PAOUserDefined10;
    }


    /**
     * Sets the PAOUserDefined10 value for this FWTPropertySearch.
     * 
     * @param PAOUserDefined10
     */
    public void setPAOUserDefined10(java.lang.String PAOUserDefined10) {
        this.PAOUserDefined10 = PAOUserDefined10;
    }


    /**
     * Gets the SAOUserDefined1 value for this FWTPropertySearch.
     * 
     * @return SAOUserDefined1
     */
    public java.lang.String getSAOUserDefined1() {
        return SAOUserDefined1;
    }


    /**
     * Sets the SAOUserDefined1 value for this FWTPropertySearch.
     * 
     * @param SAOUserDefined1
     */
    public void setSAOUserDefined1(java.lang.String SAOUserDefined1) {
        this.SAOUserDefined1 = SAOUserDefined1;
    }


    /**
     * Gets the SAOUserDefined2 value for this FWTPropertySearch.
     * 
     * @return SAOUserDefined2
     */
    public java.lang.String getSAOUserDefined2() {
        return SAOUserDefined2;
    }


    /**
     * Sets the SAOUserDefined2 value for this FWTPropertySearch.
     * 
     * @param SAOUserDefined2
     */
    public void setSAOUserDefined2(java.lang.String SAOUserDefined2) {
        this.SAOUserDefined2 = SAOUserDefined2;
    }


    /**
     * Gets the SAOUserDefined3 value for this FWTPropertySearch.
     * 
     * @return SAOUserDefined3
     */
    public java.lang.String getSAOUserDefined3() {
        return SAOUserDefined3;
    }


    /**
     * Sets the SAOUserDefined3 value for this FWTPropertySearch.
     * 
     * @param SAOUserDefined3
     */
    public void setSAOUserDefined3(java.lang.String SAOUserDefined3) {
        this.SAOUserDefined3 = SAOUserDefined3;
    }


    /**
     * Gets the SAOUserDefined4 value for this FWTPropertySearch.
     * 
     * @return SAOUserDefined4
     */
    public java.lang.String getSAOUserDefined4() {
        return SAOUserDefined4;
    }


    /**
     * Sets the SAOUserDefined4 value for this FWTPropertySearch.
     * 
     * @param SAOUserDefined4
     */
    public void setSAOUserDefined4(java.lang.String SAOUserDefined4) {
        this.SAOUserDefined4 = SAOUserDefined4;
    }


    /**
     * Gets the SAOUserDefined5 value for this FWTPropertySearch.
     * 
     * @return SAOUserDefined5
     */
    public java.lang.String getSAOUserDefined5() {
        return SAOUserDefined5;
    }


    /**
     * Sets the SAOUserDefined5 value for this FWTPropertySearch.
     * 
     * @param SAOUserDefined5
     */
    public void setSAOUserDefined5(java.lang.String SAOUserDefined5) {
        this.SAOUserDefined5 = SAOUserDefined5;
    }


    /**
     * Gets the SAOUserDefined6 value for this FWTPropertySearch.
     * 
     * @return SAOUserDefined6
     */
    public java.lang.String getSAOUserDefined6() {
        return SAOUserDefined6;
    }


    /**
     * Sets the SAOUserDefined6 value for this FWTPropertySearch.
     * 
     * @param SAOUserDefined6
     */
    public void setSAOUserDefined6(java.lang.String SAOUserDefined6) {
        this.SAOUserDefined6 = SAOUserDefined6;
    }


    /**
     * Gets the SAOUserDefined7 value for this FWTPropertySearch.
     * 
     * @return SAOUserDefined7
     */
    public java.lang.String getSAOUserDefined7() {
        return SAOUserDefined7;
    }


    /**
     * Sets the SAOUserDefined7 value for this FWTPropertySearch.
     * 
     * @param SAOUserDefined7
     */
    public void setSAOUserDefined7(java.lang.String SAOUserDefined7) {
        this.SAOUserDefined7 = SAOUserDefined7;
    }


    /**
     * Gets the SAOUserDefined8 value for this FWTPropertySearch.
     * 
     * @return SAOUserDefined8
     */
    public java.lang.String getSAOUserDefined8() {
        return SAOUserDefined8;
    }


    /**
     * Sets the SAOUserDefined8 value for this FWTPropertySearch.
     * 
     * @param SAOUserDefined8
     */
    public void setSAOUserDefined8(java.lang.String SAOUserDefined8) {
        this.SAOUserDefined8 = SAOUserDefined8;
    }


    /**
     * Gets the SAOUserDefined9 value for this FWTPropertySearch.
     * 
     * @return SAOUserDefined9
     */
    public java.lang.String getSAOUserDefined9() {
        return SAOUserDefined9;
    }


    /**
     * Sets the SAOUserDefined9 value for this FWTPropertySearch.
     * 
     * @param SAOUserDefined9
     */
    public void setSAOUserDefined9(java.lang.String SAOUserDefined9) {
        this.SAOUserDefined9 = SAOUserDefined9;
    }


    /**
     * Gets the SAOUserDefined10 value for this FWTPropertySearch.
     * 
     * @return SAOUserDefined10
     */
    public java.lang.String getSAOUserDefined10() {
        return SAOUserDefined10;
    }


    /**
     * Sets the SAOUserDefined10 value for this FWTPropertySearch.
     * 
     * @param SAOUserDefined10
     */
    public void setSAOUserDefined10(java.lang.String SAOUserDefined10) {
        this.SAOUserDefined10 = SAOUserDefined10;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTPropertySearch)) return false;
        FWTPropertySearch other = (FWTPropertySearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchMatch==null && other.getSearchMatch()==null) || 
             (this.searchMatch!=null &&
              this.searchMatch.equals(other.getSearchMatch()))) &&
            ((this.addressNumber==null && other.getAddressNumber()==null) || 
             (this.addressNumber!=null &&
              this.addressNumber.equals(other.getAddressNumber()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.UPRN==null && other.getUPRN()==null) || 
             (this.UPRN!=null &&
              this.UPRN.equals(other.getUPRN()))) &&
            ((this.SAO==null && other.getSAO()==null) || 
             (this.SAO!=null &&
              this.SAO.equals(other.getSAO()))) &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.locality==null && other.getLocality()==null) || 
             (this.locality!=null &&
              this.locality.equals(other.getLocality()))) &&
            ((this.PAO==null && other.getPAO()==null) || 
             (this.PAO!=null &&
              this.PAO.equals(other.getPAO()))) &&
            ((this.town==null && other.getTown()==null) || 
             (this.town!=null &&
              this.town.equals(other.getTown()))) &&
            ((this.USRN==null && other.getUSRN()==null) || 
             (this.USRN!=null &&
              this.USRN.equals(other.getUSRN()))) &&
            ((this.propertyID==null && other.getPropertyID()==null) || 
             (this.propertyID!=null &&
              this.propertyID.equals(other.getPropertyID()))) &&
            ((this.streetName2==null && other.getStreetName2()==null) || 
             (this.streetName2!=null &&
              this.streetName2.equals(other.getStreetName2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode()))) &&
            ((this.zipcode==null && other.getZipcode()==null) || 
             (this.zipcode!=null &&
              this.zipcode.equals(other.getZipcode()))) &&
            ((this.buildingName==null && other.getBuildingName()==null) || 
             (this.buildingName!=null &&
              this.buildingName.equals(other.getBuildingName()))) &&
            ((this.subBuildingName==null && other.getSubBuildingName()==null) || 
             (this.subBuildingName!=null &&
              this.subBuildingName.equals(other.getSubBuildingName()))) &&
            ((this.PAOUserDefined1==null && other.getPAOUserDefined1()==null) || 
             (this.PAOUserDefined1!=null &&
              this.PAOUserDefined1.equals(other.getPAOUserDefined1()))) &&
            ((this.PAOUserDefined2==null && other.getPAOUserDefined2()==null) || 
             (this.PAOUserDefined2!=null &&
              this.PAOUserDefined2.equals(other.getPAOUserDefined2()))) &&
            ((this.PAOUserDefined3==null && other.getPAOUserDefined3()==null) || 
             (this.PAOUserDefined3!=null &&
              this.PAOUserDefined3.equals(other.getPAOUserDefined3()))) &&
            ((this.PAOUserDefined4==null && other.getPAOUserDefined4()==null) || 
             (this.PAOUserDefined4!=null &&
              this.PAOUserDefined4.equals(other.getPAOUserDefined4()))) &&
            ((this.PAOUserDefined5==null && other.getPAOUserDefined5()==null) || 
             (this.PAOUserDefined5!=null &&
              this.PAOUserDefined5.equals(other.getPAOUserDefined5()))) &&
            ((this.PAOUserDefined6==null && other.getPAOUserDefined6()==null) || 
             (this.PAOUserDefined6!=null &&
              this.PAOUserDefined6.equals(other.getPAOUserDefined6()))) &&
            ((this.PAOUserDefined7==null && other.getPAOUserDefined7()==null) || 
             (this.PAOUserDefined7!=null &&
              this.PAOUserDefined7.equals(other.getPAOUserDefined7()))) &&
            ((this.PAOUserDefined8==null && other.getPAOUserDefined8()==null) || 
             (this.PAOUserDefined8!=null &&
              this.PAOUserDefined8.equals(other.getPAOUserDefined8()))) &&
            ((this.PAOUserDefined9==null && other.getPAOUserDefined9()==null) || 
             (this.PAOUserDefined9!=null &&
              this.PAOUserDefined9.equals(other.getPAOUserDefined9()))) &&
            ((this.PAOUserDefined10==null && other.getPAOUserDefined10()==null) || 
             (this.PAOUserDefined10!=null &&
              this.PAOUserDefined10.equals(other.getPAOUserDefined10()))) &&
            ((this.SAOUserDefined1==null && other.getSAOUserDefined1()==null) || 
             (this.SAOUserDefined1!=null &&
              this.SAOUserDefined1.equals(other.getSAOUserDefined1()))) &&
            ((this.SAOUserDefined2==null && other.getSAOUserDefined2()==null) || 
             (this.SAOUserDefined2!=null &&
              this.SAOUserDefined2.equals(other.getSAOUserDefined2()))) &&
            ((this.SAOUserDefined3==null && other.getSAOUserDefined3()==null) || 
             (this.SAOUserDefined3!=null &&
              this.SAOUserDefined3.equals(other.getSAOUserDefined3()))) &&
            ((this.SAOUserDefined4==null && other.getSAOUserDefined4()==null) || 
             (this.SAOUserDefined4!=null &&
              this.SAOUserDefined4.equals(other.getSAOUserDefined4()))) &&
            ((this.SAOUserDefined5==null && other.getSAOUserDefined5()==null) || 
             (this.SAOUserDefined5!=null &&
              this.SAOUserDefined5.equals(other.getSAOUserDefined5()))) &&
            ((this.SAOUserDefined6==null && other.getSAOUserDefined6()==null) || 
             (this.SAOUserDefined6!=null &&
              this.SAOUserDefined6.equals(other.getSAOUserDefined6()))) &&
            ((this.SAOUserDefined7==null && other.getSAOUserDefined7()==null) || 
             (this.SAOUserDefined7!=null &&
              this.SAOUserDefined7.equals(other.getSAOUserDefined7()))) &&
            ((this.SAOUserDefined8==null && other.getSAOUserDefined8()==null) || 
             (this.SAOUserDefined8!=null &&
              this.SAOUserDefined8.equals(other.getSAOUserDefined8()))) &&
            ((this.SAOUserDefined9==null && other.getSAOUserDefined9()==null) || 
             (this.SAOUserDefined9!=null &&
              this.SAOUserDefined9.equals(other.getSAOUserDefined9()))) &&
            ((this.SAOUserDefined10==null && other.getSAOUserDefined10()==null) || 
             (this.SAOUserDefined10!=null &&
              this.SAOUserDefined10.equals(other.getSAOUserDefined10())));
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
        if (getSearchMatch() != null) {
            _hashCode += getSearchMatch().hashCode();
        }
        if (getAddressNumber() != null) {
            _hashCode += getAddressNumber().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getUPRN() != null) {
            _hashCode += getUPRN().hashCode();
        }
        if (getSAO() != null) {
            _hashCode += getSAO().hashCode();
        }
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        if (getLocality() != null) {
            _hashCode += getLocality().hashCode();
        }
        if (getPAO() != null) {
            _hashCode += getPAO().hashCode();
        }
        if (getTown() != null) {
            _hashCode += getTown().hashCode();
        }
        if (getUSRN() != null) {
            _hashCode += getUSRN().hashCode();
        }
        if (getPropertyID() != null) {
            _hashCode += getPropertyID().hashCode();
        }
        if (getStreetName2() != null) {
            _hashCode += getStreetName2().hashCode();
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
        if (getBuildingName() != null) {
            _hashCode += getBuildingName().hashCode();
        }
        if (getSubBuildingName() != null) {
            _hashCode += getSubBuildingName().hashCode();
        }
        if (getPAOUserDefined1() != null) {
            _hashCode += getPAOUserDefined1().hashCode();
        }
        if (getPAOUserDefined2() != null) {
            _hashCode += getPAOUserDefined2().hashCode();
        }
        if (getPAOUserDefined3() != null) {
            _hashCode += getPAOUserDefined3().hashCode();
        }
        if (getPAOUserDefined4() != null) {
            _hashCode += getPAOUserDefined4().hashCode();
        }
        if (getPAOUserDefined5() != null) {
            _hashCode += getPAOUserDefined5().hashCode();
        }
        if (getPAOUserDefined6() != null) {
            _hashCode += getPAOUserDefined6().hashCode();
        }
        if (getPAOUserDefined7() != null) {
            _hashCode += getPAOUserDefined7().hashCode();
        }
        if (getPAOUserDefined8() != null) {
            _hashCode += getPAOUserDefined8().hashCode();
        }
        if (getPAOUserDefined9() != null) {
            _hashCode += getPAOUserDefined9().hashCode();
        }
        if (getPAOUserDefined10() != null) {
            _hashCode += getPAOUserDefined10().hashCode();
        }
        if (getSAOUserDefined1() != null) {
            _hashCode += getSAOUserDefined1().hashCode();
        }
        if (getSAOUserDefined2() != null) {
            _hashCode += getSAOUserDefined2().hashCode();
        }
        if (getSAOUserDefined3() != null) {
            _hashCode += getSAOUserDefined3().hashCode();
        }
        if (getSAOUserDefined4() != null) {
            _hashCode += getSAOUserDefined4().hashCode();
        }
        if (getSAOUserDefined5() != null) {
            _hashCode += getSAOUserDefined5().hashCode();
        }
        if (getSAOUserDefined6() != null) {
            _hashCode += getSAOUserDefined6().hashCode();
        }
        if (getSAOUserDefined7() != null) {
            _hashCode += getSAOUserDefined7().hashCode();
        }
        if (getSAOUserDefined8() != null) {
            _hashCode += getSAOUserDefined8().hashCode();
        }
        if (getSAOUserDefined9() != null) {
            _hashCode += getSAOUserDefined9().hashCode();
        }
        if (getSAOUserDefined10() != null) {
            _hashCode += getSAOUserDefined10().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTPropertySearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTPropertySearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "SearchMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("SAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StreetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("PAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAO"));
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
        elemField.setFieldName("USRN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "USRN"));
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
        elemField.setFieldName("streetName2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StreetName2"));
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
        elemField.setFieldName("buildingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BuildingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("PAOUserDefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOUserDefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefined2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOUserDefined3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefined3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOUserDefined4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefined4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOUserDefined5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefined5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOUserDefined6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefined6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOUserDefined7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefined7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOUserDefined8");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefined8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOUserDefined9");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefined9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAOUserDefined10");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAOUserDefined10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefined2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefined3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefined3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefined4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefined4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefined5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefined5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefined6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefined6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefined7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefined7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefined8");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefined8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefined9");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefined9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAOUserDefined10");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SAOUserDefined10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
