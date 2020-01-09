package com.oktaapi.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.oktaapi.model.UserCredentials;
import com.oktaapi.model.UserProfile;
import com.oktaapi.model.UserStatus;

public class User  {
  
  @ApiModelProperty(value = "")
  private Map<String, Object> embedded = null;

  @ApiModelProperty(value = "")
  private Map<String, Object> links = null;

  @ApiModelProperty(value = "")
  private Date activated = null;

  @ApiModelProperty(value = "")
  private Date created = null;

  @ApiModelProperty(value = "")
  private UserCredentials credentials = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private Date lastLogin = null;

  @ApiModelProperty(value = "")
  private Date lastUpdated = null;

  @ApiModelProperty(value = "")
  private Date passwordChanged = null;

  @ApiModelProperty(value = "")
  private UserProfile profile = null;

  @ApiModelProperty(value = "")
  private UserStatus status = null;

  @ApiModelProperty(value = "")
  private Date statusChanged = null;

  @ApiModelProperty(value = "")
  private UserStatus transitioningToStatus = null;
 /**
   * Get embedded
   * @return embedded
  **/
  @JsonProperty("_embedded")
  public Map<String, Object> getEmbedded() {
    return embedded;
  }


 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public Map<String, Object> getLinks() {
    return links;
  }


 /**
   * Get activated
   * @return activated
  **/
  @JsonProperty("activated")
  public Date getActivated() {
    return activated;
  }


 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }


 /**
   * Get credentials
   * @return credentials
  **/
  @JsonProperty("credentials")
  public UserCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(UserCredentials credentials) {
    this.credentials = credentials;
  }

  public User credentials(UserCredentials credentials) {
    this.credentials = credentials;
    return this;
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
   * Get lastLogin
   * @return lastLogin
  **/
  @JsonProperty("lastLogin")
  public Date getLastLogin() {
    return lastLogin;
  }


 /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @JsonProperty("lastUpdated")
  public Date getLastUpdated() {
    return lastUpdated;
  }


 /**
   * Get passwordChanged
   * @return passwordChanged
  **/
  @JsonProperty("passwordChanged")
  public Date getPasswordChanged() {
    return passwordChanged;
  }


 /**
   * Get profile
   * @return profile
  **/
  @JsonProperty("profile")
  public UserProfile getProfile() {
    return profile;
  }

  public void setProfile(UserProfile profile) {
    this.profile = profile;
  }

  public User profile(UserProfile profile) {
    this.profile = profile;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public UserStatus getStatus() {
    return status;
  }


 /**
   * Get statusChanged
   * @return statusChanged
  **/
  @JsonProperty("statusChanged")
  public Date getStatusChanged() {
    return statusChanged;
  }


 /**
   * Get transitioningToStatus
   * @return transitioningToStatus
  **/
  @JsonProperty("transitioningToStatus")
  public UserStatus getTransitioningToStatus() {
    return transitioningToStatus;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    passwordChanged: ").append(toIndentedString(passwordChanged)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChanged: ").append(toIndentedString(statusChanged)).append("\n");
    sb.append("    transitioningToStatus: ").append(toIndentedString(transitioningToStatus)).append("\n");
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

