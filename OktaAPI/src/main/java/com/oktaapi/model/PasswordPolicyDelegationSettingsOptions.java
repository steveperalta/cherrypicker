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

public class PasswordPolicyDelegationSettingsOptions  {
  
  @ApiModelProperty(value = "")
  private Boolean skipUnlock = null;
 /**
   * Get skipUnlock
   * @return skipUnlock
  **/
  @JsonProperty("skipUnlock")
  public Boolean isSkipUnlock() {
    return skipUnlock;
  }

  public void setSkipUnlock(Boolean skipUnlock) {
    this.skipUnlock = skipUnlock;
  }

  public PasswordPolicyDelegationSettingsOptions skipUnlock(Boolean skipUnlock) {
    this.skipUnlock = skipUnlock;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyDelegationSettingsOptions {\n");
    
    sb.append("    skipUnlock: ").append(toIndentedString(skipUnlock)).append("\n");
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

