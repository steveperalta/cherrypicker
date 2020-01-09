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

public class VerifyFactorRequest  {
  
  @ApiModelProperty(value = "")
  private String activationToken = null;

  @ApiModelProperty(value = "")
  private String answer = null;

  @ApiModelProperty(value = "")
  private String nextPassCode = null;

  @ApiModelProperty(value = "")
  private String passCode = null;

  @ApiModelProperty(value = "")
  private Integer tokenLifetimeSeconds = null;
 /**
   * Get activationToken
   * @return activationToken
  **/
  @JsonProperty("activationToken")
  public String getActivationToken() {
    return activationToken;
  }

  public void setActivationToken(String activationToken) {
    this.activationToken = activationToken;
  }

  public VerifyFactorRequest activationToken(String activationToken) {
    this.activationToken = activationToken;
    return this;
  }

 /**
   * Get answer
   * @return answer
  **/
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public VerifyFactorRequest answer(String answer) {
    this.answer = answer;
    return this;
  }

 /**
   * Get nextPassCode
   * @return nextPassCode
  **/
  @JsonProperty("nextPassCode")
  public String getNextPassCode() {
    return nextPassCode;
  }

  public void setNextPassCode(String nextPassCode) {
    this.nextPassCode = nextPassCode;
  }

  public VerifyFactorRequest nextPassCode(String nextPassCode) {
    this.nextPassCode = nextPassCode;
    return this;
  }

 /**
   * Get passCode
   * @return passCode
  **/
  @JsonProperty("passCode")
  public String getPassCode() {
    return passCode;
  }

  public void setPassCode(String passCode) {
    this.passCode = passCode;
  }

  public VerifyFactorRequest passCode(String passCode) {
    this.passCode = passCode;
    return this;
  }

 /**
   * Get tokenLifetimeSeconds
   * @return tokenLifetimeSeconds
  **/
  @JsonProperty("tokenLifetimeSeconds")
  public Integer getTokenLifetimeSeconds() {
    return tokenLifetimeSeconds;
  }

  public void setTokenLifetimeSeconds(Integer tokenLifetimeSeconds) {
    this.tokenLifetimeSeconds = tokenLifetimeSeconds;
  }

  public VerifyFactorRequest tokenLifetimeSeconds(Integer tokenLifetimeSeconds) {
    this.tokenLifetimeSeconds = tokenLifetimeSeconds;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyFactorRequest {\n");
    
    sb.append("    activationToken: ").append(toIndentedString(activationToken)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    nextPassCode: ").append(toIndentedString(nextPassCode)).append("\n");
    sb.append("    passCode: ").append(toIndentedString(passCode)).append("\n");
    sb.append("    tokenLifetimeSeconds: ").append(toIndentedString(tokenLifetimeSeconds)).append("\n");
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

