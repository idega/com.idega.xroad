package com.idega.xroad.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import com.idega.util.ListUtil;

public class Case  implements Serializable {
	
	private static final long serialVersionUID = -6956277602415027913L;
	private String subject, body, id, caseNumber, status;
	private Timestamp created;
	private User owner;
	private List<Document> tasks, documents;
	private List<EmailDocument> emails;
	private Collection<User> usersConnectedToProcess; 
	
	

	public Case(){
		super();
	}
	
	
	public Case(com.idega.block.process.data.Case theCase){
		this.body = theCase.getBody();
		this.subject = theCase.getSubject();
		this.owner = new User(theCase.getOwner());
		this.id = theCase.getId();
		this.caseNumber = theCase.getCaseNumber();
		this.created = theCase.getCreated();
		this.status = theCase.getStatus();
	}
	

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
	public List<Document> getTasks() {
		return tasks;
	}


	public void setTasks(List<Document> tasks) {
		this.tasks = tasks;
	}


	public List<Document> getDocuments() {
		return documents;
	}


	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}


	public List<EmailDocument> getEmails() {
		return emails;
	}


	public void setEmails(List<EmailDocument> emails) {
		this.emails = emails;
	}


	public Collection<User> getUsersConnectedToProcess() {
		return usersConnectedToProcess;
	}


	public void setUsersConnectedToProcess(Collection<User> usersConnectedToProcess) {
		this.usersConnectedToProcess = usersConnectedToProcess;
	}
	
	public void setIdegaUsersConnectedToProcess(Collection<com.idega.user.data.User> idegaUsers) {
		if(ListUtil.isEmpty(idegaUsers)){
			return;
		}
		usersConnectedToProcess = new HashSet<User>(idegaUsers.size());
		for(com.idega.user.data.User user : idegaUsers){
			User connectedUser = new User(user);
			usersConnectedToProcess.add(connectedUser);
		}
	}

}
