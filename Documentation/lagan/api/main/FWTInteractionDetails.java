/**
 * FWTInteractionDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTInteractionDetails  implements java.io.Serializable {
    private long interactionID;

    private java.lang.String channel;

    private boolean verified;

    private java.util.Calendar creationDate;

    private lagan.api.main.FWTObjectID partyID;

    /* This is a reference to interaction
     *                                 collateral information where available.
     * The item referenced depends on the type
     *                                 of interaction. For email, fax, sms
     * and
     *                                 mail interactions the reference will
     * be
     *                                 the internal identifier for the
     *                                 corresponding message record. For
     * voice
     *                                 interactions it will be an identifier
     * for a call record. For face to face
     *                                 interactions it will be an identifier
     * for a face to face details record. */
    private java.lang.String channelReference;

    /* This field is reserved for future use. */
    private java.lang.String[] channelData;

    /* initial, linked */
    private java.lang.String relation;

    public FWTInteractionDetails() {
    }

    public FWTInteractionDetails(
           long interactionID,
           java.lang.String channel,
           boolean verified,
           java.util.Calendar creationDate,
           lagan.api.main.FWTObjectID partyID,
           java.lang.String channelReference,
           java.lang.String[] channelData,
           java.lang.String relation) {
           this.interactionID = interactionID;
           this.channel = channel;
           this.verified = verified;
           this.creationDate = creationDate;
           this.partyID = partyID;
           this.channelReference = channelReference;
           this.channelData = channelData;
           this.relation = relation;
    }


    /**
     * Gets the interactionID value for this FWTInteractionDetails.
     * 
     * @return interactionID
     */
    public long getInteractionID() {
        return interactionID;
    }


    /**
     * Sets the interactionID value for this FWTInteractionDetails.
     * 
     * @param interactionID
     */
    public void setInteractionID(long interactionID) {
        this.interactionID = interactionID;
    }


    /**
     * Gets the channel value for this FWTInteractionDetails.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this FWTInteractionDetails.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the verified value for this FWTInteractionDetails.
     * 
     * @return verified
     */
    public boolean isVerified() {
        return verified;
    }


    /**
     * Sets the verified value for this FWTInteractionDetails.
     * 
     * @param verified
     */
    public void setVerified(boolean verified) {
        this.verified = verified;
    }


    /**
     * Gets the creationDate value for this FWTInteractionDetails.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this FWTInteractionDetails.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the partyID value for this FWTInteractionDetails.
     * 
     * @return partyID
     */
    public lagan.api.main.FWTObjectID getPartyID() {
        return partyID;
    }


    /**
     * Sets the partyID value for this FWTInteractionDetails.
     * 
     * @param partyID
     */
    public void setPartyID(lagan.api.main.FWTObjectID partyID) {
        this.partyID = partyID;
    }


    /**
     * Gets the channelReference value for this FWTInteractionDetails.
     * 
     * @return channelReference   * This is a reference to interaction
     *                                 collateral information where available.
     * The item referenced depends on the type
     *                                 of interaction. For email, fax, sms
     * and
     *                                 mail interactions the reference will
     * be
     *                                 the internal identifier for the
     *                                 corresponding message record. For
     * voice
     *                                 interactions it will be an identifier
     * for a call record. For face to face
     *                                 interactions it will be an identifier
     * for a face to face details record.
     */
    public java.lang.String getChannelReference() {
        return channelReference;
    }


    /**
     * Sets the channelReference value for this FWTInteractionDetails.
     * 
     * @param channelReference   * This is a reference to interaction
     *                                 collateral information where available.
     * The item referenced depends on the type
     *                                 of interaction. For email, fax, sms
     * and
     *                                 mail interactions the reference will
     * be
     *                                 the internal identifier for the
     *                                 corresponding message record. For
     * voice
     *                                 interactions it will be an identifier
     * for a call record. For face to face
     *                                 interactions it will be an identifier
     * for a face to face details record.
     */
    public void setChannelReference(java.lang.String channelReference) {
        this.channelReference = channelReference;
    }


    /**
     * Gets the channelData value for this FWTInteractionDetails.
     * 
     * @return channelData   * This field is reserved for future use.
     */
    public java.lang.String[] getChannelData() {
        return channelData;
    }


    /**
     * Sets the channelData value for this FWTInteractionDetails.
     * 
     * @param channelData   * This field is reserved for future use.
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
     * Gets the relation value for this FWTInteractionDetails.
     * 
     * @return relation   * initial, linked
     */
    public java.lang.String getRelation() {
        return relation;
    }


    /**
     * Sets the relation value for this FWTInteractionDetails.
     * 
     * @param relation   * initial, linked
     */
    public void setRelation(java.lang.String relation) {
        this.relation = relation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTInteractionDetails)) return false;
        FWTInteractionDetails other = (FWTInteractionDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.interactionID == other.getInteractionID() &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            this.verified == other.isVerified() &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.partyID==null && other.getPartyID()==null) || 
             (this.partyID!=null &&
              this.partyID.equals(other.getPartyID()))) &&
            ((this.channelReference==null && other.getChannelReference()==null) || 
             (this.channelReference!=null &&
              this.channelReference.equals(other.getChannelReference()))) &&
            ((this.channelData==null && other.getChannelData()==null) || 
             (this.channelData!=null &&
              java.util.Arrays.equals(this.channelData, other.getChannelData()))) &&
            ((this.relation==null && other.getRelation()==null) || 
             (this.relation!=null &&
              this.relation.equals(other.getRelation())));
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
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        _hashCode += (isVerified() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getPartyID() != null) {
            _hashCode += getPartyID().hashCode();
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
        if (getRelation() != null) {
            _hashCode += getRelation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTInteractionDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTInteractionDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "InteractionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("relation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Relation"));
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
