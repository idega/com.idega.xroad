package net.x_rd.ee.municipality;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.util.AXIOMUtil;

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

	public net.x_rd.ee.municipality.producer.CaseListResponse caseList(
			net.x_rd.ee.municipality.producer.CaseList caseList) {
		
		// TODO : fill this with the necessary business logic
		
		CaseListResponse r = new CaseListResponse();
		Request_type8 req = new Request_type8();
		req.setPersonalCode(caseList.getRequest().getPersonalCode());
		r.setRequest(req);
		
		Response_type6 t = new Response_type6();
		CaseListEntry_type0 e = new CaseListEntry_type0();
		e.setCaseId("123");
		e.setCaseName("Test case");
		e.setCaseStatus("status");
		e.setStatusChangeTime("2012-06-05 08:00:00");
		e.setStatusChangeMessage("Test message");
		e.setActiveOfficialName("name");
		CaseListEntry_type0[] caseListEntry_type0 = new CaseListEntry_type0[1];
		caseListEntry_type0[0] = e;
		t.setCaseListEntry(caseListEntry_type0);
		r.setResponse(t);
		return r;
	}

	/**
	 * Auto generated method signature
	 */
	//TODO Implement method
	public net.x_rd.ee.municipality.producer.SubmitParkingCardStatementResponse submitParkingCardStatement(
			net.x_rd.ee.municipality.producer.SubmitParkingCardStatement submitParkingCardStatement) {
		
		// TODO : fill this with the necessary business logic
		
		SubmitParkingCardStatementResponse r = new SubmitParkingCardStatementResponse();
		Request_type10 req = new Request_type10();
		SubmitParkingCardStatementEntry_type0 type0 = new SubmitParkingCardStatementEntry_type0();
		SubmitParkingCardStatementEntry_type1 type1 = submitParkingCardStatement.getRequest().getSubmitParkingCardStatementEntry();
		type0.setApplicantMobilePhone(type1.getApplicantMobilePhone());
		type0.setApplicantPhone(type1.getApplicantPhone());
		type0.setOtherRelationExplanationToOwnerOfApartments(type1.getOtherRelationExplanationToOwnerOfApartments());
		type0.setOwnerAddress(type1.getOwnerAddress());
		type0.setOwnerAppartmentNumber(type1.getOwnerAppartmentNumber());
		type0.setOwnerAttachments(type1.getOwnerAttachments());
		type0.setOwnerCommune(type1.getOwnerCommune());
		type0.setOwnerEmailAddress(type1.getOwnerEmailAddress());
		type0.setOwnerFullName(type1.getOwnerFullName());
		type0.setOwnerPersonalId(type1.getOwnerPersonalId());
		type0.setOwnerPostCode(type1.getOwnerPostCode());
		type0.setParkingCardComment(type1.getParkingCardComment());
		type0.setRelationsToOwnerOfApartments(type1.getRelationsToOwnerOfApartments());
		type0.setVehicleRegistrationNumber(type1.getVehicleRegistrationNumber());
		
		req.setSubmitParkingCardStatementEntry(type0);
		r.setRequest(req);
		Response_type7 t = new Response_type7();
		SubmitParkingCardStatementResponseEntry_type0 e = new SubmitParkingCardStatementResponseEntry_type0();
		e.setProcessId("123");
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
