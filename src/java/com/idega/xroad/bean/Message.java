package com.idega.xroad.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Random;

import com.idega.util.StringUtil;

/**
 * Data structure to hold message information for the user
 *
 * @author valdas
 *
 */
public class Message implements Serializable {

	private static final long serialVersionUID = 2443260681172469343L;

	private String id, identifier, subject, body, number, status;
	private Timestamp created;
	private User owner;

	public Message() {
		super();

		this.id = String.valueOf(new Random().nextInt());
	}

	public Message(com.idega.block.process.data.Case theCase) {
		this.body = theCase.getBody();
		this.subject = theCase.getSubject();
		this.owner = new User(theCase.getOwner());

		String id = theCase.getId();
		if (!StringUtil.isEmpty(id))
			this.id = id;

		this.identifier = theCase.getCaseIdentifier();
		this.number = theCase.getCaseNumber();
		this.created = theCase.getCreated();
		this.status = theCase.getStatus();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + ", identifier: " + getIdentifier();
	}
}