package com.idega.xroad.business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import net.x_rd.ee.municipality.producer.CaseList;
import net.x_rd.ee.municipality.producer.CaseListEntry_type0;
import net.x_rd.ee.municipality.producer.Request_type11;
import net.x_rd.ee.municipality.producer.Request_type9;
import net.x_rd.ee.municipality.producer.SubmitParkingCardStatement;
import net.x_rd.ee.municipality.producer.SubmitParkingCardStatementEntry_type1;
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
import com.idega.xroad.bean.Case;
import com.idega.xroad.bean.Message;
import com.idega.xroad.data.XRoadDAO;
import com.idega.xroad.data.XRoadServer;
import com.idega.xroad.webservices.client.MunicipalityStub;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CasesDataProvider extends DefaultSpringBean implements
		XroadGateway {

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

	@Override
	public Collection<Case> getCasesByUser(String serviceId, String userId)
			throws Exception {

		List<XRoadServer> servers = getXRoadDAO().getAllServers();
		if (ListUtil.isEmpty(servers)) {
			getLogger().warning("No servers of X-Road are configured");
			return null;
		}

		MunicipalityStub stub = new MunicipalityStub(servers.iterator().next()
				.getUrl());
		CaseList caseList = (CaseList) getTestObject(CaseList.class);
		Request_type9 t = new Request_type9();
		t.setPersonalCode(userId);
		caseList.setRequest(t);

		Consumer consumer = (Consumer) getTestObject(Consumer.class);
		consumer.setConsumer("ehub");

		Producer producer = (Producer) getTestObject(Producer.class);
		producer.setProducer("municipality");

		UserId uId = (UserId) getTestObject(UserId.class);
		uId.setUserId("EE12345678900");

		Id id = (Id) getTestObject(Id.class);
		id.setId("municipality.1333026172.84603");

		net.x_rd.xsd.xroad_xsd.Service service = (net.x_rd.xsd.xroad_xsd.Service) getTestObject(net.x_rd.xsd.xroad_xsd.Service.class);
		service.setService("municipality.caseList");

		Issue issue = (Issue) getTestObject(Issue.class);
		issue.setIssue("test");

		Authenticator authenticator = (Authenticator) getTestObject(Authenticator.class);
		authenticator.setAuthenticator("test");

		net.x_rd.ee.municipality.producer.CaseListResponse res = stub.caseList(
				caseList, consumer, producer, uId, id, service, issue,
				authenticator);
		CaseListEntry_type0[] userCases = res.getResponse().getCaseListEntry();

		Collection<Case> result = new ArrayList<Case>();
		for (int i = 0; i < userCases.length; i++) {
			CaseListEntry_type0 c0 = userCases[i];
			Case c = new Case();
			c.setStatus(c0.getCaseStatus());
			c.setId(Integer.valueOf(c0.getCaseId()));
			c.setSubject(c0.getCaseName());
			result.add(c);
		}

		return result;
	}

	@Override
	public String submitParkingCardStatement(String serviceId, String userId,
			Map<String, Object> data) throws Exception {
		List<XRoadServer> servers = getXRoadDAO().getAllServers();
		if (ListUtil.isEmpty(servers)) {
			getLogger().warning("No servers of X-Road are configured");
			return null;
		}

		MunicipalityStub stub = new MunicipalityStub(servers.iterator().next()
				.getUrl());
		SubmitParkingCardStatement submitParkingCardStatement = (SubmitParkingCardStatement) getTestObject(SubmitParkingCardStatement.class);
		Request_type11 r = new Request_type11();
		SubmitParkingCardStatementEntry_type1 s = new SubmitParkingCardStatementEntry_type1();
		s.setApplicantMobilePhone((String) data.get("applicantMobilePhone"));
		s.setApplicantPhone((String) data.get("applicantPhone"));
		s.setOtherRelationExplanationToOwnerOfApartments((String) data
				.get("otherRelationExplanationToOwnerOfApartments"));
		s.setOwnerAddress((String) data.get("ownerAddress"));
		s.setOwnerAppartmentNumber((String) data.get("ownerAppartmentNumber"));
		s.setOwnerAttachments((String) data.get("ownerAttachments"));
		s.setOwnerCommune((String) data.get("ownerCommune"));
		s.setOwnerEmailAddress((String) data.get("ownerEmailAddress"));
		s.setOwnerFullName((String) data.get("ownerFullName"));
		s.setOwnerPersonalId((String) data.get("ownerPersonalId"));
		s.setOwnerPostCode((String) data.get("ownerPostCode"));
		s.setParkingCardComment((String) data.get("parkingCardComment"));
		s.setRelationsToOwnerOfApartments((String) data
				.get("relationsToOwnerOfApartments"));
		s.setVehicleRegistrationNumber((String) data
				.get("vehicleRegistrationNumber"));

		Consumer consumer = (Consumer) getTestObject(Consumer.class);
		consumer.setConsumer("ehub");

		Producer producer = (Producer) getTestObject(Producer.class);
		producer.setProducer("municipality");

		UserId uId = (UserId) getTestObject(UserId.class);
		uId.setUserId("EE12345678900");

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
						consumer, producer, uId, id, service, issue,
						authenticator);
		SubmitParkingCardStatementResponseEntry_type0 responseEntry = res
				.getResponse().getSubmitParkingCardStatementResponseEntry();

		return responseEntry.getProcessId();
	}

	@Override
	public Collection<Message> getMessagesByUser(String serviceId, String userId)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Message> getUnreadMessagesByUser(String serviceId,
			String userId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Case> getUnreadCasesByUser(String serviceId, String userId)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message getMessage(String serviceId, String userId, String messageId)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Case getCase(String serviceId, String userId, String caseId)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCaseRead(String serviceId, String userId, String caseId,
			Boolean read) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMessageRead(String serviceId, String userId,
			String messageId, Boolean read) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Case> getCasesByCriteria(String serviceId,
			String caseNumber, String description, String name,
			String personalId, List<String> statuses, String dateFrom,
			String dateTo, String ownerId, List<String> groups,
			Boolean simpleCases, Boolean notGeneralCases) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
