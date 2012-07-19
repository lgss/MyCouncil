/**
 * FWTSearchHit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTSearchHit  implements java.io.Serializable {
    /* Domain object identifier */
    private java.lang.String ID;

    /* Domain object type. Examples: odmobject, case */
    private java.lang.String type;

    /* A short textual description of the object */
    private java.lang.String title;

    /* The search score for this hit */
    private float score;

    /* A list of fields belonging to this object */
    private lagan.api.main.FWTSearchHitField[] field;

    public FWTSearchHit() {
    }

    public FWTSearchHit(
           java.lang.String ID,
           java.lang.String type,
           java.lang.String title,
           float score,
           lagan.api.main.FWTSearchHitField[] field) {
           this.ID = ID;
           this.type = type;
           this.title = title;
           this.score = score;
           this.field = field;
    }


    /**
     * Gets the ID value for this FWTSearchHit.
     * 
     * @return ID   * Domain object identifier
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this FWTSearchHit.
     * 
     * @param ID   * Domain object identifier
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the type value for this FWTSearchHit.
     * 
     * @return type   * Domain object type. Examples: odmobject, case
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this FWTSearchHit.
     * 
     * @param type   * Domain object type. Examples: odmobject, case
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the title value for this FWTSearchHit.
     * 
     * @return title   * A short textual description of the object
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this FWTSearchHit.
     * 
     * @param title   * A short textual description of the object
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the score value for this FWTSearchHit.
     * 
     * @return score   * The search score for this hit
     */
    public float getScore() {
        return score;
    }


    /**
     * Sets the score value for this FWTSearchHit.
     * 
     * @param score   * The search score for this hit
     */
    public void setScore(float score) {
        this.score = score;
    }


    /**
     * Gets the field value for this FWTSearchHit.
     * 
     * @return field   * A list of fields belonging to this object
     */
    public lagan.api.main.FWTSearchHitField[] getField() {
        return field;
    }


    /**
     * Sets the field value for this FWTSearchHit.
     * 
     * @param field   * A list of fields belonging to this object
     */
    public void setField(lagan.api.main.FWTSearchHitField[] field) {
        this.field = field;
    }

    public lagan.api.main.FWTSearchHitField getField(int i) {
        return this.field[i];
    }

    public void setField(int i, lagan.api.main.FWTSearchHitField _value) {
        this.field[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTSearchHit)) return false;
        FWTSearchHit other = (FWTSearchHit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            this.score == other.getScore() &&
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              java.util.Arrays.equals(this.field, other.getField())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        _hashCode += new Float(getScore()).hashCode();
        if (getField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getField(), i);
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
        new org.apache.axis.description.TypeDesc(FWTSearchHit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTSearchHit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTSearchHitField"));
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
