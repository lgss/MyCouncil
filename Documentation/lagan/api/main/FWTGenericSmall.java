/**
 * FWTGenericSmall.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTGenericSmall  implements java.io.Serializable {
    /* This element is ignored on a create
     *                                 operation. */
    private java.lang.Long recordID;

    private java.lang.String recordType;

    private java.lang.String value1;

    private java.lang.String value2;

    private java.lang.String rangeFrom;

    private java.lang.String rangeTo;

    private java.util.Date date1;

    private java.util.Date date2;

    private java.util.Date startDate;

    private java.util.Date endDate;

    public FWTGenericSmall() {
    }

    public FWTGenericSmall(
           java.lang.Long recordID,
           java.lang.String recordType,
           java.lang.String value1,
           java.lang.String value2,
           java.lang.String rangeFrom,
           java.lang.String rangeTo,
           java.util.Date date1,
           java.util.Date date2,
           java.util.Date startDate,
           java.util.Date endDate) {
           this.recordID = recordID;
           this.recordType = recordType;
           this.value1 = value1;
           this.value2 = value2;
           this.rangeFrom = rangeFrom;
           this.rangeTo = rangeTo;
           this.date1 = date1;
           this.date2 = date2;
           this.startDate = startDate;
           this.endDate = endDate;
    }


    /**
     * Gets the recordID value for this FWTGenericSmall.
     * 
     * @return recordID   * This element is ignored on a create
     *                                 operation.
     */
    public java.lang.Long getRecordID() {
        return recordID;
    }


    /**
     * Sets the recordID value for this FWTGenericSmall.
     * 
     * @param recordID   * This element is ignored on a create
     *                                 operation.
     */
    public void setRecordID(java.lang.Long recordID) {
        this.recordID = recordID;
    }


    /**
     * Gets the recordType value for this FWTGenericSmall.
     * 
     * @return recordType
     */
    public java.lang.String getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this FWTGenericSmall.
     * 
     * @param recordType
     */
    public void setRecordType(java.lang.String recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the value1 value for this FWTGenericSmall.
     * 
     * @return value1
     */
    public java.lang.String getValue1() {
        return value1;
    }


    /**
     * Sets the value1 value for this FWTGenericSmall.
     * 
     * @param value1
     */
    public void setValue1(java.lang.String value1) {
        this.value1 = value1;
    }


    /**
     * Gets the value2 value for this FWTGenericSmall.
     * 
     * @return value2
     */
    public java.lang.String getValue2() {
        return value2;
    }


    /**
     * Sets the value2 value for this FWTGenericSmall.
     * 
     * @param value2
     */
    public void setValue2(java.lang.String value2) {
        this.value2 = value2;
    }


    /**
     * Gets the rangeFrom value for this FWTGenericSmall.
     * 
     * @return rangeFrom
     */
    public java.lang.String getRangeFrom() {
        return rangeFrom;
    }


    /**
     * Sets the rangeFrom value for this FWTGenericSmall.
     * 
     * @param rangeFrom
     */
    public void setRangeFrom(java.lang.String rangeFrom) {
        this.rangeFrom = rangeFrom;
    }


    /**
     * Gets the rangeTo value for this FWTGenericSmall.
     * 
     * @return rangeTo
     */
    public java.lang.String getRangeTo() {
        return rangeTo;
    }


    /**
     * Sets the rangeTo value for this FWTGenericSmall.
     * 
     * @param rangeTo
     */
    public void setRangeTo(java.lang.String rangeTo) {
        this.rangeTo = rangeTo;
    }


    /**
     * Gets the date1 value for this FWTGenericSmall.
     * 
     * @return date1
     */
    public java.util.Date getDate1() {
        return date1;
    }


    /**
     * Sets the date1 value for this FWTGenericSmall.
     * 
     * @param date1
     */
    public void setDate1(java.util.Date date1) {
        this.date1 = date1;
    }


    /**
     * Gets the date2 value for this FWTGenericSmall.
     * 
     * @return date2
     */
    public java.util.Date getDate2() {
        return date2;
    }


    /**
     * Sets the date2 value for this FWTGenericSmall.
     * 
     * @param date2
     */
    public void setDate2(java.util.Date date2) {
        this.date2 = date2;
    }


    /**
     * Gets the startDate value for this FWTGenericSmall.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this FWTGenericSmall.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this FWTGenericSmall.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this FWTGenericSmall.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTGenericSmall)) return false;
        FWTGenericSmall other = (FWTGenericSmall) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recordID==null && other.getRecordID()==null) || 
             (this.recordID!=null &&
              this.recordID.equals(other.getRecordID()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.value1==null && other.getValue1()==null) || 
             (this.value1!=null &&
              this.value1.equals(other.getValue1()))) &&
            ((this.value2==null && other.getValue2()==null) || 
             (this.value2!=null &&
              this.value2.equals(other.getValue2()))) &&
            ((this.rangeFrom==null && other.getRangeFrom()==null) || 
             (this.rangeFrom!=null &&
              this.rangeFrom.equals(other.getRangeFrom()))) &&
            ((this.rangeTo==null && other.getRangeTo()==null) || 
             (this.rangeTo!=null &&
              this.rangeTo.equals(other.getRangeTo()))) &&
            ((this.date1==null && other.getDate1()==null) || 
             (this.date1!=null &&
              this.date1.equals(other.getDate1()))) &&
            ((this.date2==null && other.getDate2()==null) || 
             (this.date2!=null &&
              this.date2.equals(other.getDate2()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        if (getRecordID() != null) {
            _hashCode += getRecordID().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getValue1() != null) {
            _hashCode += getValue1().hashCode();
        }
        if (getValue2() != null) {
            _hashCode += getValue2().hashCode();
        }
        if (getRangeFrom() != null) {
            _hashCode += getRangeFrom().hashCode();
        }
        if (getRangeTo() != null) {
            _hashCode += getRangeTo().hashCode();
        }
        if (getDate1() != null) {
            _hashCode += getDate1().hashCode();
        }
        if (getDate2() != null) {
            _hashCode += getDate2().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTGenericSmall.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTGenericSmall"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RecordID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RangeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RangeTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Date1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Date2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
