package com.oktaapi.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PasswordPolicyPasswordSettingsAge  {
  
  @ApiModelProperty(value = "")
  private Integer expireWarnDays = null;

  @ApiModelProperty(value = "")
  private Integer historyCount = null;

  @ApiModelProperty(value = "")
  private Integer maxAgeDays = null;

  @ApiModelProperty(value = "")
  private Integer minAgeMinutes = null;
 /**
   * Get expireWarnDays
   * @return expireWarnDays
  **/
  @JsonProperty("expireWarnDays")
  public Integer getExpireWarnDays() {
    return expireWarnDays;
  }

  public void setExpireWarnDays(Integer expireWarnDays) {
    this.expireWarnDays = expireWarnDays;
  }

  public PasswordPolicyPasswordSettingsAge expireWarnDays(Integer expireWarnDays) {
    this.expireWarnDays = expireWarnDays;
    return this;
  }

 /**
   * Get historyCount
   * @return historyCount
  **/
  @JsonProperty("historyCount")
  public Integer getHistoryCount() {
    return historyCount;
  }

  public void setHistoryCount(Integer historyCount) {
    this.historyCount = historyCount;
  }

  public PasswordPolicyPasswordSettingsAge historyCount(Integer historyCount) {
    this.historyCount = historyCount;
    return this;
  }

 /**
   * Get maxAgeDays
   * @return maxAgeDays
  **/
  @JsonProperty("maxAgeDays")
  public Integer getMaxAgeDays() {
    return maxAgeDays;
  }

  public void setMaxAgeDays(Integer maxAgeDays) {
    this.maxAgeDays = maxAgeDays;
  }

  public PasswordPolicyPasswordSettingsAge maxAgeDays(Integer maxAgeDays) {
    this.maxAgeDays = maxAgeDays;
    return this;
  }

 /**
   * Get minAgeMinutes
   * @return minAgeMinutes
  **/
  @JsonProperty("minAgeMinutes")
  public Integer getMinAgeMinutes() {
    return minAgeMinutes;
  }

  public void setMinAgeMinutes(Integer minAgeMinutes) {
    this.minAgeMinutes = minAgeMinutes;
  }

  public PasswordPolicyPasswordSettingsAge minAgeMinutes(Integer minAgeMinutes) {
    this.minAgeMinutes = minAgeMinutes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyPasswordSettingsAge {\n");
    
    sb.append("    expireWarnDays: ").append(toIndentedString(expireWarnDays)).append("\n");
    sb.append("    historyCount: ").append(toIndentedString(historyCount)).append("\n");
    sb.append("    maxAgeDays: ").append(toIndentedString(maxAgeDays)).append("\n");
    sb.append("    minAgeMinutes: ").append(toIndentedString(minAgeMinutes)).append("\n");
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

