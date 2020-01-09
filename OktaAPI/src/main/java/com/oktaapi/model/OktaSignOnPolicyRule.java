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

import com.oktaapi.model.OktaSignOnPolicyRuleActions;
import com.oktaapi.model.OktaSignOnPolicyRuleConditions;

public class OktaSignOnPolicyRule  {
  
  @ApiModelProperty(value = "")
  private OktaSignOnPolicyRuleActions actions = null;

  @ApiModelProperty(value = "")
  private OktaSignOnPolicyRuleConditions conditions = null;

  @ApiModelProperty(value = "")
  private String name = null;
 /**
   * Get actions
   * @return actions
  **/
  @JsonProperty("actions")
  public OktaSignOnPolicyRuleActions getActions() {
    return actions;
  }

  public void setActions(OktaSignOnPolicyRuleActions actions) {
    this.actions = actions;
  }

  public OktaSignOnPolicyRule actions(OktaSignOnPolicyRuleActions actions) {
    this.actions = actions;
    return this;
  }

 /**
   * Get conditions
   * @return conditions
  **/
  @JsonProperty("conditions")
  public OktaSignOnPolicyRuleConditions getConditions() {
    return conditions;
  }

  public void setConditions(OktaSignOnPolicyRuleConditions conditions) {
    this.conditions = conditions;
  }

  public OktaSignOnPolicyRule conditions(OktaSignOnPolicyRuleConditions conditions) {
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

  public OktaSignOnPolicyRule name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OktaSignOnPolicyRule {\n");
    
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

