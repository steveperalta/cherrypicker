package com.oktaapi.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicationCredentialsSigning  {
  
  @ApiModelProperty(value = "")
  private String kid = null;

  @ApiModelProperty(value = "")
  private Date lastRotated = null;

  @ApiModelProperty(value = "")
  private Date nextRotation = null;

  @ApiModelProperty(value = "")
  private String rotationMode = null;
 /**
   * Get kid
   * @return kid
  **/
  @JsonProperty("kid")
  public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }

  public ApplicationCredentialsSigning kid(String kid) {
    this.kid = kid;
    return this;
  }

 /**
   * Get lastRotated
   * @return lastRotated
  **/
  @JsonProperty("lastRotated")
  public Date getLastRotated() {
    return lastRotated;
  }


 /**
   * Get nextRotation
   * @return nextRotation
  **/
  @JsonProperty("nextRotation")
  public Date getNextRotation() {
    return nextRotation;
  }


 /**
   * Get rotationMode
   * @return rotationMode
  **/
  @JsonProperty("rotationMode")
  public String getRotationMode() {
    return rotationMode;
  }

  public void setRotationMode(String rotationMode) {
    this.rotationMode = rotationMode;
  }

  public ApplicationCredentialsSigning rotationMode(String rotationMode) {
    this.rotationMode = rotationMode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationCredentialsSigning {\n");
    
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    lastRotated: ").append(toIndentedString(lastRotated)).append("\n");
    sb.append("    nextRotation: ").append(toIndentedString(nextRotation)).append("\n");
    sb.append("    rotationMode: ").append(toIndentedString(rotationMode)).append("\n");
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

