/**
 * FWTCaseCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseCreate  implements java.io.Serializable {
    private int classificationEventCode;

    private java.lang.Integer priority;

    private java.lang.String title;

    private java.lang.String description;

    private java.lang.String queue;

    private java.util.Calendar dueDate;

    private lagan.api.main.FWTObjectBriefDetails associatedObject;

    private lagan.api.main.FWTCaseForm form;

    private java.lang.Boolean internal;

    private java.lang.Long interactionID;

    private lagan.api.main.FWTDomainObjectID parent;

    private java.lang.String XCoord;

    private java.lang.String YCoord;

    public FWTCaseCreate() {
    }

    public FWTCaseCreate(
           int classificationEventCode,
           java.lang.Integer priority,
           java.lang.String title,
           java.lang.String description,
           java.lang.String queue,
           java.util.Calendar dueDate,
           lagan.api.main.FWTObjectBriefDetails associatedObject,
           lagan.api.main.FWTCaseForm form,
           java.lang.Boolean internal,
           java.lang.Long interactionID,
           lagan.api.main.FWTDomainObjectID parent,
           java.lang.String XCoord,
           java.lang.String YCoord) {
           this.classificationEventCode = classificationEventCode;
           this.priority = priority;
           this.title = title;
           this.description = description;
           this.queue = queue;
           this.dueDate = dueDate;
           this.associatedObject = associatedObject;
           this.form = form;
           this.internal = internal;
           this.interactionID = interactionID;
           this.parent = parent;
           this.XCoord = XCoord;
           this.YCoord = YCoord;
    }


    /**
     * Gets the classificationEventCode value for this FWTCaseCreate.
     * 
     * @return classificationEventCode
     */
    public int getClassificationEventCode() {
        return classificationEventCode;
    }


    /**
     * Sets the classificationEventCode value for this FWTCaseCreate.
     * 
     * @param classificationEventCode
     */
    public void setClassificationEventCode(int classificationEventCode) {
        this.classificationEventCode = classificationEventCode;
    }


    /**
     * Gets the priority value for this FWTCaseCreate.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this FWTCaseCreate.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the title value for this FWTCaseCreate.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this FWTCaseCreate.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the description value for this FWTCaseCreate.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FWTCaseCreate.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the queue value for this FWTCaseCreate.
     * 
     * @return queue
     */
    public java.lang.String getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this FWTCaseCreate.
     * 
     * @param queue
     */
    public void setQueue(java.lang.String queue) {
        this.queue = queue;
    }


    /**
     * Gets the dueDate value for this FWTCaseCreate.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this FWTCaseCreate.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the associatedObject value for this FWTCaseCreate.
     * 
     * @return associatedObject
     */
    public lagan.api.main.FWTObjectBriefDetails getAssociatedObject() {
        return associatedObject;
    }


    /**
     * Sets the associatedObject value for this FWTCaseCreate.
     * 
     * @param associatedObject
     */
    public void setAssociatedObject(lagan.api.main.FWTObjectBriefDetails associatedObject) {
        this.associatedObject = associatedObject;
    }


    /**
     * Gets the form value for this FWTCaseCreate.
     * 
     * @return form
     */
    public lagan.api.main.FWTCaseForm getForm() {
        return form;
    }


    /**
     * Sets the form value for this FWTCaseCreate.
     * 
     * @param form
     */
    public void setForm(lagan.api.main.FWTCaseForm form) {
        this.form = form;
    }


    /**
     * Gets the internal value for this FWTCaseCreate.
     * 
     * @return internal
     */
    public java.lang.Boolean getInternal() {
        return internal;
    }


    /**
     * Sets the internal value for this FWTCaseCreate.
     * 
     * @param internal
     */
    public void setInternal(java.lang.Boolean internal) {
        this.internal = internal;
    }


    /**
     * Gets the interactionID value for this FWTCaseCreate.
     * 
     * @return interactionID
     */
    public java.lang.Long getInteractionID() {
        return interactionID;
    }


    /**
     * Sets the interactionID value for this FWTCaseCreate.
     * 
     * @param interactionID
     */
    public void setInteractionID(java.lang.Long interactionID) {
        this.interactionID = interactionID;
    }


    /**
     * Gets the parent value for this FWTCaseCreate.
     * 
     * @return parent
     */
    public lagan.api.main.FWTDomainObjectID getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this FWTCaseCreate.
     * 
     * @param parent
     */
    public void setParent(lagan.api.main.FWTDomainObjectID parent) {
        this.parent = parent;
    }


    /**
     * Gets the XCoord value for this FWTCaseCreate.
     * 
     * @return XCoord
     */
    public java.lang.String getXCoord() {
        return XCoord;
    }


    /**
     * Sets the XCoord value for this FWTCaseCreate.
     * 
     * @param XCoord
     */
    public void setXCoord(java.lang.String XCoord) {
        this.XCoord = XCoord;
    }


    /**
     * Gets the YCoord value for this FWTCaseCreate.
     * 
     * @return YCoord
     */
    public java.lang.String getYCoord() {
        return YCoord;
    }


    /**
     * Sets the YCoord value for this FWTCaseCreate.
     * 
     * @param YCoord
     */
    public void setYCoord(java.lang.String YCoord) {
        this.YCoord = YCoord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseCreate)) return false;
        FWTCaseCreate other = (FWTCaseCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.classificationEventCode == other.getClassificationEventCode() &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.queue==null && other.getQueue()==null) || 
             (this.queue!=null &&
              this.queue.equals(other.getQueue()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.associatedObject==null && other.getAssociatedObject()==null) || 
             (this.associatedObject!=null &&
              this.associatedObject.equals(other.getAssociatedObject()))) &&
            ((this.form==null && other.getForm()==null) || 
             (this.form!=null &&
              this.form.equals(other.getForm()))) &&
            ((this.internal==null && other.getInternal()==null) || 
             (this.internal!=null &&
              this.internal.equals(other.getInternal()))) &&
            ((this.interactionID==null && other.getInteractionID()==null) || 
             (this.interactionID!=null &&
              this.interactionID.equals(other.getInteractionID()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
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
        _hashCode += getClassificationEventCode();
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getQueue() != null) {
            _hashCode += getQueue().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getAssociatedObject() != null) {
            _hashCode += getAssociatedObject().hashCode();
        }
        if (getForm() != null) {
            _hashCode += getForm().hashCode();
        }
        if (getInternal() != null) {
            _hashCode += getInternal().hashCode();
        }
        if (getInteractionID() != null) {
            _hashCode += getInteractionID().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
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
        new org.apache.axis.description.TypeDesc(FWTCaseCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTCaseCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificationEventCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClassificationEventCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Priority"));
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
        elemField.setFieldName("associatedObject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AssociatedObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectBriefDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("form");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Form"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseForm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Internal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "InteractionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTDomainObjectID"));
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
