/**
 * FWTCaseForm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseForm  implements java.io.Serializable {
    private lagan.api.main.FWTCaseFormField[] formField;

    private java.lang.String formName;

    private java.lang.String formKey;

    public FWTCaseForm() {
    }

    public FWTCaseForm(
           lagan.api.main.FWTCaseFormField[] formField,
           java.lang.String formName,
           java.lang.String formKey) {
           this.formField = formField;
           this.formName = formName;
           this.formKey = formKey;
    }


    /**
     * Gets the formField value for this FWTCaseForm.
     * 
     * @return formField
     */
    public lagan.api.main.FWTCaseFormField[] getFormField() {
        return formField;
    }


    /**
     * Sets the formField value for this FWTCaseForm.
     * 
     * @param formField
     */
    public void setFormField(lagan.api.main.FWTCaseFormField[] formField) {
        this.formField = formField;
    }

    public lagan.api.main.FWTCaseFormField getFormField(int i) {
        return this.formField[i];
    }

    public void setFormField(int i, lagan.api.main.FWTCaseFormField _value) {
        this.formField[i] = _value;
    }


    /**
     * Gets the formName value for this FWTCaseForm.
     * 
     * @return formName
     */
    public java.lang.String getFormName() {
        return formName;
    }


    /**
     * Sets the formName value for this FWTCaseForm.
     * 
     * @param formName
     */
    public void setFormName(java.lang.String formName) {
        this.formName = formName;
    }


    /**
     * Gets the formKey value for this FWTCaseForm.
     * 
     * @return formKey
     */
    public java.lang.String getFormKey() {
        return formKey;
    }


    /**
     * Sets the formKey value for this FWTCaseForm.
     * 
     * @param formKey
     */
    public void setFormKey(java.lang.String formKey) {
        this.formKey = formKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseForm)) return false;
        FWTCaseForm other = (FWTCaseForm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.formField==null && other.getFormField()==null) || 
             (this.formField!=null &&
              java.util.Arrays.equals(this.formField, other.getFormField()))) &&
            ((this.formName==null && other.getFormName()==null) || 
             (this.formName!=null &&
              this.formName.equals(other.getFormName()))) &&
            ((this.formKey==null && other.getFormKey()==null) || 
             (this.formKey!=null &&
              this.formKey.equals(other.getFormKey())));
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
        if (getFormField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFormField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFormField(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormName() != null) {
            _hashCode += getFormName().hashCode();
        }
        if (getFormKey() != null) {
            _hashCode += getFormKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTCaseForm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseForm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formField");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FormField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseFormField"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FormName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FormKey"));
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
