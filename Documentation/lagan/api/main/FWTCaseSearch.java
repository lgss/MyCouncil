/**
 * FWTCaseSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseSearch  implements java.io.Serializable {
    private java.lang.String caseReference;

    /* open, closed, all (If no value is
     *                                     supplied the default is all) */
    private java.lang.String status;

    private java.lang.Integer classificationEventCode;

    private java.lang.String title;

    private java.lang.String queue;

    private java.lang.String associatedObjectDescription;

    private lagan.api.main.FWTObjectID associatedObjectId;

    /* User ID */
    private lagan.api.main.FWTUser raisedByUser;

    /* User ID */
    private lagan.api.main.FWTUser currentHandler;

    private java.util.Calendar createdAfter;

    private java.util.Calendar createdBefore;

    private java.lang.Integer priorityMinimum;

    private java.lang.Integer priorityMaximum;

    private java.lang.Integer resultsLimit;

    private java.lang.Integer severityMinimum;

    private java.lang.Integer severityMaximum;

    /* NAMEKEY field used in the LGNCC_CASECATEGORYDEFINITION table */
    private java.lang.String categoryNameKey;

    public FWTCaseSearch() {
    }

    public FWTCaseSearch(
           java.lang.String caseReference,
           java.lang.String status,
           java.lang.Integer classificationEventCode,
           java.lang.String title,
           java.lang.String queue,
           java.lang.String associatedObjectDescription,
           lagan.api.main.FWTObjectID associatedObjectId,
           lagan.api.main.FWTUser raisedByUser,
           lagan.api.main.FWTUser currentHandler,
           java.util.Calendar createdAfter,
           java.util.Calendar createdBefore,
           java.lang.Integer priorityMinimum,
           java.lang.Integer priorityMaximum,
           java.lang.Integer resultsLimit,
           java.lang.Integer severityMinimum,
           java.lang.Integer severityMaximum,
           java.lang.String categoryNameKey) {
           this.caseReference = caseReference;
           this.status = status;
           this.classificationEventCode = classificationEventCode;
           this.title = title;
           this.queue = queue;
           this.associatedObjectDescription = associatedObjectDescription;
           this.associatedObjectId = associatedObjectId;
           this.raisedByUser = raisedByUser;
           this.currentHandler = currentHandler;
           this.createdAfter = createdAfter;
           this.createdBefore = createdBefore;
           this.priorityMinimum = priorityMinimum;
           this.priorityMaximum = priorityMaximum;
           this.resultsLimit = resultsLimit;
           this.severityMinimum = severityMinimum;
           this.severityMaximum = severityMaximum;
           this.categoryNameKey = categoryNameKey;
    }


    /**
     * Gets the caseReference value for this FWTCaseSearch.
     * 
     * @return caseReference
     */
    public java.lang.String getCaseReference() {
        return caseReference;
    }


    /**
     * Sets the caseReference value for this FWTCaseSearch.
     * 
     * @param caseReference
     */
    public void setCaseReference(java.lang.String caseReference) {
        this.caseReference = caseReference;
    }


    /**
     * Gets the status value for this FWTCaseSearch.
     * 
     * @return status   * open, closed, all (If no value is
     *                                     supplied the default is all)
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FWTCaseSearch.
     * 
     * @param status   * open, closed, all (If no value is
     *                                     supplied the default is all)
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the classificationEventCode value for this FWTCaseSearch.
     * 
     * @return classificationEventCode
     */
    public java.lang.Integer getClassificationEventCode() {
        return classificationEventCode;
    }


    /**
     * Sets the classificationEventCode value for this FWTCaseSearch.
     * 
     * @param classificationEventCode
     */
    public void setClassificationEventCode(java.lang.Integer classificationEventCode) {
        this.classificationEventCode = classificationEventCode;
    }


    /**
     * Gets the title value for this FWTCaseSearch.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this FWTCaseSearch.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the queue value for this FWTCaseSearch.
     * 
     * @return queue
     */
    public java.lang.String getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this FWTCaseSearch.
     * 
     * @param queue
     */
    public void setQueue(java.lang.String queue) {
        this.queue = queue;
    }


    /**
     * Gets the associatedObjectDescription value for this FWTCaseSearch.
     * 
     * @return associatedObjectDescription
     */
    public java.lang.String getAssociatedObjectDescription() {
        return associatedObjectDescription;
    }


    /**
     * Sets the associatedObjectDescription value for this FWTCaseSearch.
     * 
     * @param associatedObjectDescription
     */
    public void setAssociatedObjectDescription(java.lang.String associatedObjectDescription) {
        this.associatedObjectDescription = associatedObjectDescription;
    }


    /**
     * Gets the associatedObjectId value for this FWTCaseSearch.
     * 
     * @return associatedObjectId
     */
    public lagan.api.main.FWTObjectID getAssociatedObjectId() {
        return associatedObjectId;
    }


    /**
     * Sets the associatedObjectId value for this FWTCaseSearch.
     * 
     * @param associatedObjectId
     */
    public void setAssociatedObjectId(lagan.api.main.FWTObjectID associatedObjectId) {
        this.associatedObjectId = associatedObjectId;
    }


    /**
     * Gets the raisedByUser value for this FWTCaseSearch.
     * 
     * @return raisedByUser   * User ID
     */
    public lagan.api.main.FWTUser getRaisedByUser() {
        return raisedByUser;
    }


    /**
     * Sets the raisedByUser value for this FWTCaseSearch.
     * 
     * @param raisedByUser   * User ID
     */
    public void setRaisedByUser(lagan.api.main.FWTUser raisedByUser) {
        this.raisedByUser = raisedByUser;
    }


    /**
     * Gets the currentHandler value for this FWTCaseSearch.
     * 
     * @return currentHandler   * User ID
     */
    public lagan.api.main.FWTUser getCurrentHandler() {
        return currentHandler;
    }


    /**
     * Sets the currentHandler value for this FWTCaseSearch.
     * 
     * @param currentHandler   * User ID
     */
    public void setCurrentHandler(lagan.api.main.FWTUser currentHandler) {
        this.currentHandler = currentHandler;
    }


    /**
     * Gets the createdAfter value for this FWTCaseSearch.
     * 
     * @return createdAfter
     */
    public java.util.Calendar getCreatedAfter() {
        return createdAfter;
    }


    /**
     * Sets the createdAfter value for this FWTCaseSearch.
     * 
     * @param createdAfter
     */
    public void setCreatedAfter(java.util.Calendar createdAfter) {
        this.createdAfter = createdAfter;
    }


    /**
     * Gets the createdBefore value for this FWTCaseSearch.
     * 
     * @return createdBefore
     */
    public java.util.Calendar getCreatedBefore() {
        return createdBefore;
    }


    /**
     * Sets the createdBefore value for this FWTCaseSearch.
     * 
     * @param createdBefore
     */
    public void setCreatedBefore(java.util.Calendar createdBefore) {
        this.createdBefore = createdBefore;
    }


    /**
     * Gets the priorityMinimum value for this FWTCaseSearch.
     * 
     * @return priorityMinimum
     */
    public java.lang.Integer getPriorityMinimum() {
        return priorityMinimum;
    }


    /**
     * Sets the priorityMinimum value for this FWTCaseSearch.
     * 
     * @param priorityMinimum
     */
    public void setPriorityMinimum(java.lang.Integer priorityMinimum) {
        this.priorityMinimum = priorityMinimum;
    }


    /**
     * Gets the priorityMaximum value for this FWTCaseSearch.
     * 
     * @return priorityMaximum
     */
    public java.lang.Integer getPriorityMaximum() {
        return priorityMaximum;
    }


    /**
     * Sets the priorityMaximum value for this FWTCaseSearch.
     * 
     * @param priorityMaximum
     */
    public void setPriorityMaximum(java.lang.Integer priorityMaximum) {
        this.priorityMaximum = priorityMaximum;
    }


    /**
     * Gets the resultsLimit value for this FWTCaseSearch.
     * 
     * @return resultsLimit
     */
    public java.lang.Integer getResultsLimit() {
        return resultsLimit;
    }


    /**
     * Sets the resultsLimit value for this FWTCaseSearch.
     * 
     * @param resultsLimit
     */
    public void setResultsLimit(java.lang.Integer resultsLimit) {
        this.resultsLimit = resultsLimit;
    }


    /**
     * Gets the severityMinimum value for this FWTCaseSearch.
     * 
     * @return severityMinimum
     */
    public java.lang.Integer getSeverityMinimum() {
        return severityMinimum;
    }


    /**
     * Sets the severityMinimum value for this FWTCaseSearch.
     * 
     * @param severityMinimum
     */
    public void setSeverityMinimum(java.lang.Integer severityMinimum) {
        this.severityMinimum = severityMinimum;
    }


    /**
     * Gets the severityMaximum value for this FWTCaseSearch.
     * 
     * @return severityMaximum
     */
    public java.lang.Integer getSeverityMaximum() {
        return severityMaximum;
    }


    /**
     * Sets the severityMaximum value for this FWTCaseSearch.
     * 
     * @param severityMaximum
     */
    public void setSeverityMaximum(java.lang.Integer severityMaximum) {
        this.severityMaximum = severityMaximum;
    }


    /**
     * Gets the categoryNameKey value for this FWTCaseSearch.
     * 
     * @return categoryNameKey   * NAMEKEY field used in the LGNCC_CASECATEGORYDEFINITION table
     */
    public java.lang.String getCategoryNameKey() {
        return categoryNameKey;
    }


    /**
     * Sets the categoryNameKey value for this FWTCaseSearch.
     * 
     * @param categoryNameKey   * NAMEKEY field used in the LGNCC_CASECATEGORYDEFINITION table
     */
    public void setCategoryNameKey(java.lang.String categoryNameKey) {
        this.categoryNameKey = categoryNameKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseSearch)) return false;
        FWTCaseSearch other = (FWTCaseSearch) obj;
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
            ((this.classificationEventCode==null && other.getClassificationEventCode()==null) || 
             (this.classificationEventCode!=null &&
              this.classificationEventCode.equals(other.getClassificationEventCode()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.queue==null && other.getQueue()==null) || 
             (this.queue!=null &&
              this.queue.equals(other.getQueue()))) &&
            ((this.associatedObjectDescription==null && other.getAssociatedObjectDescription()==null) || 
             (this.associatedObjectDescription!=null &&
              this.associatedObjectDescription.equals(other.getAssociatedObjectDescription()))) &&
            ((this.associatedObjectId==null && other.getAssociatedObjectId()==null) || 
             (this.associatedObjectId!=null &&
              this.associatedObjectId.equals(other.getAssociatedObjectId()))) &&
            ((this.raisedByUser==null && other.getRaisedByUser()==null) || 
             (this.raisedByUser!=null &&
              this.raisedByUser.equals(other.getRaisedByUser()))) &&
            ((this.currentHandler==null && other.getCurrentHandler()==null) || 
             (this.currentHandler!=null &&
              this.currentHandler.equals(other.getCurrentHandler()))) &&
            ((this.createdAfter==null && other.getCreatedAfter()==null) || 
             (this.createdAfter!=null &&
              this.createdAfter.equals(other.getCreatedAfter()))) &&
            ((this.createdBefore==null && other.getCreatedBefore()==null) || 
             (this.createdBefore!=null &&
              this.createdBefore.equals(other.getCreatedBefore()))) &&
            ((this.priorityMinimum==null && other.getPriorityMinimum()==null) || 
             (this.priorityMinimum!=null &&
              this.priorityMinimum.equals(other.getPriorityMinimum()))) &&
            ((this.priorityMaximum==null && other.getPriorityMaximum()==null) || 
             (this.priorityMaximum!=null &&
              this.priorityMaximum.equals(other.getPriorityMaximum()))) &&
            ((this.resultsLimit==null && other.getResultsLimit()==null) || 
             (this.resultsLimit!=null &&
              this.resultsLimit.equals(other.getResultsLimit()))) &&
            ((this.severityMinimum==null && other.getSeverityMinimum()==null) || 
             (this.severityMinimum!=null &&
              this.severityMinimum.equals(other.getSeverityMinimum()))) &&
            ((this.severityMaximum==null && other.getSeverityMaximum()==null) || 
             (this.severityMaximum!=null &&
              this.severityMaximum.equals(other.getSeverityMaximum()))) &&
            ((this.categoryNameKey==null && other.getCategoryNameKey()==null) || 
             (this.categoryNameKey!=null &&
              this.categoryNameKey.equals(other.getCategoryNameKey())));
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
        if (getClassificationEventCode() != null) {
            _hashCode += getClassificationEventCode().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getQueue() != null) {
            _hashCode += getQueue().hashCode();
        }
        if (getAssociatedObjectDescription() != null) {
            _hashCode += getAssociatedObjectDescription().hashCode();
        }
        if (getAssociatedObjectId() != null) {
            _hashCode += getAssociatedObjectId().hashCode();
        }
        if (getRaisedByUser() != null) {
            _hashCode += getRaisedByUser().hashCode();
        }
        if (getCurrentHandler() != null) {
            _hashCode += getCurrentHandler().hashCode();
        }
        if (getCreatedAfter() != null) {
            _hashCode += getCreatedAfter().hashCode();
        }
        if (getCreatedBefore() != null) {
            _hashCode += getCreatedBefore().hashCode();
        }
        if (getPriorityMinimum() != null) {
            _hashCode += getPriorityMinimum().hashCode();
        }
        if (getPriorityMaximum() != null) {
            _hashCode += getPriorityMaximum().hashCode();
        }
        if (getResultsLimit() != null) {
            _hashCode += getResultsLimit().hashCode();
        }
        if (getSeverityMinimum() != null) {
            _hashCode += getSeverityMinimum().hashCode();
        }
        if (getSeverityMaximum() != null) {
            _hashCode += getSeverityMaximum().hashCode();
        }
        if (getCategoryNameKey() != null) {
            _hashCode += getCategoryNameKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FWTCaseSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTCaseSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CaseReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificationEventCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClassificationEventCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedObjectDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AssociatedObjectDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedObjectId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AssociatedObjectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raisedByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RaisedByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTUser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentHandler");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrentHandler"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTUser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityMinimum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PriorityMinimum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityMaximum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PriorityMaximum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultsLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultsLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityMinimum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SeverityMinimum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityMaximum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SeverityMaximum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
