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

public class UserActivationToken  {
  
  @ApiModelProperty(value = "")
  private String activationToken = null;

  @ApiModelProperty(value = "")
  private String activationUrl = null;
 /**
   * Get activationToken
   * @return activationToken
  **/
  @JsonProperty("activationToken")
  public String getActivationToken() {
    return activationToken;
  }


 /**
   * Get activationUrl
   * @return activationUrl
  **/
  @JsonProperty("activationUrl")
  public String getActivationUrl() {
    return activationUrl;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivationToken {\n");
    
    sb.append("    activationToken: ").append(toIndentedString(activationToken)).append("\n");
    sb.append("    activationUrl: ").append(toIndentedString(activationUrl)).append("\n");
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

