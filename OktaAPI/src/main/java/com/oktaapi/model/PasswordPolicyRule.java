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

import com.oktaapi.model.PasswordPolicyRuleActions;
import com.oktaapi.model.PasswordPolicyRuleConditions;

public class PasswordPolicyRule  {
  
  @ApiModelProperty(value = "")
  private PasswordPolicyRuleActions actions = null;

  @ApiModelProperty(value = "")
  private PasswordPolicyRuleConditions conditions = null;

  @ApiModelProperty(value = "")
  private String name = null;
 /**
   * Get actions
   * @return actions
  **/
  @JsonProperty("actions")
  public PasswordPolicyRuleActions getActions() {
    return actions;
  }

  public void setActions(PasswordPolicyRuleActions actions) {
    this.actions = actions;
  }

  public PasswordPolicyRule actions(PasswordPolicyRuleActions actions) {
    this.actions = actions;
    return this;
  }

 /**
   * Get conditions
   * @return conditions
  **/
  @JsonProperty("conditions")
  public PasswordPolicyRuleConditions getConditions() {
    return conditions;
  }

  public void setConditions(PasswordPolicyRuleConditions conditions) {
    this.conditions = conditions;
  }

  public PasswordPolicyRule conditions(PasswordPolicyRuleConditions conditions) {
    this.conditions = conditions;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PasswordPolicyRule name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyRule {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

