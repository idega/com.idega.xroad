package com.idega.xroad.business;

import java.util.List;

import net.x_rd.ee.municipality.producer.CaseList;
import net.x_rd.ee.municipality.producer.CaseListEntry_type0;
import net.x_rd.ee.municipality.producer.Request_type8;
import net.x_rd.ee.municipality.producer.Request_type9;
import net.x_rd.ee.municipality.producer.SubmitParkingCardStatement;
import net.x_rd.ee.municipality.producer.SubmitParkingCardStatementEntry_type0;
import net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponseEntry_type0;
import net.x_rd.xsd.xroad_xsd.Authenticator;
import net.x_rd.xsd.xroad_xsd.Consumer;
import net.x_rd.xsd.xroad_xsd.Id;
import net.x_rd.xsd.xroad_xsd.Issue;
import net.x_rd.xsd.xroad_xsd.Producer;
import net.x_rd.xsd.xroad_xsd.UserId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.util.ListUtil;
import com.idega.util.expression.ELUtil;
import com.idega.xroad.data.XRoadDAO;
import com.idega.xroad.data.XRoadServer;
import com.idega.xroad.webservices.client.MunicipalityStub;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CasesDataProvider extends DefaultSpringBean {

	@Autowired
	private XRoadDAO xroadDAO;

	private XRoadDAO getXRoadDAO() {
		if (xroadDAO == null)
			ELUtil.getInstance().autowire(this);
		return xroadDAO;
	}

	public static org.apache.axis2.databinding.ADBBean getTestObject(
			java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

	public CaseListEntry_type0[] getCases() throws Exception {
		List<XRoadServer> servers = getXRoadDAO().getAllServers();
		if (ListUtil.isEmpty(servers)) {
			getLogger().warning("No servers of X-Road are configured");
			return null;
		}

		MunicipalityStub stub = new MunicipalityStub(servers.iterator().next()
				.getUrl());
		CaseList caseList = (CaseList) getTestObject(CaseList.class);
		caseList.setRequest(new Request_type8());

		Consumer consumer = (Consumer) getTestObject(Consumer.class);
		consumer.setConsumer("ehub");

		Producer producer = (Producer) getTestObject(Producer.class);
		producer.setProducer("municipality");

		UserId userId = (UserId) getTestObject(UserId.class);
		userId.setUserId("EE12345678900");

		Id id = (Id) getTestObject(Id.class);
		id.setId("municipality.1333026172.84603");

		net.x_rd.xsd.xroad_xsd.Service service = (net.x_rd.xsd.xroad_xsd.Service) getTestObject(net.x_rd.xsd.xroad_xsd.Service.class);
		service.setService("municipality.caseList");

		Issue issue = (Issue) getTestObject(Issue.class);
		issue.setIssue("test");

		Authenticator authenticator = (Authenticator) getTestObject(Authenticator.class);
		authenticator.setAuthenticator("test");

		net.x_rd.ee.municipality.producer.CaseListResponse res = stub.caseList(
				caseList, consumer, producer, userId, id, service, issue,
				authenticator);
		return res.getResponse().getCaseListEntry();
	}

	public SubmitParkingCardStatementResponseEntry_type0 submitParkingCardStatement()
			throws Exception {
		List<XRoadServer> servers = getXRoadDAO().getAllServers();
		if (ListUtil.isEmpty(servers)) {
			getLogger().warning("No servers of X-Road are configured");
			return null;
		}

		MunicipalityStub stub = new MunicipalityStub(servers.iterator().next()
				.getUrl());
		SubmitParkingCardStatement submitParkingCardStatement = (SubmitParkingCardStatement) getTestObject(SubmitParkingCardStatement.class);
		Request_type9 r = new Request_type9();
		SubmitParkingCardStatementEntry_type0 s = new SubmitParkingCardStatementEntry_type0();
		s.setApplicantMobilePhone("1");
		s.setApplicantPhone("1");
		s.setOtherRelationExplanationToOwnerOfApartments("1");
		s.setOwnerAddress("1");
		s.setOwnerAppartmentNumber("1");
		s.setOwnerAttachments("1");
		s.setOwnerCommune("1");
		s.setOwnerEmailAddress("1");
		s.setOwnerFullName("1");
		s.setOwnerPersonalId("1");
		s.setOwnerPostCode("1");
		s.setParkingCardComment("1");
		s.setRelationsToOwnerOfApartments("1");
		s.setVehicleRegistrationNumber("1");

		Consumer consumer = (Consumer) getTestObject(Consumer.class);
		consumer.setConsumer("ehub");

		Producer producer = (Producer) getTestObject(Producer.class);
		producer.setProducer("municipality");

		UserId userId = (UserId) getTestObject(UserId.class);
		userId.setUserId("EE12345678900");

		Id id = (Id) getTestObject(Id.class);
		id.setId("municipality.1333026172.84603");

		net.x_rd.xsd.xroad_xsd.Service service = (net.x_rd.xsd.xroad_xsd.Service) getTestObject(net.x_rd.xsd.xroad_xsd.Service.class);
		service.setService("municipality.submitParkingCardStatement");

		Issue issue = (Issue) getTestObject(Issue.class);
		issue.setIssue("test");

		Authenticator authenticator = (Authenticator) getTestObject(Authenticator.class);
		authenticator.setAuthenticator("test");

		r.setSubmitParkingCardStatementEntry(s);
		submitParkingCardStatement.setRequest(r);

		net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse res = stub
				.submitParkingCardStatement(submitParkingCardStatement,
						consumer, producer, userId, id, service, issue,
						authenticator);
		return res.getResponse().getSubmitParkingCardStatementResponseEntry();
	}

}
