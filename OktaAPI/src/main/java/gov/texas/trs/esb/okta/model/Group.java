package gov.texas.trs.esb.okta.model;

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

import gov.texas.trs.esb.okta.model.GroupProfile;

public class Group  {
  
  @ApiModelProperty(value = "")
  private Map<String, Object> embedded = null;

  @ApiModelProperty(value = "")
  private Map<String, Object> links = null;

  @ApiModelProperty(value = "")
  private Date created = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private Date lastMembershipUpdated = null;

  @ApiModelProperty(value = "")
  private Date lastUpdated = null;

  @ApiModelProperty(value = "")
  private List<String> objectClass = null;

  @ApiModelProperty(value = "")
  private GroupProfile profile = null;

  @ApiModelProperty(value = "")
  private String type = null;
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
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * Get lastMembershipUpdated
   * @return lastMembershipUpdated
  **/
  @JsonProperty("lastMembershipUpdated")
  public Date getLastMembershipUpdated() {
    return lastMembershipUpdated;
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
   * Get objectClass
   * @return objectClass
  **/
  @JsonProperty("objectClass")
  public List<String> getObjectClass() {
    return objectClass;
  }


 /**
   * Get profile
   * @return profile
  **/
  @JsonProperty("profile")
  public GroupProfile getProfile() {
    return profile;
  }

  public void setProfile(GroupProfile profile) {
    this.profile = profile;
  }

  public Group profile(GroupProfile profile) {
    this.profile = profile;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastMembershipUpdated: ").append(toIndentedString(lastMembershipUpdated)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    objectClass: ").append(toIndentedString(objectClass)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

