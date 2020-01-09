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

public class BasicApplicationSettingsApplication  {
  
  @ApiModelProperty(value = "")
  private String authURL = null;

  @ApiModelProperty(value = "")
  private String url = null;
 /**
   * Get authURL
   * @return authURL
  **/
  @JsonProperty("authURL")
  public String getAuthURL() {
    return authURL;
  }

  public void setAuthURL(String authURL) {
    this.authURL = authURL;
  }

  public BasicApplicationSettingsApplication authURL(String authURL) {
    this.authURL = authURL;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public BasicApplicationSettingsApplication url(String url) {
    this.url = url;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicApplicationSettingsApplication {\n");
    
    sb.append("    authURL: ").append(toIndentedString(authURL)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

