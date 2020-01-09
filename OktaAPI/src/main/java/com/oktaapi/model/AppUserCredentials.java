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

import com.oktaapi.model.AppUserPasswordCredential;

public class AppUserCredentials  {
  
  @ApiModelProperty(value = "")
  private AppUserPasswordCredential password = null;

  @ApiModelProperty(value = "")
  private String userName = null;
 /**
   * Get password
   * @return password
  **/
  @JsonProperty("password")
  public AppUserPasswordCredential getPassword() {
    return password;
  }

  public void setPassword(AppUserPasswordCredential password) {
    this.password = password;
  }

  public AppUserCredentials password(AppUserPasswordCredential password) {
    this.password = password;
    return this;
  }

 /**
   * Get userName
   * @return userName
  **/
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public AppUserCredentials userName(String userName) {
    this.userName = userName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUserCredentials {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

