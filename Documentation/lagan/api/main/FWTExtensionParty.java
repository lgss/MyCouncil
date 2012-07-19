/**
 * FWTExtensionParty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTExtensionParty  implements java.io.Serializable {
    private long objectID;

    private lagan.api.main.FWTObjectBriefDetails briefDetails;

    private lagan.api.main.FWTContactPostal[] contactPostals;

    private lagan.api.main.FWTContactPhone[] contactPhones;

    private lagan.api.main.FWTContactEmail[] contactEmails;

    private lagan.api.main.FWTKeyValue[] value;

    private lagan.api.main.FWTExtensionChildSet[] childSet;

    public FWTExtensionParty() {
    }

    public FWTExtensionParty(
           long objectID,
           lagan.api.main.FWTObjectBriefDetails briefDetails,
           lagan.api.main.FWTContactPostal[] contactPostals,
           lagan.api.main.FWTContactPhone[] contactPhones,
           lagan.api.main.FWTContactEmail[] contactEmails,
           lagan.api.main.FWTKeyValue[] value,
           lagan.api.main.FWTExtensionChildSet[] childSet) {
           this.objectID = objectID;
           this.briefDetails = briefDetails;
           this.contactPostals = contactPostals;
           this.contactPhones = contactPhones;
           this.contactEmails = contactEmails;
           this.value = value;
           this.childSet = childSet;
    }


    /**
     * Gets the objectID value for this FWTExtensionParty.
     * 
     * @return objectID
     */
    public long getObjectID() {
        return objectID;
    }


    /**
     * Sets the objectID value for this FWTExtensionParty.
     * 
     * @param objectID
     */
    public void setObjectID(long objectID) {
        this.objectID = objectID;
    }


    /**
     * Gets the briefDetails value for this FWTExtensionParty.
     * 
     * @return briefDetails
     */
    public lagan.api.main.FWTObjectBriefDetails getBriefDetails() {
        return briefDetails;
    }


    /**
     * Sets the briefDetails value for this FWTExtensionParty.
     * 
     * @param briefDetails
     */
    public void setBriefDetails(lagan.api.main.FWTObjectBriefDetails briefDetails) {
        this.briefDetails = briefDetails;
    }


    /**
     * Gets the contactPostals value for this FWTExtensionParty.
     * 
     * @return contactPostals
     */
    public lagan.api.main.FWTContactPostal[] getContactPostals() {
        return contactPostals;
    }


    /**
     * Sets the contactPostals value for this FWTExtensionParty.
     * 
     * @param contactPostals
     */
    public void setContactPostals(lagan.api.main.FWTContactPostal[] contactPostals) {
        this.contactPostals = contactPostals;
    }

    public lagan.api.main.FWTContactPostal getContactPostals(int i) {
        return this.contactPostals[i];
    }

    public void setContactPostals(int i, lagan.api.main.FWTContactPostal _value) {
        this.contactPostals[i] = _value;
    }


    /**
     * Gets the contactPhones value for this FWTExtensionParty.
     * 
     * @return contactPhones
     */
    public lagan.api.main.FWTContactPhone[] getContactPhones() {
        return contactPhones;
    }


    /**
     * Sets the contactPhones value for this FWTExtensionParty.
     * 
     * @param contactPhones
     */
    public void setContactPhones(lagan.api.main.FWTContactPhone[] contactPhones) {
        this.contactPhones = contactPhones;
    }

    public lagan.api.main.FWTContactPhone getContactPhones(int i) {
        return this.contactPhones[i];
    }

    public void setContactPhones(int i, lagan.api.main.FWTContactPhone _value) {
        this.contactPhones[i] = _value;
    }


    /**
     * Gets the contactEmails value for this FWTExtensionParty.
     * 
     * @return contactEmails
     */
    public lagan.api.main.FWTContactEmail[] getContactEmails() {
        return contactEmails;
    }


    /**
     * Sets the contactEmails value for this FWTExtensionParty.
     * 
     * @param contactEmails
     */
    public void setContactEmails(lagan.api.main.FWTContactEmail[] contactEmails) {
        this.contactEmails = contactEmails;
    }

    public lagan.api.main.FWTContactEmail getContactEmails(int i) {
        return this.contactEmails[i];
    }

    public void setContactEmails(int i, lagan.api.main.FWTContactEmail _value) {
        this.contactEmails[i] = _value;
    }


    /**
     * Gets the value value for this FWTExtensionParty.
     * 
     * @return value
     */
    public lagan.api.main.FWTKeyValue[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this FWTExtensionParty.
     * 
     * @param value
     */
    public void setValue(lagan.api.main.FWTKeyValue[] value) {
        this.value = value;
    }

    public lagan.api.main.FWTKeyValue getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, lagan.api.main.FWTKeyValue _value) {
        this.value[i] = _value;
    }


    /**
     * Gets the childSet value for this FWTExtensionParty.
     * 
     * @return childSet
     */
    public lagan.api.main.FWTExtensionChildSet[] getChildSet() {
        return childSet;
    }


    /**
     * Sets the childSet value for this FWTExtensionParty.
     * 
     * @param childSet
     */
    public void setChildSet(lagan.api.main.FWTExtensionChildSet[] childSet) {
        this.childSet = childSet;
    }

    public lagan.api.main.FWTExtensionChildSet getChildSet(int i) {
        return this.childSet[i];
    }

    public void setChildSet(int i, lagan.api.main.FWTExtensionChildSet _value) {
        this.childSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTExtensionParty)) return false;
        FWTExtensionParty other = (FWTExtensionParty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.objectID == other.getObjectID() &&
            ((this.briefDetails==null && other.getBriefDetails()==null) || 
             (this.briefDetails!=null &&
              this.briefDetails.equals(other.getBriefDetails()))) &&
            ((this.contactPostals==null && other.getContactPostals()==null) || 
             (this.contactPostals!=null &&
              java.util.Arrays.equals(this.contactPostals, other.getContactPostals()))) &&
            ((this.contactPhones==null && other.getContactPhones()==null) || 
             (this.contactPhones!=null &&
              java.util.Arrays.equals(this.contactPhones, other.getContactPhones()))) &&
            ((this.contactEmails==null && other.getContactEmails()==null) || 
             (this.contactEmails!=null &&
              java.util.Arrays.equals(this.contactEmails, other.getContactEmails()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue()))) &&
            ((this.childSet==null && other.getChildSet()==null) || 
             (this.childSet!=null &&
              java.util.Arrays.equals(this.childSet, other.getChildSet())));
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
        _hashCode += new Long(getObjectID()).hashCode();
        if (getBriefDetails() != null) {
            _hashCode += getBriefDetails().hashCode();
        }
        if (getContactPostals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactPostals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContactPostals(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContactPhones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactPhones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContactPhones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContactEmails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactEmails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContactEmails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChildSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildSet(), i);
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
        new org.apache.axis.description.TypeDesc(FWTExtensionParty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTExtensionParty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ObjectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("briefDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BriefDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectBriefDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPostals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactPostals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTContactPostal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPhones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactPhones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTContactPhone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTContactEmail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTKeyValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChildSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTExtensionChildSet"));
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
