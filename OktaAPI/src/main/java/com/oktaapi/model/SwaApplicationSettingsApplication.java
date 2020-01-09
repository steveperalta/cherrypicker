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

public class SwaApplicationSettingsApplication  {
  
  @ApiModelProperty(value = "")
  private String buttonField = null;

  @ApiModelProperty(value = "")
  private String loginUrlRegex = null;

  @ApiModelProperty(value = "")
  private String passwordField = null;

  @ApiModelProperty(value = "")
  private String url = null;

  @ApiModelProperty(value = "")
  private String usernameField = null;
 /**
   * Get buttonField
   * @return buttonField
  **/
  @JsonProperty("buttonField")
  public String getButtonField() {
    return buttonField;
  }

  public void setButtonField(String buttonField) {
    this.buttonField = buttonField;
  }

  public SwaApplicationSettingsApplication buttonField(String buttonField) {
    this.buttonField = buttonField;
    return this;
  }

 /**
   * Get loginUrlRegex
   * @return loginUrlRegex
  **/
  @JsonProperty("loginUrlRegex")
  public String getLoginUrlRegex() {
    return loginUrlRegex;
  }

  public void setLoginUrlRegex(String loginUrlRegex) {
    this.loginUrlRegex = loginUrlRegex;
  }

  public SwaApplicationSettingsApplication loginUrlRegex(String loginUrlRegex) {
    this.loginUrlRegex = loginUrlRegex;
    return this;
  }

 /**
   * Get passwordField
   * @return passwordField
  **/
  @JsonProperty("passwordField")
  public String getPasswordField() {
    return passwordField;
  }

  public void setPasswordField(String passwordField) {
    this.passwordField = passwordField;
  }

  public SwaApplicationSettingsApplication passwordField(String passwordField) {
    this.passwordField = passwordField;
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

  public SwaApplicationSettingsApplication url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Get usernameField
   * @return usernameField
  **/
  @JsonProperty("usernameField")
  public String getUsernameField() {
    return usernameField;
  }

  public void setUsernameField(String usernameField) {
    this.usernameField = usernameField;
  }

  public SwaApplicationSettingsApplication usernameField(String usernameField) {
    this.usernameField = usernameField;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaApplicationSettingsApplication {\n");
    
    sb.append("    buttonField: ").append(toIndentedString(buttonField)).append("\n");
    sb.append("    loginUrlRegex: ").append(toIndentedString(loginUrlRegex)).append("\n");
    sb.append("    passwordField: ").append(toIndentedString(passwordField)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    usernameField: ").append(toIndentedString(usernameField)).append("\n");
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

