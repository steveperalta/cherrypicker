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

import com.oktaapi.model.EmailStatus;
import com.oktaapi.model.EmailType;

public class EmailAddress  {
  
  @ApiModelProperty(value = "")
  private EmailStatus status = null;

  @ApiModelProperty(value = "")
  private EmailType type = null;

  @ApiModelProperty(value = "")
  private String value = null;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public EmailStatus getStatus() {
    return status;
  }


 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public EmailType getType() {
    return type;
  }


 /**
   * Get value
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAddress {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

