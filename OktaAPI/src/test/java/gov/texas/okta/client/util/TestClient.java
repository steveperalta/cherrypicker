package gov.texas.okta.client.util;

import java.util.HashMap;
import java.util.Map;

import gov.texas.esb.cxf.okta.client.service.OktaService;
import gov.texas.esb.cxf.okta.client.service.impl.OktaServiceImpl;

public class TestClient {

	public static OktaService createTestClient() {
		OktaServiceImpl clientImpl=new OktaServiceImpl();
		Map<String, String> properties = new HashMap<String,String>();
		
		properties.put("oktaUri","your_okta_uri");
		properties.put("token","your_okta_api_token");
		clientImpl.activate(properties);
		return clientImpl;
	}
}
