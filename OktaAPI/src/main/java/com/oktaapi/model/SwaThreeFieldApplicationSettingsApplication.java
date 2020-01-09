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

public class SwaThreeFieldApplicationSettingsApplication  {
  
  @ApiModelProperty(value = "")
  private String buttonSelector = null;

  @ApiModelProperty(value = "")
  private String extraFieldSelector = null;

  @ApiModelProperty(value = "")
  private String extraFieldValue = null;

  @ApiModelProperty(value = "")
  private String loginUrlRegex = null;

  @ApiModelProperty(value = "")
  private String passwordSelector = null;

  @ApiModelProperty(value = "")
  private String targetUrl = null;

  @ApiModelProperty(value = "")
  private String userNameSelector = null;
 /**
   * Get buttonSelector
   * @return buttonSelector
  **/
  @JsonProperty("buttonSelector")
  public String getButtonSelector() {
    return buttonSelector;
  }

  public void setButtonSelector(String buttonSelector) {
    this.buttonSelector = buttonSelector;
  }

  public SwaThreeFieldApplicationSettingsApplication buttonSelector(String buttonSelector) {
    this.buttonSelector = buttonSelector;
    return this;
  }

 /**
   * Get extraFieldSelector
   * @return extraFieldSelector
  **/
  @JsonProperty("extraFieldSelector")
  public String getExtraFieldSelector() {
    return extraFieldSelector;
  }

  public void setExtraFieldSelector(String extraFieldSelector) {
    this.extraFieldSelector = extraFieldSelector;
  }

  public SwaThreeFieldApplicationSettingsApplication extraFieldSelector(String extraFieldSelector) {
    this.extraFieldSelector = extraFieldSelector;
    return this;
  }

 /**
   * Get extraFieldValue
   * @return extraFieldValue
  **/
  @JsonProperty("extraFieldValue")
  public String getExtraFieldValue() {
    return extraFieldValue;
  }

  public void setExtraFieldValue(String extraFieldValue) {
    this.extraFieldValue = extraFieldValue;
  }

  public SwaThreeFieldApplicationSettingsApplication extraFieldValue(String extraFieldValue) {
    this.extraFieldValue = extraFieldValue;
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

  public SwaThreeFieldApplicationSettingsApplication loginUrlRegex(String loginUrlRegex) {
    this.loginUrlRegex = loginUrlRegex;
    return this;
  }

 /**
   * Get passwordSelector
   * @return passwordSelector
  **/
  @JsonProperty("passwordSelector")
  public String getPasswordSelector() {
    return passwordSelector;
  }

  public void setPasswordSelector(String passwordSelector) {
    this.passwordSelector = passwordSelector;
  }

  public SwaThreeFieldApplicationSettingsApplication passwordSelector(String passwordSelector) {
    this.passwordSelector = passwordSelector;
    return this;
  }

 /**
   * Get targetUrl
   * @return targetUrl
  **/
  @JsonProperty("targetUrl")
  public String getTargetUrl() {
    return targetUrl;
  }

  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }

  public SwaThreeFieldApplicationSettingsApplication targetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
    return this;
  }

 /**
   * Get userNameSelector
   * @return userNameSelector
  **/
  @JsonProperty("userNameSelector")
  public String getUserNameSelector() {
    return userNameSelector;
  }

  public void setUserNameSelector(String userNameSelector) {
    this.userNameSelector = userNameSelector;
  }

  public SwaThreeFieldApplicationSettingsApplication userNameSelector(String userNameSelector) {
    this.userNameSelector = userNameSelector;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaThreeFieldApplicationSettingsApplication {\n");
    
    sb.append("    buttonSelector: ").append(toIndentedString(buttonSelector)).append("\n");
    sb.append("    extraFieldSelector: ").append(toIndentedString(extraFieldSelector)).append("\n");
    sb.append("    extraFieldValue: ").append(toIndentedString(extraFieldValue)).append("\n");
    sb.append("    loginUrlRegex: ").append(toIndentedString(loginUrlRegex)).append("\n");
    sb.append("    passwordSelector: ").append(toIndentedString(passwordSelector)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    userNameSelector: ").append(toIndentedString(userNameSelector)).append("\n");
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

