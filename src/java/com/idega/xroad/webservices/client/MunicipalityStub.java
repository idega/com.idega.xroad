package com.idega.xroad.webservices.client;

import java.util.Iterator;

import net.x_rd.ee.municipality.producer.MunicipalityserviceStub;

import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMNode;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeaderBlock;
import org.apache.axis2.AxisFault;

public class MunicipalityStub extends MunicipalityserviceStub {

	public MunicipalityStub() throws AxisFault {
		super();
	}

	@Override
	protected void addHeader(OMElement omElementToadd, SOAPEnvelope envelop) {
		SOAPHeaderBlock soapHeaderBlock = envelop.getHeader().addHeaderBlock(
				omElementToadd.getLocalName(), omElementToadd.getNamespace());

		// mustUnderstand is not used by X-Road
		// if(mustUnderstand) {
		// soapHeaderBlock.setMustUnderstand(mustUnderstand);
		// }
		OMNode omNode = null;
		for (Iterator iter = omElementToadd.getChildren(); iter.hasNext();) {
			omNode = (OMNode) iter.next();
		}

		soapHeaderBlock.addChild(omNode);

		OMAttribute omatribute = null;
		for (Iterator iter2 = omElementToadd.getAllAttributes(); iter2
				.hasNext();) {
			omatribute = (OMAttribute) iter2.next();
			soapHeaderBlock.addAttribute(omatribute);
		}
	}
}