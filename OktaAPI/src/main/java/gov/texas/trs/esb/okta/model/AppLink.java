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

public class AppLink  {
  
  @ApiModelProperty(value = "")
  private String appAssignmentId = null;

  @ApiModelProperty(value = "")
  private String appInstanceId = null;

  @ApiModelProperty(value = "")
  private String appName = null;

  @ApiModelProperty(value = "")
  private Boolean credentialsSetup = null;

  @ApiModelProperty(value = "")
  private Boolean hidden = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private String label = null;

  @ApiModelProperty(value = "")
  private String linkUrl = null;

  @ApiModelProperty(value = "")
  private String logoUrl = null;

  @ApiModelProperty(value = "")
  private Integer sortOrder = null;
 /**
   * Get appAssignmentId
   * @return appAssignmentId
  **/
  @JsonProperty("appAssignmentId")
  public String getAppAssignmentId() {
    return appAssignmentId;
  }


 /**
   * Get appInstanceId
   * @return appInstanceId
  **/
  @JsonProperty("appInstanceId")
  public String getAppInstanceId() {
    return appInstanceId;
  }


 /**
   * Get appName
   * @return appName
  **/
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }


 /**
   * Get credentialsSetup
   * @return credentialsSetup
  **/
  @JsonProperty("credentialsSetup")
  public Boolean isCredentialsSetup() {
    return credentialsSetup;
  }


 /**
   * Get hidden
   * @return hidden
  **/
  @JsonProperty("hidden")
  public Boolean isHidden() {
    return hidden;
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


 /**
   * Get linkUrl
   * @return linkUrl
  **/
  @JsonProperty("linkUrl")
  public String getLinkUrl() {
    return linkUrl;
  }


 /**
   * Get logoUrl
   * @return logoUrl
  **/
  @JsonProperty("logoUrl")
  public String getLogoUrl() {
    return logoUrl;
  }


 /**
   * Get sortOrder
   * @return sortOrder
  **/
  @JsonProperty("sortOrder")
  public Integer getSortOrder() {
    return sortOrder;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLink {\n");
    
    sb.append("    appAssignmentId: ").append(toIndentedString(appAssignmentId)).append("\n");
    sb.append("    appInstanceId: ").append(toIndentedString(appInstanceId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    credentialsSetup: ").append(toIndentedString(credentialsSetup)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

