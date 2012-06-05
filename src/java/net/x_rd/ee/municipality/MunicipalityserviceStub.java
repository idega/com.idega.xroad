
/**
 * MunicipalityserviceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package net.x_rd.ee.municipality;

        

        /*
        *  MunicipalityserviceStub java implementation
        */

        
        public class MunicipalityserviceStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("Municipalityservice" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[3];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "caseList"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "submitParkingCardStatement"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "allowedMethods"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         


    }

    /**
      *Constructor that takes in a configContext
      */

    public MunicipalityserviceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public MunicipalityserviceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public MunicipalityserviceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://localhost:8080/workspace/services/municipalityservice/" );
                
    }

    /**
     * Default Constructor
     */
    public MunicipalityserviceStub() throws org.apache.axis2.AxisFault {
        
                    this("http://localhost:8080/workspace/services/municipalityservice/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public MunicipalityserviceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see net.x_rd.ee.municipality.Municipalityservice#caseList
                     * @param caseList239
                    
                     * @param consumer240
                    
                     * @param producer241
                    
                     * @param userId242
                    
                     * @param id243
                    
                     * @param service244
                    
                     * @param issue245
                    
                     * @param authenticator246
                    
                     */

                    

                            public  net.x_rd.ee.municipality.producer.CaseListResponse caseList(

                            net.x_rd.ee.municipality.producer.CaseList caseList239,net.x_rd.xsd.xroad_xsd.Consumer consumer240,net.x_rd.xsd.xroad_xsd.Producer producer241,net.x_rd.xsd.xroad_xsd.UserId userId242,net.x_rd.xsd.xroad_xsd.Id id243,net.x_rd.xsd.xroad_xsd.Service service244,net.x_rd.xsd.xroad_xsd.Issue issue245,net.x_rd.xsd.xroad_xsd.Authenticator authenticator246)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    caseList239,
                                                    optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer",
                                                    "caseList")), new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer",
                                                    "caseList"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (consumer240!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconsumer240 = toOM(consumer240, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "caseList")));
                                                    addHeader(omElementconsumer240,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (producer241!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementproducer241 = toOM(producer241, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "caseList")));
                                                    addHeader(omElementproducer241,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (userId242!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserId242 = toOM(userId242, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "caseList")));
                                                    addHeader(omElementuserId242,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (id243!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementid243 = toOM(id243, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "caseList")));
                                                    addHeader(omElementid243,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (service244!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementservice244 = toOM(service244, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "caseList")));
                                                    addHeader(omElementservice244,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (issue245!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementissue245 = toOM(issue245, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "caseList")));
                                                    addHeader(omElementissue245,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (authenticator246!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementauthenticator246 = toOM(authenticator246, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "caseList")));
                                                    addHeader(omElementauthenticator246,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             net.x_rd.ee.municipality.producer.CaseListResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.x_rd.ee.municipality.producer.CaseListResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"caseList"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"caseList"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"caseList"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see net.x_rd.ee.municipality.Municipalityservice#submitParkingCardStatement
                     * @param submitParkingCardStatement248
                    
                     * @param consumer249
                    
                     * @param producer250
                    
                     * @param userId251
                    
                     * @param id252
                    
                     * @param service253
                    
                     * @param issue254
                    
                     * @param authenticator255
                    
                     */

                    

                            public  net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse submitParkingCardStatement(

                            net.x_rd.ee.municipality.producer.SubmitParkingCardStatement submitParkingCardStatement248,net.x_rd.xsd.xroad_xsd.Consumer consumer249,net.x_rd.xsd.xroad_xsd.Producer producer250,net.x_rd.xsd.xroad_xsd.UserId userId251,net.x_rd.xsd.xroad_xsd.Id id252,net.x_rd.xsd.xroad_xsd.Service service253,net.x_rd.xsd.xroad_xsd.Issue issue254,net.x_rd.xsd.xroad_xsd.Authenticator authenticator255)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    submitParkingCardStatement248,
                                                    optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer",
                                                    "submitParkingCardStatement")), new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer",
                                                    "submitParkingCardStatement"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (consumer249!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconsumer249 = toOM(consumer249, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "submitParkingCardStatement")));
                                                    addHeader(omElementconsumer249,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (producer250!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementproducer250 = toOM(producer250, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "submitParkingCardStatement")));
                                                    addHeader(omElementproducer250,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (userId251!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserId251 = toOM(userId251, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "submitParkingCardStatement")));
                                                    addHeader(omElementuserId251,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (id252!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementid252 = toOM(id252, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "submitParkingCardStatement")));
                                                    addHeader(omElementid252,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (service253!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementservice253 = toOM(service253, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "submitParkingCardStatement")));
                                                    addHeader(omElementservice253,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (issue254!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementissue254 = toOM(issue254, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "submitParkingCardStatement")));
                                                    addHeader(omElementissue254,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (authenticator255!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementauthenticator255 = toOM(authenticator255, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "submitParkingCardStatement")));
                                                    addHeader(omElementauthenticator255,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"submitParkingCardStatement"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"submitParkingCardStatement"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"submitParkingCardStatement"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see net.x_rd.ee.municipality.Municipalityservice#allowedMethods
                     * @param allowedMethods257
                    
                     * @param consumer258
                    
                     * @param producer259
                    
                     * @param userId260
                    
                     * @param id261
                    
                     * @param service262
                    
                     * @param issue263
                    
                     * @param authenticator264
                    
                     */

                    

                            public  net.x_rd.ee.municipality.producer.AllowedMethodsResponse allowedMethods(

                            net.x_rd.ee.municipality.producer.AllowedMethods allowedMethods257,net.x_rd.xsd.xroad_xsd.Consumer consumer258,net.x_rd.xsd.xroad_xsd.Producer producer259,net.x_rd.xsd.xroad_xsd.UserId userId260,net.x_rd.xsd.xroad_xsd.Id id261,net.x_rd.xsd.xroad_xsd.Service service262,net.x_rd.xsd.xroad_xsd.Issue issue263,net.x_rd.xsd.xroad_xsd.Authenticator authenticator264)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    allowedMethods257,
                                                    optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer",
                                                    "allowedMethods")), new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer",
                                                    "allowedMethods"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (consumer258!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconsumer258 = toOM(consumer258, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "allowedMethods")));
                                                    addHeader(omElementconsumer258,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (producer259!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementproducer259 = toOM(producer259, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "allowedMethods")));
                                                    addHeader(omElementproducer259,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (userId260!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementuserId260 = toOM(userId260, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "allowedMethods")));
                                                    addHeader(omElementuserId260,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (id261!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementid261 = toOM(id261, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "allowedMethods")));
                                                    addHeader(omElementid261,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (service262!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementservice262 = toOM(service262, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "allowedMethods")));
                                                    addHeader(omElementservice262,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (issue263!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementissue263 = toOM(issue263, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "allowedMethods")));
                                                    addHeader(omElementissue263,env);
                                                
                                        }
                                    
                                        // add the children only if the parameter is not null
                                        if (authenticator264!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementauthenticator264 = toOM(authenticator264, optimizeContent(new javax.xml.namespace.QName("http://municipality.ee.x-rd.net/producer", "allowedMethods")));
                                                    addHeader(omElementauthenticator264,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             net.x_rd.ee.municipality.producer.AllowedMethodsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.x_rd.ee.municipality.producer.AllowedMethodsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"allowedMethods"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"allowedMethods"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"allowedMethods"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
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

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //http://localhost:8080/workspace/services/municipalityservice
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
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.x_rd.ee.municipality.producer.CaseList param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.x_rd.ee.municipality.producer.CaseList.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.x_rd.ee.municipality.producer.SubmitParkingCardStatement param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.x_rd.ee.municipality.producer.SubmitParkingCardStatement.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.x_rd.ee.municipality.producer.AllowedMethods param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.x_rd.ee.municipality.producer.AllowedMethods.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


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



    
   }
   