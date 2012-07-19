/**
 * FWTFaceToFaceConversation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;


/**
 * Both the Duration and WaitingTime should be supplied in seconds
 */
public class FWTFaceToFaceConversation  implements java.io.Serializable {
    private long faceToFaceID;

    private java.util.Calendar startDate;

    private java.lang.Integer duration;

    private java.lang.Integer counter;

    private java.lang.Integer queue;

    private java.lang.Integer waitingTime;

    public FWTFaceToFaceConversation() {
    }

    public FWTFaceToFaceConversation(
           long faceToFaceID,
           java.util.Calendar startDate,
           java.lang.Integer duration,
           java.lang.Integer counter,
           java.lang.Integer queue,
           java.lang.Integer waitingTime) {
           this.faceToFaceID = faceToFaceID;
           this.startDate = startDate;
           this.duration = duration;
           this.counter = counter;
           this.queue = queue;
           this.waitingTime = waitingTime;
    }


    /**
     * Gets the faceToFaceID value for this FWTFaceToFaceConversation.
     * 
     * @return faceToFaceID
     */
    public long getFaceToFaceID() {
        return faceToFaceID;
    }


    /**
     * Sets the faceToFaceID value for this FWTFaceToFaceConversation.
     * 
     * @param faceToFaceID
     */
    public void setFaceToFaceID(long faceToFaceID) {
        this.faceToFaceID = faceToFaceID;
    }


    /**
     * Gets the startDate value for this FWTFaceToFaceConversation.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this FWTFaceToFaceConversation.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the duration value for this FWTFaceToFaceConversation.
     * 
     * @return duration
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this FWTFaceToFaceConversation.
     * 
     * @param duration
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the counter value for this FWTFaceToFaceConversation.
     * 
     * @return counter
     */
    public java.lang.Integer getCounter() {
        return counter;
    }


    /**
     * Sets the counter value for this FWTFaceToFaceConversation.
     * 
     * @param counter
     */
    public void setCounter(java.lang.Integer counter) {
        this.counter = counter;
    }


    /**
     * Gets the queue value for this FWTFaceToFaceConversation.
     * 
     * @return queue
     */
    public java.lang.Integer getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this FWTFaceToFaceConversation.
     * 
     * @param queue
     */
    public void setQueue(java.lang.Integer queue) {
        this.queue = queue;
    }


    /**
     * Gets the waitingTime value for this FWTFaceToFaceConversation.
     * 
     * @return waitingTime
     */
    public java.lang.Integer getWaitingTime() {
        return waitingTime;
    }


    /**
     * Sets the waitingTime value for this FWTFaceToFaceConversation.
     * 
     * @param waitingTime
     */
    public void setWaitingTime(java.lang.Integer waitingTime) {
        this.waitingTime = waitingTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTFaceToFaceConversation)) return false;
        FWTFaceToFaceConversation other = (FWTFaceToFaceConversation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.faceToFaceID == other.getFaceToFaceID() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.counter==null && other.getCounter()==null) || 
             (this.counter!=null &&
              this.counter.equals(other.getCounter()))) &&
            ((this.queue==null && other.getQueue()==null) || 
             (this.queue!=null &&
              this.queue.equals(other.getQueue()))) &&
            ((this.waitingTime==null && other.getWaitingTime()==null) || 
             (this.waitingTime!=null &&
              this.waitingTime.equals(other.getWaitingTime())));
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
        _hashCode += new Long(getFaceToFaceID()).hashCode();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getCounter() != null) {
            _hashCode += getCounter().hashCode();
        }
        if (getQueue() != null) {
            _hashCode += getQueue().hashCode();
        }
        if (getWaitingTime() != null) {
            _hashCode += getWaitingTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTFaceToFaceConversation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTFaceToFaceConversation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faceToFaceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FaceToFaceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Counter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waitingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WaitingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
