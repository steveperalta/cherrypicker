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

import com.oktaapi.model.PolicyNetworkCondition;
import com.oktaapi.model.PolicyPeopleCondition;

public class PasswordPolicyRuleConditions  {
  
  @ApiModelProperty(value = "")
  private PolicyNetworkCondition network = null;

  @ApiModelProperty(value = "")
  private PolicyPeopleCondition people = null;
 /**
   * Get network
   * @return network
  **/
  @JsonProperty("network")
  public PolicyNetworkCondition getNetwork() {
    return network;
  }

  public void setNetwork(PolicyNetworkCondition network) {
    this.network = network;
  }

  public PasswordPolicyRuleConditions network(PolicyNetworkCondition network) {
    this.network = network;
    return this;
  }

 /**
   * Get people
   * @return people
  **/
  @JsonProperty("people")
  public PolicyPeopleCondition getPeople() {
    return people;
  }

  public void setPeople(PolicyPeopleCondition people) {
    this.people = people;
  }

  public PasswordPolicyRuleConditions people(PolicyPeopleCondition people) {
    this.people = people;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyRuleConditions {\n");
    
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
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

