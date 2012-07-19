/**
 * FWTCaseBriefDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseBriefDetails  implements java.io.Serializable {
    private java.lang.String caseReference;

    /* open, closed */
    private java.lang.String status;

    private java.util.Calendar opened;

    private java.util.Calendar endDate;

    private lagan.api.main.FWTUser raisedByUser;

    private java.lang.String[] classification;

    private java.lang.String title;

    private lagan.api.main.FWTObjectBriefDetails associatedObject;

    private int category;

    private java.lang.String categoryDescription;

    private java.lang.String categoryNameKey;

    private java.lang.String categoryNameValue;

    private java.lang.String XCoord;

    private java.lang.String YCoord;

    public FWTCaseBriefDetails() {
    }

    public FWTCaseBriefDetails(
           java.lang.String caseReference,
           java.lang.String status,
           java.util.Calendar opened,
           java.util.Calendar endDate,
           lagan.api.main.FWTUser raisedByUser,
           java.lang.String[] classification,
           java.lang.String title,
           lagan.api.main.FWTObjectBriefDetails associatedObject,
           int category,
           java.lang.String categoryDescription,
           java.lang.String categoryNameKey,
           java.lang.String categoryNameValue,
           java.lang.String XCoord,
           java.lang.String YCoord) {
           this.caseReference = caseReference;
           this.status = status;
           this.opened = opened;
           this.endDate = endDate;
           this.raisedByUser = raisedByUser;
           this.classification = classification;
           this.title = title;
           this.associatedObject = associatedObject;
           this.category = category;
           this.categoryDescription = categoryDescription;
           this.categoryNameKey = categoryNameKey;
           this.categoryNameValue = categoryNameValue;
           this.XCoord = XCoord;
           this.YCoord = YCoord;
    }


    /**
     * Gets the caseReference value for this FWTCaseBriefDetails.
     * 
     * @return caseReference
     */
    public java.lang.String getCaseReference() {
        return caseReference;
    }


    /**
     * Sets the caseReference value for this FWTCaseBriefDetails.
     * 
     * @param caseReference
     */
    public void setCaseReference(java.lang.String caseReference) {
        this.caseReference = caseReference;
    }


    /**
     * Gets the status value for this FWTCaseBriefDetails.
     * 
     * @return status   * open, closed
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FWTCaseBriefDetails.
     * 
     * @param status   * open, closed
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the opened value for this FWTCaseBriefDetails.
     * 
     * @return opened
     */
    public java.util.Calendar getOpened() {
        return opened;
    }


    /**
     * Sets the opened value for this FWTCaseBriefDetails.
     * 
     * @param opened
     */
    public void setOpened(java.util.Calendar opened) {
        this.opened = opened;
    }


    /**
     * Gets the endDate value for this FWTCaseBriefDetails.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this FWTCaseBriefDetails.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the raisedByUser value for this FWTCaseBriefDetails.
     * 
     * @return raisedByUser
     */
    public lagan.api.main.FWTUser getRaisedByUser() {
        return raisedByUser;
    }


    /**
     * Sets the raisedByUser value for this FWTCaseBriefDetails.
     * 
     * @param raisedByUser
     */
    public void setRaisedByUser(lagan.api.main.FWTUser raisedByUser) {
        this.raisedByUser = raisedByUser;
    }


    /**
     * Gets the classification value for this FWTCaseBriefDetails.
     * 
     * @return classification
     */
    public java.lang.String[] getClassification() {
        return classification;
    }


    /**
     * Sets the classification value for this FWTCaseBriefDetails.
     * 
     * @param classification
     */
    public void setClassification(java.lang.String[] classification) {
        this.classification = classification;
    }


    /**
     * Gets the title value for this FWTCaseBriefDetails.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this FWTCaseBriefDetails.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the associatedObject value for this FWTCaseBriefDetails.
     * 
     * @return associatedObject
     */
    public lagan.api.main.FWTObjectBriefDetails getAssociatedObject() {
        return associatedObject;
    }


    /**
     * Sets the associatedObject value for this FWTCaseBriefDetails.
     * 
     * @param associatedObject
     */
    public void setAssociatedObject(lagan.api.main.FWTObjectBriefDetails associatedObject) {
        this.associatedObject = associatedObject;
    }


    /**
     * Gets the category value for this FWTCaseBriefDetails.
     * 
     * @return category
     */
    public int getCategory() {
        return category;
    }


    /**
     * Sets the category value for this FWTCaseBriefDetails.
     * 
     * @param category
     */
    public void setCategory(int category) {
        this.category = category;
    }


    /**
     * Gets the categoryDescription value for this FWTCaseBriefDetails.
     * 
     * @return categoryDescription
     */
    public java.lang.String getCategoryDescription() {
        return categoryDescription;
    }


    /**
     * Sets the categoryDescription value for this FWTCaseBriefDetails.
     * 
     * @param categoryDescription
     */
    public void setCategoryDescription(java.lang.String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }


    /**
     * Gets the categoryNameKey value for this FWTCaseBriefDetails.
     * 
     * @return categoryNameKey
     */
    public java.lang.String getCategoryNameKey() {
        return categoryNameKey;
    }


    /**
     * Sets the categoryNameKey value for this FWTCaseBriefDetails.
     * 
     * @param categoryNameKey
     */
    public void setCategoryNameKey(java.lang.String categoryNameKey) {
        this.categoryNameKey = categoryNameKey;
    }


    /**
     * Gets the categoryNameValue value for this FWTCaseBriefDetails.
     * 
     * @return categoryNameValue
     */
    public java.lang.String getCategoryNameValue() {
        return categoryNameValue;
    }


    /**
     * Sets the categoryNameValue value for this FWTCaseBriefDetails.
     * 
     * @param categoryNameValue
     */
    public void setCategoryNameValue(java.lang.String categoryNameValue) {
        this.categoryNameValue = categoryNameValue;
    }


    /**
     * Gets the XCoord value for this FWTCaseBriefDetails.
     * 
     * @return XCoord
     */
    public java.lang.String getXCoord() {
        return XCoord;
    }


    /**
     * Sets the XCoord value for this FWTCaseBriefDetails.
     * 
     * @param XCoord
     */
    public void setXCoord(java.lang.String XCoord) {
        this.XCoord = XCoord;
    }


    /**
     * Gets the YCoord value for this FWTCaseBriefDetails.
     * 
     * @return YCoord
     */
    public java.lang.String getYCoord() {
        return YCoord;
    }


    /**
     * Sets the YCoord value for this FWTCaseBriefDetails.
     * 
     * @param YCoord
     */
    public void setYCoord(java.lang.String YCoord) {
        this.YCoord = YCoord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseBriefDetails)) return false;
        FWTCaseBriefDetails other = (FWTCaseBriefDetails) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.opened==null && other.getOpened()==null) || 
             (this.opened!=null &&
              this.opened.equals(other.getOpened()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.raisedByUser==null && other.getRaisedByUser()==null) || 
             (this.raisedByUser!=null &&
              this.raisedByUser.equals(other.getRaisedByUser()))) &&
            ((this.classification==null && other.getClassification()==null) || 
             (this.classification!=null &&
              java.util.Arrays.equals(this.classification, other.getClassification()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.associatedObject==null && other.getAssociatedObject()==null) || 
             (this.associatedObject!=null &&
              this.associatedObject.equals(other.getAssociatedObject()))) &&
            this.category == other.getCategory() &&
            ((this.categoryDescription==null && other.getCategoryDescription()==null) || 
             (this.categoryDescription!=null &&
              this.categoryDescription.equals(other.getCategoryDescription()))) &&
            ((this.categoryNameKey==null && other.getCategoryNameKey()==null) || 
             (this.categoryNameKey!=null &&
              this.categoryNameKey.equals(other.getCategoryNameKey()))) &&
            ((this.categoryNameValue==null && other.getCategoryNameValue()==null) || 
             (this.categoryNameValue!=null &&
              this.categoryNameValue.equals(other.getCategoryNameValue()))) &&
            ((this.XCoord==null && other.getXCoord()==null) || 
             (this.XCoord!=null &&
              this.XCoord.equals(other.getXCoord()))) &&
            ((this.YCoord==null && other.getYCoord()==null) || 
             (this.YCoord!=null &&
              this.YCoord.equals(other.getYCoord())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getOpened() != null) {
            _hashCode += getOpened().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getRaisedByUser() != null) {
            _hashCode += getRaisedByUser().hashCode();
        }
        if (getClassification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getAssociatedObject() != null) {
            _hashCode += getAssociatedObject().hashCode();
        }
        _hashCode += getCategory();
        if (getCategoryDescription() != null) {
            _hashCode += getCategoryDescription().hashCode();
        }
        if (getCategoryNameKey() != null) {
            _hashCode += getCategoryNameKey().hashCode();
        }
        if (getCategoryNameValue() != null) {
            _hashCode += getCategoryNameValue().hashCode();
        }
        if (getXCoord() != null) {
            _hashCode += getXCoord().hashCode();
        }
        if (getYCoord() != null) {
            _hashCode += getYCoord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTCaseBriefDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseBriefDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CaseReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opened");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Opened"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raisedByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RaisedByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTUser"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Classification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTCaseClassification>Classifier"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Classifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedObject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AssociatedObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectBriefDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CategoryDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryNameKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CategoryNameKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryNameValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CategoryNameValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XCoord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XCoord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YCoord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "YCoord"));
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
