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

import com.oktaapi.model.SchemeApplicationCredentials;
import com.oktaapi.model.SecurePasswordStoreApplicationSettings;

public class SecurePasswordStoreApplication  {
  
  @ApiModelProperty(value = "")
  private SchemeApplicationCredentials credentials = null;

  @ApiModelProperty(value = "")
  private Object name = null;

  @ApiModelProperty(value = "")
  private SecurePasswordStoreApplicationSettings settings = null;
 /**
   * Get credentials
   * @return credentials
  **/
  @JsonProperty("credentials")
  public SchemeApplicationCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(SchemeApplicationCredentials credentials) {
    this.credentials = credentials;
  }

  public SecurePasswordStoreApplication credentials(SchemeApplicationCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }

  public SecurePasswordStoreApplication name(Object name) {
    this.name = name;
    return this;
  }

 /**
   * Get settings
   * @return settings
  **/
  @JsonProperty("settings")
  public SecurePasswordStoreApplicationSettings getSettings() {
    return settings;
  }

  public void setSettings(SecurePasswordStoreApplicationSettings settings) {
    this.settings = settings;
  }

  public SecurePasswordStoreApplication settings(SecurePasswordStoreApplicationSettings settings) {
    this.settings = settings;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurePasswordStoreApplication {\n");
    
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

