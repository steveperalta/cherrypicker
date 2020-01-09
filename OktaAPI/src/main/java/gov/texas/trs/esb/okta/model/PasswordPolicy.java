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

import gov.texas.trs.esb.okta.model.PasswordPolicyConditions;
import gov.texas.trs.esb.okta.model.PasswordPolicySettings;

public class PasswordPolicy  {
  
  @ApiModelProperty(value = "")
  private PasswordPolicyConditions conditions = null;

  @ApiModelProperty(value = "")
  private PasswordPolicySettings settings = null;
 /**
   * Get conditions
   * @return conditions
  **/
  @JsonProperty("conditions")
  public PasswordPolicyConditions getConditions() {
    return conditions;
  }

  public void setConditions(PasswordPolicyConditions conditions) {
    this.conditions = conditions;
  }

  public PasswordPolicy conditions(PasswordPolicyConditions conditions) {
    this.conditions = conditions;
    return this;
  }

 /**
   * Get settings
   * @return settings
  **/
  @JsonProperty("settings")
  public PasswordPolicySettings getSettings() {
    return settings;
  }

  public void setSettings(PasswordPolicySettings settings) {
    this.settings = settings;
  }

  public PasswordPolicy settings(PasswordPolicySettings settings) {
    this.settings = settings;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicy {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

