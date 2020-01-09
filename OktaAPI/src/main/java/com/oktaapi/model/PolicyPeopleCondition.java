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

import com.oktaapi.model.GroupCondition;
import com.oktaapi.model.UserCondition;

public class PolicyPeopleCondition  {
  
  @ApiModelProperty(value = "")
  private GroupCondition groups = null;

  @ApiModelProperty(value = "")
  private UserCondition users = null;
 /**
   * Get groups
   * @return groups
  **/
  @JsonProperty("groups")
  public GroupCondition getGroups() {
    return groups;
  }

  public void setGroups(GroupCondition groups) {
    this.groups = groups;
  }

  public PolicyPeopleCondition groups(GroupCondition groups) {
    this.groups = groups;
    return this;
  }

 /**
   * Get users
   * @return users
  **/
  @JsonProperty("users")
  public UserCondition getUsers() {
    return users;
  }

  public void setUsers(UserCondition users) {
    this.users = users;
  }

  public PolicyPeopleCondition users(UserCondition users) {
    this.users = users;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyPeopleCondition {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

