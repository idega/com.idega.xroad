package com.idega.xroad.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="xroad_server")
@NamedQueries({
	@NamedQuery(name=XRoadServer.QUERY_GET_ALL_SERVERS, query="from XRoadServer"),
	@NamedQuery(name=XRoadServer.QUERY_GET_SERVER_BY_URL, query="select s from XRoadServer s where s.url = :PARAM_SERVER_URL")
})
public class XRoadServer implements Serializable {

	private static final long serialVersionUID = 2456633405602846429L;

	public static final String	QUERY_GET_ALL_SERVERS = "XRoadServer.getAll",
								QUERY_GET_SERVER_BY_URL = "XRoadServer.getByUrl";

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="url")
	private String url;

	@Column(name="port")
	private String port;

	@Column(name="organization")
	private String organization;

	public XRoadServer() {
		super();
	}

	public XRoadServer(String url, String port, String organization) {
		this.url = url;
		this.port = port;
		this.organization = organization;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + ", server URL: " + getUrl() + ", port: " + getPort() + ", organization: " + getOrganization();
	}
}