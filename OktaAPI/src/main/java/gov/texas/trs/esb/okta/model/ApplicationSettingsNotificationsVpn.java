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

import gov.texas.trs.esb.okta.model.ApplicationSettingsNotificationsVpnNetwork;

public class ApplicationSettingsNotificationsVpn  {
  
  @ApiModelProperty(value = "")
  private String helpUrl = null;

  @ApiModelProperty(value = "")
  private String message = null;

  @ApiModelProperty(value = "")
  private ApplicationSettingsNotificationsVpnNetwork network = null;
 /**
   * Get helpUrl
   * @return helpUrl
  **/
  @JsonProperty("helpUrl")
  public String getHelpUrl() {
    return helpUrl;
  }

  public void setHelpUrl(String helpUrl) {
    this.helpUrl = helpUrl;
  }

  public ApplicationSettingsNotificationsVpn helpUrl(String helpUrl) {
    this.helpUrl = helpUrl;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ApplicationSettingsNotificationsVpn message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get network
   * @return network
  **/
  @JsonProperty("network")
  public ApplicationSettingsNotificationsVpnNetwork getNetwork() {
    return network;
  }

  public void setNetwork(ApplicationSettingsNotificationsVpnNetwork network) {
    this.network = network;
  }

  public ApplicationSettingsNotificationsVpn network(ApplicationSettingsNotificationsVpnNetwork network) {
    this.network = network;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSettingsNotificationsVpn {\n");
    
    sb.append("    helpUrl: ").append(toIndentedString(helpUrl)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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

