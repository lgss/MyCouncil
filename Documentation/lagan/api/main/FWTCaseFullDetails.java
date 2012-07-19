/**
 * FWTCaseFullDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public class FWTCaseFullDetails  implements java.io.Serializable {
    private lagan.api.main.FWTCaseCoreDetails coreDetails;

    private lagan.api.main.FWTCaseForm form;

    private lagan.api.main.FWTCaseEvent[] events;

    private lagan.api.main.FWTCaseTask[] tasks;

    private lagan.api.main.FWTCaseWorkflowInstance workflow;

    private lagan.api.main.FWTNote[] notes;

    private lagan.api.main.FWTCaseEform[] eforms;

    private lagan.api.main.FWTInteractionDetails[] interactions;

    private lagan.api.main.FWTCaseEformData[] eformData;

    private lagan.api.main.FWTLinkedCase[] linkCases;

    public FWTCaseFullDetails() {
    }

    public FWTCaseFullDetails(
           lagan.api.main.FWTCaseCoreDetails coreDetails,
           lagan.api.main.FWTCaseForm form,
           lagan.api.main.FWTCaseEvent[] events,
           lagan.api.main.FWTCaseTask[] tasks,
           lagan.api.main.FWTCaseWorkflowInstance workflow,
           lagan.api.main.FWTNote[] notes,
           lagan.api.main.FWTCaseEform[] eforms,
           lagan.api.main.FWTInteractionDetails[] interactions,
           lagan.api.main.FWTCaseEformData[] eformData,
           lagan.api.main.FWTLinkedCase[] linkCases) {
           this.coreDetails = coreDetails;
           this.form = form;
           this.events = events;
           this.tasks = tasks;
           this.workflow = workflow;
           this.notes = notes;
           this.eforms = eforms;
           this.interactions = interactions;
           this.eformData = eformData;
           this.linkCases = linkCases;
    }


    /**
     * Gets the coreDetails value for this FWTCaseFullDetails.
     * 
     * @return coreDetails
     */
    public lagan.api.main.FWTCaseCoreDetails getCoreDetails() {
        return coreDetails;
    }


    /**
     * Sets the coreDetails value for this FWTCaseFullDetails.
     * 
     * @param coreDetails
     */
    public void setCoreDetails(lagan.api.main.FWTCaseCoreDetails coreDetails) {
        this.coreDetails = coreDetails;
    }


    /**
     * Gets the form value for this FWTCaseFullDetails.
     * 
     * @return form
     */
    public lagan.api.main.FWTCaseForm getForm() {
        return form;
    }


    /**
     * Sets the form value for this FWTCaseFullDetails.
     * 
     * @param form
     */
    public void setForm(lagan.api.main.FWTCaseForm form) {
        this.form = form;
    }


    /**
     * Gets the events value for this FWTCaseFullDetails.
     * 
     * @return events
     */
    public lagan.api.main.FWTCaseEvent[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this FWTCaseFullDetails.
     * 
     * @param events
     */
    public void setEvents(lagan.api.main.FWTCaseEvent[] events) {
        this.events = events;
    }


    /**
     * Gets the tasks value for this FWTCaseFullDetails.
     * 
     * @return tasks
     */
    public lagan.api.main.FWTCaseTask[] getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this FWTCaseFullDetails.
     * 
     * @param tasks
     */
    public void setTasks(lagan.api.main.FWTCaseTask[] tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the workflow value for this FWTCaseFullDetails.
     * 
     * @return workflow
     */
    public lagan.api.main.FWTCaseWorkflowInstance getWorkflow() {
        return workflow;
    }


    /**
     * Sets the workflow value for this FWTCaseFullDetails.
     * 
     * @param workflow
     */
    public void setWorkflow(lagan.api.main.FWTCaseWorkflowInstance workflow) {
        this.workflow = workflow;
    }


    /**
     * Gets the notes value for this FWTCaseFullDetails.
     * 
     * @return notes
     */
    public lagan.api.main.FWTNote[] getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this FWTCaseFullDetails.
     * 
     * @param notes
     */
    public void setNotes(lagan.api.main.FWTNote[] notes) {
        this.notes = notes;
    }


    /**
     * Gets the eforms value for this FWTCaseFullDetails.
     * 
     * @return eforms
     */
    public lagan.api.main.FWTCaseEform[] getEforms() {
        return eforms;
    }


    /**
     * Sets the eforms value for this FWTCaseFullDetails.
     * 
     * @param eforms
     */
    public void setEforms(lagan.api.main.FWTCaseEform[] eforms) {
        this.eforms = eforms;
    }


    /**
     * Gets the interactions value for this FWTCaseFullDetails.
     * 
     * @return interactions
     */
    public lagan.api.main.FWTInteractionDetails[] getInteractions() {
        return interactions;
    }


    /**
     * Sets the interactions value for this FWTCaseFullDetails.
     * 
     * @param interactions
     */
    public void setInteractions(lagan.api.main.FWTInteractionDetails[] interactions) {
        this.interactions = interactions;
    }


    /**
     * Gets the eformData value for this FWTCaseFullDetails.
     * 
     * @return eformData
     */
    public lagan.api.main.FWTCaseEformData[] getEformData() {
        return eformData;
    }


    /**
     * Sets the eformData value for this FWTCaseFullDetails.
     * 
     * @param eformData
     */
    public void setEformData(lagan.api.main.FWTCaseEformData[] eformData) {
        this.eformData = eformData;
    }


    /**
     * Gets the linkCases value for this FWTCaseFullDetails.
     * 
     * @return linkCases
     */
    public lagan.api.main.FWTLinkedCase[] getLinkCases() {
        return linkCases;
    }


    /**
     * Sets the linkCases value for this FWTCaseFullDetails.
     * 
     * @param linkCases
     */
    public void setLinkCases(lagan.api.main.FWTLinkedCase[] linkCases) {
        this.linkCases = linkCases;
    }

    public lagan.api.main.FWTLinkedCase getLinkCases(int i) {
        return this.linkCases[i];
    }

    public void setLinkCases(int i, lagan.api.main.FWTLinkedCase _value) {
        this.linkCases[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FWTCaseFullDetails)) return false;
        FWTCaseFullDetails other = (FWTCaseFullDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coreDetails==null && other.getCoreDetails()==null) || 
             (this.coreDetails!=null &&
              this.coreDetails.equals(other.getCoreDetails()))) &&
            ((this.form==null && other.getForm()==null) || 
             (this.form!=null &&
              this.form.equals(other.getForm()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              java.util.Arrays.equals(this.tasks, other.getTasks()))) &&
            ((this.workflow==null && other.getWorkflow()==null) || 
             (this.workflow!=null &&
              this.workflow.equals(other.getWorkflow()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              java.util.Arrays.equals(this.notes, other.getNotes()))) &&
            ((this.eforms==null && other.getEforms()==null) || 
             (this.eforms!=null &&
              java.util.Arrays.equals(this.eforms, other.getEforms()))) &&
            ((this.interactions==null && other.getInteractions()==null) || 
             (this.interactions!=null &&
              java.util.Arrays.equals(this.interactions, other.getInteractions()))) &&
            ((this.eformData==null && other.getEformData()==null) || 
             (this.eformData!=null &&
              java.util.Arrays.equals(this.eformData, other.getEformData()))) &&
            ((this.linkCases==null && other.getLinkCases()==null) || 
             (this.linkCases!=null &&
              java.util.Arrays.equals(this.linkCases, other.getLinkCases())));
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
        if (getCoreDetails() != null) {
            _hashCode += getCoreDetails().hashCode();
        }
        if (getForm() != null) {
            _hashCode += getForm().hashCode();
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTasks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTasks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTasks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkflow() != null) {
            _hashCode += getWorkflow().hashCode();
        }
        if (getNotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEforms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEforms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEforms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInteractions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInteractions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInteractions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEformData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEformData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEformData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLinkCases() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkCases());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkCases(), i);
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
        new org.apache.axis.description.TypeDesc(FWTCaseFullDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", ">FWTCaseFullDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CoreDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseCoreDetails"));
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
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CaseEvent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseTask"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CaseTask"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Workflow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseWorkflowInstance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTNote"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Note"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eforms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Eforms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseEform"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CaseEform"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interactions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Interactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTInteractionDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "InteractionDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eformData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EformData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTCaseEformData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CaseEformData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkCases");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LinkCases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lagan.com/wsdl/FLTypes", "FWTLinkedCase"));
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
