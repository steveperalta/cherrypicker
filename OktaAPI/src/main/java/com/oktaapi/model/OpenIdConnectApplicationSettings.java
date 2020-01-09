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

import com.oktaapi.model.OpenIdConnectApplicationSettingsClient;

public class OpenIdConnectApplicationSettings  {
  
  @ApiModelProperty(value = "")
  private OpenIdConnectApplicationSettingsClient oauthClient = null;
 /**
   * Get oauthClient
   * @return oauthClient
  **/
  @JsonProperty("oauthClient")
  public OpenIdConnectApplicationSettingsClient getOauthClient() {
    return oauthClient;
  }

  public void setOauthClient(OpenIdConnectApplicationSettingsClient oauthClient) {
    this.oauthClient = oauthClient;
  }

  public OpenIdConnectApplicationSettings oauthClient(OpenIdConnectApplicationSettingsClient oauthClient) {
    this.oauthClient = oauthClient;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenIdConnectApplicationSettings {\n");
    
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

