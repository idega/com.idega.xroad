package com.idega.xroad.processes.business;

import java.util.Collection;
import java.util.Map;

import com.idega.block.process.presentation.beans.CasePresentation;
import com.idega.xroad.processes.bean.XRoadProcess;

/**
 * Gateway between Idega's API to the cases/BPM system and X-Road
 *
 * @author valdas
 *
 */
public interface XRoadProcessServices {

	/**
	 * Fetches a list of all available processes
	 *
	 * @param userPersonalId - user who wishes to get BPM processes
	 * @return  {@link Collection} of {@link XRoadProcess}
	 */
	public Collection<XRoadProcess> getAvailableProceses(String userPersonalId);

	/**
	 * Fetches all cases for all processes
	 *
	 * @param userPersonalId - user who wishes to get cases
	 * @return {@link Collection} of {@link CasePresentation}
	 */
	public Collection<CasePresentation> getAllCases(String userPersonalId);

	/**
	 * Fetches all the cases for the process
	 *
	 * @param userPersonalId - user who wishes to get cases
	 * @param processName - name of the process (not a localized one, but "system", i.e. ParkingCard)
	 * @return {@link Collection} of {@link CasePresentation}
	 */
	public Collection<CasePresentation> getCasesForProcess(String userPersonalId, String processName);

	/**
	 * Starts a BPM process
	 *
	 * @param userPersonalId - process creator
	 * @param processName - name of the process (not a localized one, but "system", i.e. ParkingCard)
	 * @param processData - variables for the process
	 * @return ID of the started process
	 */
	public Long doSubmitProcess(String userPersonalId, String processName, Map<String, Object> processData);

}