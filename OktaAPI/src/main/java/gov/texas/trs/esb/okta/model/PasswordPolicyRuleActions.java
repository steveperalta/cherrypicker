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

import gov.texas.trs.esb.okta.model.PasswordPolicyRuleAction;

public class PasswordPolicyRuleActions  {
  
  @ApiModelProperty(value = "")
  private PasswordPolicyRuleAction passwordChange = null;

  @ApiModelProperty(value = "")
  private PasswordPolicyRuleAction selfServicePasswordReset = null;

  @ApiModelProperty(value = "")
  private PasswordPolicyRuleAction selfServiceUnlock = null;
 /**
   * Get passwordChange
   * @return passwordChange
  **/
  @JsonProperty("passwordChange")
  public PasswordPolicyRuleAction getPasswordChange() {
    return passwordChange;
  }

  public void setPasswordChange(PasswordPolicyRuleAction passwordChange) {
    this.passwordChange = passwordChange;
  }

  public PasswordPolicyRuleActions passwordChange(PasswordPolicyRuleAction passwordChange) {
    this.passwordChange = passwordChange;
    return this;
  }

 /**
   * Get selfServicePasswordReset
   * @return selfServicePasswordReset
  **/
  @JsonProperty("selfServicePasswordReset")
  public PasswordPolicyRuleAction getSelfServicePasswordReset() {
    return selfServicePasswordReset;
  }

  public void setSelfServicePasswordReset(PasswordPolicyRuleAction selfServicePasswordReset) {
    this.selfServicePasswordReset = selfServicePasswordReset;
  }

  public PasswordPolicyRuleActions selfServicePasswordReset(PasswordPolicyRuleAction selfServicePasswordReset) {
    this.selfServicePasswordReset = selfServicePasswordReset;
    return this;
  }

 /**
   * Get selfServiceUnlock
   * @return selfServiceUnlock
  **/
  @JsonProperty("selfServiceUnlock")
  public PasswordPolicyRuleAction getSelfServiceUnlock() {
    return selfServiceUnlock;
  }

  public void setSelfServiceUnlock(PasswordPolicyRuleAction selfServiceUnlock) {
    this.selfServiceUnlock = selfServiceUnlock;
  }

  public PasswordPolicyRuleActions selfServiceUnlock(PasswordPolicyRuleAction selfServiceUnlock) {
    this.selfServiceUnlock = selfServiceUnlock;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyRuleActions {\n");
    
    sb.append("    passwordChange: ").append(toIndentedString(passwordChange)).append("\n");
    sb.append("    selfServicePasswordReset: ").append(toIndentedString(selfServicePasswordReset)).append("\n");
    sb.append("    selfServiceUnlock: ").append(toIndentedString(selfServiceUnlock)).append("\n");
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

