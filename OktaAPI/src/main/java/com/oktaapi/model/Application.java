package com.oktaapi.model;

import java.util.ArrayList;
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

import com.oktaapi.model.ApplicationAccessibility;
import com.oktaapi.model.ApplicationCredentials;
import com.oktaapi.model.ApplicationLicensing;
import com.oktaapi.model.ApplicationSettings;
import com.oktaapi.model.ApplicationSignOnMode;
import com.oktaapi.model.ApplicationVisibility;

public class Application  {
  
  @ApiModelProperty(value = "")
  private Map<String, Object> embedded = null;

  @ApiModelProperty(value = "")
  private Map<String, Object> links = null;

  @ApiModelProperty(value = "")
  private ApplicationAccessibility accessibility = null;

  @ApiModelProperty(value = "")
  private Date created = null;

  @ApiModelProperty(value = "")
  private ApplicationCredentials credentials = null;

  @ApiModelProperty(value = "")
  private List<String> features = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private String label = null;

  @ApiModelProperty(value = "")
  private Date lastUpdated = null;

  @ApiModelProperty(value = "")
  private ApplicationLicensing licensing = null;

  @ApiModelProperty(value = "")
  private String name = null;

  @ApiModelProperty(value = "")
  private Map<String, Object> profile = null;

  @ApiModelProperty(value = "")
  private ApplicationSettings settings = null;

  @ApiModelProperty(value = "")
  private ApplicationSignOnMode signOnMode = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("ACTIVE") ACTIVE(String.valueOf("ACTIVE")), @XmlEnumValue("INACTIVE") INACTIVE(String.valueOf("INACTIVE")), @XmlEnumValue("DELETED") DELETED(String.valueOf("DELETED"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private StatusEnum status = null;

  @ApiModelProperty(value = "")
  private ApplicationVisibility visibility = null;
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
   * Get accessibility
   * @return accessibility
  **/
  @JsonProperty("accessibility")
  public ApplicationAccessibility getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(ApplicationAccessibility accessibility) {
    this.accessibility = accessibility;
  }

  public Application accessibility(ApplicationAccessibility accessibility) {
    this.accessibility = accessibility;
    return this;
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
  public ApplicationCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(ApplicationCredentials credentials) {
    this.credentials = credentials;
  }

  public Application credentials(ApplicationCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

 /**
   * Get features
   * @return features
  **/
  @JsonProperty("features")
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public Application features(List<String> features) {
    this.features = features;
    return this;
  }

  public Application addFeaturesItem(String featuresItem) {
    this.features.add(featuresItem);
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
   * Get label
   * @return label
  **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Application label(String label) {
    this.label = label;
    return this;
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
   * Get licensing
   * @return licensing
  **/
  @JsonProperty("licensing")
  public ApplicationLicensing getLicensing() {
    return licensing;
  }

  public void setLicensing(ApplicationLicensing licensing) {
    this.licensing = licensing;
  }

  public Application licensing(ApplicationLicensing licensing) {
    this.licensing = licensing;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
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

  public Application profile(Map<String, Object> profile) {
    this.profile = profile;
    return this;
  }

  public Application putProfileItem(String key, Object profileItem) {
    this.profile.put(key, profileItem);
    return this;
  }

 /**
   * Get settings
   * @return settings
  **/
  @JsonProperty("settings")
  public ApplicationSettings getSettings() {
    return settings;
  }

  public void setSettings(ApplicationSettings settings) {
    this.settings = settings;
  }

  public Application settings(ApplicationSettings settings) {
    this.settings = settings;
    return this;
  }

 /**
   * Get signOnMode
   * @return signOnMode
  **/
  @JsonProperty("signOnMode")
  public ApplicationSignOnMode getSignOnMode() {
    return signOnMode;
  }

  public void setSignOnMode(ApplicationSignOnMode signOnMode) {
    this.signOnMode = signOnMode;
  }

  public Application signOnMode(ApplicationSignOnMode signOnMode) {
    this.signOnMode = signOnMode;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }


 /**
   * Get visibility
   * @return visibility
  **/
  @JsonProperty("visibility")
  public ApplicationVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(ApplicationVisibility visibility) {
    this.visibility = visibility;
  }

  public Application visibility(ApplicationVisibility visibility) {
    this.visibility = visibility;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    licensing: ").append(toIndentedString(licensing)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    signOnMode: ").append(toIndentedString(signOnMode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

