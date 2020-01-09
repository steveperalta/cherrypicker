package gov.texas.trs.esb.okta.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WsFederationApplicationSettingsApplication  {
  
  @ApiModelProperty(value = "")
  private String attributeStatements = null;

  @ApiModelProperty(value = "")
  private String audienceRestriction = null;

  @ApiModelProperty(value = "")
  private String authnContextClassRef = null;

  @ApiModelProperty(value = "")
  private String groupFilter = null;

  @ApiModelProperty(value = "")
  private String groupName = null;

  @ApiModelProperty(value = "")
  private String groupValueFormat = null;

  @ApiModelProperty(value = "")
  private String nameIDFormat = null;

  @ApiModelProperty(value = "")
  private String realm = null;

  @ApiModelProperty(value = "")
  private String siteURL = null;

  @ApiModelProperty(value = "")
  private String usernameAttribute = null;

  @ApiModelProperty(value = "")
  private Boolean wReplyOverride = null;

  @ApiModelProperty(value = "")
  private String wReplyURL = null;
 /**
   * Get attributeStatements
   * @return attributeStatements
  **/
  @JsonProperty("attributeStatements")
  public String getAttributeStatements() {
    return attributeStatements;
  }

  public void setAttributeStatements(String attributeStatements) {
    this.attributeStatements = attributeStatements;
  }

  public WsFederationApplicationSettingsApplication attributeStatements(String attributeStatements) {
    this.attributeStatements = attributeStatements;
    return this;
  }

 /**
   * Get audienceRestriction
   * @return audienceRestriction
  **/
  @JsonProperty("audienceRestriction")
  public String getAudienceRestriction() {
    return audienceRestriction;
  }

  public void setAudienceRestriction(String audienceRestriction) {
    this.audienceRestriction = audienceRestriction;
  }

  public WsFederationApplicationSettingsApplication audienceRestriction(String audienceRestriction) {
    this.audienceRestriction = audienceRestriction;
    return this;
  }

 /**
   * Get authnContextClassRef
   * @return authnContextClassRef
  **/
  @JsonProperty("authnContextClassRef")
  public String getAuthnContextClassRef() {
    return authnContextClassRef;
  }

  public void setAuthnContextClassRef(String authnContextClassRef) {
    this.authnContextClassRef = authnContextClassRef;
  }

  public WsFederationApplicationSettingsApplication authnContextClassRef(String authnContextClassRef) {
    this.authnContextClassRef = authnContextClassRef;
    return this;
  }

 /**
   * Get groupFilter
   * @return groupFilter
  **/
  @JsonProperty("groupFilter")
  public String getGroupFilter() {
    return groupFilter;
  }

  public void setGroupFilter(String groupFilter) {
    this.groupFilter = groupFilter;
  }

  public WsFederationApplicationSettingsApplication groupFilter(String groupFilter) {
    this.groupFilter = groupFilter;
    return this;
  }

 /**
   * Get groupName
   * @return groupName
  **/
  @JsonProperty("groupName")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public WsFederationApplicationSettingsApplication groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

 /**
   * Get groupValueFormat
   * @return groupValueFormat
  **/
  @JsonProperty("groupValueFormat")
  public String getGroupValueFormat() {
    return groupValueFormat;
  }

  public void setGroupValueFormat(String groupValueFormat) {
    this.groupValueFormat = groupValueFormat;
  }

  public WsFederationApplicationSettingsApplication groupValueFormat(String groupValueFormat) {
    this.groupValueFormat = groupValueFormat;
    return this;
  }

 /**
   * Get nameIDFormat
   * @return nameIDFormat
  **/
  @JsonProperty("nameIDFormat")
  public String getNameIDFormat() {
    return nameIDFormat;
  }

  public void setNameIDFormat(String nameIDFormat) {
    this.nameIDFormat = nameIDFormat;
  }

  public WsFederationApplicationSettingsApplication nameIDFormat(String nameIDFormat) {
    this.nameIDFormat = nameIDFormat;
    return this;
  }

 /**
   * Get realm
   * @return realm
  **/
  @JsonProperty("realm")
  public String getRealm() {
    return realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }

  public WsFederationApplicationSettingsApplication realm(String realm) {
    this.realm = realm;
    return this;
  }

 /**
   * Get siteURL
   * @return siteURL
  **/
  @JsonProperty("siteURL")
  public String getSiteURL() {
    return siteURL;
  }

  public void setSiteURL(String siteURL) {
    this.siteURL = siteURL;
  }

  public WsFederationApplicationSettingsApplication siteURL(String siteURL) {
    this.siteURL = siteURL;
    return this;
  }

 /**
   * Get usernameAttribute
   * @return usernameAttribute
  **/
  @JsonProperty("usernameAttribute")
  public String getUsernameAttribute() {
    return usernameAttribute;
  }

  public void setUsernameAttribute(String usernameAttribute) {
    this.usernameAttribute = usernameAttribute;
  }

  public WsFederationApplicationSettingsApplication usernameAttribute(String usernameAttribute) {
    this.usernameAttribute = usernameAttribute;
    return this;
  }

 /**
   * Get wReplyOverride
   * @return wReplyOverride
  **/
  @JsonProperty("wReplyOverride")
  public Boolean isWReplyOverride() {
    return wReplyOverride;
  }

  public void setWReplyOverride(Boolean wReplyOverride) {
    this.wReplyOverride = wReplyOverride;
  }

  public WsFederationApplicationSettingsApplication wReplyOverride(Boolean wReplyOverride) {
    this.wReplyOverride = wReplyOverride;
    return this;
  }

 /**
   * Get wReplyURL
   * @return wReplyURL
  **/
  @JsonProperty("wReplyURL")
  public String getWReplyURL() {
    return wReplyURL;
  }

  public void setWReplyURL(String wReplyURL) {
    this.wReplyURL = wReplyURL;
  }

  public WsFederationApplicationSettingsApplication wReplyURL(String wReplyURL) {
    this.wReplyURL = wReplyURL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WsFederationApplicationSettingsApplication {\n");
    
    sb.append("    attributeStatements: ").append(toIndentedString(attributeStatements)).append("\n");
    sb.append("    audienceRestriction: ").append(toIndentedString(audienceRestriction)).append("\n");
    sb.append("    authnContextClassRef: ").append(toIndentedString(authnContextClassRef)).append("\n");
    sb.append("    groupFilter: ").append(toIndentedString(groupFilter)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupValueFormat: ").append(toIndentedString(groupValueFormat)).append("\n");
    sb.append("    nameIDFormat: ").append(toIndentedString(nameIDFormat)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    siteURL: ").append(toIndentedString(siteURL)).append("\n");
    sb.append("    usernameAttribute: ").append(toIndentedString(usernameAttribute)).append("\n");
    sb.append("    wReplyOverride: ").append(toIndentedString(wReplyOverride)).append("\n");
    sb.append("    wReplyURL: ").append(toIndentedString(wReplyURL)).append("\n");
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

