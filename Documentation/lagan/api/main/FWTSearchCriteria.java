/**
 * FWTSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTSearchCriteria  implements java.io.Serializable {
    /* A Lucene query string. See http://lucene.apache.org/java/docs/queryparsersyntax.html */
    private java.lang.String queryString;

    /* Values: basic, full. Identifies the level of detail returned
     * for each search hit. Defaults to basic. */
    private java.lang.String resultDetail;

    /* Index of the first hit to return. Defaults to 0 */
    private java.lang.Integer startIndex;

    /* Number of hits to return, beginning at StartIndex. Defaults
     * to pre-configured maximum. See services.properties */
    private java.lang.Integer pageSize;

    public FWTSearchCriteria() {
    }

    public FWTSearchCriteria(
           java.lang.String queryString,
           java.lang.String resultDetail,
           java.lang.Integer startIndex,
           java.lang.Integer pageSize) {
           this.queryString = queryString;
           this.resultDetail = resultDetail;
           this.startIndex = startIndex;
           this.pageSize = pageSize;
    }


    /**
     * Gets the queryString value for this FWTSearchCriteria.
     * 
     * @return queryString   * A Lucene query string. See http://lucene.apache.org/java/docs/queryparsersyntax.html
     */
    public java.lang.String getQueryString() {
        return queryString;
    }


    /**
     * Sets the queryString value for this FWTSearchCriteria.
     * 
     * @param queryString   * A Lucene query string. See http://lucene.apache.org/java/docs/queryparsersyntax.html
     */
    public void setQueryString(java.lang.String queryString) {
        this.queryString = queryString;
    }


    /**
     * Gets the resultDetail value for this FWTSearchCriteria.
     * 
     * @return resultDetail   * Values: basic, full. Identifies the level of detail returned
     * for each search hit. Defaults to basic.
     */
    public java.lang.String getResultDetail() {
        return resultDetail;
    }


    /**
     * Sets the resultDetail value for this FWTSearchCriteria.
     * 
     * @param resultDetail   * Values: basic, full. Identifies the level of detail returned
     * for each search hit. Defaults to basic.
     */
    public void setResultDetail(java.lang.String resultDetail) {
        this.resultDetail = resultDetail;
    }


    /**
     * Gets the startIndex value for this FWTSearchCriteria.
     * 
     * @return startIndex   * Index of the first hit to return. Defaults to 0
     */
    public java.lang.Integer getStartIndex() {
        return startIndex;
    }


    /**
     * Sets the startIndex value for this FWTSearchCriteria.
     * 
     * @param startIndex   * Index of the first hit to return. Defaults to 0
     */
    public void setStartIndex(java.lang.Integer startIndex) {
        this.startIndex = startIndex;
    }


    /**
     * Gets the pageSize value for this FWTSearchCriteria.
     * 
     * @return pageSize   * Number of hits to return, beginning at StartIndex. Defaults
     * to pre-configured maximum. See services.properties
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this FWTSearchCriteria.
     * 
     * @param pageSize   * Number of hits to return, beginning at StartIndex. Defaults
     * to pre-configured maximum. See services.properties
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTSearchCriteria)) return false;
        FWTSearchCriteria other = (FWTSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryString==null && other.getQueryString()==null) || 
             (this.queryString!=null &&
              this.queryString.equals(other.getQueryString()))) &&
            ((this.resultDetail==null && other.getResultDetail()==null) || 
             (this.resultDetail!=null &&
              this.resultDetail.equals(other.getResultDetail()))) &&
            ((this.startIndex==null && other.getStartIndex()==null) || 
             (this.startIndex!=null &&
              this.startIndex.equals(other.getStartIndex()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize())));
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
        if (getQueryString() != null) {
            _hashCode += getQueryString().hashCode();
        }
        if (getResultDetail() != null) {
            _hashCode += getResultDetail().hashCode();
        }
        if (getStartIndex() != null) {
            _hashCode += getStartIndex().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueryString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
