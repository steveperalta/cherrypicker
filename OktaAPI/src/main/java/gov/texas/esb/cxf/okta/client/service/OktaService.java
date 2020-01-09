package gov.texas.esb.cxf.okta.client.service;

import java.time.LocalDateTime;

import gov.texas.esb.cxf.okta.client.api.LogEvents;

public interface OktaService {
	public LogEvents getLogEvents(LocalDateTime since, LocalDateTime until);

}
