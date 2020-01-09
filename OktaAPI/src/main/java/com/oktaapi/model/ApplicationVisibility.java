package com.oktaapi.model;

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

import com.oktaapi.model.ApplicationVisibilityHide;

public class ApplicationVisibility  {
  
  @ApiModelProperty(value = "")
  private Map<String, Boolean> appLinks = null;

  @ApiModelProperty(value = "")
  private Boolean autoSubmitToolbar = null;

  @ApiModelProperty(value = "")
  private ApplicationVisibilityHide hide = null;
 /**
   * Get appLinks
   * @return appLinks
  **/
  @JsonProperty("appLinks")
  public Map<String, Boolean> getAppLinks() {
    return appLinks;
  }

  public void setAppLinks(Map<String, Boolean> appLinks) {
    this.appLinks = appLinks;
  }

  public ApplicationVisibility appLinks(Map<String, Boolean> appLinks) {
    this.appLinks = appLinks;
    return this;
  }

  public ApplicationVisibility putAppLinksItem(String key, Boolean appLinksItem) {
    this.appLinks.put(key, appLinksItem);
    return this;
  }

 /**
   * Get autoSubmitToolbar
   * @return autoSubmitToolbar
  **/
  @JsonProperty("autoSubmitToolbar")
  public Boolean isAutoSubmitToolbar() {
    return autoSubmitToolbar;
  }

  public void setAutoSubmitToolbar(Boolean autoSubmitToolbar) {
    this.autoSubmitToolbar = autoSubmitToolbar;
  }

  public ApplicationVisibility autoSubmitToolbar(Boolean autoSubmitToolbar) {
    this.autoSubmitToolbar = autoSubmitToolbar;
    return this;
  }

 /**
   * Get hide
   * @return hide
  **/
  @JsonProperty("hide")
  public ApplicationVisibilityHide getHide() {
    return hide;
  }

  public void setHide(ApplicationVisibilityHide hide) {
    this.hide = hide;
  }

  public ApplicationVisibility hide(ApplicationVisibilityHide hide) {
    this.hide = hide;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationVisibility {\n");
    
    sb.append("    appLinks: ").append(toIndentedString(appLinks)).append("\n");
    sb.append("    autoSubmitToolbar: ").append(toIndentedString(autoSubmitToolbar)).append("\n");
    sb.append("    hide: ").append(toIndentedString(hide)).append("\n");
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

