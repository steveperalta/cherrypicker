package gov.texas.trs.esb.okta.model;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

import gov.texas.trs.esb.okta.model.PasswordPolicyRecoveryEmail;
import gov.texas.trs.esb.okta.model.PasswordPolicyRecoveryFactorSettings;
import gov.texas.trs.esb.okta.model.PasswordPolicyRecoveryQuestion;

public class PasswordPolicyRecoveryFactors  {
  
  @ApiModelProperty(value = "")
  private PasswordPolicyRecoveryFactorSettings oktaCall = null;

  @ApiModelProperty(value = "")
  private PasswordPolicyRecoveryEmail oktaEmail = null;

  @ApiModelProperty(value = "")
  private PasswordPolicyRecoveryFactorSettings oktaSms = null;

  @ApiModelProperty(value = "")
  private PasswordPolicyRecoveryQuestion recoveryQuestion = null;
 /**
   * Get oktaCall
   * @return oktaCall
  **/
  @JsonProperty("okta_call")
  public PasswordPolicyRecoveryFactorSettings getOktaCall() {
    return oktaCall;
  }

  public void setOktaCall(PasswordPolicyRecoveryFactorSettings oktaCall) {
    this.oktaCall = oktaCall;
  }

  public PasswordPolicyRecoveryFactors oktaCall(PasswordPolicyRecoveryFactorSettings oktaCall) {
    this.oktaCall = oktaCall;
    return this;
  }

 /**
   * Get oktaEmail
   * @return oktaEmail
  **/
  @JsonProperty("okta_email")
  public PasswordPolicyRecoveryEmail getOktaEmail() {
    return oktaEmail;
  }

  public void setOktaEmail(PasswordPolicyRecoveryEmail oktaEmail) {
    this.oktaEmail = oktaEmail;
  }

  public PasswordPolicyRecoveryFactors oktaEmail(PasswordPolicyRecoveryEmail oktaEmail) {
    this.oktaEmail = oktaEmail;
    return this;
  }

 /**
   * Get oktaSms
   * @return oktaSms
  **/
  @JsonProperty("okta_sms")
  public PasswordPolicyRecoveryFactorSettings getOktaSms() {
    return oktaSms;
  }

  public void setOktaSms(PasswordPolicyRecoveryFactorSettings oktaSms) {
    this.oktaSms = oktaSms;
  }

  public PasswordPolicyRecoveryFactors oktaSms(PasswordPolicyRecoveryFactorSettings oktaSms) {
    this.oktaSms = oktaSms;
    return this;
  }

 /**
   * Get recoveryQuestion
   * @return recoveryQuestion
  **/
  @JsonProperty("recovery_question")
  public PasswordPolicyRecoveryQuestion getRecoveryQuestion() {
    return recoveryQuestion;
  }

  public void setRecoveryQuestion(PasswordPolicyRecoveryQuestion recoveryQuestion) {
    this.recoveryQuestion = recoveryQuestion;
  }

  public PasswordPolicyRecoveryFactors recoveryQuestion(PasswordPolicyRecoveryQuestion recoveryQuestion) {
    this.recoveryQuestion = recoveryQuestion;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyRecoveryFactors {\n");
    
    sb.append("    oktaCall: ").append(toIndentedString(oktaCall)).append("\n");
    sb.append("    oktaEmail: ").append(toIndentedString(oktaEmail)).append("\n");
    sb.append("    oktaSms: ").append(toIndentedString(oktaSms)).append("\n");
    sb.append("    recoveryQuestion: ").append(toIndentedString(recoveryQuestion)).append("\n");
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

