package com.oktaapi.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.oktaapi.model.GroupRuleAction;
import com.oktaapi.model.GroupRuleConditions;
import com.oktaapi.model.GroupRuleStatus;

public class GroupRule  {
  
  @ApiModelProperty(value = "")
  private Map<String, Object> embedded = null;

  @ApiModelProperty(value = "")
  private GroupRuleAction actions = null;

  @ApiModelProperty(value = "")
  private Boolean allGroupsValid = null;

  @ApiModelProperty(value = "")
  private GroupRuleConditions conditions = null;

  @ApiModelProperty(value = "")
  private Date created = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private Date lastUpdated = null;

  @ApiModelProperty(value = "")
  private String name = null;

  @ApiModelProperty(value = "")
  private GroupRuleStatus status = null;

  @ApiModelProperty(value = "")
  private String type = null;
 /**
   * Get embedded
   * @return embedded
  **/
  @JsonProperty("_embedded")
  public Map<String, Object> getEmbedded() {
    return embedded;
  }


 /**
   * Get actions
   * @return actions
  **/
  @JsonProperty("actions")
  public GroupRuleAction getActions() {
    return actions;
  }

  public void setActions(GroupRuleAction actions) {
    this.actions = actions;
  }

  public GroupRule actions(GroupRuleAction actions) {
    this.actions = actions;
    return this;
  }

 /**
   * Get allGroupsValid
   * @return allGroupsValid
  **/
  @JsonProperty("allGroupsValid")
  public Boolean isAllGroupsValid() {
    return allGroupsValid;
  }

  public void setAllGroupsValid(Boolean allGroupsValid) {
    this.allGroupsValid = allGroupsValid;
  }

  public GroupRule allGroupsValid(Boolean allGroupsValid) {
    this.allGroupsValid = allGroupsValid;
    return this;
  }

 /**
   * Get conditions
   * @return conditions
  **/
  @JsonProperty("conditions")
  public GroupRuleConditions getConditions() {
    return conditions;
  }

  public void setConditions(GroupRuleConditions conditions) {
    this.conditions = conditions;
  }

  public GroupRule conditions(GroupRuleConditions conditions) {
    this.conditions = conditions;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }


 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @JsonProperty("lastUpdated")
  public Date getLastUpdated() {
    return lastUpdated;
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

  public GroupRule name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public GroupRuleStatus getStatus() {
    return status;
  }


 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GroupRule type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRule {\n");
    
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    allGroupsValid: ").append(toIndentedString(allGroupsValid)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

