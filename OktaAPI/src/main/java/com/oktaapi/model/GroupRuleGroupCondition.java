package com.oktaapi.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupRuleGroupCondition  {
  
  @ApiModelProperty(value = "")
  private List<String> exclude = null;

  @ApiModelProperty(value = "")
  private List<String> include = null;
 /**
   * Get exclude
   * @return exclude
  **/
  @JsonProperty("exclude")
  public List<String> getExclude() {
    return exclude;
  }

  public void setExclude(List<String> exclude) {
    this.exclude = exclude;
  }

  public GroupRuleGroupCondition exclude(List<String> exclude) {
    this.exclude = exclude;
    return this;
  }

  public GroupRuleGroupCondition addExcludeItem(String excludeItem) {
    this.exclude.add(excludeItem);
    return this;
  }

 /**
   * Get include
   * @return include
  **/
  @JsonProperty("include")
  public List<String> getInclude() {
    return include;
  }

  public void setInclude(List<String> include) {
    this.include = include;
  }

  public GroupRuleGroupCondition include(List<String> include) {
    this.include = include;
    return this;
  }

  public GroupRuleGroupCondition addIncludeItem(String includeItem) {
    this.include.add(includeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRuleGroupCondition {\n");
    
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
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

