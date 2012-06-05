package com.idega.xroad;

import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWBundleStartable;
import com.idega.xroad.business.CasesDataProvider;
import com.idega.xroad.view.XRoadViewManager;

public class IWBundleStarter implements IWBundleStartable {

	public static final String IW_BUNDLE_IDENTIFIER = "com.idega.xroad";

	public void start(IWBundle starterBundle) {
		XRoadViewManager.getInstance(starterBundle.getApplication()).getXRoadNode();
	}

	public void stop(IWBundle starterBundle) {
		// TODO Auto-generated method stub

	}

}
