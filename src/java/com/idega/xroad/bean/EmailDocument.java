package com.idega.xroad.bean;

import java.io.Serializable;

import com.idega.jbpm.exe.BPMEmailDocument;
import com.idega.util.CoreConstants;

public class EmailDocument extends Document implements Serializable {

	private static final long serialVersionUID = -6925765377033732072L;

	private String subject, fromPerson, fromAddress;
	
	public EmailDocument(){
		super();
	}
	
	public EmailDocument(BPMEmailDocument document){
		super(document);
		subject = document.getSubject();
		if(CoreConstants.EMPTY.equals(subject)){
			subject = null;
		}
		fromPerson = document.getFromPersonal();
		if(CoreConstants.EMPTY.equals(fromPerson)){
			fromPerson = null;
		}
		fromAddress = document.getFromAddress();
		if(CoreConstants.EMPTY.equals(fromPerson)){
			fromPerson = null;
		}
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
