/**
 * FWTCaseCoreDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseCoreDetails  implements java.io.Serializable {
    private java.lang.String caseReference;

    /* open, closed */
    private java.lang.String status;

    private java.util.Calendar opened;

    private java.util.Calendar closed;

    private lagan.api.main.FWTUser raisedByUser;

    private java.lang.String[] classification;

    private java.lang.String title;

    private lagan.api.main.FWTObjectBriefDetails associatedObject;

    private int category;

    private java.lang.String categoryDescription;

    private java.lang.String categoryNameKey;

    private java.lang.String categoryNameValue;

    private int priority;

    private int severity;

    private boolean workflowCase;

    private boolean internal;

    private java.lang.String description;

    private java.lang.String queue;

    private java.util.Calendar dueDate;

    private lagan.api.main.FWTUser currentHandler;

    private java.lang.String XCoord;

    private java.lang.String YCoord;

    public FWTCaseCoreDetails() {
    }

    public FWTCaseCoreDetails(
           java.lang.String caseReference,
           java.lang.String status,
           java.util.Calendar opened,
           java.util.Calendar closed,
           lagan.api.main.FWTUser raisedByUser,
           java.lang.String[] classification,
           java.lang.String title,
           lagan.api.main.FWTObjectBriefDetails associatedObject,
           int category,
           java.lang.String categoryDescription,
           java.lang.String categoryNameKey,
           java.lang.String categoryNameValue,
           int priority,
           int severity,
           boolean workflowCase,
           boolean internal,
           java.lang.String description,
           java.lang.String queue,
           java.util.Calendar dueDate,
           lagan.api.main.FWTUser currentHandler,
           java.lang.String XCoord,
           java.lang.String YCoord) {
           this.caseReference = caseReference;
           this.status = status;
           this.opened = opened;
           this.closed = closed;
           this.raisedByUser = raisedByUser;
           this.classification = classification;
           this.title = title;
           this.associatedObject = associatedObject;
           this.category = category;
           this.categoryDescription = categoryDescription;
           this.categoryNameKey = categoryNameKey;
           this.categoryNameValue = categoryNameValue;
           this.priority = priority;
           this.severity = severity;
           this.workflowCase = workflowCase;
           this.internal = internal;
           this.description = description;
           this.queue = queue;
           this.dueDate = dueDate;
           this.currentHandler = currentHandler;
           this.XCoord = XCoord;
           this.YCoord = YCoord;
    }


    /**
     * Gets the caseReference value for this FWTCaseCoreDetails.
     * 
     * @return caseReference
     */
    public java.lang.String getCaseReference() {
        return caseReference;
    }


    /**
     * Sets the caseReference value for this FWTCaseCoreDetails.
     * 
     * @param caseReference
     */
    public void setCaseReference(java.lang.String caseReference) {
        this.caseReference = caseReference;
    }


    /**
     * Gets the status value for this FWTCaseCoreDetails.
     * 
     * @return status   * open, closed
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FWTCaseCoreDetails.
     * 
     * @param status   * open, closed
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the opened value for this FWTCaseCoreDetails.
     * 
     * @return opened
     */
    public java.util.Calendar getOpened() {
        return opened;
    }


    /**
     * Sets the opened value for this FWTCaseCoreDetails.
     * 
     * @param opened
     */
    public void setOpened(java.util.Calendar opened) {
        this.opened = opened;
    }


    /**
     * Gets the closed value for this FWTCaseCoreDetails.
     * 
     * @return closed
     */
    public java.util.Calendar getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this FWTCaseCoreDetails.
     * 
     * @param closed
     */
    public void setClosed(java.util.Calendar closed) {
        this.closed = closed;
    }


    /**
     * Gets the raisedByUser value for this FWTCaseCoreDetails.
     * 
     * @return raisedByUser
     */
    public lagan.api.main.FWTUser getRaisedByUser() {
        return raisedByUser;
    }


    /**
     * Sets the raisedByUser value for this FWTCaseCoreDetails.
     * 
     * @param raisedByUser
     */
    public void setRaisedByUser(lagan.api.main.FWTUser raisedByUser) {
        this.raisedByUser = raisedByUser;
    }


    /**
     * Gets the classification value for this FWTCaseCoreDetails.
     * 
     * @return classification
     */
    public java.lang.String[] getClassification() {
        return classification;
    }


    /**
     * Sets the classification value for this FWTCaseCoreDetails.
     * 
     * @param classification
     */
    public void setClassification(java.lang.String[] classification) {
        this.classification = classification;
    }


    /**
     * Gets the title value for this FWTCaseCoreDetails.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this FWTCaseCoreDetails.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the associatedObject value for this FWTCaseCoreDetails.
     * 
     * @return associatedObject
     */
    public lagan.api.main.FWTObjectBriefDetails getAssociatedObject() {
        return associatedObject;
    }


    /**
     * Sets the associatedObject value for this FWTCaseCoreDetails.
     * 
     * @param associatedObject
     */
    public void setAssociatedObject(lagan.api.main.FWTObjectBriefDetails associatedObject) {
        this.associatedObject = associatedObject;
    }


    /**
     * Gets the category value for this FWTCaseCoreDetails.
     * 
     * @return category
     */
    public int getCategory() {
        return category;
    }


    /**
     * Sets the category value for this FWTCaseCoreDetails.
     * 
     * @param category
     */
    public void setCategory(int category) {
        this.category = category;
    }


    /**
     * Gets the categoryDescription value for this FWTCaseCoreDetails.
     * 
     * @return categoryDescription
     */
    public java.lang.String getCategoryDescription() {
        return categoryDescription;
    }


    /**
     * Sets the categoryDescription value for this FWTCaseCoreDetails.
     * 
     * @param categoryDescription
     */
    public void setCategoryDescription(java.lang.String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }


    /**
     * Gets the categoryNameKey value for this FWTCaseCoreDetails.
     * 
     * @return categoryNameKey
     */
    public java.lang.String getCategoryNameKey() {
        return categoryNameKey;
    }


    /**
     * Sets the categoryNameKey value for this FWTCaseCoreDetails.
     * 
     * @param categoryNameKey
     */
    public void setCategoryNameKey(java.lang.String categoryNameKey) {
        this.categoryNameKey = categoryNameKey;
    }


    /**
     * Gets the categoryNameValue value for this FWTCaseCoreDetails.
     * 
     * @return categoryNameValue
     */
    public java.lang.String getCategoryNameValue() {
        return categoryNameValue;
    }


    /**
     * Sets the categoryNameValue value for this FWTCaseCoreDetails.
     * 
     * @param categoryNameValue
     */
    public void setCategoryNameValue(java.lang.String categoryNameValue) {
        this.categoryNameValue = categoryNameValue;
    }


    /**
     * Gets the priority value for this FWTCaseCoreDetails.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this FWTCaseCoreDetails.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the severity value for this FWTCaseCoreDetails.
     * 
     * @return severity
     */
    public int getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this FWTCaseCoreDetails.
     * 
     * @param severity
     */
    public void setSeverity(int severity) {
        this.severity = severity;
    }


    /**
     * Gets the workflowCase value for this FWTCaseCoreDetails.
     * 
     * @return workflowCase
     */
    public boolean isWorkflowCase() {
        return workflowCase;
    }


    /**
     * Sets the workflowCase value for this FWTCaseCoreDetails.
     * 
     * @param workflowCase
     */
    public void setWorkflowCase(boolean workflowCase) {
        this.workflowCase = workflowCase;
    }


    /**
     * Gets the internal value for this FWTCaseCoreDetails.
     * 
     * @return internal
     */
    public boolean isInternal() {
        return internal;
    }


    /**
     * Sets the internal value for this FWTCaseCoreDetails.
     * 
     * @param internal
     */
    public void setInternal(boolean internal) {
        this.internal = internal;
    }


    /**
     * Gets the description value for this FWTCaseCoreDetails.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FWTCaseCoreDetails.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the queue value for this FWTCaseCoreDetails.
     * 
     * @return queue
     */
    public java.lang.String getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this FWTCaseCoreDetails.
     * 
     * @param queue
     */
    public void setQueue(java.lang.String queue) {
        this.queue = queue;
    }


    /**
     * Gets the dueDate value for this FWTCaseCoreDetails.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this FWTCaseCoreDetails.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the currentHandler value for this FWTCaseCoreDetails.
     * 
     * @return currentHandler
     */
    public lagan.api.main.FWTUser getCurrentHandler() {
        return currentHandler;
    }


    /**
     * Sets the currentHandler value for this FWTCaseCoreDetails.
     * 
     * @param currentHandler
     */
    public void setCurrentHandler(lagan.api.main.FWTUser currentHandler) {
        this.currentHandler = currentHandler;
    }


    /**
     * Gets the XCoord value for this FWTCaseCoreDetails.
     * 
     * @return XCoord
     */
    public java.lang.String getXCoord() {
        return XCoord;
    }


    /**
     * Sets the XCoord value for this FWTCaseCoreDetails.
     * 
     * @param XCoord
     */
    public void setXCoord(java.lang.String XCoord) {
        this.XCoord = XCoord;
    }


    /**
     * Gets the YCoord value for this FWTCaseCoreDetails.
     * 
     * @return YCoord
     */
    public java.lang.String getYCoord() {
        return YCoord;
    }


    /**
     * Sets the YCoord value for this FWTCaseCoreDetails.
     * 
     * @param YCoord
     */
    public void setYCoord(java.lang.String YCoord) {
        this.YCoord = YCoord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseCoreDetails)) return false;
        FWTCaseCoreDetails other = (FWTCaseCoreDetails) obj;
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
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              this.closed.equals(other.getClosed()))) &&
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
            this.priority == other.getPriority() &&
            this.severity == other.getSeverity() &&
            this.workflowCase == other.isWorkflowCase() &&
            this.internal == other.isInternal() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.queue==null && other.getQueue()==null) || 
             (this.queue!=null &&
              this.queue.equals(other.getQueue()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.currentHandler==null && other.getCurrentHandler()==null) || 
             (this.currentHandler!=null &&
              this.currentHandler.equals(other.getCurrentHandler()))) &&
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
        if (getClosed() != null) {
            _hashCode += getClosed().hashCode();
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
        _hashCode += getPriority();
        _hashCode += getSeverity();
        _hashCode += (isWorkflowCase() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isInternal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getQueue() != null) {
            _hashCode += getQueue().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getCurrentHandler() != null) {
            _hashCode += getCurrentHandler().hashCode();
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
        new org.apache.axis.description.TypeDesc(FWTCaseCoreDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseCoreDetails"));
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
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Closed"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowCase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkflowCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Internal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
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
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
