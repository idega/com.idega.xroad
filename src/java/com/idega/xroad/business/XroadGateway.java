package com.idega.xroad.business;

import java.util.Collection;
import java.util.List;

import com.idega.xroad.bean.Case;
import com.idega.xroad.bean.Message;

public interface XroadGateway {
	
	public static final String BEAN_NAME = "xroadGateway";
	
	public Collection<Message> getMessagesByUser(String serviceId, String userId) throws Exception;

	public Collection<Message> getUnreadMessagesByUser(String serviceId, String userId)  throws Exception;

	public Collection<Case> getCasesByUser(String serviceId, String userId)  throws Exception;

	public Collection<Case> getUnreadCasesByUser(String serviceId, String userId)  throws Exception;
	public Message getMessage(String serviceId, String userId, String messageId) throws Exception;

	public Case getCase(String serviceId, String userId, String caseId) throws Exception;

	public void setCaseRead(String serviceId, String userId, String caseId, Boolean read) throws Exception;
	
	public void setMessageRead(String serviceId, String userId, String messageId, Boolean read) throws Exception;
	
	public Collection<Case> getCasesByCriteria(String serviceId,String caseNumber, 
			String description, String name, String personalId, List<String> statuses, String dateFrom, String dateTo, 
			String ownerId, List<String> groups, Boolean simpleCases, Boolean notGeneralCases) throws Exception;
	
}

