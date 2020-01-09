package com.oktaapi.model;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.oktaapi.model.OAuthEndpointAuthenticationMethod;

public class ApplicationCredentialsOAuthClient  {
  
  @ApiModelProperty(value = "")
  private Boolean autoKeyRotation = null;

  @ApiModelProperty(value = "")
  private String clientId = null;

  @ApiModelProperty(value = "")
  private String clientSecret = null;

  @ApiModelProperty(value = "")
  private OAuthEndpointAuthenticationMethod tokenEndpointAuthMethod = null;
 /**
   * Get autoKeyRotation
   * @return autoKeyRotation
  **/
  @JsonProperty("autoKeyRotation")
  public Boolean isAutoKeyRotation() {
    return autoKeyRotation;
  }

  public void setAutoKeyRotation(Boolean autoKeyRotation) {
    this.autoKeyRotation = autoKeyRotation;
  }

  public ApplicationCredentialsOAuthClient autoKeyRotation(Boolean autoKeyRotation) {
    this.autoKeyRotation = autoKeyRotation;
    return this;
  }

 /**
   * Get clientId
   * @return clientId
  **/
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ApplicationCredentialsOAuthClient clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

 /**
   * Get clientSecret
   * @return clientSecret
  **/
  @JsonProperty("client_secret")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public ApplicationCredentialsOAuthClient clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

 /**
   * Get tokenEndpointAuthMethod
   * @return tokenEndpointAuthMethod
  **/
  @JsonProperty("token_endpoint_auth_method")
  public OAuthEndpointAuthenticationMethod getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }

  public void setTokenEndpointAuthMethod(OAuthEndpointAuthenticationMethod tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }

  public ApplicationCredentialsOAuthClient tokenEndpointAuthMethod(OAuthEndpointAuthenticationMethod tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationCredentialsOAuthClient {\n");
    
    sb.append("    autoKeyRotation: ").append(toIndentedString(autoKeyRotation)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    tokenEndpointAuthMethod: ").append(toIndentedString(tokenEndpointAuthMethod)).append("\n");
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

