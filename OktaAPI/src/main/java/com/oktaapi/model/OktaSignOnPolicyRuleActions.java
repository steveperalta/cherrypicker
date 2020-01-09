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

import com.oktaapi.model.OktaSignOnPolicyRuleSignonActions;

public class OktaSignOnPolicyRuleActions  {
  
  @ApiModelProperty(value = "")
  private OktaSignOnPolicyRuleSignonActions signon = null;
 /**
   * Get signon
   * @return signon
  **/
  @JsonProperty("signon")
  public OktaSignOnPolicyRuleSignonActions getSignon() {
    return signon;
  }

  public void setSignon(OktaSignOnPolicyRuleSignonActions signon) {
    this.signon = signon;
  }

  public OktaSignOnPolicyRuleActions signon(OktaSignOnPolicyRuleSignonActions signon) {
    this.signon = signon;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OktaSignOnPolicyRuleActions {\n");
    
    sb.append("    signon: ").append(toIndentedString(signon)).append("\n");
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

