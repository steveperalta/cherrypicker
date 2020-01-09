package com.oktaapi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.oktaapi.model.LogActor;
import com.oktaapi.model.LogAuthenticationContext;
import com.oktaapi.model.LogClient;
import com.oktaapi.model.LogDebugContext;
import com.oktaapi.model.LogOutcome;
import com.oktaapi.model.LogRequest;
import com.oktaapi.model.LogSecurityContext;
import com.oktaapi.model.LogSeverity;
import com.oktaapi.model.LogTarget;
import com.oktaapi.model.LogTransaction;

public class LogEvent  {
  
  @ApiModelProperty(value = "")
  private LogActor actor = null;

  @ApiModelProperty(value = "")
  private LogAuthenticationContext authenticationContext = null;

  @ApiModelProperty(value = "")
  private LogClient client = null;

  @ApiModelProperty(value = "")
  private LogDebugContext debugContext = null;

  @ApiModelProperty(value = "")
  private String displayMessage = null;

  @ApiModelProperty(value = "")
  private String eventType = null;

  @ApiModelProperty(value = "")
  private String legacyEventType = null;

  @ApiModelProperty(value = "")
  private LogOutcome outcome = null;

  @ApiModelProperty(value = "")
  private Date published = null;

  @ApiModelProperty(value = "")
  private LogRequest request = null;

  @ApiModelProperty(value = "")
  private LogSecurityContext securityContext = null;

  @ApiModelProperty(value = "")
  private LogSeverity severity = null;

  @ApiModelProperty(value = "")
  private List<LogTarget> target = null;

  @ApiModelProperty(value = "")
  private LogTransaction transaction = null;

  @ApiModelProperty(value = "")
  private String uuid = null;

  @ApiModelProperty(value = "")
  private String version = null;
 /**
   * Get actor
   * @return actor
  **/
  @JsonProperty("actor")
  public LogActor getActor() {
    return actor;
  }


 /**
   * Get authenticationContext
   * @return authenticationContext
  **/
  @JsonProperty("authenticationContext")
  public LogAuthenticationContext getAuthenticationContext() {
    return authenticationContext;
  }


 /**
   * Get client
   * @return client
  **/
  @JsonProperty("client")
  public LogClient getClient() {
    return client;
  }


 /**
   * Get debugContext
   * @return debugContext
  **/
  @JsonProperty("debugContext")
  public LogDebugContext getDebugContext() {
    return debugContext;
  }


 /**
   * Get displayMessage
   * @return displayMessage
  **/
  @JsonProperty("displayMessage")
  public String getDisplayMessage() {
    return displayMessage;
  }


 /**
   * Get eventType
   * @return eventType
  **/
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }


 /**
   * Get legacyEventType
   * @return legacyEventType
  **/
  @JsonProperty("legacyEventType")
  public String getLegacyEventType() {
    return legacyEventType;
  }


 /**
   * Get outcome
   * @return outcome
  **/
  @JsonProperty("outcome")
  public LogOutcome getOutcome() {
    return outcome;
  }


 /**
   * Get published
   * @return published
  **/
  @JsonProperty("published")
  public Date getPublished() {
    return published;
  }


 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public LogRequest getRequest() {
    return request;
  }


 /**
   * Get securityContext
   * @return securityContext
  **/
  @JsonProperty("securityContext")
  public LogSecurityContext getSecurityContext() {
    return securityContext;
  }


 /**
   * Get severity
   * @return severity
  **/
  @JsonProperty("severity")
  public LogSeverity getSeverity() {
    return severity;
  }


 /**
   * Get target
   * @return target
  **/
  @JsonProperty("target")
  public List<LogTarget> getTarget() {
    return target;
  }


 /**
   * Get transaction
   * @return transaction
  **/
  @JsonProperty("transaction")
  public LogTransaction getTransaction() {
    return transaction;
  }


 /**
   * Get uuid
   * @return uuid
  **/
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }


 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    authenticationContext: ").append(toIndentedString(authenticationContext)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    debugContext: ").append(toIndentedString(debugContext)).append("\n");
    sb.append("    displayMessage: ").append(toIndentedString(displayMessage)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    legacyEventType: ").append(toIndentedString(legacyEventType)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

