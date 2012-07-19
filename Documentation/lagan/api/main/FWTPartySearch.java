/**
 * FWTPartySearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;


/**
 * The following items are not used for
 *                             Organisation search: Forename, Forename2,
 * NationalInsuranceNumber,
 *                             SocialSecurityNumber, DateOfBirth
 */
public class FWTPartySearch  implements java.io.Serializable {
    /* individual, organisation, party */
    private java.lang.String searchType;

    private java.lang.String searchMatch;

    /* Surname or organisation name */
    private java.lang.String name;

    private java.lang.String forename;

    private java.lang.String forename2;

    private java.util.Calendar dateOfBirth;

    /* Not applicable for US individuals */
    private java.lang.String nationalInsuranceNumber;

    /* For US individuals only */
    private java.lang.String socialSecurityNumber;

    /* Not applicable for US addresses */
    private java.lang.String postcode;

    private java.lang.String addressNumber;

    private java.lang.String streetName;

    /* For US addresses only */
    private java.lang.String city;

    /* For US addresses only */
    private java.lang.String stateCode;

    /* For US addresses only */
    private java.lang.String zipcode;

    private java.lang.String phoneNumber;

    private java.lang.String emailAddress;

    private java.lang.String[] genericValue;

    public FWTPartySearch() {
    }

    public FWTPartySearch(
           java.lang.String searchType,
           java.lang.String searchMatch,
           java.lang.String name,
           java.lang.String forename,
           java.lang.String forename2,
           java.util.Calendar dateOfBirth,
           java.lang.String nationalInsuranceNumber,
           java.lang.String socialSecurityNumber,
           java.lang.String postcode,
           java.lang.String addressNumber,
           java.lang.String streetName,
           java.lang.String city,
           java.lang.String stateCode,
           java.lang.String zipcode,
           java.lang.String phoneNumber,
           java.lang.String emailAddress,
           java.lang.String[] genericValue) {
           this.searchType = searchType;
           this.searchMatch = searchMatch;
           this.name = name;
           this.forename = forename;
           this.forename2 = forename2;
           this.dateOfBirth = dateOfBirth;
           this.nationalInsuranceNumber = nationalInsuranceNumber;
           this.socialSecurityNumber = socialSecurityNumber;
           this.postcode = postcode;
           this.addressNumber = addressNumber;
           this.streetName = streetName;
           this.city = city;
           this.stateCode = stateCode;
           this.zipcode = zipcode;
           this.phoneNumber = phoneNumber;
           this.emailAddress = emailAddress;
           this.genericValue = genericValue;
    }


    /**
     * Gets the searchType value for this FWTPartySearch.
     * 
     * @return searchType   * individual, organisation, party
     */
    public java.lang.String getSearchType() {
        return searchType;
    }


    /**
     * Sets the searchType value for this FWTPartySearch.
     * 
     * @param searchType   * individual, organisation, party
     */
    public void setSearchType(java.lang.String searchType) {
        this.searchType = searchType;
    }


    /**
     * Gets the searchMatch value for this FWTPartySearch.
     * 
     * @return searchMatch
     */
    public java.lang.String getSearchMatch() {
        return searchMatch;
    }


    /**
     * Sets the searchMatch value for this FWTPartySearch.
     * 
     * @param searchMatch
     */
    public void setSearchMatch(java.lang.String searchMatch) {
        this.searchMatch = searchMatch;
    }


    /**
     * Gets the name value for this FWTPartySearch.
     * 
     * @return name   * Surname or organisation name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this FWTPartySearch.
     * 
     * @param name   * Surname or organisation name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the forename value for this FWTPartySearch.
     * 
     * @return forename
     */
    public java.lang.String getForename() {
        return forename;
    }


    /**
     * Sets the forename value for this FWTPartySearch.
     * 
     * @param forename
     */
    public void setForename(java.lang.String forename) {
        this.forename = forename;
    }


    /**
     * Gets the forename2 value for this FWTPartySearch.
     * 
     * @return forename2
     */
    public java.lang.String getForename2() {
        return forename2;
    }


    /**
     * Sets the forename2 value for this FWTPartySearch.
     * 
     * @param forename2
     */
    public void setForename2(java.lang.String forename2) {
        this.forename2 = forename2;
    }


    /**
     * Gets the dateOfBirth value for this FWTPartySearch.
     * 
     * @return dateOfBirth
     */
    public java.util.Calendar getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this FWTPartySearch.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the nationalInsuranceNumber value for this FWTPartySearch.
     * 
     * @return nationalInsuranceNumber   * Not applicable for US individuals
     */
    public java.lang.String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }


    /**
     * Sets the nationalInsuranceNumber value for this FWTPartySearch.
     * 
     * @param nationalInsuranceNumber   * Not applicable for US individuals
     */
    public void setNationalInsuranceNumber(java.lang.String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }


    /**
     * Gets the socialSecurityNumber value for this FWTPartySearch.
     * 
     * @return socialSecurityNumber   * For US individuals only
     */
    public java.lang.String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    /**
     * Sets the socialSecurityNumber value for this FWTPartySearch.
     * 
     * @param socialSecurityNumber   * For US individuals only
     */
    public void setSocialSecurityNumber(java.lang.String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    /**
     * Gets the postcode value for this FWTPartySearch.
     * 
     * @return postcode   * Not applicable for US addresses
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this FWTPartySearch.
     * 
     * @param postcode   * Not applicable for US addresses
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the addressNumber value for this FWTPartySearch.
     * 
     * @return addressNumber
     */
    public java.lang.String getAddressNumber() {
        return addressNumber;
    }


    /**
     * Sets the addressNumber value for this FWTPartySearch.
     * 
     * @param addressNumber
     */
    public void setAddressNumber(java.lang.String addressNumber) {
        this.addressNumber = addressNumber;
    }


    /**
     * Gets the streetName value for this FWTPartySearch.
     * 
     * @return streetName
     */
    public java.lang.String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this FWTPartySearch.
     * 
     * @param streetName
     */
    public void setStreetName(java.lang.String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the city value for this FWTPartySearch.
     * 
     * @return city   * For US addresses only
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this FWTPartySearch.
     * 
     * @param city   * For US addresses only
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the stateCode value for this FWTPartySearch.
     * 
     * @return stateCode   * For US addresses only
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this FWTPartySearch.
     * 
     * @param stateCode   * For US addresses only
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }


    /**
     * Gets the zipcode value for this FWTPartySearch.
     * 
     * @return zipcode   * For US addresses only
     */
    public java.lang.String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this FWTPartySearch.
     * 
     * @param zipcode   * For US addresses only
     */
    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the phoneNumber value for this FWTPartySearch.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this FWTPartySearch.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the emailAddress value for this FWTPartySearch.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this FWTPartySearch.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the genericValue value for this FWTPartySearch.
     * 
     * @return genericValue
     */
    public java.lang.String[] getGenericValue() {
        return genericValue;
    }


    /**
     * Sets the genericValue value for this FWTPartySearch.
     * 
     * @param genericValue
     */
    public void setGenericValue(java.lang.String[] genericValue) {
        this.genericValue = genericValue;
    }

    public java.lang.String getGenericValue(int i) {
        return this.genericValue[i];
    }

    public void setGenericValue(int i, java.lang.String _value) {
        this.genericValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTPartySearch)) return false;
        FWTPartySearch other = (FWTPartySearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchType==null && other.getSearchType()==null) || 
             (this.searchType!=null &&
              this.searchType.equals(other.getSearchType()))) &&
            ((this.searchMatch==null && other.getSearchMatch()==null) || 
             (this.searchMatch!=null &&
              this.searchMatch.equals(other.getSearchMatch()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.forename==null && other.getForename()==null) || 
             (this.forename!=null &&
              this.forename.equals(other.getForename()))) &&
            ((this.forename2==null && other.getForename2()==null) || 
             (this.forename2!=null &&
              this.forename2.equals(other.getForename2()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.nationalInsuranceNumber==null && other.getNationalInsuranceNumber()==null) || 
             (this.nationalInsuranceNumber!=null &&
              this.nationalInsuranceNumber.equals(other.getNationalInsuranceNumber()))) &&
            ((this.socialSecurityNumber==null && other.getSocialSecurityNumber()==null) || 
             (this.socialSecurityNumber!=null &&
              this.socialSecurityNumber.equals(other.getSocialSecurityNumber()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.addressNumber==null && other.getAddressNumber()==null) || 
             (this.addressNumber!=null &&
              this.addressNumber.equals(other.getAddressNumber()))) &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode()))) &&
            ((this.zipcode==null && other.getZipcode()==null) || 
             (this.zipcode!=null &&
              this.zipcode.equals(other.getZipcode()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.genericValue==null && other.getGenericValue()==null) || 
             (this.genericValue!=null &&
              java.util.Arrays.equals(this.genericValue, other.getGenericValue())));
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
        if (getSearchType() != null) {
            _hashCode += getSearchType().hashCode();
        }
        if (getSearchMatch() != null) {
            _hashCode += getSearchMatch().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getForename() != null) {
            _hashCode += getForename().hashCode();
        }
        if (getForename2() != null) {
            _hashCode += getForename2().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getNationalInsuranceNumber() != null) {
            _hashCode += getNationalInsuranceNumber().hashCode();
        }
        if (getSocialSecurityNumber() != null) {
            _hashCode += getSocialSecurityNumber().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getAddressNumber() != null) {
            _hashCode += getAddressNumber().hashCode();
        }
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
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
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getGenericValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGenericValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGenericValue(), i);
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
        new org.apache.axis.description.TypeDesc(FWTPartySearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTPartySearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SearchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "SearchMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Forename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forename2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Forename2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Postcode"));
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
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StreetName"));
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
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenericValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTPartySearch>GenericValue"));
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
