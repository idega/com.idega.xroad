package com.idega.xroad.data.impl;

import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.persistence.Param;
import com.idega.core.persistence.impl.GenericDaoImpl;
import com.idega.util.StringUtil;
import com.idega.xroad.data.XRoadDAO;
import com.idega.xroad.data.XRoadServer;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class XRoadDAOImpl extends GenericDaoImpl implements XRoadDAO {

	public List<XRoadServer> getAllServers() {
		return getResultList(XRoadServer.QUERY_GET_ALL_SERVERS, XRoadServer.class);
	}

	public XRoadServer getServerByUrl(String url) {
		if (StringUtil.isEmpty(url))
			return null;

		return getSingleResult(XRoadServer.QUERY_GET_SERVER_BY_URL, XRoadServer.class, new Param("PARAM_SERVER_URL", url));
	}

}