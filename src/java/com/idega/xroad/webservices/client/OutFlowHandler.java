package com.idega.xroad.webservices.client;



import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.soap.SOAP11Constants;
import org.apache.axiom.soap.SOAP12Constants;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPFactory;
import org.apache.axiom.soap.SOAPHeaderBlock;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;

public class OutFlowHandler extends AbstractHandler {
    public InvocationResponse invoke(MessageContext messageContext) throws AxisFault {
        // lets add an Soap header for the out going message
        SOAPEnvelope soapEnvelope = messageContext.getEnvelope();

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
        SOAPHeaderBlock consumer = soapEnvelope.getHeader().addHeaderBlock("consumer", omNamespace);
        consumer.setText("ehub");
        
        SOAPHeaderBlock producer = soapEnvelope.getHeader().addHeaderBlock("producer", omNamespace);
        producer.setText("municipality");
        
        SOAPHeaderBlock userId = soapEnvelope.getHeader().addHeaderBlock("userId", omNamespace);
        userId.setText("EE12345678900");
        
        SOAPHeaderBlock id = soapEnvelope.getHeader().addHeaderBlock("id", omNamespace);
        id.setText("municipality.1333026172.84603");
        
        SOAPHeaderBlock service = soapEnvelope.getHeader().addHeaderBlock("service", omNamespace);
        service.setText("municipality.submitParkingCardStatement");
        
        SOAPHeaderBlock issue = soapEnvelope.getHeader().addHeaderBlock("issue", omNamespace);
        issue.setText("test");
        
        SOAPHeaderBlock authenticator = soapEnvelope.getHeader().addHeaderBlock("authenticator", omNamespace);
        authenticator.setText("test");

        return InvocationResponse.CONTINUE;
    }

}
