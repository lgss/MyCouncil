/**
 * FWTPartyCluster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTPartyCluster  implements java.io.Serializable {
    private lagan.api.main.FWTObjectID[] objectID;

    private java.lang.String clusterID;

    public FWTPartyCluster() {
    }

    public FWTPartyCluster(
           lagan.api.main.FWTObjectID[] objectID,
           java.lang.String clusterID) {
           this.objectID = objectID;
           this.clusterID = clusterID;
    }


    /**
     * Gets the objectID value for this FWTPartyCluster.
     * 
     * @return objectID
     */
    public lagan.api.main.FWTObjectID[] getObjectID() {
        return objectID;
    }


    /**
     * Sets the objectID value for this FWTPartyCluster.
     * 
     * @param objectID
     */
    public void setObjectID(lagan.api.main.FWTObjectID[] objectID) {
        this.objectID = objectID;
    }

    public lagan.api.main.FWTObjectID getObjectID(int i) {
        return this.objectID[i];
    }

    public void setObjectID(int i, lagan.api.main.FWTObjectID _value) {
        this.objectID[i] = _value;
    }


    /**
     * Gets the clusterID value for this FWTPartyCluster.
     * 
     * @return clusterID
     */
    public java.lang.String getClusterID() {
        return clusterID;
    }


    /**
     * Sets the clusterID value for this FWTPartyCluster.
     * 
     * @param clusterID
     */
    public void setClusterID(java.lang.String clusterID) {
        this.clusterID = clusterID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTPartyCluster)) return false;
        FWTPartyCluster other = (FWTPartyCluster) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectID==null && other.getObjectID()==null) || 
             (this.objectID!=null &&
              java.util.Arrays.equals(this.objectID, other.getObjectID()))) &&
            ((this.clusterID==null && other.getClusterID()==null) || 
             (this.clusterID!=null &&
              this.clusterID.equals(other.getClusterID())));
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
        if (getObjectID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjectID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjectID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClusterID() != null) {
            _hashCode += getClusterID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTPartyCluster.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTPartyCluster"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ObjectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectID"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClusterID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
