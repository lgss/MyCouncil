/**
 * FWTCaseEventNew.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseEventNew  implements java.io.Serializable {
    private java.lang.String caseReference;

    private java.lang.String eventTitle;

    private java.lang.String additionalInfo;

    private java.lang.String proxyUserID;

    private java.lang.String proxyUserName;

    public FWTCaseEventNew() {
    }

    public FWTCaseEventNew(
           java.lang.String caseReference,
           java.lang.String eventTitle,
           java.lang.String additionalInfo,
           java.lang.String proxyUserID,
           java.lang.String proxyUserName) {
           this.caseReference = caseReference;
           this.eventTitle = eventTitle;
           this.additionalInfo = additionalInfo;
           this.proxyUserID = proxyUserID;
           this.proxyUserName = proxyUserName;
    }


    /**
     * Gets the caseReference value for this FWTCaseEventNew.
     * 
     * @return caseReference
     */
    public java.lang.String getCaseReference() {
        return caseReference;
    }


    /**
     * Sets the caseReference value for this FWTCaseEventNew.
     * 
     * @param caseReference
     */
    public void setCaseReference(java.lang.String caseReference) {
        this.caseReference = caseReference;
    }


    /**
     * Gets the eventTitle value for this FWTCaseEventNew.
     * 
     * @return eventTitle
     */
    public java.lang.String getEventTitle() {
        return eventTitle;
    }


    /**
     * Sets the eventTitle value for this FWTCaseEventNew.
     * 
     * @param eventTitle
     */
    public void setEventTitle(java.lang.String eventTitle) {
        this.eventTitle = eventTitle;
    }


    /**
     * Gets the additionalInfo value for this FWTCaseEventNew.
     * 
     * @return additionalInfo
     */
    public java.lang.String getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this FWTCaseEventNew.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(java.lang.String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the proxyUserID value for this FWTCaseEventNew.
     * 
     * @return proxyUserID
     */
    public java.lang.String getProxyUserID() {
        return proxyUserID;
    }


    /**
     * Sets the proxyUserID value for this FWTCaseEventNew.
     * 
     * @param proxyUserID
     */
    public void setProxyUserID(java.lang.String proxyUserID) {
        this.proxyUserID = proxyUserID;
    }


    /**
     * Gets the proxyUserName value for this FWTCaseEventNew.
     * 
     * @return proxyUserName
     */
    public java.lang.String getProxyUserName() {
        return proxyUserName;
    }


    /**
     * Sets the proxyUserName value for this FWTCaseEventNew.
     * 
     * @param proxyUserName
     */
    public void setProxyUserName(java.lang.String proxyUserName) {
        this.proxyUserName = proxyUserName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseEventNew)) return false;
        FWTCaseEventNew other = (FWTCaseEventNew) obj;
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
            ((this.eventTitle==null && other.getEventTitle()==null) || 
             (this.eventTitle!=null &&
              this.eventTitle.equals(other.getEventTitle()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              this.additionalInfo.equals(other.getAdditionalInfo()))) &&
            ((this.proxyUserID==null && other.getProxyUserID()==null) || 
             (this.proxyUserID!=null &&
              this.proxyUserID.equals(other.getProxyUserID()))) &&
            ((this.proxyUserName==null && other.getProxyUserName()==null) || 
             (this.proxyUserName!=null &&
              this.proxyUserName.equals(other.getProxyUserName())));
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
        if (getEventTitle() != null) {
            _hashCode += getEventTitle().hashCode();
        }
        if (getAdditionalInfo() != null) {
            _hashCode += getAdditionalInfo().hashCode();
        }
        if (getProxyUserID() != null) {
            _hashCode += getProxyUserID().hashCode();
        }
        if (getProxyUserName() != null) {
            _hashCode += getProxyUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTCaseEventNew.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTCaseEventNew"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CaseReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EventTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProxyUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProxyUserName"));
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
