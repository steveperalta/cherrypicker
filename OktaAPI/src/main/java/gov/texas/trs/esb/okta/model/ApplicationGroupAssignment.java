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

public class ApplicationGroupAssignment  {
  
  @ApiModelProperty(value = "")
  private Map<String, Object> embedded = null;

  @ApiModelProperty(value = "")
  private Map<String, Object> links = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private Date lastUpdated = null;

  @ApiModelProperty(value = "")
  private Integer priority = null;

  @ApiModelProperty(value = "")
  private Map<String, Object> profile = null;
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
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
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
   * Get priority
   * @return priority
  **/
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ApplicationGroupAssignment priority(Integer priority) {
    this.priority = priority;
    return this;
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

  public ApplicationGroupAssignment profile(Map<String, Object> profile) {
    this.profile = profile;
    return this;
  }

  public ApplicationGroupAssignment putProfileItem(String key, Object profileItem) {
    this.profile.put(key, profileItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationGroupAssignment {\n");
    
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

