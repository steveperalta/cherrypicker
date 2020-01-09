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

public class PushFactorProfile  {
  
  @ApiModelProperty(value = "")
  private String credentialId = null;

  @ApiModelProperty(value = "")
  private String deviceType = null;

  @ApiModelProperty(value = "")
  private String name = null;

  @ApiModelProperty(value = "")
  private String platform = null;

  @ApiModelProperty(value = "")
  private String version = null;
 /**
   * Get credentialId
   * @return credentialId
  **/
  @JsonProperty("credentialId")
  public String getCredentialId() {
    return credentialId;
  }

  public void setCredentialId(String credentialId) {
    this.credentialId = credentialId;
  }

  public PushFactorProfile credentialId(String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

 /**
   * Get deviceType
   * @return deviceType
  **/
  @JsonProperty("deviceType")
  public String getDeviceType() {
    return deviceType;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PushFactorProfile name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get platform
   * @return platform
  **/
  @JsonProperty("platform")
  public String getPlatform() {
    return platform;
  }


 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public PushFactorProfile version(String version) {
    this.version = version;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFactorProfile {\n");
    
    sb.append("    credentialId: ").append(toIndentedString(credentialId)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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

