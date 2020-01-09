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

import com.oktaapi.model.ApplicationCredentialsOAuthClient;

public class OAuthApplicationCredentials  {
  
  @ApiModelProperty(value = "")
  private ApplicationCredentialsOAuthClient oauthClient = null;
 /**
   * Get oauthClient
   * @return oauthClient
  **/
  @JsonProperty("oauthClient")
  public ApplicationCredentialsOAuthClient getOauthClient() {
    return oauthClient;
  }

  public void setOauthClient(ApplicationCredentialsOAuthClient oauthClient) {
    this.oauthClient = oauthClient;
  }

  public OAuthApplicationCredentials oauthClient(ApplicationCredentialsOAuthClient oauthClient) {
    this.oauthClient = oauthClient;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthApplicationCredentials {\n");
    
    sb.append("    oauthClient: ").append(toIndentedString(oauthClient)).append("\n");
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

