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

import com.oktaapi.model.ApplicationCredentialsSigning;
import com.oktaapi.model.ApplicationCredentialsUsernameTemplate;

public class ApplicationCredentials  {
  
  @ApiModelProperty(value = "")
  private ApplicationCredentialsSigning signing = null;

  @ApiModelProperty(value = "")
  private ApplicationCredentialsUsernameTemplate userNameTemplate = null;
 /**
   * Get signing
   * @return signing
  **/
  @JsonProperty("signing")
  public ApplicationCredentialsSigning getSigning() {
    return signing;
  }

  public void setSigning(ApplicationCredentialsSigning signing) {
    this.signing = signing;
  }

  public ApplicationCredentials signing(ApplicationCredentialsSigning signing) {
    this.signing = signing;
    return this;
  }

 /**
   * Get userNameTemplate
   * @return userNameTemplate
  **/
  @JsonProperty("userNameTemplate")
  public ApplicationCredentialsUsernameTemplate getUserNameTemplate() {
    return userNameTemplate;
  }

  public void setUserNameTemplate(ApplicationCredentialsUsernameTemplate userNameTemplate) {
    this.userNameTemplate = userNameTemplate;
  }

  public ApplicationCredentials userNameTemplate(ApplicationCredentialsUsernameTemplate userNameTemplate) {
    this.userNameTemplate = userNameTemplate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationCredentials {\n");
    
    sb.append("    signing: ").append(toIndentedString(signing)).append("\n");
    sb.append("    userNameTemplate: ").append(toIndentedString(userNameTemplate)).append("\n");
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

