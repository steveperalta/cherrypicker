package gov.texas.esb.cxf.okta.client.api;

import java.time.LocalDateTime;
import java.util.List;

import gov.texas.trs.esb.okta.model.LogEvent;

public class LogEvents {

	private List<LogEvent> logEvents;
	
	private LocalDateTime lastUpdateTime;
	
	public LogEvents(List<LogEvent> response) {
		this.logEvents=response;
	}
	public List<LogEvent> getLogEvents() {
		return logEvents;
	}
	public void setLogEvents(List<LogEvent> logEvents) {
		this.logEvents = logEvents;
	}
	public LocalDateTime getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	
}

