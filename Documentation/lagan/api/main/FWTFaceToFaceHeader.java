/**
 * FWTFaceToFaceHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTFaceToFaceHeader  implements java.io.Serializable {
    private java.util.Calendar interactionDate;

    private java.lang.Integer branchID;

    private java.lang.String ticketNumber;

    public FWTFaceToFaceHeader() {
    }

    public FWTFaceToFaceHeader(
           java.util.Calendar interactionDate,
           java.lang.Integer branchID,
           java.lang.String ticketNumber) {
           this.interactionDate = interactionDate;
           this.branchID = branchID;
           this.ticketNumber = ticketNumber;
    }


    /**
     * Gets the interactionDate value for this FWTFaceToFaceHeader.
     * 
     * @return interactionDate
     */
    public java.util.Calendar getInteractionDate() {
        return interactionDate;
    }


    /**
     * Sets the interactionDate value for this FWTFaceToFaceHeader.
     * 
     * @param interactionDate
     */
    public void setInteractionDate(java.util.Calendar interactionDate) {
        this.interactionDate = interactionDate;
    }


    /**
     * Gets the branchID value for this FWTFaceToFaceHeader.
     * 
     * @return branchID
     */
    public java.lang.Integer getBranchID() {
        return branchID;
    }


    /**
     * Sets the branchID value for this FWTFaceToFaceHeader.
     * 
     * @param branchID
     */
    public void setBranchID(java.lang.Integer branchID) {
        this.branchID = branchID;
    }


    /**
     * Gets the ticketNumber value for this FWTFaceToFaceHeader.
     * 
     * @return ticketNumber
     */
    public java.lang.String getTicketNumber() {
        return ticketNumber;
    }


    /**
     * Sets the ticketNumber value for this FWTFaceToFaceHeader.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(java.lang.String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTFaceToFaceHeader)) return false;
        FWTFaceToFaceHeader other = (FWTFaceToFaceHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.interactionDate==null && other.getInteractionDate()==null) || 
             (this.interactionDate!=null &&
              this.interactionDate.equals(other.getInteractionDate()))) &&
            ((this.branchID==null && other.getBranchID()==null) || 
             (this.branchID!=null &&
              this.branchID.equals(other.getBranchID()))) &&
            ((this.ticketNumber==null && other.getTicketNumber()==null) || 
             (this.ticketNumber!=null &&
              this.ticketNumber.equals(other.getTicketNumber())));
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
        if (getInteractionDate() != null) {
            _hashCode += getInteractionDate().hashCode();
        }
        if (getBranchID() != null) {
            _hashCode += getBranchID().hashCode();
        }
        if (getTicketNumber() != null) {
            _hashCode += getTicketNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTFaceToFaceHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTFaceToFaceHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InteractionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BranchID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketNumber"));
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
