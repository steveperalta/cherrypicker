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

import gov.texas.trs.esb.okta.model.LogGeographicalContext;
import gov.texas.trs.esb.okta.model.LogUserAgent;

public class LogClient  {
  
  @ApiModelProperty(value = "")
  private String device = null;

  @ApiModelProperty(value = "")
  private LogGeographicalContext geographicalContext = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private String ipAddress = null;

  @ApiModelProperty(value = "")
  private LogUserAgent userAgent = null;

  @ApiModelProperty(value = "")
  private String zone = null;
 /**
   * Get device
   * @return device
  **/
  @JsonProperty("device")
  public String getDevice() {
    return device;
  }


 /**
   * Get geographicalContext
   * @return geographicalContext
  **/
  @JsonProperty("geographicalContext")
  public LogGeographicalContext getGeographicalContext() {
    return geographicalContext;
  }


 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * Get ipAddress
   * @return ipAddress
  **/
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }


 /**
   * Get userAgent
   * @return userAgent
  **/
  @JsonProperty("userAgent")
  public LogUserAgent getUserAgent() {
    return userAgent;
  }


 /**
   * Get zone
   * @return zone
  **/
  @JsonProperty("zone")
  public String getZone() {
    return zone;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    geographicalContext: ").append(toIndentedString(geographicalContext)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

