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

public class LogIpAddress  {
  
  @ApiModelProperty(value = "")
  private LogGeographicalContext geographicalContext = null;

  @ApiModelProperty(value = "")
  private String ip = null;

  @ApiModelProperty(value = "")
  private String source = null;

  @ApiModelProperty(value = "")
  private String version = null;
 /**
   * Get geographicalContext
   * @return geographicalContext
  **/
  @JsonProperty("geographicalContext")
  public LogGeographicalContext getGeographicalContext() {
    return geographicalContext;
  }


 /**
   * Get ip
   * @return ip
  **/
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }


 /**
   * Get source
   * @return source
  **/
  @JsonProperty("source")
  public String getSource() {
    return source;
  }


 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    geographicalContext: ").append(toIndentedString(geographicalContext)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

