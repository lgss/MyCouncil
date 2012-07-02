/**
 * SLATimePeriodType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class SLATimePeriodType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SLATimePeriodType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SECOND = "SECOND";
    public static final java.lang.String _MINUTE = "MINUTE";
    public static final java.lang.String _HOUR = "HOUR";
    public static final java.lang.String _DAY = "DAY";
    public static final java.lang.String _WEEK = "WEEK";
    public static final java.lang.String _MONTH = "MONTH";
    public static final SLATimePeriodType SECOND = new SLATimePeriodType(_SECOND);
    public static final SLATimePeriodType MINUTE = new SLATimePeriodType(_MINUTE);
    public static final SLATimePeriodType HOUR = new SLATimePeriodType(_HOUR);
    public static final SLATimePeriodType DAY = new SLATimePeriodType(_DAY);
    public static final SLATimePeriodType WEEK = new SLATimePeriodType(_WEEK);
    public static final SLATimePeriodType MONTH = new SLATimePeriodType(_MONTH);
    public java.lang.String getValue() { return _value_;}
    public static SLATimePeriodType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SLATimePeriodType enumeration = (SLATimePeriodType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SLATimePeriodType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SLATimePeriodType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "SLATimePeriodType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
