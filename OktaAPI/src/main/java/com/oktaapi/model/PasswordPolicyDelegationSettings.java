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

import com.oktaapi.model.PasswordPolicyDelegationSettingsOptions;

public class PasswordPolicyDelegationSettings  {
  
  @ApiModelProperty(value = "")
  private PasswordPolicyDelegationSettingsOptions options = null;
 /**
   * Get options
   * @return options
  **/
  @JsonProperty("options")
  public PasswordPolicyDelegationSettingsOptions getOptions() {
    return options;
  }

  public void setOptions(PasswordPolicyDelegationSettingsOptions options) {
    this.options = options;
  }

  public PasswordPolicyDelegationSettings options(PasswordPolicyDelegationSettingsOptions options) {
    this.options = options;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyDelegationSettings {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

