package gov.texas.trs.esb.okta.model;

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

import gov.texas.trs.esb.okta.model.AppUserCredentials;

public class AppUser  {
  
  @ApiModelProperty(value = "")
  private Map<String, Object> embedded = null;

  @ApiModelProperty(value = "")
  private Map<String, Object> links = null;

  @ApiModelProperty(value = "")
  private Date created = null;

  @ApiModelProperty(value = "")
  private AppUserCredentials credentials = null;

  @ApiModelProperty(value = "")
  private String externalId = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private Date lastSync = null;

  @ApiModelProperty(value = "")
  private Date lastUpdated = null;

  @ApiModelProperty(value = "")
  private Date passwordChanged = null;

  @ApiModelProperty(value = "")
  private Map<String, Object> profile = null;

  @ApiModelProperty(value = "")
  private String scope = null;

  @ApiModelProperty(value = "")
  private String status = null;

  @ApiModelProperty(value = "")
  private Date statusChanged = null;

  @ApiModelProperty(value = "")
  private String syncState = null;
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
  public AppUserCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(AppUserCredentials credentials) {
    this.credentials = credentials;
  }

  public AppUser credentials(AppUserCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

 /**
   * Get externalId
   * @return externalId
  **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }


 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AppUser id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get lastSync
   * @return lastSync
  **/
  @JsonProperty("lastSync")
  public Date getLastSync() {
    return lastSync;
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
  public Map<String, Object> getProfile() {
    return profile;
  }

  public void setProfile(Map<String, Object> profile) {
    this.profile = profile;
  }

  public AppUser profile(Map<String, Object> profile) {
    this.profile = profile;
    return this;
  }

  public AppUser putProfileItem(String key, Object profileItem) {
    this.profile.put(key, profileItem);
    return this;
  }

 /**
   * Get scope
   * @return scope
  **/
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public AppUser scope(String scope) {
    this.scope = scope;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
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
   * Get syncState
   * @return syncState
  **/
  @JsonProperty("syncState")
  public String getSyncState() {
    return syncState;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUser {\n");
    
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastSync: ").append(toIndentedString(lastSync)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    passwordChanged: ").append(toIndentedString(passwordChanged)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChanged: ").append(toIndentedString(statusChanged)).append("\n");
    sb.append("    syncState: ").append(toIndentedString(syncState)).append("\n");
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

