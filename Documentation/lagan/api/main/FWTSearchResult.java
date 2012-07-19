/**
 * FWTSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTSearchResult  implements java.io.Serializable {
    /* Total number of hits found */
    private int totalHits;

    /* The index of the first hit returned by this call */
    private int startIndex;

    /* Number of hits returned by this call */
    private int pageSize;

    /* The elapsed search time in milliseconds */
    private long elapsedMilliseconds;

    /* The list of hits, possibly empty */
    private lagan.api.main.FWTSearchHit[] hit;

    public FWTSearchResult() {
    }

    public FWTSearchResult(
           int totalHits,
           int startIndex,
           int pageSize,
           long elapsedMilliseconds,
           lagan.api.main.FWTSearchHit[] hit) {
           this.totalHits = totalHits;
           this.startIndex = startIndex;
           this.pageSize = pageSize;
           this.elapsedMilliseconds = elapsedMilliseconds;
           this.hit = hit;
    }


    /**
     * Gets the totalHits value for this FWTSearchResult.
     * 
     * @return totalHits   * Total number of hits found
     */
    public int getTotalHits() {
        return totalHits;
    }


    /**
     * Sets the totalHits value for this FWTSearchResult.
     * 
     * @param totalHits   * Total number of hits found
     */
    public void setTotalHits(int totalHits) {
        this.totalHits = totalHits;
    }


    /**
     * Gets the startIndex value for this FWTSearchResult.
     * 
     * @return startIndex   * The index of the first hit returned by this call
     */
    public int getStartIndex() {
        return startIndex;
    }


    /**
     * Sets the startIndex value for this FWTSearchResult.
     * 
     * @param startIndex   * The index of the first hit returned by this call
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }


    /**
     * Gets the pageSize value for this FWTSearchResult.
     * 
     * @return pageSize   * Number of hits returned by this call
     */
    public int getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this FWTSearchResult.
     * 
     * @param pageSize   * Number of hits returned by this call
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the elapsedMilliseconds value for this FWTSearchResult.
     * 
     * @return elapsedMilliseconds   * The elapsed search time in milliseconds
     */
    public long getElapsedMilliseconds() {
        return elapsedMilliseconds;
    }


    /**
     * Sets the elapsedMilliseconds value for this FWTSearchResult.
     * 
     * @param elapsedMilliseconds   * The elapsed search time in milliseconds
     */
    public void setElapsedMilliseconds(long elapsedMilliseconds) {
        this.elapsedMilliseconds = elapsedMilliseconds;
    }


    /**
     * Gets the hit value for this FWTSearchResult.
     * 
     * @return hit   * The list of hits, possibly empty
     */
    public lagan.api.main.FWTSearchHit[] getHit() {
        return hit;
    }


    /**
     * Sets the hit value for this FWTSearchResult.
     * 
     * @param hit   * The list of hits, possibly empty
     */
    public void setHit(lagan.api.main.FWTSearchHit[] hit) {
        this.hit = hit;
    }

    public lagan.api.main.FWTSearchHit getHit(int i) {
        return this.hit[i];
    }

    public void setHit(int i, lagan.api.main.FWTSearchHit _value) {
        this.hit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTSearchResult)) return false;
        FWTSearchResult other = (FWTSearchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.totalHits == other.getTotalHits() &&
            this.startIndex == other.getStartIndex() &&
            this.pageSize == other.getPageSize() &&
            this.elapsedMilliseconds == other.getElapsedMilliseconds() &&
            ((this.hit==null && other.getHit()==null) || 
             (this.hit!=null &&
              java.util.Arrays.equals(this.hit, other.getHit())));
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
        _hashCode += getTotalHits();
        _hashCode += getStartIndex();
        _hashCode += getPageSize();
        _hashCode += new Long(getElapsedMilliseconds()).hashCode();
        if (getHit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHit(), i);
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
        new org.apache.axis.description.TypeDesc(FWTSearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalHits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalHits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elapsedMilliseconds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ElapsedMilliseconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Hit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTSearchHit"));
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
