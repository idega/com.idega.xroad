package com.idega.xroad.bean;

import java.io.Serializable;
import java.util.Date;

import com.idega.jbpm.exe.BPMDocument;
import com.idega.util.StringUtil;

/**
 * Data structure to hold BPM related data for the case
 *
 * @author valdas
 *
 */
public class Task implements Serializable {

	private static final long serialVersionUID = 3656106891236803553L;

	private String id, name, viewUri;
	private Date created;

	public Task() {
		super();
	}

	public Task(String id, String name, String viewUri, Date created) {
		this.id = id;
		this.name = name;
		this.viewUri = viewUri;
		this.created = created;

		if (StringUtil.isEmpty(this.id))
			this.id = null;
		if (StringUtil.isEmpty(this.name))
			this.name = null;
		if (StringUtil.isEmpty(this.viewUri))
			this.viewUri = null;
	}

	public Task(BPMDocument document) {
		this(String.valueOf(document.getTaskInstanceId()), document.getDocumentName(), null, document.getCreateDate());
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

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
