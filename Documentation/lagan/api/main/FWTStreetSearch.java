/**
 * FWTStreetSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTStreetSearch  implements java.io.Serializable {
    private java.lang.String searchMatch;

    private java.lang.String streetName;

    private java.lang.String locality;

    /* Not applicable for US addresses -
     *                                     use City */
    private java.lang.String town;

    /* Not applicable for US addresses */
    private java.lang.String USRN;

    /* For US addresses only */
    private java.lang.String city;

    /* For US addresses only */
    private java.lang.String stateCode;

    private java.lang.String userDefined1;

    private java.lang.String userDefined2;

    private java.lang.String userDefined3;

    private java.lang.String userDefined4;

    private java.lang.String userDefined5;

    private java.lang.String userDefined6;

    private java.lang.String userDefined7;

    private java.lang.String userDefined8;

    private java.lang.String userDefined9;

    private java.lang.String userDefined10;

    public FWTStreetSearch() {
    }

    public FWTStreetSearch(
           java.lang.String searchMatch,
           java.lang.String streetName,
           java.lang.String locality,
           java.lang.String town,
           java.lang.String USRN,
           java.lang.String city,
           java.lang.String stateCode,
           java.lang.String userDefined1,
           java.lang.String userDefined2,
           java.lang.String userDefined3,
           java.lang.String userDefined4,
           java.lang.String userDefined5,
           java.lang.String userDefined6,
           java.lang.String userDefined7,
           java.lang.String userDefined8,
           java.lang.String userDefined9,
           java.lang.String userDefined10) {
           this.searchMatch = searchMatch;
           this.streetName = streetName;
           this.locality = locality;
           this.town = town;
           this.USRN = USRN;
           this.city = city;
           this.stateCode = stateCode;
           this.userDefined1 = userDefined1;
           this.userDefined2 = userDefined2;
           this.userDefined3 = userDefined3;
           this.userDefined4 = userDefined4;
           this.userDefined5 = userDefined5;
           this.userDefined6 = userDefined6;
           this.userDefined7 = userDefined7;
           this.userDefined8 = userDefined8;
           this.userDefined9 = userDefined9;
           this.userDefined10 = userDefined10;
    }


    /**
     * Gets the searchMatch value for this FWTStreetSearch.
     * 
     * @return searchMatch
     */
    public java.lang.String getSearchMatch() {
        return searchMatch;
    }


    /**
     * Sets the searchMatch value for this FWTStreetSearch.
     * 
     * @param searchMatch
     */
    public void setSearchMatch(java.lang.String searchMatch) {
        this.searchMatch = searchMatch;
    }


    /**
     * Gets the streetName value for this FWTStreetSearch.
     * 
     * @return streetName
     */
    public java.lang.String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this FWTStreetSearch.
     * 
     * @param streetName
     */
    public void setStreetName(java.lang.String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the locality value for this FWTStreetSearch.
     * 
     * @return locality
     */
    public java.lang.String getLocality() {
        return locality;
    }


    /**
     * Sets the locality value for this FWTStreetSearch.
     * 
     * @param locality
     */
    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }


    /**
     * Gets the town value for this FWTStreetSearch.
     * 
     * @return town   * Not applicable for US addresses -
     *                                     use City
     */
    public java.lang.String getTown() {
        return town;
    }


    /**
     * Sets the town value for this FWTStreetSearch.
     * 
     * @param town   * Not applicable for US addresses -
     *                                     use City
     */
    public void setTown(java.lang.String town) {
        this.town = town;
    }


    /**
     * Gets the USRN value for this FWTStreetSearch.
     * 
     * @return USRN   * Not applicable for US addresses
     */
    public java.lang.String getUSRN() {
        return USRN;
    }


    /**
     * Sets the USRN value for this FWTStreetSearch.
     * 
     * @param USRN   * Not applicable for US addresses
     */
    public void setUSRN(java.lang.String USRN) {
        this.USRN = USRN;
    }


    /**
     * Gets the city value for this FWTStreetSearch.
     * 
     * @return city   * For US addresses only
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this FWTStreetSearch.
     * 
     * @param city   * For US addresses only
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the stateCode value for this FWTStreetSearch.
     * 
     * @return stateCode   * For US addresses only
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this FWTStreetSearch.
     * 
     * @param stateCode   * For US addresses only
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }


    /**
     * Gets the userDefined1 value for this FWTStreetSearch.
     * 
     * @return userDefined1
     */
    public java.lang.String getUserDefined1() {
        return userDefined1;
    }


    /**
     * Sets the userDefined1 value for this FWTStreetSearch.
     * 
     * @param userDefined1
     */
    public void setUserDefined1(java.lang.String userDefined1) {
        this.userDefined1 = userDefined1;
    }


    /**
     * Gets the userDefined2 value for this FWTStreetSearch.
     * 
     * @return userDefined2
     */
    public java.lang.String getUserDefined2() {
        return userDefined2;
    }


    /**
     * Sets the userDefined2 value for this FWTStreetSearch.
     * 
     * @param userDefined2
     */
    public void setUserDefined2(java.lang.String userDefined2) {
        this.userDefined2 = userDefined2;
    }


    /**
     * Gets the userDefined3 value for this FWTStreetSearch.
     * 
     * @return userDefined3
     */
    public java.lang.String getUserDefined3() {
        return userDefined3;
    }


    /**
     * Sets the userDefined3 value for this FWTStreetSearch.
     * 
     * @param userDefined3
     */
    public void setUserDefined3(java.lang.String userDefined3) {
        this.userDefined3 = userDefined3;
    }


    /**
     * Gets the userDefined4 value for this FWTStreetSearch.
     * 
     * @return userDefined4
     */
    public java.lang.String getUserDefined4() {
        return userDefined4;
    }


    /**
     * Sets the userDefined4 value for this FWTStreetSearch.
     * 
     * @param userDefined4
     */
    public void setUserDefined4(java.lang.String userDefined4) {
        this.userDefined4 = userDefined4;
    }


    /**
     * Gets the userDefined5 value for this FWTStreetSearch.
     * 
     * @return userDefined5
     */
    public java.lang.String getUserDefined5() {
        return userDefined5;
    }


    /**
     * Sets the userDefined5 value for this FWTStreetSearch.
     * 
     * @param userDefined5
     */
    public void setUserDefined5(java.lang.String userDefined5) {
        this.userDefined5 = userDefined5;
    }


    /**
     * Gets the userDefined6 value for this FWTStreetSearch.
     * 
     * @return userDefined6
     */
    public java.lang.String getUserDefined6() {
        return userDefined6;
    }


    /**
     * Sets the userDefined6 value for this FWTStreetSearch.
     * 
     * @param userDefined6
     */
    public void setUserDefined6(java.lang.String userDefined6) {
        this.userDefined6 = userDefined6;
    }


    /**
     * Gets the userDefined7 value for this FWTStreetSearch.
     * 
     * @return userDefined7
     */
    public java.lang.String getUserDefined7() {
        return userDefined7;
    }


    /**
     * Sets the userDefined7 value for this FWTStreetSearch.
     * 
     * @param userDefined7
     */
    public void setUserDefined7(java.lang.String userDefined7) {
        this.userDefined7 = userDefined7;
    }


    /**
     * Gets the userDefined8 value for this FWTStreetSearch.
     * 
     * @return userDefined8
     */
    public java.lang.String getUserDefined8() {
        return userDefined8;
    }


    /**
     * Sets the userDefined8 value for this FWTStreetSearch.
     * 
     * @param userDefined8
     */
    public void setUserDefined8(java.lang.String userDefined8) {
        this.userDefined8 = userDefined8;
    }


    /**
     * Gets the userDefined9 value for this FWTStreetSearch.
     * 
     * @return userDefined9
     */
    public java.lang.String getUserDefined9() {
        return userDefined9;
    }


    /**
     * Sets the userDefined9 value for this FWTStreetSearch.
     * 
     * @param userDefined9
     */
    public void setUserDefined9(java.lang.String userDefined9) {
        this.userDefined9 = userDefined9;
    }


    /**
     * Gets the userDefined10 value for this FWTStreetSearch.
     * 
     * @return userDefined10
     */
    public java.lang.String getUserDefined10() {
        return userDefined10;
    }


    /**
     * Sets the userDefined10 value for this FWTStreetSearch.
     * 
     * @param userDefined10
     */
    public void setUserDefined10(java.lang.String userDefined10) {
        this.userDefined10 = userDefined10;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTStreetSearch)) return false;
        FWTStreetSearch other = (FWTStreetSearch) obj;
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
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.locality==null && other.getLocality()==null) || 
             (this.locality!=null &&
              this.locality.equals(other.getLocality()))) &&
            ((this.town==null && other.getTown()==null) || 
             (this.town!=null &&
              this.town.equals(other.getTown()))) &&
            ((this.USRN==null && other.getUSRN()==null) || 
             (this.USRN!=null &&
              this.USRN.equals(other.getUSRN()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode()))) &&
            ((this.userDefined1==null && other.getUserDefined1()==null) || 
             (this.userDefined1!=null &&
              this.userDefined1.equals(other.getUserDefined1()))) &&
            ((this.userDefined2==null && other.getUserDefined2()==null) || 
             (this.userDefined2!=null &&
              this.userDefined2.equals(other.getUserDefined2()))) &&
            ((this.userDefined3==null && other.getUserDefined3()==null) || 
             (this.userDefined3!=null &&
              this.userDefined3.equals(other.getUserDefined3()))) &&
            ((this.userDefined4==null && other.getUserDefined4()==null) || 
             (this.userDefined4!=null &&
              this.userDefined4.equals(other.getUserDefined4()))) &&
            ((this.userDefined5==null && other.getUserDefined5()==null) || 
             (this.userDefined5!=null &&
              this.userDefined5.equals(other.getUserDefined5()))) &&
            ((this.userDefined6==null && other.getUserDefined6()==null) || 
             (this.userDefined6!=null &&
              this.userDefined6.equals(other.getUserDefined6()))) &&
            ((this.userDefined7==null && other.getUserDefined7()==null) || 
             (this.userDefined7!=null &&
              this.userDefined7.equals(other.getUserDefined7()))) &&
            ((this.userDefined8==null && other.getUserDefined8()==null) || 
             (this.userDefined8!=null &&
              this.userDefined8.equals(other.getUserDefined8()))) &&
            ((this.userDefined9==null && other.getUserDefined9()==null) || 
             (this.userDefined9!=null &&
              this.userDefined9.equals(other.getUserDefined9()))) &&
            ((this.userDefined10==null && other.getUserDefined10()==null) || 
             (this.userDefined10!=null &&
              this.userDefined10.equals(other.getUserDefined10())));
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
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        if (getLocality() != null) {
            _hashCode += getLocality().hashCode();
        }
        if (getTown() != null) {
            _hashCode += getTown().hashCode();
        }
        if (getUSRN() != null) {
            _hashCode += getUSRN().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getStateCode() != null) {
            _hashCode += getStateCode().hashCode();
        }
        if (getUserDefined1() != null) {
            _hashCode += getUserDefined1().hashCode();
        }
        if (getUserDefined2() != null) {
            _hashCode += getUserDefined2().hashCode();
        }
        if (getUserDefined3() != null) {
            _hashCode += getUserDefined3().hashCode();
        }
        if (getUserDefined4() != null) {
            _hashCode += getUserDefined4().hashCode();
        }
        if (getUserDefined5() != null) {
            _hashCode += getUserDefined5().hashCode();
        }
        if (getUserDefined6() != null) {
            _hashCode += getUserDefined6().hashCode();
        }
        if (getUserDefined7() != null) {
            _hashCode += getUserDefined7().hashCode();
        }
        if (getUserDefined8() != null) {
            _hashCode += getUserDefined8().hashCode();
        }
        if (getUserDefined9() != null) {
            _hashCode += getUserDefined9().hashCode();
        }
        if (getUserDefined10() != null) {
            _hashCode += getUserDefined10().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTStreetSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTStreetSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "SearchMatch"));
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
        elemField.setFieldName("userDefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined8");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined9");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined10");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDefined10"));
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
