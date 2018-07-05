package com.bonitasoft.rpa;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.bonitasoft.engine.api.ApiAccessType;
import org.bonitasoft.engine.api.LoginAPI;
import org.bonitasoft.engine.api.ProcessAPI;
import org.bonitasoft.engine.api.TenantAPIAccessor;
import org.bonitasoft.engine.bpm.contract.ContractViolationException;
import org.bonitasoft.engine.bpm.flownode.FlowNodeExecutionException;
import org.bonitasoft.engine.bpm.flownode.UserTaskNotFoundException;
import org.bonitasoft.engine.exception.BonitaHomeNotSetException;
import org.bonitasoft.engine.exception.ServerAPIException;
import org.bonitasoft.engine.exception.UnknownAPITypeException;
import org.bonitasoft.engine.platform.LoginException;
import org.bonitasoft.engine.platform.LogoutException;
import org.bonitasoft.engine.platform.UnknownUserException;
import org.bonitasoft.engine.session.APISession;
import org.bonitasoft.engine.session.SessionNotFoundException;
import org.bonitasoft.engine.util.APITypeManager;

public class Main {
	static public void Main(String[] args) throws BonitaHomeNotSetException, ServerAPIException, UnknownAPITypeException, UnknownUserException, LoginException, UserTaskNotFoundException, FlowNodeExecutionException, NumberFormatException, ContractViolationException, SessionNotFoundException, LogoutException {
		Map<String, String> settings = new HashMap<String, String>();
		settings.put("server.url", "http://localhost:8080");
		settings.put("application.name", "bonita");
		APITypeManager.setAPITypeAndParams(ApiAccessType.HTTP, settings);
		LoginAPI loginAPI = TenantAPIAccessor.getLoginAPI();
		APISession apiSession = loginAPI.login("walter.bates", "bpm");
		
		String taskid = args[0];
		
		ProcessAPI processAPI = TenantAPIAccessor.getProcessAPI(apiSession);
		HashMap<String, Serializable> inputs = new HashMap<String, Serializable>();
		HashMap<String, Serializable> aPieceOfData = new HashMap<String, Serializable>();
		inputs.put("aPieceOfData", aPieceOfData);
		aPieceOfData.put("equifaxBeacon", args[1]);
		aPieceOfData.put("transunionFico", args[2]);
		aPieceOfData.put("experianFair", args[3]);
		processAPI.executeUserTask(Long.parseLong(taskid), inputs);
		
		TenantAPIAccessor.getLoginAPI().logout(apiSession);
	}
}