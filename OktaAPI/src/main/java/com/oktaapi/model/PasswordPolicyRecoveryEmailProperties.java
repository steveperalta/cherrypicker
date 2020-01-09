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

import com.oktaapi.model.PasswordPolicyRecoveryEmailRecoveryToken;

public class PasswordPolicyRecoveryEmailProperties  {
  
  @ApiModelProperty(value = "")
  private PasswordPolicyRecoveryEmailRecoveryToken recoveryToken = null;
 /**
   * Get recoveryToken
   * @return recoveryToken
  **/
  @JsonProperty("recoveryToken")
  public PasswordPolicyRecoveryEmailRecoveryToken getRecoveryToken() {
    return recoveryToken;
  }

  public void setRecoveryToken(PasswordPolicyRecoveryEmailRecoveryToken recoveryToken) {
    this.recoveryToken = recoveryToken;
  }

  public PasswordPolicyRecoveryEmailProperties recoveryToken(PasswordPolicyRecoveryEmailRecoveryToken recoveryToken) {
    this.recoveryToken = recoveryToken;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyRecoveryEmailProperties {\n");
    
    sb.append("    recoveryToken: ").append(toIndentedString(recoveryToken)).append("\n");
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

