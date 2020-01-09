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

public class LogUserAgent  {
  
  @ApiModelProperty(value = "")
  private String browser = null;

  @ApiModelProperty(value = "")
  private String os = null;

  @ApiModelProperty(value = "")
  private String rawUserAgent = null;
 /**
   * Get browser
   * @return browser
  **/
  @JsonProperty("browser")
  public String getBrowser() {
    return browser;
  }


 /**
   * Get os
   * @return os
  **/
  @JsonProperty("os")
  public String getOs() {
    return os;
  }


 /**
   * Get rawUserAgent
   * @return rawUserAgent
  **/
  @JsonProperty("rawUserAgent")
  public String getRawUserAgent() {
    return rawUserAgent;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    rawUserAgent: ").append(toIndentedString(rawUserAgent)).append("\n");
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

