/**
 * FWTCodeBook.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCodeBook  implements java.io.Serializable {
    private long codeBookID;

    private java.lang.String codeBookName;

    private java.lang.String description;

    private boolean published;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private lagan.api.main.FWTCode[] codes;

    public FWTCodeBook() {
    }

    public FWTCodeBook(
           long codeBookID,
           java.lang.String codeBookName,
           java.lang.String description,
           boolean published,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           lagan.api.main.FWTCode[] codes) {
           this.codeBookID = codeBookID;
           this.codeBookName = codeBookName;
           this.description = description;
           this.published = published;
           this.startDate = startDate;
           this.endDate = endDate;
           this.codes = codes;
    }


    /**
     * Gets the codeBookID value for this FWTCodeBook.
     * 
     * @return codeBookID
     */
    public long getCodeBookID() {
        return codeBookID;
    }


    /**
     * Sets the codeBookID value for this FWTCodeBook.
     * 
     * @param codeBookID
     */
    public void setCodeBookID(long codeBookID) {
        this.codeBookID = codeBookID;
    }


    /**
     * Gets the codeBookName value for this FWTCodeBook.
     * 
     * @return codeBookName
     */
    public java.lang.String getCodeBookName() {
        return codeBookName;
    }


    /**
     * Sets the codeBookName value for this FWTCodeBook.
     * 
     * @param codeBookName
     */
    public void setCodeBookName(java.lang.String codeBookName) {
        this.codeBookName = codeBookName;
    }


    /**
     * Gets the description value for this FWTCodeBook.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FWTCodeBook.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the published value for this FWTCodeBook.
     * 
     * @return published
     */
    public boolean isPublished() {
        return published;
    }


    /**
     * Sets the published value for this FWTCodeBook.
     * 
     * @param published
     */
    public void setPublished(boolean published) {
        this.published = published;
    }


    /**
     * Gets the startDate value for this FWTCodeBook.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this FWTCodeBook.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this FWTCodeBook.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this FWTCodeBook.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the codes value for this FWTCodeBook.
     * 
     * @return codes
     */
    public lagan.api.main.FWTCode[] getCodes() {
        return codes;
    }


    /**
     * Sets the codes value for this FWTCodeBook.
     * 
     * @param codes
     */
    public void setCodes(lagan.api.main.FWTCode[] codes) {
        this.codes = codes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCodeBook)) return false;
        FWTCodeBook other = (FWTCodeBook) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codeBookID == other.getCodeBookID() &&
            ((this.codeBookName==null && other.getCodeBookName()==null) || 
             (this.codeBookName!=null &&
              this.codeBookName.equals(other.getCodeBookName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.published == other.isPublished() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.codes==null && other.getCodes()==null) || 
             (this.codes!=null &&
              java.util.Arrays.equals(this.codes, other.getCodes())));
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
        _hashCode += new Long(getCodeBookID()).hashCode();
        if (getCodeBookName() != null) {
            _hashCode += getCodeBookName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isPublished() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCodes(), i);
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
        new org.apache.axis.description.TypeDesc(FWTCodeBook.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTCodeBook"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeBookID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodeBookID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeBookName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CodeBookName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">CodeBookName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("published");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Published"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Codes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCode"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Code"));
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
