package com.idega.xroad.bean;

import java.io.Serializable;
import java.util.Date;

import com.idega.jbpm.exe.BPMDocument;
import com.idega.util.CoreConstants;

public class Document implements Serializable {
	
	
	private static final long serialVersionUID = 3656106891236803553L;

	private String name, submittedByName, viewUri;
	private Date created;
	
	public Document(){
		super();
	}
	
	public Document(BPMDocument document){
		name = document.getDocumentName();
		if(CoreConstants.EMPTY.equals(name)){
			name = null;
		}
		submittedByName = document.getSubmittedByName();
		if(CoreConstants.EMPTY.equals(submittedByName)){
			submittedByName = null;
		}
		created = document.getCreateDate();
	}

	public String getViewUri() {
		return viewUri;
	}

	public void setViewUri(String viewUri) {
		this.viewUri = viewUri;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubmittedByName() {
		return submittedByName;
	}

	public void setSubmittedByName(String submittedByName) {
		this.submittedByName = submittedByName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	
}
