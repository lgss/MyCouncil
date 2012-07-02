/**
 * FLWebInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lagan.api.main;

public interface FLWebInterface extends java.rmi.Remote {
    public int linkCases(lagan.api.main.FLLinkCasesParams linkCasesParams) throws java.rmi.RemoteException, lagan.api.main.FWTException;
    public int unLinkCases(lagan.api.main.FLLinkCasesParams[] unLinkCasesParams) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves core details of cases owned by the caller
     */
    public lagan.api.main.FWTCaseCoreDetails[] retrieveMyCases() throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Gives ownership of one or more cases to the caller
     */
    public int addToMyCases(java.lang.String[] addCaseList) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Removes ownership of one or more cases from the caller
     */
    public int removeFromMyCases(java.lang.String[] removeCaseList) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Delete a case
     */
    public int deleteCases(java.lang.String[] caseDelete) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves brief details of cases matching the given
     *                 search criteria
     */
    public lagan.api.main.FWTCaseBriefDetails[] searchForCases(lagan.api.main.FWTCaseSearch caseSearch) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves full details of a case
     */
    public lagan.api.main.FWTCaseFullDetails retrieveCaseDetails(lagan.api.main.FWTCaseFullDetailsRequest caseRetrieve) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * adds a document to the Lagan Repository
     */
    public java.lang.String addDocumentToRepository(lagan.api.main.FWTDocument repositoryDocumentAdd) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * removes a document from the Lagan Repository
     */
    public void removeDocumentFromRepository(java.lang.String repositoryDocumentRemove) throws java.rmi.RemoteException;

    /**
     * gets a document from the Lagan Repository
     */
    public lagan.api.main.FWTDocument getDocumentFromRepository(java.lang.String repositoryDocumentGet) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * attaches a note to a case or interaction
     */
    public int createNotes(lagan.api.main.FWTNoteToParent notesCreate) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * deletes a note from a case or interaction
     */
    public void deleteNotes(lagan.api.main.FWTNoteDetail notesDelete) throws java.rmi.RemoteException;

    /**
     * updates a note in a case or interaction
     */
    public void updateNotes(lagan.api.main.FWTNoteDetail notesUpdate) throws java.rmi.RemoteException;

    /**
     * updates a note in a case or interaction
     */
    public lagan.api.main.FWTNoteDetail[] getNotes(lagan.api.main.FWTNoteToParent notesGet) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Creates a case and optionally links it to an interaction
     */
    public java.lang.String createCase(lagan.api.main.FWTCaseCreate caseCreate) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Updates a case
     */
    public int updateCase(lagan.api.main.FWTCaseUpdate caseUpdate) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Calculate Working Days For a given SLA value (D5, D10...)
     */
    public lagan.api.main.FWTCalculateDueDateFinish calculateDueDate(lagan.api.main.FWTCalculateDueDateInput dueDateCalculateInput) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Finishes one or more cases; reschedule, reallocate, or
     *                 complete workflow step; ownership is relinquished
     */
    public int finishCases(lagan.api.main.FWTCaseFinish caseFinish) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Closes one or more cases
     */
    public int closeCases(lagan.api.main.FWTCaseClose caseClose) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Adds an event to a case
     */
    public int addCaseEvent(lagan.api.main.FWTCaseEventNew caseEventNew) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Creates a task for a case; the task can be predefined or
     *                 manually defined
     */
    public int createCaseTask(lagan.api.main.FWTCaseTaskNew caseTaskNew) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Updates a case task
     */
    public int updateCaseTask(lagan.api.main.FWTCaseTaskUpdate caseTaskUpdate) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Adds an eform to a case. Note that the parameter EformName
     * is referring to 
     *                 the name of the eForm definition NOT the name of the
     * eForm.
     */
    public int addCaseEform(lagan.api.main.FWTCaseEformNew caseEformNew) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Creates an interaction and optionally links it to a case
     */
    public long createInteraction(lagan.api.main.FWTInteractionCreate interactionCreate) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Creates an interaction and optionally links it to a case
     */
    public int updateInteraction(lagan.api.main.FWTInteractionUpdate interactionUpdate) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Links an interaction to a case
     */
    public int linkInteractionToCase(lagan.api.main.FWTInteractionCaseLink interactionCaselink) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Stores data coming from an EForm object
     */
    public int writeCaseEformData(lagan.api.main.FWTCaseEformData writeCaseEform) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Reads data from an EForm object
     */
    public lagan.api.main.FWTCaseEformData readCaseEformData(lagan.api.main.FWTCaseEformInstance readCaseEform) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves brief details of individuals or organisations
     *                 matching the given search criteria
     */
    public lagan.api.main.FWTObjectBriefDetails[] searchForParty(lagan.api.main.FWTPartySearch partySearch) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves brief details of properties matching the given
     *                 search criteria
     */
    public lagan.api.main.FWTObjectBriefDetails[] searchForProperty(lagan.api.main.FWTPropertySearch propertySearch) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves brief details of streets matching the given
     *                 search criteria
     */
    public lagan.api.main.FWTObjectBriefDetails[] searchForStreet(lagan.api.main.FWTStreetSearch streetSearch) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves full details of an individual
     */
    public lagan.api.main.FWTIndividual retrieveIndividual(lagan.api.main.FWTObjectID individualID) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves full details of an organisation
     */
    public lagan.api.main.FWTOrganisation retrieveOrganisation(lagan.api.main.FWTObjectID organisationID) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves full details of a property
     */
    public lagan.api.main.FWTProperty retrieveProperty(lagan.api.main.FWTObjectID propertyID) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves full details of a street
     */
    public lagan.api.main.FWTStreet retrieveStreet(lagan.api.main.FWTObjectID streetID) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Creates an individual and merges parties behind the
     *                 created record when a list of party Ids is provided
     */
    public lagan.api.main.FWTObjectID createIndividual(lagan.api.main.FWTIndividual individualCreate) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Creates an organisation
     */
    public lagan.api.main.FWTObjectID createOrganisation(lagan.api.main.FWTOrganisation organisationCreate) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Updates an individual
     */
    public int updateIndividual(lagan.api.main.FWTIndividualUpdate individualUpdate) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Updates an organisation
     */
    public int updateOrganisation(lagan.api.main.FWTOrganisationUpdate organisationUpdate) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Merges a list of parties into the target party
     */
    public long createPartyMerge(lagan.api.main.FWTMergeCreate mergeCreate) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Deletes a party
     */
    public int deleteParty(lagan.api.main.FWTDeleteParty partyDelete) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Dissolves the merge process performed on the party.
     */
    public int rollbackPartyMerge(lagan.api.main.FWTObjectID rollbackMerge) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Updates the cluster Ids of the parties in the list.
     */
    public int updatePartyCluster(lagan.api.main.FWTPartyCluster updateCluster) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Clears the cluster Ids of the parties in the list.
     */
    public int clearPartyCluster(lagan.api.main.FWTObjectIdList clearCluster) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Creates a new relationship instance
     */
    public long createRelationship(lagan.api.main.FWTRelationshipNew relationshipCreate) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Deletes a relationship
     */
    public int deleteRelationship(long relationshipDelete) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves a relationship record given the relationship Id
     */
    public lagan.api.main.FWTRelationship retrieveRelationship(long relationshipRetrieve) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves an object's relationships
     */
    public lagan.api.main.FWTRelationship[] retrieveRelationships(lagan.api.main.FWTObjectID relationshipOwner) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Updates a relationship's dates
     */
    public void updateRelationshipTimeframe(lagan.api.main.FWTRelationshipTimeframeUpdate relationshipTimeframeUpdate) throws java.rmi.RemoteException;

    /**
     * Updates a relationship's form data
     */
    public void updateRelationshipFormData(lagan.api.main.FWTRelationshipFormDataUpdate relationshipFormDataUpdate) throws java.rmi.RemoteException;

    /**
     * Retrieves general messages
     */
    public lagan.api.main.FWTMessageGeneral[] retrieveGeneralMessages(int messageAgeLimit) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves party messages
     */
    public lagan.api.main.FWTMessageParty[] retrievePartyMessages(lagan.api.main.FWTObjectID partyID) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Creates a general message
     */
    public int createGeneralMessage(lagan.api.main.FWTMessageGeneralNew generalMessage) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Creates a party message
     */
    public int createPartyMessage(lagan.api.main.FWTMessagePartyNew partyMessage) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves details on all events of the specified type
     */
    public lagan.api.main.FWTEvent[] retrieveEvents(int eventType) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves an Extension Party
     */
    public lagan.api.main.FWTExtensionParty retrieveExtensionParty(lagan.api.main.FWTObjectID partyID) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves an Extension Object
     */
    public lagan.api.main.FWTExtensionObject retrieveExtensionObject(lagan.api.main.FWTObjectID objectID) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Searches object
     */
    public lagan.api.main.FWTObjectBriefDetails[] searchForObject(lagan.api.main.FWTObjectSearchCriteria objectSearch) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Creates an extension object
     */
    public lagan.api.main.FWTObjectID createExtensionObject(lagan.api.main.FWTExtensionObject extObject) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Creates an extension party
     */
    public lagan.api.main.FWTObjectID createExtensionParty(lagan.api.main.FWTExtensionParty extObject) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Updates an extension object
     */
    public int updateExtensionObject(lagan.api.main.FWTExtensionObject extObject) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Updates an extension party
     */
    public int updateExtensionParty(lagan.api.main.FWTExtensionParty extObject) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * This operation is not used and is no longer available
     */
    public lagan.api.main.FWTRuleEngineResults invokeRuleEngine(lagan.api.main.FWTRuleEngineCriteria ruleEngineCriteria) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves a code value
     */
    public java.lang.String retrieveCodeValue(java.lang.String codeKey) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves a code book
     */
    public lagan.api.main.FWTCodeBook retrieveCodeBook(java.lang.String codeBookName) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Search and Retrieves full details of a case
     */
    public lagan.api.main.FWTCaseFullDetails[] searchAndRetrieveCaseDetails(lagan.api.main.FWTSearchAndRetrieveCase searchAndRetrieveDetails) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Retrieves list of Sid Access Permissions
     */
    public lagan.api.main.FWTSidAccessPermissions[] getAcl(lagan.api.main.FWTDomainObjectID domainObject) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Sets the Acl
     */
    public void setAcl(lagan.api.main.FWTSetAcl setAcl) throws java.rmi.RemoteException;

    /**
     * Set the sid access permissions
     */
    public void setSidAccessPermissions(lagan.api.main.FWTSetSidAccessPermissions setSidAccessPermissions) throws java.rmi.RemoteException;

    /**
     * Insert a Sid access permissions
     */
    public void insertSidAccessPermissions(lagan.api.main.FWTInsertSidAccessPermissions insertSidAccessPermissions) throws java.rmi.RemoteException;

    /**
     * Remove a Sid access permissions
     */
    public void removeSidAccessPermissions(lagan.api.main.FWTRemoveSidAccessPermissions removeSidAccessPermissions) throws java.rmi.RemoteException;

    /**
     * Perform a Lucene search
     */
    public lagan.api.main.FWTSearchResult search(lagan.api.main.FWTSearchCriteria searchCriteria) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Creates a face to face header record
     */
    public long createFaceToFaceHeader(lagan.api.main.FWTFaceToFaceHeader faceToFaceHeader) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Creates a face to face conversation
     */
    public int createFaceToFaceConversation(lagan.api.main.FWTFaceToFaceConversation faceToFaceConversationInteraction) throws java.rmi.RemoteException, lagan.api.main.FWTException;

    /**
     * Reopening of case
     */
    public int reopenCase(lagan.api.main.FWTReopenCaseRequest reopenCaseRequest) throws java.rmi.RemoteException, lagan.api.main.FWTException;
}
