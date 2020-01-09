package com.oktaapi.model;

import java.util.ArrayList;
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

import com.oktaapi.model.LogAuthenticationProvider;
import com.oktaapi.model.LogCredentialProvider;
import com.oktaapi.model.LogCredentialType;
import com.oktaapi.model.LogIssuer;

public class LogAuthenticationContext  {
  
  @ApiModelProperty(value = "")
  private LogAuthenticationProvider authenticationProvider = null;

  @ApiModelProperty(value = "")
  private Integer authenticationStep = null;

  @ApiModelProperty(value = "")
  private List<LogCredentialProvider> credentialProvider = null;

  @ApiModelProperty(value = "")
  private List<LogCredentialType> credentialType = null;

  @ApiModelProperty(value = "")
  private String externalSessionId = null;

  @ApiModelProperty(value = "")
  private String _interface = null;

  @ApiModelProperty(value = "")
  private LogIssuer issuer = null;
 /**
   * Get authenticationProvider
   * @return authenticationProvider
  **/
  @JsonProperty("authenticationProvider")
  public LogAuthenticationProvider getAuthenticationProvider() {
    return authenticationProvider;
  }


 /**
   * Get authenticationStep
   * @return authenticationStep
  **/
  @JsonProperty("authenticationStep")
  public Integer getAuthenticationStep() {
    return authenticationStep;
  }


 /**
   * Get credentialProvider
   * @return credentialProvider
  **/
  @JsonProperty("credentialProvider")
  public List<LogCredentialProvider> getCredentialProvider() {
    return credentialProvider;
  }


 /**
   * Get credentialType
   * @return credentialType
  **/
  @JsonProperty("credentialType")
  public List<LogCredentialType> getCredentialType() {
    return credentialType;
  }


 /**
   * Get externalSessionId
   * @return externalSessionId
  **/
  @JsonProperty("externalSessionId")
  public String getExternalSessionId() {
    return externalSessionId;
  }


 /**
   * Get _interface
   * @return _interface
  **/
  @JsonProperty("interface")
  public String getInterface() {
    return _interface;
  }


 /**
   * Get issuer
   * @return issuer
  **/
  @JsonProperty("issuer")
  public LogIssuer getIssuer() {
    return issuer;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    authenticationProvider: ").append(toIndentedString(authenticationProvider)).append("\n");
    sb.append("    authenticationStep: ").append(toIndentedString(authenticationStep)).append("\n");
    sb.append("    credentialProvider: ").append(toIndentedString(credentialProvider)).append("\n");
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    externalSessionId: ").append(toIndentedString(externalSessionId)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

