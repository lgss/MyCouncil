/**
 * FWTSearchAndRetrieveCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTSearchAndRetrieveCase  implements java.io.Serializable {
    private lagan.api.main.FWTCaseSearch FWTCaseSearch;

    /* Values: all, core, eforms-r,
     *                                     eforms-rw, events, form, fullform,
     * notes, tasks, workflow,
     *                                     interactions, eform-data, linkcases */
    private java.lang.String[] option;

    public FWTSearchAndRetrieveCase() {
    }

    public FWTSearchAndRetrieveCase(
           lagan.api.main.FWTCaseSearch FWTCaseSearch,
           java.lang.String[] option) {
           this.FWTCaseSearch = FWTCaseSearch;
           this.option = option;
    }


    /**
     * Gets the FWTCaseSearch value for this FWTSearchAndRetrieveCase.
     * 
     * @return FWTCaseSearch
     */
    public lagan.api.main.FWTCaseSearch getFWTCaseSearch() {
        return FWTCaseSearch;
    }


    /**
     * Sets the FWTCaseSearch value for this FWTSearchAndRetrieveCase.
     * 
     * @param FWTCaseSearch
     */
    public void setFWTCaseSearch(lagan.api.main.FWTCaseSearch FWTCaseSearch) {
        this.FWTCaseSearch = FWTCaseSearch;
    }


    /**
     * Gets the option value for this FWTSearchAndRetrieveCase.
     * 
     * @return option   * Values: all, core, eforms-r,
     *                                     eforms-rw, events, form, fullform,
     * notes, tasks, workflow,
     *                                     interactions, eform-data, linkcases
     */
    public java.lang.String[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this FWTSearchAndRetrieveCase.
     * 
     * @param option   * Values: all, core, eforms-r,
     *                                     eforms-rw, events, form, fullform,
     * notes, tasks, workflow,
     *                                     interactions, eform-data, linkcases
     */
    public void setOption(java.lang.String[] option) {
        this.option = option;
    }

    public java.lang.String getOption(int i) {
        return this.option[i];
    }

    public void setOption(int i, java.lang.String _value) {
        this.option[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTSearchAndRetrieveCase)) return false;
        FWTSearchAndRetrieveCase other = (FWTSearchAndRetrieveCase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.FWTCaseSearch==null && other.getFWTCaseSearch()==null) || 
             (this.FWTCaseSearch!=null &&
              this.FWTCaseSearch.equals(other.getFWTCaseSearch()))) &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              java.util.Arrays.equals(this.option, other.getOption())));
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
        if (getFWTCaseSearch() != null) {
            _hashCode += getFWTCaseSearch().hashCode();
        }
        if (getOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOption(), i);
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
        new org.apache.axis.description.TypeDesc(FWTSearchAndRetrieveCase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTSearchAndRetrieveCase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FWTCaseSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTCaseSearch"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">>FWTSearchAndRetrieveCase>Option"));
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
