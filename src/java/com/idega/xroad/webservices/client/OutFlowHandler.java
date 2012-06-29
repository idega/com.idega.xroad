package com.idega.xroad.webservices.client;

import java.util.Iterator;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.soap.SOAP11Constants;
import org.apache.axiom.soap.SOAP12Constants;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPFactory;
import org.apache.axiom.soap.SOAPHeader;
import org.apache.axiom.soap.SOAPHeaderBlock;
import org.apache.axiom.soap.impl.llom.soap11.SOAP11HeaderBlockImpl;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;
import org.apache.axis2.wsdl.WSDLConstants;

public class OutFlowHandler extends AbstractHandler {
    public InvocationResponse invoke(MessageContext messageContext) throws AxisFault {
        // lets add an Soap header for the out going message
        SOAPEnvelope soapEnvelope = messageContext.getEnvelope();
        MessageContext requestMessageContext = MessageContext.getCurrentMessageContext().getOperationContext()
        		.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        SOAPHeader requestHeader = requestMessageContext.getEnvelope().getHeader();
        
        if (soapEnvelope.getHeader() == null) {
            String soapNamespace = soapEnvelope.getNamespace().getNamespaceURI();
            // creating a soap factory according the the soap namespce uri
            SOAPFactory soapFactory = null;
            if (soapNamespace.equals(SOAP11Constants.SOAP_ENVELOPE_NAMESPACE_URI)) {
                soapFactory = OMAbstractFactory.getSOAP11Factory();
            } else if (soapNamespace.equals(SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI)) {
                soapFactory = OMAbstractFactory.getSOAP12Factory();
            } else {
                System.out.println("Unknow soap message");
            }
            soapFactory.createSOAPHeader(soapEnvelope);
        }

        OMNamespace omNamespace = OMAbstractFactory.getOMFactory().createOMNamespace("http://x-rd.net/xsd/xroad.xsd","xrd");
        Iterator it = requestHeader.getChildElements();
		while (it.hasNext()) {
			SOAP11HeaderBlockImpl o = (SOAP11HeaderBlockImpl) it.next();
			SOAPHeaderBlock block = soapEnvelope.getHeader().addHeaderBlock(o.getLocalName(), omNamespace);
			block.setText(o.getText());
		}

        return InvocationResponse.CONTINUE;
    }

}
