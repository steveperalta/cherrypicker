package com.okta.client.service;

import java.time.LocalDateTime;

import com.okta.client.api.LogEvents;

public interface OktaService {
	public LogEvents getLogEvents(LocalDateTime since, LocalDateTime until);

}
