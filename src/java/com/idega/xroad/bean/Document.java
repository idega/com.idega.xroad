package com.idega.xroad.bean;

import java.util.Date;

import com.idega.jbpm.exe.BPMDocument;
import com.idega.util.StringUtil;

public class Document extends Task {

	private static final long serialVersionUID = -592111244656387698L;

	private String submittedByName;

	public Document() {
		super();
	}

	public Document(String id, String name, String submittedByName, String viewUri, Date created) {
		super(id, name, viewUri, created);

		this.submittedByName = submittedByName;
		if (StringUtil.isEmpty(this.submittedByName))
			this.submittedByName = null;
	}

	public Document(BPMDocument document) {
		super(document);

		submittedByName = document.getSubmittedByName();
		if (StringUtil.isEmpty(submittedByName))
			submittedByName = null;
	}

	public String getSubmittedByName() {
		return submittedByName;
	}

	public void setSubmittedByName(String submittedByName) {
		this.submittedByName = submittedByName;
	}



}