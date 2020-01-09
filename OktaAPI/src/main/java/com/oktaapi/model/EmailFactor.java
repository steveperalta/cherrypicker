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

import com.oktaapi.model.EmailFactorProfile;

public class EmailFactor  {
  
  @ApiModelProperty(value = "")
  private EmailFactorProfile profile = null;
 /**
   * Get profile
   * @return profile
  **/
  @JsonProperty("profile")
  public EmailFactorProfile getProfile() {
    return profile;
  }

  public void setProfile(EmailFactorProfile profile) {
    this.profile = profile;
  }

  public EmailFactor profile(EmailFactorProfile profile) {
    this.profile = profile;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailFactor {\n");
    
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

