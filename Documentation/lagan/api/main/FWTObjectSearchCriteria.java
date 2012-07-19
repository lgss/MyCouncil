/**
 * FWTObjectSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTObjectSearchCriteria  implements java.io.Serializable {
    /* Numeric type of the search to be
     *                                     performed */
    private java.lang.Integer searchType;

    private lagan.api.main.FWTKeyValue[] criteria;

    /* Options for the search, dependent on
     *                                     search type */
    private java.lang.String options;

    public FWTObjectSearchCriteria() {
    }

    public FWTObjectSearchCriteria(
           java.lang.Integer searchType,
           lagan.api.main.FWTKeyValue[] criteria,
           java.lang.String options) {
           this.searchType = searchType;
           this.criteria = criteria;
           this.options = options;
    }


    /**
     * Gets the searchType value for this FWTObjectSearchCriteria.
     * 
     * @return searchType   * Numeric type of the search to be
     *                                     performed
     */
    public java.lang.Integer getSearchType() {
        return searchType;
    }


    /**
     * Sets the searchType value for this FWTObjectSearchCriteria.
     * 
     * @param searchType   * Numeric type of the search to be
     *                                     performed
     */
    public void setSearchType(java.lang.Integer searchType) {
        this.searchType = searchType;
    }


    /**
     * Gets the criteria value for this FWTObjectSearchCriteria.
     * 
     * @return criteria
     */
    public lagan.api.main.FWTKeyValue[] getCriteria() {
        return criteria;
    }


    /**
     * Sets the criteria value for this FWTObjectSearchCriteria.
     * 
     * @param criteria
     */
    public void setCriteria(lagan.api.main.FWTKeyValue[] criteria) {
        this.criteria = criteria;
    }

    public lagan.api.main.FWTKeyValue getCriteria(int i) {
        return this.criteria[i];
    }

    public void setCriteria(int i, lagan.api.main.FWTKeyValue _value) {
        this.criteria[i] = _value;
    }


    /**
     * Gets the options value for this FWTObjectSearchCriteria.
     * 
     * @return options   * Options for the search, dependent on
     *                                     search type
     */
    public java.lang.String getOptions() {
        return options;
    }


    /**
     * Sets the options value for this FWTObjectSearchCriteria.
     * 
     * @param options   * Options for the search, dependent on
     *                                     search type
     */
    public void setOptions(java.lang.String options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTObjectSearchCriteria)) return false;
        FWTObjectSearchCriteria other = (FWTObjectSearchCriteria) obj;
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
            ((this.criteria==null && other.getCriteria()==null) || 
             (this.criteria!=null &&
              java.util.Arrays.equals(this.criteria, other.getCriteria()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions())));
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
        if (getCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTObjectSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTObjectSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SearchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Criteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTKeyValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Options"));
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
