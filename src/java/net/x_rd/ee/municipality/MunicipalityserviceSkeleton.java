package net.x_rd.ee.municipality;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.idega.block.process.presentation.beans.CasePresentation;
import com.idega.util.expression.ELUtil;
import com.idega.xroad.processes.business.XRoadProcessServices;

import net.x_rd.ee.municipality.producer.CaseListEntry_type0;
import net.x_rd.ee.municipality.producer.CaseListResponse;
import net.x_rd.ee.municipality.producer.Request_type10;
import net.x_rd.ee.municipality.producer.Request_type8;
import net.x_rd.ee.municipality.producer.Response_type6;
import net.x_rd.ee.municipality.producer.Response_type7;
import net.x_rd.ee.municipality.producer.SubmitParkingCardStatementEntry_type0;
import net.x_rd.ee.municipality.producer.SubmitParkingCardStatementEntry_type1;
import net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse;
import net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponseEntry_type0;

/**
 * MunicipalityserviceSkeleton java skeleton for the axisService
 */
public class MunicipalityserviceSkeleton implements
		MunicipalityserviceSkeletonInterface {

	/**
	 * Auto generated method signature
	 */

	@Autowired
	private XRoadProcessServices xroadProcessesServices;

	private XRoadProcessServices getXRoadProcessServices() {
		if (xroadProcessesServices == null) {
			ELUtil.getInstance().autowire(this);
		}
		return xroadProcessesServices;
	}

	public net.x_rd.ee.municipality.producer.CaseListResponse caseList(
			net.x_rd.ee.municipality.producer.CaseList caseList) {

		Collection<CasePresentation> allCases = getXRoadProcessServices()
				.getAllCases(caseList.getRequest().getPersonalCode());
		List<CaseListEntry_type0> cases = new ArrayList<CaseListEntry_type0>();
		for (CasePresentation c : allCases) {
			CaseListEntry_type0 e = new CaseListEntry_type0();
			e.setCaseId(c.getCaseIdentifier());
			e.setCaseName(c.getSubject());
			e.setCaseStatus(c.getCaseStatusLocalized());
			e.setStatusChangeTime("2012-06-05 08:00:00");
			e.setStatusChangeMessage("Status change message...");
			e.setActiveOfficialName(c.getHandledBy().getName());
			cases.add(e);
		}

		CaseListResponse r = new CaseListResponse();
		Request_type8 req = new Request_type8();
		req.setPersonalCode(caseList.getRequest().getPersonalCode());
		r.setRequest(req);
		Response_type6 t = new Response_type6();
		t.setCaseListEntry((CaseListEntry_type0[]) cases.toArray());
		r.setResponse(t);
		return r;
	}

	/**
	 * Auto generated method signature
	 */
	public net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse submitParkingCardStatement(
			net.x_rd.ee.municipality.producer.SubmitParkingCardStatement submitParkingCardStatement) {

		SubmitParkingCardStatementResponse r = new SubmitParkingCardStatementResponse();
		Request_type10 req = new Request_type10();
		SubmitParkingCardStatementEntry_type0 type0 = new SubmitParkingCardStatementEntry_type0();
		SubmitParkingCardStatementEntry_type1 type1 = submitParkingCardStatement
				.getRequest().getSubmitParkingCardStatementEntry();
		type0.setApplicantMobilePhone(type1.getApplicantMobilePhone());
		type0.setApplicantPhone(type1.getApplicantPhone());
		type0.setOtherRelationExplanationToOwnerOfApartments(type1
				.getOtherRelationExplanationToOwnerOfApartments());
		type0.setOwnerAddress(type1.getOwnerAddress());
		type0.setOwnerAppartmentNumber(type1.getOwnerAppartmentNumber());
		type0.setOwnerAttachments(type1.getOwnerAttachments());
		type0.setOwnerCommune(type1.getOwnerCommune());
		type0.setOwnerEmailAddress(type1.getOwnerEmailAddress());
		type0.setOwnerFullName(type1.getOwnerFullName());
		type0.setOwnerPersonalId(type1.getOwnerPersonalId());
		type0.setOwnerPostCode(type1.getOwnerPostCode());
		type0.setParkingCardComment(type1.getParkingCardComment());
		type0.setRelationsToOwnerOfApartments(type1
				.getRelationsToOwnerOfApartments());
		type0.setVehicleRegistrationNumber(type1.getVehicleRegistrationNumber());

		Map<String, Object> processData = new HashMap<String, Object>();
		processData
				.put("applicantMobilePhone", type1.getApplicantMobilePhone());
		processData.put("applicantPhone", type1.getApplicantPhone());
		processData.put("otherRelationExplanationToOwnerOfApartments",
				type1.getOtherRelationExplanationToOwnerOfApartments());
		processData.put("ownerAddress", type1.getOwnerAddress());
		processData.put("ownerAppartmentNumber",
				type1.getOwnerAppartmentNumber());
		processData.put("ownerAttachments", type1.getOwnerAttachments());
		processData.put("ownerCommune", type1.getOwnerCommune());
		processData.put("ownerEmailAddress", type1.getOwnerEmailAddress());
		processData.put("ownerFullName", type1.getOwnerFullName());
		processData.put("ownerPersonalId", type1.getOwnerPersonalId());
		processData.put("ownerPostCode", type1.getOwnerPostCode());
		processData.put("parkingCardComment", type1.getParkingCardComment());
		processData.put("relationsToOwnerOfApartments",
				type1.getRelationsToOwnerOfApartments());
		processData.put("vehicleRegistrationNumber",
				type1.getVehicleRegistrationNumber());

		Long processId = getXRoadProcessServices().doSubmitProcess(
				type1.getOwnerPersonalId(), "ParkingCard", processData);

		req.setSubmitParkingCardStatementEntry(type0);
		r.setRequest(req);
		Response_type7 t = new Response_type7();
		SubmitParkingCardStatementResponseEntry_type0 e = new SubmitParkingCardStatementResponseEntry_type0();
		e.setProcessId(Long.toString(processId));
		t.setSubmitParkingCardStatementResponseEntry(e);
		r.setResponse(t);
		return r;
	}

	/**
	 * Auto generated method signature
	 * 
	 */

	public net.x_rd.ee.municipality.producer.AllowedMethodsResponse allowedMethods(
			net.x_rd.ee.municipality.producer.AllowedMethods allowedMethods) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#allowedMethods");
	}

}
