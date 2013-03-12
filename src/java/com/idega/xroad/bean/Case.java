package com.idega.xroad.bean;

import java.util.ArrayList;
import java.util.Collection;
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

	private List<Task> tasks;
	private List<Document> documents;
	private List<Email> emails;
	private List<User> usersConnectedToProcess;

	public Case() {
		super();
	}

	public Case(com.idega.block.process.data.Case theCase) {
		super(theCase);
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public Collection<User> getUsersConnectedToProcess() {
		return usersConnectedToProcess;
	}

	public void setUsersConnectedToProcess(List<User> usersConnectedToProcess) {
		this.usersConnectedToProcess = usersConnectedToProcess;
	}

	public void setUsersConnectedToProcess(Collection<com.idega.user.data.User> users) {
		if (ListUtil.isEmpty(users))
			return;

		usersConnectedToProcess = new ArrayList<User>(users.size());
		for (com.idega.user.data.User user: users) {
			User connectedUser = new User(user);
			usersConnectedToProcess.add(connectedUser);
		}
	}

}
