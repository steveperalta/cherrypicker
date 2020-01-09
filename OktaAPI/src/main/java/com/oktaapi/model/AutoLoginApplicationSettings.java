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

import com.oktaapi.model.AutoLoginApplicationSettingsSignOn;

public class AutoLoginApplicationSettings  {
  
  @ApiModelProperty(value = "")
  private AutoLoginApplicationSettingsSignOn signOn = null;
 /**
   * Get signOn
   * @return signOn
  **/
  @JsonProperty("signOn")
  public AutoLoginApplicationSettingsSignOn getSignOn() {
    return signOn;
  }

  public void setSignOn(AutoLoginApplicationSettingsSignOn signOn) {
    this.signOn = signOn;
  }

  public AutoLoginApplicationSettings signOn(AutoLoginApplicationSettingsSignOn signOn) {
    this.signOn = signOn;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoLoginApplicationSettings {\n");
    
    sb.append("    signOn: ").append(toIndentedString(signOn)).append("\n");
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

