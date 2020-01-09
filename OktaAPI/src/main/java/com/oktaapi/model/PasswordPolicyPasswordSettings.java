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

import com.oktaapi.model.PasswordPolicyPasswordSettingsAge;
import com.oktaapi.model.PasswordPolicyPasswordSettingsComplexity;
import com.oktaapi.model.PasswordPolicyPasswordSettingsLockout;

public class PasswordPolicyPasswordSettings  {
  
  @ApiModelProperty(value = "")
  private PasswordPolicyPasswordSettingsAge age = null;

  @ApiModelProperty(value = "")
  private PasswordPolicyPasswordSettingsComplexity complexity = null;

  @ApiModelProperty(value = "")
  private PasswordPolicyPasswordSettingsLockout lockout = null;
 /**
   * Get age
   * @return age
  **/
  @JsonProperty("age")
  public PasswordPolicyPasswordSettingsAge getAge() {
    return age;
  }

  public void setAge(PasswordPolicyPasswordSettingsAge age) {
    this.age = age;
  }

  public PasswordPolicyPasswordSettings age(PasswordPolicyPasswordSettingsAge age) {
    this.age = age;
    return this;
  }

 /**
   * Get complexity
   * @return complexity
  **/
  @JsonProperty("complexity")
  public PasswordPolicyPasswordSettingsComplexity getComplexity() {
    return complexity;
  }

  public void setComplexity(PasswordPolicyPasswordSettingsComplexity complexity) {
    this.complexity = complexity;
  }

  public PasswordPolicyPasswordSettings complexity(PasswordPolicyPasswordSettingsComplexity complexity) {
    this.complexity = complexity;
    return this;
  }

 /**
   * Get lockout
   * @return lockout
  **/
  @JsonProperty("lockout")
  public PasswordPolicyPasswordSettingsLockout getLockout() {
    return lockout;
  }

  public void setLockout(PasswordPolicyPasswordSettingsLockout lockout) {
    this.lockout = lockout;
  }

  public PasswordPolicyPasswordSettings lockout(PasswordPolicyPasswordSettingsLockout lockout) {
    this.lockout = lockout;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyPasswordSettings {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    complexity: ").append(toIndentedString(complexity)).append("\n");
    sb.append("    lockout: ").append(toIndentedString(lockout)).append("\n");
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

