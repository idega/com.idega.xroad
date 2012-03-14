package com.idega.xroad.data;

import java.util.List;

import com.idega.core.persistence.GenericDao;

public interface XRoadDAO extends GenericDao {

	public List<XRoadServer> getAllServers();

	public XRoadServer getServerByUrl(String url);

}