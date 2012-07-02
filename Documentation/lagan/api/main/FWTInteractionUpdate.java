/**
 * FWTInteractionUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTInteractionUpdate  implements java.io.Serializable {
    private long interactionID;

    private lagan.api.main.FWTInteractionMessage interactionMessage;

    private java.lang.String queueForInteractionMessage;

    public FWTInteractionUpdate() {
    }

    public FWTInteractionUpdate(
           long interactionID,
           lagan.api.main.FWTInteractionMessage interactionMessage,
           java.lang.String queueForInteractionMessage) {
           this.interactionID = interactionID;
           this.interactionMessage = interactionMessage;
           this.queueForInteractionMessage = queueForInteractionMessage;
    }


    /**
     * Gets the interactionID value for this FWTInteractionUpdate.
     * 
     * @return interactionID
     */
    public long getInteractionID() {
        return interactionID;
    }


    /**
     * Sets the interactionID value for this FWTInteractionUpdate.
     * 
     * @param interactionID
     */
    public void setInteractionID(long interactionID) {
        this.interactionID = interactionID;
    }


    /**
     * Gets the interactionMessage value for this FWTInteractionUpdate.
     * 
     * @return interactionMessage
     */
    public lagan.api.main.FWTInteractionMessage getInteractionMessage() {
        return interactionMessage;
    }


    /**
     * Sets the interactionMessage value for this FWTInteractionUpdate.
     * 
     * @param interactionMessage
     */
    public void setInteractionMessage(lagan.api.main.FWTInteractionMessage interactionMessage) {
        this.interactionMessage = interactionMessage;
    }


    /**
     * Gets the queueForInteractionMessage value for this FWTInteractionUpdate.
     * 
     * @return queueForInteractionMessage
     */
    public java.lang.String getQueueForInteractionMessage() {
        return queueForInteractionMessage;
    }


    /**
     * Sets the queueForInteractionMessage value for this FWTInteractionUpdate.
     * 
     * @param queueForInteractionMessage
     */
    public void setQueueForInteractionMessage(java.lang.String queueForInteractionMessage) {
        this.queueForInteractionMessage = queueForInteractionMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTInteractionUpdate)) return false;
        FWTInteractionUpdate other = (FWTInteractionUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.interactionID == other.getInteractionID() &&
            ((this.interactionMessage==null && other.getInteractionMessage()==null) || 
             (this.interactionMessage!=null &&
              this.interactionMessage.equals(other.getInteractionMessage()))) &&
            ((this.queueForInteractionMessage==null && other.getQueueForInteractionMessage()==null) || 
             (this.queueForInteractionMessage!=null &&
              this.queueForInteractionMessage.equals(other.getQueueForInteractionMessage())));
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
        _hashCode += new Long(getInteractionID()).hashCode();
        if (getInteractionMessage() != null) {
            _hashCode += getInteractionMessage().hashCode();
        }
        if (getQueueForInteractionMessage() != null) {
            _hashCode += getQueueForInteractionMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTInteractionUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTInteractionUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "InteractionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interactionMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InteractionMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTInteractionMessage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueForInteractionMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queueForInteractionMessage"));
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
