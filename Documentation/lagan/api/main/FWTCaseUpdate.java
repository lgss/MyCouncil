/**
 * FWTCaseUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseUpdate  implements java.io.Serializable {
    private java.lang.String caseReference;

    private java.lang.Integer priority;

    private java.lang.Integer severity;

    private java.lang.String title;

    private java.lang.String description;

    private java.lang.String queue;

    private java.util.Calendar dueDate;

    private lagan.api.main.FWTObjectID associatedObject;

    private lagan.api.main.FWTUser currentHandler;

    private java.lang.Boolean internal;

    private lagan.api.main.FWTCaseForm form;

    private java.lang.String[] newNote;

    private lagan.api.main.FWTNoteAttachment[] newNoteAttachment;

    private lagan.api.main.FWTCaseNoteUpdate[] updateNote;

    private lagan.api.main.FWTUpdateNoteAttachment[] updateNoteAttachment;

    /* The supplied value is prepended to
     *                                     the existing case reference,
     *                                     separated by a hyphen, i.e. the
     * updated case reference is
     *                                     NewCaseReference-CaseReference */
    private java.lang.String newCaseReference;

    private lagan.api.main.FWTBPMCaseUpdate[] BPMCaseUpdate;

    private lagan.api.main.FWTDomainObjectID parent;

    private java.lang.String XCoord;

    private java.lang.String YCoord;

    public FWTCaseUpdate() {
    }

    public FWTCaseUpdate(
           java.lang.String caseReference,
           java.lang.Integer priority,
           java.lang.Integer severity,
           java.lang.String title,
           java.lang.String description,
           java.lang.String queue,
           java.util.Calendar dueDate,
           lagan.api.main.FWTObjectID associatedObject,
           lagan.api.main.FWTUser currentHandler,
           java.lang.Boolean internal,
           lagan.api.main.FWTCaseForm form,
           java.lang.String[] newNote,
           lagan.api.main.FWTNoteAttachment[] newNoteAttachment,
           lagan.api.main.FWTCaseNoteUpdate[] updateNote,
           lagan.api.main.FWTUpdateNoteAttachment[] updateNoteAttachment,
           java.lang.String newCaseReference,
           lagan.api.main.FWTBPMCaseUpdate[] BPMCaseUpdate,
           lagan.api.main.FWTDomainObjectID parent,
           java.lang.String XCoord,
           java.lang.String YCoord) {
           this.caseReference = caseReference;
           this.priority = priority;
           this.severity = severity;
           this.title = title;
           this.description = description;
           this.queue = queue;
           this.dueDate = dueDate;
           this.associatedObject = associatedObject;
           this.currentHandler = currentHandler;
           this.internal = internal;
           this.form = form;
           this.newNote = newNote;
           this.newNoteAttachment = newNoteAttachment;
           this.updateNote = updateNote;
           this.updateNoteAttachment = updateNoteAttachment;
           this.newCaseReference = newCaseReference;
           this.BPMCaseUpdate = BPMCaseUpdate;
           this.parent = parent;
           this.XCoord = XCoord;
           this.YCoord = YCoord;
    }


    /**
     * Gets the caseReference value for this FWTCaseUpdate.
     * 
     * @return caseReference
     */
    public java.lang.String getCaseReference() {
        return caseReference;
    }


    /**
     * Sets the caseReference value for this FWTCaseUpdate.
     * 
     * @param caseReference
     */
    public void setCaseReference(java.lang.String caseReference) {
        this.caseReference = caseReference;
    }


    /**
     * Gets the priority value for this FWTCaseUpdate.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this FWTCaseUpdate.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the severity value for this FWTCaseUpdate.
     * 
     * @return severity
     */
    public java.lang.Integer getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this FWTCaseUpdate.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.Integer severity) {
        this.severity = severity;
    }


    /**
     * Gets the title value for this FWTCaseUpdate.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this FWTCaseUpdate.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the description value for this FWTCaseUpdate.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FWTCaseUpdate.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the queue value for this FWTCaseUpdate.
     * 
     * @return queue
     */
    public java.lang.String getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this FWTCaseUpdate.
     * 
     * @param queue
     */
    public void setQueue(java.lang.String queue) {
        this.queue = queue;
    }


    /**
     * Gets the dueDate value for this FWTCaseUpdate.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this FWTCaseUpdate.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the associatedObject value for this FWTCaseUpdate.
     * 
     * @return associatedObject
     */
    public lagan.api.main.FWTObjectID getAssociatedObject() {
        return associatedObject;
    }


    /**
     * Sets the associatedObject value for this FWTCaseUpdate.
     * 
     * @param associatedObject
     */
    public void setAssociatedObject(lagan.api.main.FWTObjectID associatedObject) {
        this.associatedObject = associatedObject;
    }


    /**
     * Gets the currentHandler value for this FWTCaseUpdate.
     * 
     * @return currentHandler
     */
    public lagan.api.main.FWTUser getCurrentHandler() {
        return currentHandler;
    }


    /**
     * Sets the currentHandler value for this FWTCaseUpdate.
     * 
     * @param currentHandler
     */
    public void setCurrentHandler(lagan.api.main.FWTUser currentHandler) {
        this.currentHandler = currentHandler;
    }


    /**
     * Gets the internal value for this FWTCaseUpdate.
     * 
     * @return internal
     */
    public java.lang.Boolean getInternal() {
        return internal;
    }


    /**
     * Sets the internal value for this FWTCaseUpdate.
     * 
     * @param internal
     */
    public void setInternal(java.lang.Boolean internal) {
        this.internal = internal;
    }


    /**
     * Gets the form value for this FWTCaseUpdate.
     * 
     * @return form
     */
    public lagan.api.main.FWTCaseForm getForm() {
        return form;
    }


    /**
     * Sets the form value for this FWTCaseUpdate.
     * 
     * @param form
     */
    public void setForm(lagan.api.main.FWTCaseForm form) {
        this.form = form;
    }


    /**
     * Gets the newNote value for this FWTCaseUpdate.
     * 
     * @return newNote
     */
    public java.lang.String[] getNewNote() {
        return newNote;
    }


    /**
     * Sets the newNote value for this FWTCaseUpdate.
     * 
     * @param newNote
     */
    public void setNewNote(java.lang.String[] newNote) {
        this.newNote = newNote;
    }

    public java.lang.String getNewNote(int i) {
        return this.newNote[i];
    }

    public void setNewNote(int i, java.lang.String _value) {
        this.newNote[i] = _value;
    }


    /**
     * Gets the newNoteAttachment value for this FWTCaseUpdate.
     * 
     * @return newNoteAttachment
     */
    public lagan.api.main.FWTNoteAttachment[] getNewNoteAttachment() {
        return newNoteAttachment;
    }


    /**
     * Sets the newNoteAttachment value for this FWTCaseUpdate.
     * 
     * @param newNoteAttachment
     */
    public void setNewNoteAttachment(lagan.api.main.FWTNoteAttachment[] newNoteAttachment) {
        this.newNoteAttachment = newNoteAttachment;
    }

    public lagan.api.main.FWTNoteAttachment getNewNoteAttachment(int i) {
        return this.newNoteAttachment[i];
    }

    public void setNewNoteAttachment(int i, lagan.api.main.FWTNoteAttachment _value) {
        this.newNoteAttachment[i] = _value;
    }


    /**
     * Gets the updateNote value for this FWTCaseUpdate.
     * 
     * @return updateNote
     */
    public lagan.api.main.FWTCaseNoteUpdate[] getUpdateNote() {
        return updateNote;
    }


    /**
     * Sets the updateNote value for this FWTCaseUpdate.
     * 
     * @param updateNote
     */
    public void setUpdateNote(lagan.api.main.FWTCaseNoteUpdate[] updateNote) {
        this.updateNote = updateNote;
    }

    public lagan.api.main.FWTCaseNoteUpdate getUpdateNote(int i) {
        return this.updateNote[i];
    }

    public void setUpdateNote(int i, lagan.api.main.FWTCaseNoteUpdate _value) {
        this.updateNote[i] = _value;
    }


    /**
     * Gets the updateNoteAttachment value for this FWTCaseUpdate.
     * 
     * @return updateNoteAttachment
     */
    public lagan.api.main.FWTUpdateNoteAttachment[] getUpdateNoteAttachment() {
        return updateNoteAttachment;
    }


    /**
     * Sets the updateNoteAttachment value for this FWTCaseUpdate.
     * 
     * @param updateNoteAttachment
     */
    public void setUpdateNoteAttachment(lagan.api.main.FWTUpdateNoteAttachment[] updateNoteAttachment) {
        this.updateNoteAttachment = updateNoteAttachment;
    }

    public lagan.api.main.FWTUpdateNoteAttachment getUpdateNoteAttachment(int i) {
        return this.updateNoteAttachment[i];
    }

    public void setUpdateNoteAttachment(int i, lagan.api.main.FWTUpdateNoteAttachment _value) {
        this.updateNoteAttachment[i] = _value;
    }


    /**
     * Gets the newCaseReference value for this FWTCaseUpdate.
     * 
     * @return newCaseReference   * The supplied value is prepended to
     *                                     the existing case reference,
     *                                     separated by a hyphen, i.e. the
     * updated case reference is
     *                                     NewCaseReference-CaseReference
     */
    public java.lang.String getNewCaseReference() {
        return newCaseReference;
    }


    /**
     * Sets the newCaseReference value for this FWTCaseUpdate.
     * 
     * @param newCaseReference   * The supplied value is prepended to
     *                                     the existing case reference,
     *                                     separated by a hyphen, i.e. the
     * updated case reference is
     *                                     NewCaseReference-CaseReference
     */
    public void setNewCaseReference(java.lang.String newCaseReference) {
        this.newCaseReference = newCaseReference;
    }


    /**
     * Gets the BPMCaseUpdate value for this FWTCaseUpdate.
     * 
     * @return BPMCaseUpdate
     */
    public lagan.api.main.FWTBPMCaseUpdate[] getBPMCaseUpdate() {
        return BPMCaseUpdate;
    }


    /**
     * Sets the BPMCaseUpdate value for this FWTCaseUpdate.
     * 
     * @param BPMCaseUpdate
     */
    public void setBPMCaseUpdate(lagan.api.main.FWTBPMCaseUpdate[] BPMCaseUpdate) {
        this.BPMCaseUpdate = BPMCaseUpdate;
    }

    public lagan.api.main.FWTBPMCaseUpdate getBPMCaseUpdate(int i) {
        return this.BPMCaseUpdate[i];
    }

    public void setBPMCaseUpdate(int i, lagan.api.main.FWTBPMCaseUpdate _value) {
        this.BPMCaseUpdate[i] = _value;
    }


    /**
     * Gets the parent value for this FWTCaseUpdate.
     * 
     * @return parent
     */
    public lagan.api.main.FWTDomainObjectID getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this FWTCaseUpdate.
     * 
     * @param parent
     */
    public void setParent(lagan.api.main.FWTDomainObjectID parent) {
        this.parent = parent;
    }


    /**
     * Gets the XCoord value for this FWTCaseUpdate.
     * 
     * @return XCoord
     */
    public java.lang.String getXCoord() {
        return XCoord;
    }


    /**
     * Sets the XCoord value for this FWTCaseUpdate.
     * 
     * @param XCoord
     */
    public void setXCoord(java.lang.String XCoord) {
        this.XCoord = XCoord;
    }


    /**
     * Gets the YCoord value for this FWTCaseUpdate.
     * 
     * @return YCoord
     */
    public java.lang.String getYCoord() {
        return YCoord;
    }


    /**
     * Sets the YCoord value for this FWTCaseUpdate.
     * 
     * @param YCoord
     */
    public void setYCoord(java.lang.String YCoord) {
        this.YCoord = YCoord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseUpdate)) return false;
        FWTCaseUpdate other = (FWTCaseUpdate) obj;
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
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
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
            ((this.currentHandler==null && other.getCurrentHandler()==null) || 
             (this.currentHandler!=null &&
              this.currentHandler.equals(other.getCurrentHandler()))) &&
            ((this.internal==null && other.getInternal()==null) || 
             (this.internal!=null &&
              this.internal.equals(other.getInternal()))) &&
            ((this.form==null && other.getForm()==null) || 
             (this.form!=null &&
              this.form.equals(other.getForm()))) &&
            ((this.newNote==null && other.getNewNote()==null) || 
             (this.newNote!=null &&
              java.util.Arrays.equals(this.newNote, other.getNewNote()))) &&
            ((this.newNoteAttachment==null && other.getNewNoteAttachment()==null) || 
             (this.newNoteAttachment!=null &&
              java.util.Arrays.equals(this.newNoteAttachment, other.getNewNoteAttachment()))) &&
            ((this.updateNote==null && other.getUpdateNote()==null) || 
             (this.updateNote!=null &&
              java.util.Arrays.equals(this.updateNote, other.getUpdateNote()))) &&
            ((this.updateNoteAttachment==null && other.getUpdateNoteAttachment()==null) || 
             (this.updateNoteAttachment!=null &&
              java.util.Arrays.equals(this.updateNoteAttachment, other.getUpdateNoteAttachment()))) &&
            ((this.newCaseReference==null && other.getNewCaseReference()==null) || 
             (this.newCaseReference!=null &&
              this.newCaseReference.equals(other.getNewCaseReference()))) &&
            ((this.BPMCaseUpdate==null && other.getBPMCaseUpdate()==null) || 
             (this.BPMCaseUpdate!=null &&
              java.util.Arrays.equals(this.BPMCaseUpdate, other.getBPMCaseUpdate()))) &&
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
        if (getCaseReference() != null) {
            _hashCode += getCaseReference().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
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
        if (getCurrentHandler() != null) {
            _hashCode += getCurrentHandler().hashCode();
        }
        if (getInternal() != null) {
            _hashCode += getInternal().hashCode();
        }
        if (getForm() != null) {
            _hashCode += getForm().hashCode();
        }
        if (getNewNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewNoteAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewNoteAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewNoteAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUpdateNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpdateNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpdateNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUpdateNoteAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpdateNoteAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpdateNoteAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewCaseReference() != null) {
            _hashCode += getNewCaseReference().hashCode();
        }
        if (getBPMCaseUpdate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBPMCaseUpdate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBPMCaseUpdate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(FWTCaseUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTCaseUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "CaseReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseReference"));
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
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Severity"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTObjectID"));
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
        elemField.setFieldName("internal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Internal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("newNote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NewNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newNoteAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NewNoteAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTNoteAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateNote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdateNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseNoteUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateNoteAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdateNoteAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTUpdateNoteAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCaseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "NewCaseReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BPMCaseUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BPMCaseUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTBPMCaseUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
