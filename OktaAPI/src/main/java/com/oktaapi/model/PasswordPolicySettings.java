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

import com.oktaapi.model.PasswordPolicyDelegationSettings;
import com.oktaapi.model.PasswordPolicyPasswordSettings;
import com.oktaapi.model.PasswordPolicyRecoverySettings;

public class PasswordPolicySettings  {
  
  @ApiModelProperty(value = "")
  private PasswordPolicyDelegationSettings delegation = null;

  @ApiModelProperty(value = "")
  private PasswordPolicyPasswordSettings password = null;

  @ApiModelProperty(value = "")
  private PasswordPolicyRecoverySettings recovery = null;
 /**
   * Get delegation
   * @return delegation
  **/
  @JsonProperty("delegation")
  public PasswordPolicyDelegationSettings getDelegation() {
    return delegation;
  }

  public void setDelegation(PasswordPolicyDelegationSettings delegation) {
    this.delegation = delegation;
  }

  public PasswordPolicySettings delegation(PasswordPolicyDelegationSettings delegation) {
    this.delegation = delegation;
    return this;
  }

 /**
   * Get password
   * @return password
  **/
  @JsonProperty("password")
  public PasswordPolicyPasswordSettings getPassword() {
    return password;
  }

  public void setPassword(PasswordPolicyPasswordSettings password) {
    this.password = password;
  }

  public PasswordPolicySettings password(PasswordPolicyPasswordSettings password) {
    this.password = password;
    return this;
  }

 /**
   * Get recovery
   * @return recovery
  **/
  @JsonProperty("recovery")
  public PasswordPolicyRecoverySettings getRecovery() {
    return recovery;
  }

  public void setRecovery(PasswordPolicyRecoverySettings recovery) {
    this.recovery = recovery;
  }

  public PasswordPolicySettings recovery(PasswordPolicyRecoverySettings recovery) {
    this.recovery = recovery;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicySettings {\n");
    
    sb.append("    delegation: ").append(toIndentedString(delegation)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    recovery: ").append(toIndentedString(recovery)).append("\n");
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

