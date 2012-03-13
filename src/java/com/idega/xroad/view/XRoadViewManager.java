package com.idega.xroad.view;

import java.util.Arrays;

import com.idega.core.view.ApplicationViewNode;
import com.idega.core.view.DefaultViewNode;
import com.idega.core.view.ViewManager;
import com.idega.core.view.ViewNode;
import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWMainApplication;
import com.idega.repository.data.Singleton;
import com.idega.xroad.IWBundleStarter;

public class XRoadViewManager implements Singleton {

	public static final String X_ROAD_VIEW_MANAGER = "iw_xroad_view_mamanger";

	private IWMainApplication iwma;
	private ViewNode xroadRootNode;

	private XRoadViewManager(IWMainApplication iwma) {
		this.iwma = iwma;
	}

	public static synchronized XRoadViewManager getInstance(IWMainApplication iwma) {
		XRoadViewManager manager = (XRoadViewManager) iwma.getAttribute(X_ROAD_VIEW_MANAGER);
		if (manager == null) {
			manager = new XRoadViewManager(iwma);
			iwma.setAttribute(X_ROAD_VIEW_MANAGER, manager);
		}
		return manager;
	}

	public ViewNode getXRoadNode(){
		IWBundle iwb = iwma.getBundle(IWBundleStarter.IW_BUNDLE_IDENTIFIER);
		if (xroadRootNode == null)
			xroadRootNode = initalizeRootNode(iwb);
		return xroadRootNode;
	}

	public ViewNode initalizeRootNode(IWBundle bundle) {
		ViewNode root = ViewManager.getInstance(iwma).getWorkspaceRoot();
		DefaultViewNode xroadNode = new ApplicationViewNode("X-Road", root);
		xroadNode.setAuthorizedRoles(Arrays.asList("xroad"));

		xroadNode.setFaceletUri(bundle.getFaceletURI("xroad.xhtml"));

		this.xroadRootNode = xroadNode;
		return this.xroadRootNode;
	}
}
