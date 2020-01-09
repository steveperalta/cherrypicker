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

import gov.texas.trs.esb.okta.model.OktaSignOnPolicyConditions;

public class OktaSignOnPolicy  {
  
  @ApiModelProperty(value = "")
  private OktaSignOnPolicyConditions conditions = null;
 /**
   * Get conditions
   * @return conditions
  **/
  @JsonProperty("conditions")
  public OktaSignOnPolicyConditions getConditions() {
    return conditions;
  }

  public void setConditions(OktaSignOnPolicyConditions conditions) {
    this.conditions = conditions;
  }

  public OktaSignOnPolicy conditions(OktaSignOnPolicyConditions conditions) {
    this.conditions = conditions;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OktaSignOnPolicy {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

