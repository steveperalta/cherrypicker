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

import com.oktaapi.model.GroupRuleGroupAssignment;

public class GroupRuleAction  {
  
  @ApiModelProperty(value = "")
  private GroupRuleGroupAssignment assignUserToGroups = null;
 /**
   * Get assignUserToGroups
   * @return assignUserToGroups
  **/
  @JsonProperty("assignUserToGroups")
  public GroupRuleGroupAssignment getAssignUserToGroups() {
    return assignUserToGroups;
  }

  public void setAssignUserToGroups(GroupRuleGroupAssignment assignUserToGroups) {
    this.assignUserToGroups = assignUserToGroups;
  }

  public GroupRuleAction assignUserToGroups(GroupRuleGroupAssignment assignUserToGroups) {
    this.assignUserToGroups = assignUserToGroups;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRuleAction {\n");
    
    sb.append("    assignUserToGroups: ").append(toIndentedString(assignUserToGroups)).append("\n");
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

