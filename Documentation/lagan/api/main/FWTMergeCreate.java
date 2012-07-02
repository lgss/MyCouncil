/**
 * FWTMergeCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTMergeCreate  implements java.io.Serializable {
    private lagan.api.main.FWTObjectID targetParty;

    private lagan.api.main.FWTObjectID[] mergeParties;

    public FWTMergeCreate() {
    }

    public FWTMergeCreate(
           lagan.api.main.FWTObjectID targetParty,
           lagan.api.main.FWTObjectID[] mergeParties) {
           this.targetParty = targetParty;
           this.mergeParties = mergeParties;
    }


    /**
     * Gets the targetParty value for this FWTMergeCreate.
     * 
     * @return targetParty
     */
    public lagan.api.main.FWTObjectID getTargetParty() {
        return targetParty;
    }


    /**
     * Sets the targetParty value for this FWTMergeCreate.
     * 
     * @param targetParty
     */
    public void setTargetParty(lagan.api.main.FWTObjectID targetParty) {
        this.targetParty = targetParty;
    }


    /**
     * Gets the mergeParties value for this FWTMergeCreate.
     * 
     * @return mergeParties
     */
    public lagan.api.main.FWTObjectID[] getMergeParties() {
        return mergeParties;
    }


    /**
     * Sets the mergeParties value for this FWTMergeCreate.
     * 
     * @param mergeParties
     */
    public void setMergeParties(lagan.api.main.FWTObjectID[] mergeParties) {
        this.mergeParties = mergeParties;
    }

    public lagan.api.main.FWTObjectID getMergeParties(int i) {
        return this.mergeParties[i];
    }

    public void setMergeParties(int i, lagan.api.main.FWTObjectID _value) {
        this.mergeParties[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTMergeCreate)) return false;
        FWTMergeCreate other = (FWTMergeCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetParty==null && other.getTargetParty()==null) || 
             (this.targetParty!=null &&
              this.targetParty.equals(other.getTargetParty()))) &&
            ((this.mergeParties==null && other.getMergeParties()==null) || 
             (this.mergeParties!=null &&
              java.util.Arrays.equals(this.mergeParties, other.getMergeParties())));
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
        if (getTargetParty() != null) {
            _hashCode += getTargetParty().hashCode();
        }
        if (getMergeParties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMergeParties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMergeParties(), i);
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
        new org.apache.axis.description.TypeDesc(FWTMergeCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTMergeCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetParty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mergeParties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MergeParties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectID"));
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
