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

import gov.texas.trs.esb.okta.model.ApplicationSettingsApplication;
import gov.texas.trs.esb.okta.model.ApplicationSettingsNotifications;

public class ApplicationSettings  {
  
  @ApiModelProperty(value = "")
  private ApplicationSettingsApplication app = null;

  @ApiModelProperty(value = "")
  private Boolean implicitAssignment = null;

  @ApiModelProperty(value = "")
  private String inlineHookId = null;

  @ApiModelProperty(value = "")
  private ApplicationSettingsNotifications notifications = null;
 /**
   * Get app
   * @return app
  **/
  @JsonProperty("app")
  public ApplicationSettingsApplication getApp() {
    return app;
  }

  public void setApp(ApplicationSettingsApplication app) {
    this.app = app;
  }

  public ApplicationSettings app(ApplicationSettingsApplication app) {
    this.app = app;
    return this;
  }

 /**
   * Get implicitAssignment
   * @return implicitAssignment
  **/
  @JsonProperty("implicitAssignment")
  public Boolean isImplicitAssignment() {
    return implicitAssignment;
  }

  public void setImplicitAssignment(Boolean implicitAssignment) {
    this.implicitAssignment = implicitAssignment;
  }

  public ApplicationSettings implicitAssignment(Boolean implicitAssignment) {
    this.implicitAssignment = implicitAssignment;
    return this;
  }

 /**
   * Get inlineHookId
   * @return inlineHookId
  **/
  @JsonProperty("inlineHookId")
  public String getInlineHookId() {
    return inlineHookId;
  }

  public void setInlineHookId(String inlineHookId) {
    this.inlineHookId = inlineHookId;
  }

  public ApplicationSettings inlineHookId(String inlineHookId) {
    this.inlineHookId = inlineHookId;
    return this;
  }

 /**
   * Get notifications
   * @return notifications
  **/
  @JsonProperty("notifications")
  public ApplicationSettingsNotifications getNotifications() {
    return notifications;
  }

  public void setNotifications(ApplicationSettingsNotifications notifications) {
    this.notifications = notifications;
  }

  public ApplicationSettings notifications(ApplicationSettingsNotifications notifications) {
    this.notifications = notifications;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSettings {\n");
    
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    implicitAssignment: ").append(toIndentedString(implicitAssignment)).append("\n");
    sb.append("    inlineHookId: ").append(toIndentedString(inlineHookId)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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

