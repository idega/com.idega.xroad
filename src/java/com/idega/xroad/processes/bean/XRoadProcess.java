package com.idega.xroad.processes.bean;

import java.io.Serializable;

/**
 * Data structure to represent available BPM process via X-Road
 *
 * @author valdas
 *
 */
public class XRoadProcess implements Serializable {

	private static final long serialVersionUID = -5352310685171623833L;

	private String id, name, localizedName, url;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocalizedName() {
		return localizedName;
	}

	public void setLocalizedName(String localizedName) {
		this.localizedName = localizedName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}