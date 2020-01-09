package com.okta.client.api;

import java.util.HashMap;
import java.util.Map;

import com.okta.client.service.OktaService;
import com.okta.client.service.impl.OktaServiceImpl;

public class TestClient {

	public static OktaService createTestClient() {
		OktaServiceImpl clientImpl=new OktaServiceImpl();
		Map<String, String> properties = new HashMap<String,String>();
		
		properties.put("oktaUri","your_okta_org_url");
		properties.put("token","your_api_token");
		clientImpl.activate(properties);
		return clientImpl;
	}
}
