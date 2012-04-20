package com.idega.xroad.business;

import net.x_rd.ee.municipality.producer.MunicipalityserviceStub.CaseListEntry_type0;
import net.x_rd.ee.municipality.producer.MunicipalityserviceStub.CaseListResponse;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.xroad.webservices.client.MunicipalityStub;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CasesDataProvider extends DefaultSpringBean {

	public static org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

	public CaseListEntry_type0[] getCases() throws Exception {
		MunicipalityStub stub = new MunicipalityStub();

		MunicipalityStub.CaseList caseList = (MunicipalityStub.CaseList) getTestObject(MunicipalityStub.CaseList.class);
		OMFactory fac = OMAbstractFactory.getOMFactory();
		OMNamespace omNs = fac.createOMNamespace("http://municipality.ee.x-rd.net/producer", "q1");
		OMElement method = fac.createOMElement("test", omNs);
		caseList.setRequest(method);

		MunicipalityStub.Consumer consumer = (MunicipalityStub.Consumer)getTestObject(MunicipalityStub.Consumer.class);
		consumer.setConsumer("ehub");

		MunicipalityStub.Producer producer = (MunicipalityStub.Producer)getTestObject(MunicipalityStub.Producer.class);
		producer.setProducer("municipality");

		MunicipalityStub.UserId userId = (MunicipalityStub.UserId)getTestObject(MunicipalityStub.UserId.class);
		userId.setUserId("EE12345678900");

		MunicipalityStub.Id id = (MunicipalityStub.Id)getTestObject(MunicipalityStub.Id.class);
		id.setId("municipality.1333026172.84603");

		MunicipalityStub.Service service = (MunicipalityStub.Service)getTestObject(MunicipalityStub.Service.class);
		service.setService("municipality.caseList");

		MunicipalityStub.Issue issue = (MunicipalityStub.Issue)getTestObject(MunicipalityStub.Issue.class);
		issue.setIssue("test");

		MunicipalityStub.Authenticator authenticator = (MunicipalityStub.Authenticator)getTestObject(MunicipalityStub.Authenticator.class);
		authenticator.setAuthenticator("test");

		CaseListResponse res = stub.caseList(caseList,consumer,producer,userId,id,service,issue,authenticator);
		return res.getResponse().getCaseListEntry();
	}

}
