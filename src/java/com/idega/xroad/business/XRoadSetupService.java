package com.idega.xroad.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idega.core.business.DefaultSpringBean;
import com.idega.util.ListUtil;
import com.idega.util.StringUtil;
import com.idega.xroad.data.XRoadDAO;
import com.idega.xroad.data.XRoadServer;

@Scope("request")
@Service("xRoadSetupService")
public class XRoadSetupService extends DefaultSpringBean {

	@Autowired
	private XRoadDAO xroadDAO;

	private XRoadServer server;

	private String serverUrl, port, organization;

	private XRoadServer getServer() {
		if (server != null)
			return server;

		List<XRoadServer> servers = xroadDAO.getAllServers();
		if (ListUtil.isEmpty(servers))
			return null;

		server = servers.iterator().next();
		return server;
	}

	public String getServerUrl() {
		XRoadServer server = getServer();
		return server == null ? null : server.getUrl();
	}

	public String getPort() {
		XRoadServer server = getServer();
		return server == null ? null : server.getPort();
	}

	public String getOrganization() {
		XRoadServer server = getServer();
		return server == null ? null : server.getOrganization();
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	@Transactional(readOnly=false)
	public void saveServer() {
		if (StringUtil.isEmpty(serverUrl) || StringUtil.isEmpty(port) || StringUtil.isEmpty(organization)) {
			getLogger().warning("Some of the parameter is not provided or invalid: server: " + serverUrl + ", port: " + port + ", organization: " +
					organization);
			return;
		}

		XRoadServer server = xroadDAO.getServerByUrl(serverUrl);
		if (server == null) {
			server = new XRoadServer(serverUrl, port, organization);
			xroadDAO.persist(server);
		} else {
			server.setUrl(serverUrl);
			server.setPort(port);
			server.setOrganization(organization);
			xroadDAO.merge(server);
		}
		this.server = null;
	}
}