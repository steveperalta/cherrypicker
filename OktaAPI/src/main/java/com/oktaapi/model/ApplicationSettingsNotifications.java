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

import com.oktaapi.model.ApplicationSettingsNotificationsVpn;

public class ApplicationSettingsNotifications  {
  
  @ApiModelProperty(value = "")
  private ApplicationSettingsNotificationsVpn vpn = null;
 /**
   * Get vpn
   * @return vpn
  **/
  @JsonProperty("vpn")
  public ApplicationSettingsNotificationsVpn getVpn() {
    return vpn;
  }

  public void setVpn(ApplicationSettingsNotificationsVpn vpn) {
    this.vpn = vpn;
  }

  public ApplicationSettingsNotifications vpn(ApplicationSettingsNotificationsVpn vpn) {
    this.vpn = vpn;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSettingsNotifications {\n");
    
    sb.append("    vpn: ").append(toIndentedString(vpn)).append("\n");
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

