package com.idega.xroad.webservices.client;

import java.rmi.RemoteException;
import java.util.List;
import java.util.logging.Level;

import javax.xml.rpc.holders.ObjectHolder;

import net.x_rd.ee.municipality.producer.CaseList;
import net.x_rd.ee.municipality.producer.CaseListResponseCaseListEntry;
import net.x_rd.ee.municipality.producer.MunicipalityporttypeProxy;
import net.x_rd.ee.municipality.producer.holders.CaseListResponseHolder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.util.ListUtil;
import com.idega.xroad.data.XRoadDAO;
import com.idega.xroad.data.XRoadServer;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CaseDataProvider extends DefaultSpringBean {

	@Autowired
	private XRoadDAO xroadDAO;

	private MunicipalityporttypeProxy getMunicipalityPort() {
		List<XRoadServer> servers = xroadDAO.getAllServers();
		if (ListUtil.isEmpty(servers))
			return null;

		XRoadServer server = servers.iterator().next();
		MunicipalityporttypeProxy proxy = new MunicipalityporttypeProxy(server.getUrl());
		return proxy;
	}

	public CaseListResponseCaseListEntry[] getCaseList() {
		CaseListResponseHolder result = new CaseListResponseHolder();
		try {
			getMunicipalityPort().caseList(new CaseList("test", new CaseListResponseCaseListEntry[100]), new ObjectHolder(), result);
		} catch (RemoteException e) {
			getLogger().log(Level.WARNING, "Error getting case list", e);
		}

		return result.value;
	}

}
