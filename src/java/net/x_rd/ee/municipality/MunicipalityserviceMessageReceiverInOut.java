
/**
 * MunicipalityserviceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package net.x_rd.ee.municipality;

        /**
        *  MunicipalityserviceMessageReceiverInOut message receiver
        */

        public class MunicipalityserviceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        @Override
		public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        MunicipalityserviceSkeletonInterface skel = (MunicipalityserviceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){




            if("caseList".equals(methodName)){

                net.x_rd.ee.municipality.producer.CaseListResponse caseListResponse49 = null;
	                        net.x_rd.ee.municipality.producer.CaseList wrappedParam =
                                                             (net.x_rd.ee.municipality.producer.CaseList)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    net.x_rd.ee.municipality.producer.CaseList.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));

                                               caseListResponse49 =


                                                         skel.caseList(wrappedParam)
                                                    ;

                                        envelope = toEnvelope(getSOAPFactory(msgContext), caseListResponse49, false, new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer",
                                                    "caseList"));
                                    } else

            if("submitParkingCardStatement".equals(methodName)){

                net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse submitParkingCardStatementResponse58 = null;
	                        net.x_rd.ee.municipality.producer.SubmitParkingCardStatement wrappedParam =
                                                             (net.x_rd.ee.municipality.producer.SubmitParkingCardStatement)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    net.x_rd.ee.municipality.producer.SubmitParkingCardStatement.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));

                                               submitParkingCardStatementResponse58 =


                                                         skel.submitParkingCardStatement(wrappedParam)
                                                    ;

                                        envelope = toEnvelope(getSOAPFactory(msgContext), submitParkingCardStatementResponse58, false, new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer",
                                                    "submitParkingCardStatement"));
                                    } else

            if("allowedMethods".equals(methodName)){

                net.x_rd.ee.municipality.producer.AllowedMethodsResponse allowedMethodsResponse67 = null;
	                        net.x_rd.ee.municipality.producer.AllowedMethods wrappedParam =
                                                             (net.x_rd.ee.municipality.producer.AllowedMethods)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    net.x_rd.ee.municipality.producer.AllowedMethods.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));

                                               allowedMethodsResponse67 =


                                                         skel.allowedMethods(wrappedParam)
                                                    ;

                                        envelope = toEnvelope(getSOAPFactory(msgContext), allowedMethodsResponse67, false, new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer",
                                                    "allowedMethods"));

            } else {
              throw new java.lang.RuntimeException("method not found");
            }


        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        	e.printStackTrace();
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }

        //
            private  org.apache.axiom.om.OMElement  toOM(net.x_rd.ee.municipality.producer.CaseList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


                        try{
                             return param.getOMElement(net.x_rd.ee.municipality.producer.CaseList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }


            }

            private  org.apache.axiom.om.OMElement  toOM(net.x_rd.ee.municipality.producer.CaseListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


                        try{
                             return param.getOMElement(net.x_rd.ee.municipality.producer.CaseListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }


            }

            private  org.apache.axiom.om.OMElement  toOM(net.x_rd.xsd.xroad_xsd.Consumer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


                        try{
                             return param.getOMElement(net.x_rd.xsd.xroad_xsd.Consumer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }


            }

            private  org.apache.axiom.om.OMElement  toOM(net.x_rd.xsd.xroad_xsd.Producer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


                        try{
                             return param.getOMElement(net.x_rd.xsd.xroad_xsd.Producer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }


            }

            private  org.apache.axiom.om.OMElement  toOM(net.x_rd.xsd.xroad_xsd.UserId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


                        try{
                             return param.getOMElement(net.x_rd.xsd.xroad_xsd.UserId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }


            }

            private  org.apache.axiom.om.OMElement  toOM(net.x_rd.xsd.xroad_xsd.Id param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


                        try{
                             return param.getOMElement(net.x_rd.xsd.xroad_xsd.Id.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }


            }

            private  org.apache.axiom.om.OMElement  toOM(net.x_rd.xsd.xroad_xsd.Service param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


                        try{
                             return param.getOMElement(net.x_rd.xsd.xroad_xsd.Service.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }


            }

            private  org.apache.axiom.om.OMElement  toOM(net.x_rd.xsd.xroad_xsd.Issue param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


                        try{
                             return param.getOMElement(net.x_rd.xsd.xroad_xsd.Issue.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }


            }

            private  org.apache.axiom.om.OMElement  toOM(net.x_rd.xsd.xroad_xsd.Authenticator param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


                        try{
                             return param.getOMElement(net.x_rd.xsd.xroad_xsd.Authenticator.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }


            }

            private  org.apache.axiom.om.OMElement  toOM(net.x_rd.ee.municipality.producer.SubmitParkingCardStatement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


                        try{
                             return param.getOMElement(net.x_rd.ee.municipality.producer.SubmitParkingCardStatement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }


            }

            private  org.apache.axiom.om.OMElement  toOM(net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


                        try{
                             return param.getOMElement(net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }


            }

            private  org.apache.axiom.om.OMElement  toOM(net.x_rd.ee.municipality.producer.AllowedMethods param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


                        try{
                             return param.getOMElement(net.x_rd.ee.municipality.producer.AllowedMethods.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }


            }

            private  org.apache.axiom.om.OMElement  toOM(net.x_rd.ee.municipality.producer.AllowedMethodsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


                        try{
                             return param.getOMElement(net.x_rd.ee.municipality.producer.AllowedMethodsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }


            }

                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.x_rd.ee.municipality.producer.CaseListResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

                                    emptyEnvelope.getBody().addChild(param.getOMElement(net.x_rd.ee.municipality.producer.CaseListResponse.MY_QNAME,factory));


                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }

                         private net.x_rd.ee.municipality.producer.CaseListResponse wrapcaseList(){
                                net.x_rd.ee.municipality.producer.CaseListResponse wrappedElement = new net.x_rd.ee.municipality.producer.CaseListResponse();
                                return wrappedElement;
                         }

                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

                                    emptyEnvelope.getBody().addChild(param.getOMElement(net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse.MY_QNAME,factory));


                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }

                         private net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse wrapsubmitParkingCardStatement(){
                                net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse wrappedElement = new net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse();
                                return wrappedElement;
                         }

                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.x_rd.ee.municipality.producer.AllowedMethodsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

                                    emptyEnvelope.getBody().addChild(param.getOMElement(net.x_rd.ee.municipality.producer.AllowedMethodsResponse.MY_QNAME,factory));


                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }

                         private net.x_rd.ee.municipality.producer.AllowedMethodsResponse wrapallowedMethods(){
                                net.x_rd.ee.municipality.producer.AllowedMethodsResponse wrappedElement = new net.x_rd.ee.municipality.producer.AllowedMethodsResponse();
                                return wrappedElement;
                         }



        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {

                if (net.x_rd.ee.municipality.producer.CaseList.class.equals(type)){

                           return net.x_rd.ee.municipality.producer.CaseList.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.ee.municipality.producer.CaseListResponse.class.equals(type)){

                           return net.x_rd.ee.municipality.producer.CaseListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Consumer.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Consumer.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Producer.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Producer.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.UserId.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.UserId.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Id.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Id.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Service.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Service.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Issue.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Issue.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Authenticator.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Authenticator.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Consumer.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Consumer.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Producer.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Producer.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.UserId.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.UserId.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Id.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Id.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Service.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Service.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Issue.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Issue.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Authenticator.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Authenticator.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.ee.municipality.producer.SubmitParkingCardStatement.class.equals(type)){

                           return net.x_rd.ee.municipality.producer.SubmitParkingCardStatement.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse.class.equals(type)){

                           return net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Consumer.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Consumer.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Producer.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Producer.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.UserId.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.UserId.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Id.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Id.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Service.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Service.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Issue.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Issue.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Authenticator.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Authenticator.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Consumer.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Consumer.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Producer.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Producer.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.UserId.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.UserId.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Id.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Id.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Service.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Service.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Issue.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Issue.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Authenticator.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Authenticator.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.ee.municipality.producer.AllowedMethods.class.equals(type)){

                           return net.x_rd.ee.municipality.producer.AllowedMethods.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.ee.municipality.producer.AllowedMethodsResponse.class.equals(type)){

                           return net.x_rd.ee.municipality.producer.AllowedMethodsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Consumer.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Consumer.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Producer.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Producer.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.UserId.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.UserId.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Id.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Id.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Service.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Service.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Issue.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Issue.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Authenticator.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Authenticator.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Consumer.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Consumer.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Producer.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Producer.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.UserId.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.UserId.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Id.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Id.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Service.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Service.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Issue.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Issue.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

                if (net.x_rd.xsd.xroad_xsd.Authenticator.class.equals(type)){

                           return net.x_rd.xsd.xroad_xsd.Authenticator.Factory.parse(param.getXMLStreamReaderWithoutCaching());


                }

        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }





        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
