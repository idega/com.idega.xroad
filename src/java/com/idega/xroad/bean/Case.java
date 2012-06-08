package com.idega.xroad.bean;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import com.idega.util.ListUtil;

/**
 * Data structure to hold case information
 *
 * @author valdas
 *
 */
public class Case extends Message {

	private static final long serialVersionUID = -6956277602415027913L;

	private List<Document> tasks, documents;
	private List<EmailDocument> emails;
	private Collection<User> usersConnectedToProcess;

	public Case() {
		super();
	}

	public Case(com.idega.block.process.data.Case theCase) {
		super(theCase);
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
		if (ListUtil.isEmpty(idegaUsers))
			return;

		usersConnectedToProcess = new HashSet<User>(idegaUsers.size());
		for (com.idega.user.data.User user: idegaUsers) {
			User connectedUser = new User(user);
			usersConnectedToProcess.add(connectedUser);
		}
	}

}
