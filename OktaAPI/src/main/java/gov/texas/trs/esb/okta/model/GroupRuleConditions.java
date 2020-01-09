package gov.texas.trs.esb.okta.model;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

import gov.texas.trs.esb.okta.model.GroupRuleExpression;
import gov.texas.trs.esb.okta.model.GroupRulePeopleCondition;

public class GroupRuleConditions  {
  
  @ApiModelProperty(value = "")
  private GroupRuleExpression expression = null;

  @ApiModelProperty(value = "")
  private GroupRulePeopleCondition people = null;
 /**
   * Get expression
   * @return expression
  **/
  @JsonProperty("expression")
  public GroupRuleExpression getExpression() {
    return expression;
  }

  public void setExpression(GroupRuleExpression expression) {
    this.expression = expression;
  }

  public GroupRuleConditions expression(GroupRuleExpression expression) {
    this.expression = expression;
    return this;
  }

 /**
   * Get people
   * @return people
  **/
  @JsonProperty("people")
  public GroupRulePeopleCondition getPeople() {
    return people;
  }

  public void setPeople(GroupRulePeopleCondition people) {
    this.people = people;
  }

  public GroupRuleConditions people(GroupRulePeopleCondition people) {
    this.people = people;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRuleConditions {\n");
    
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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

