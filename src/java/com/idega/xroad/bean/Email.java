package com.idega.xroad.bean;

import java.io.Serializable;

import com.idega.jbpm.exe.BPMEmailDocument;
import com.idega.util.StringUtil;

/**
 * Data structure to hold communication via emails about the case
 *
 * @author valdas
 *
 */
public class Email extends Task implements Serializable {

	private static final long serialVersionUID = -6925765377033732072L;

	private String subject, message, fromPerson, fromAddress;

	public Email() {
		super();
	}

	public Email(String subject, String message, String fromPerson, String fromAddress) {
		this();

		this.subject = subject;
		this.message = message;
		this.fromPerson = fromPerson;
		this.fromAddress = fromAddress;
	}

	public Email(BPMEmailDocument document){
		super(document);

		subject = document.getSubject();
		if (StringUtil.isEmpty(subject))
			subject = null;

		message = document.getMessage();
		if (StringUtil.isEmpty(message))
			message = null;

		fromPerson = document.getFromPersonal();
		if (StringUtil.isEmpty(fromPerson))
			fromPerson = null;

		fromAddress = document.getFromAddress();
		if (StringUtil.isEmpty(fromAddress))
			fromPerson = null;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFromPerson() {
		return fromPerson;
	}

	public void setFromPerson(String fromPerson) {
		this.fromPerson = fromPerson;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

}
