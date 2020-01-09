package gov.texas.trs.esb.okta.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PasswordPolicyPasswordSettingsLockout  {
  
  @ApiModelProperty(value = "")
  private Integer autoUnlockMinutes = null;

  @ApiModelProperty(value = "")
  private Integer maxAttempts = null;

  @ApiModelProperty(value = "")
  private Boolean showLockoutFailures = null;

  @ApiModelProperty(value = "")
  private List<String> userLockoutNotificationChannels = null;
 /**
   * Get autoUnlockMinutes
   * @return autoUnlockMinutes
  **/
  @JsonProperty("autoUnlockMinutes")
  public Integer getAutoUnlockMinutes() {
    return autoUnlockMinutes;
  }

  public void setAutoUnlockMinutes(Integer autoUnlockMinutes) {
    this.autoUnlockMinutes = autoUnlockMinutes;
  }

  public PasswordPolicyPasswordSettingsLockout autoUnlockMinutes(Integer autoUnlockMinutes) {
    this.autoUnlockMinutes = autoUnlockMinutes;
    return this;
  }

 /**
   * Get maxAttempts
   * @return maxAttempts
  **/
  @JsonProperty("maxAttempts")
  public Integer getMaxAttempts() {
    return maxAttempts;
  }

  public void setMaxAttempts(Integer maxAttempts) {
    this.maxAttempts = maxAttempts;
  }

  public PasswordPolicyPasswordSettingsLockout maxAttempts(Integer maxAttempts) {
    this.maxAttempts = maxAttempts;
    return this;
  }

 /**
   * Get showLockoutFailures
   * @return showLockoutFailures
  **/
  @JsonProperty("showLockoutFailures")
  public Boolean isShowLockoutFailures() {
    return showLockoutFailures;
  }

  public void setShowLockoutFailures(Boolean showLockoutFailures) {
    this.showLockoutFailures = showLockoutFailures;
  }

  public PasswordPolicyPasswordSettingsLockout showLockoutFailures(Boolean showLockoutFailures) {
    this.showLockoutFailures = showLockoutFailures;
    return this;
  }

 /**
   * Get userLockoutNotificationChannels
   * @return userLockoutNotificationChannels
  **/
  @JsonProperty("userLockoutNotificationChannels")
  public List<String> getUserLockoutNotificationChannels() {
    return userLockoutNotificationChannels;
  }

  public void setUserLockoutNotificationChannels(List<String> userLockoutNotificationChannels) {
    this.userLockoutNotificationChannels = userLockoutNotificationChannels;
  }

  public PasswordPolicyPasswordSettingsLockout userLockoutNotificationChannels(List<String> userLockoutNotificationChannels) {
    this.userLockoutNotificationChannels = userLockoutNotificationChannels;
    return this;
  }

  public PasswordPolicyPasswordSettingsLockout addUserLockoutNotificationChannelsItem(String userLockoutNotificationChannelsItem) {
    this.userLockoutNotificationChannels.add(userLockoutNotificationChannelsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyPasswordSettingsLockout {\n");
    
    sb.append("    autoUnlockMinutes: ").append(toIndentedString(autoUnlockMinutes)).append("\n");
    sb.append("    maxAttempts: ").append(toIndentedString(maxAttempts)).append("\n");
    sb.append("    showLockoutFailures: ").append(toIndentedString(showLockoutFailures)).append("\n");
    sb.append("    userLockoutNotificationChannels: ").append(toIndentedString(userLockoutNotificationChannels)).append("\n");
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

