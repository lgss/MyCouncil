/**
 * FWTInteractionCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTInteractionCreate  implements java.io.Serializable {
    private java.lang.String channel;

    private boolean verified;

    private lagan.api.main.FWTObjectID partyID;

    private java.lang.String caseReference;

    /* This is a reference to interaction
     *                                     collateral information. It is
     * not
     *                                     possible currently to create
     *                                     collateral data through the
     *                                     webservice so this field can be
     * omitted. */
    private java.lang.String channelReference;

    /* This field is reserved for future
     *                                     use. */
    private java.lang.String[] channelData;

    private java.lang.String[] noteText;

    public FWTInteractionCreate() {
    }

    public FWTInteractionCreate(
           java.lang.String channel,
           boolean verified,
           lagan.api.main.FWTObjectID partyID,
           java.lang.String caseReference,
           java.lang.String channelReference,
           java.lang.String[] channelData,
           java.lang.String[] noteText) {
           this.channel = channel;
           this.verified = verified;
           this.partyID = partyID;
           this.caseReference = caseReference;
           this.channelReference = channelReference;
           this.channelData = channelData;
           this.noteText = noteText;
    }


    /**
     * Gets the channel value for this FWTInteractionCreate.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this FWTInteractionCreate.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the verified value for this FWTInteractionCreate.
     * 
     * @return verified
     */
    public boolean isVerified() {
        return verified;
    }


    /**
     * Sets the verified value for this FWTInteractionCreate.
     * 
     * @param verified
     */
    public void setVerified(boolean verified) {
        this.verified = verified;
    }


    /**
     * Gets the partyID value for this FWTInteractionCreate.
     * 
     * @return partyID
     */
    public lagan.api.main.FWTObjectID getPartyID() {
        return partyID;
    }


    /**
     * Sets the partyID value for this FWTInteractionCreate.
     * 
     * @param partyID
     */
    public void setPartyID(lagan.api.main.FWTObjectID partyID) {
        this.partyID = partyID;
    }


    /**
     * Gets the caseReference value for this FWTInteractionCreate.
     * 
     * @return caseReference
     */
    public java.lang.String getCaseReference() {
        return caseReference;
    }


    /**
     * Sets the caseReference value for this FWTInteractionCreate.
     * 
     * @param caseReference
     */
    public void setCaseReference(java.lang.String caseReference) {
        this.caseReference = caseReference;
    }


    /**
     * Gets the channelReference value for this FWTInteractionCreate.
     * 
     * @return channelReference   * This is a reference to interaction
     *                                     collateral information. It is
     * not
     *                                     possible currently to create
     *                                     collateral data through the
     *                                     webservice so this field can be
     * omitted.
     */
    public java.lang.String getChannelReference() {
        return channelReference;
    }


    /**
     * Sets the channelReference value for this FWTInteractionCreate.
     * 
     * @param channelReference   * This is a reference to interaction
     *                                     collateral information. It is
     * not
     *                                     possible currently to create
     *                                     collateral data through the
     *                                     webservice so this field can be
     * omitted.
     */
    public void setChannelReference(java.lang.String channelReference) {
        this.channelReference = channelReference;
    }


    /**
     * Gets the channelData value for this FWTInteractionCreate.
     * 
     * @return channelData   * This field is reserved for future
     *                                     use.
     */
    public java.lang.String[] getChannelData() {
        return channelData;
    }


    /**
     * Sets the channelData value for this FWTInteractionCreate.
     * 
     * @param channelData   * This field is reserved for future
     *                                     use.
     */
    public void setChannelData(java.lang.String[] channelData) {
        this.channelData = channelData;
    }

    public java.lang.String getChannelData(int i) {
        return this.channelData[i];
    }

    public void setChannelData(int i, java.lang.String _value) {
        this.channelData[i] = _value;
    }


    /**
     * Gets the noteText value for this FWTInteractionCreate.
     * 
     * @return noteText
     */
    public java.lang.String[] getNoteText() {
        return noteText;
    }


    /**
     * Sets the noteText value for this FWTInteractionCreate.
     * 
     * @param noteText
     */
    public void setNoteText(java.lang.String[] noteText) {
        this.noteText = noteText;
    }

    public java.lang.String getNoteText(int i) {
        return this.noteText[i];
    }

    public void setNoteText(int i, java.lang.String _value) {
        this.noteText[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTInteractionCreate)) return false;
        FWTInteractionCreate other = (FWTInteractionCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            this.verified == other.isVerified() &&
            ((this.partyID==null && other.getPartyID()==null) || 
             (this.partyID!=null &&
              this.partyID.equals(other.getPartyID()))) &&
            ((this.caseReference==null && other.getCaseReference()==null) || 
             (this.caseReference!=null &&
              this.caseReference.equals(other.getCaseReference()))) &&
            ((this.channelReference==null && other.getChannelReference()==null) || 
             (this.channelReference!=null &&
              this.channelReference.equals(other.getChannelReference()))) &&
            ((this.channelData==null && other.getChannelData()==null) || 
             (this.channelData!=null &&
              java.util.Arrays.equals(this.channelData, other.getChannelData()))) &&
            ((this.noteText==null && other.getNoteText()==null) || 
             (this.noteText!=null &&
              java.util.Arrays.equals(this.noteText, other.getNoteText())));
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
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        _hashCode += (isVerified() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPartyID() != null) {
            _hashCode += getPartyID().hashCode();
        }
        if (getCaseReference() != null) {
            _hashCode += getCaseReference().hashCode();
        }
        if (getChannelReference() != null) {
            _hashCode += getChannelReference().hashCode();
        }
        if (getChannelData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannelData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannelData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNoteText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNoteText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNoteText(), i);
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
        new org.apache.axis.description.TypeDesc(FWTInteractionCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTInteractionCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "Channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Verified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CaseReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChannelReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChannelData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NoteText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTInteractionCreate>NoteText"));
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
