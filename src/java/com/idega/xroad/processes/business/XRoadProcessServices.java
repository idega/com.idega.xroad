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
	 * @return  {@link Collection} of {@link XRoadProcess}
	 */
	public Collection<XRoadProcess> getAvailableProceses();

	/**
	 * Fetches all cases for all processes
	 *
	 * @return {@link Collection} of {@link CasePresentation}
	 */
	public Collection<CasePresentation> getAllCases();

	/**
	 * Fetches all the cases for the process
	 *
	 * @param processName - name of the process (not a localized one, but "system", i.e. ApplicationForTheParkingCard)
	 * @return {@link Collection} of {@link CasePresentation}
	 */
	public Collection<CasePresentation> getCasesForProcess(String processName);

	/**
	 * Starts a BPM process
	 *
	 * @param userId - process creator
	 * @param processName - name of the process (not a localized one, but "system", i.e. ApplicationForTheParkingCard)
	 * @param processData - variables for the process
	 * @return ID of the started process
	 */
	public Long doSubmitProcess(String userId, String processName, Map<String, Object> processData);

}