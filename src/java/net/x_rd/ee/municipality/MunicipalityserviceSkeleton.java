package net.x_rd.ee.municipality;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import org.jbpm.JbpmContext;
import org.jbpm.JbpmException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.idega.block.process.presentation.beans.CasePresentation;
import com.idega.jbpm.BPMContext;
import com.idega.jbpm.JbpmCallback;
import com.idega.user.data.User;
import com.idega.util.ArrayUtil;
import com.idega.util.expression.ELUtil;
import com.idega.xroad.processes.business.XRoadProcessServices;

/**
 * MunicipalityserviceSkeleton java skeleton for the axisService
 */
public class MunicipalityserviceSkeleton implements MunicipalityserviceSkeletonInterface {

	@Autowired
	private XRoadProcessServices xroadProcessesServices;

	@Autowired
	private BPMContext bpmContext;

	private XRoadProcessServices getXRoadProcessServices() {
		if (xroadProcessesServices == null)
			ELUtil.getInstance().autowire(this);

		return xroadProcessesServices;
	}

	private BPMContext getBPMContext() {
		if (bpmContext == null)
			ELUtil.getInstance().autowire(this);

		return bpmContext;
	}

	@Override
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
			User handler = c.getHandledBy();
			if (handler != null)
				e.setActiveOfficialName(handler.getName());
			cases.add(e);
		}

		CaseListResponse r = new CaseListResponse();
		Request_type8 req = new Request_type8();
		req.setPersonalCode(caseList.getRequest().getPersonalCode());
		r.setRequest(req);
		Response_type6 t = new Response_type6();
		CaseListEntry_type0[] casesArray = ArrayUtil.convertListToArray(cases);
		t.setCaseListEntry(casesArray);
		r.setResponse(t);
		return r;
	}

	/**
	 * Auto generated method signature
	 */
	@Override
	@Transactional(readOnly=false)
	public net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse submitParkingCardStatement(
			final net.x_rd.ee.municipality.producer.SubmitParkingCardStatement submitParkingCardStatement) {

		SubmitParkingCardStatementResponse response = getBPMContext().execute(new JbpmCallback<SubmitParkingCardStatementResponse>() {

			@Override
			public SubmitParkingCardStatementResponse doInJbpm(JbpmContext context) throws JbpmException {
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
						.put("string_applicantMobilePhone", type1.getApplicantMobilePhone());
				processData.put("string_applicantPhone", type1.getApplicantPhone());
				processData.put("string_otherRelationExplanationToOwnerOfApartments",
						type1.getOtherRelationExplanationToOwnerOfApartments());
				processData.put("string_ownerAddress", type1.getOwnerAddress());
				processData.put("string_ownerAppartmentNumber",
						type1.getOwnerAppartmentNumber());
				processData.put("files_ownerAttachments", type1.getOwnerAttachments());
				processData.put("string_ownerCommune", type1.getOwnerCommune());
				processData.put("string_ownerEmailAddress", type1.getOwnerEmailAddress());
				processData.put("string_repeatedOwnerEmailAddress", type1.getOwnerEmailAddress());
				processData.put("string_ownerFullName", type1.getOwnerFullName());
				processData.put("string_ownerPersonalId", type1.getOwnerPersonalId());
				processData.put("string_ownerPostCode", type1.getOwnerPostCode());
				processData.put("string_parkingCardComment", type1.getParkingCardComment());
				processData.put("string_relationsToOwnerOfApartments",
						type1.getRelationsToOwnerOfApartments());
				processData.put("string_vehicleRegistrationNumber",
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
		});

		return response;
	}

	/**
	 * Auto generated method signature
	 *
	 */

	@Override
	public net.x_rd.ee.municipality.producer.AllowedMethodsResponse allowedMethods(
			net.x_rd.ee.municipality.producer.AllowedMethods allowedMethods) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#allowedMethods");
	}

}
