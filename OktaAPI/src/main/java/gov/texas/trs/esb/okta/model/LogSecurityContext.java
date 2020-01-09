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

public class LogSecurityContext  {
  
  @ApiModelProperty(value = "")
  private Integer asNumber = null;

  @ApiModelProperty(value = "")
  private String asOrg = null;

  @ApiModelProperty(value = "")
  private String domain = null;

  @ApiModelProperty(value = "")
  private Boolean isProxy = null;

  @ApiModelProperty(value = "")
  private String isp = null;
 /**
   * Get asNumber
   * @return asNumber
  **/
  @JsonProperty("asNumber")
  public Integer getAsNumber() {
    return asNumber;
  }


 /**
   * Get asOrg
   * @return asOrg
  **/
  @JsonProperty("asOrg")
  public String getAsOrg() {
    return asOrg;
  }


 /**
   * Get domain
   * @return domain
  **/
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }


 /**
   * Get isProxy
   * @return isProxy
  **/
  @JsonProperty("isProxy")
  public Boolean isIsProxy() {
    return isProxy;
  }


 /**
   * Get isp
   * @return isp
  **/
  @JsonProperty("isp")
  public String getIsp() {
    return isp;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    asNumber: ").append(toIndentedString(asNumber)).append("\n");
    sb.append("    asOrg: ").append(toIndentedString(asOrg)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    isProxy: ").append(toIndentedString(isProxy)).append("\n");
    sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
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

