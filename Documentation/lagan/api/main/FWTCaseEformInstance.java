/**
 * FWTCaseEformInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseEformInstance  implements java.io.Serializable {
    private java.lang.String caseReference;

    private java.lang.String eformName;

    /* Only to be used if eForm is stored in a content repository. */
    private java.lang.String contentRepositoryVersion;

    public FWTCaseEformInstance() {
    }

    public FWTCaseEformInstance(
           java.lang.String caseReference,
           java.lang.String eformName,
           java.lang.String contentRepositoryVersion) {
           this.caseReference = caseReference;
           this.eformName = eformName;
           this.contentRepositoryVersion = contentRepositoryVersion;
    }


    /**
     * Gets the caseReference value for this FWTCaseEformInstance.
     * 
     * @return caseReference
     */
    public java.lang.String getCaseReference() {
        return caseReference;
    }


    /**
     * Sets the caseReference value for this FWTCaseEformInstance.
     * 
     * @param caseReference
     */
    public void setCaseReference(java.lang.String caseReference) {
        this.caseReference = caseReference;
    }


    /**
     * Gets the eformName value for this FWTCaseEformInstance.
     * 
     * @return eformName
     */
    public java.lang.String getEformName() {
        return eformName;
    }


    /**
     * Sets the eformName value for this FWTCaseEformInstance.
     * 
     * @param eformName
     */
    public void setEformName(java.lang.String eformName) {
        this.eformName = eformName;
    }


    /**
     * Gets the contentRepositoryVersion value for this FWTCaseEformInstance.
     * 
     * @return contentRepositoryVersion   * Only to be used if eForm is stored in a content repository.
     */
    public java.lang.String getContentRepositoryVersion() {
        return contentRepositoryVersion;
    }


    /**
     * Sets the contentRepositoryVersion value for this FWTCaseEformInstance.
     * 
     * @param contentRepositoryVersion   * Only to be used if eForm is stored in a content repository.
     */
    public void setContentRepositoryVersion(java.lang.String contentRepositoryVersion) {
        this.contentRepositoryVersion = contentRepositoryVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseEformInstance)) return false;
        FWTCaseEformInstance other = (FWTCaseEformInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseReference==null && other.getCaseReference()==null) || 
             (this.caseReference!=null &&
              this.caseReference.equals(other.getCaseReference()))) &&
            ((this.eformName==null && other.getEformName()==null) || 
             (this.eformName!=null &&
              this.eformName.equals(other.getEformName()))) &&
            ((this.contentRepositoryVersion==null && other.getContentRepositoryVersion()==null) || 
             (this.contentRepositoryVersion!=null &&
              this.contentRepositoryVersion.equals(other.getContentRepositoryVersion())));
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
        if (getCaseReference() != null) {
            _hashCode += getCaseReference().hashCode();
        }
        if (getEformName() != null) {
            _hashCode += getEformName().hashCode();
        }
        if (getContentRepositoryVersion() != null) {
            _hashCode += getContentRepositoryVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTCaseEformInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseEformInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CaseReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eformName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EformName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentRepositoryVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContentRepositoryVersion"));
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
