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

public class OktaSignOnPolicyRuleSignonSessionActions  {
  
  @ApiModelProperty(value = "")
  private Integer maxSessionIdleMinutes = null;

  @ApiModelProperty(value = "")
  private Integer maxSessionLifetimeMinutes = null;

  @ApiModelProperty(value = "")
  private Boolean usePersistentCookie = false;
 /**
   * Get maxSessionIdleMinutes
   * @return maxSessionIdleMinutes
  **/
  @JsonProperty("maxSessionIdleMinutes")
  public Integer getMaxSessionIdleMinutes() {
    return maxSessionIdleMinutes;
  }

  public void setMaxSessionIdleMinutes(Integer maxSessionIdleMinutes) {
    this.maxSessionIdleMinutes = maxSessionIdleMinutes;
  }

  public OktaSignOnPolicyRuleSignonSessionActions maxSessionIdleMinutes(Integer maxSessionIdleMinutes) {
    this.maxSessionIdleMinutes = maxSessionIdleMinutes;
    return this;
  }

 /**
   * Get maxSessionLifetimeMinutes
   * @return maxSessionLifetimeMinutes
  **/
  @JsonProperty("maxSessionLifetimeMinutes")
  public Integer getMaxSessionLifetimeMinutes() {
    return maxSessionLifetimeMinutes;
  }

  public void setMaxSessionLifetimeMinutes(Integer maxSessionLifetimeMinutes) {
    this.maxSessionLifetimeMinutes = maxSessionLifetimeMinutes;
  }

  public OktaSignOnPolicyRuleSignonSessionActions maxSessionLifetimeMinutes(Integer maxSessionLifetimeMinutes) {
    this.maxSessionLifetimeMinutes = maxSessionLifetimeMinutes;
    return this;
  }

 /**
   * Get usePersistentCookie
   * @return usePersistentCookie
  **/
  @JsonProperty("usePersistentCookie")
  public Boolean isUsePersistentCookie() {
    return usePersistentCookie;
  }

  public void setUsePersistentCookie(Boolean usePersistentCookie) {
    this.usePersistentCookie = usePersistentCookie;
  }

  public OktaSignOnPolicyRuleSignonSessionActions usePersistentCookie(Boolean usePersistentCookie) {
    this.usePersistentCookie = usePersistentCookie;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OktaSignOnPolicyRuleSignonSessionActions {\n");
    
    sb.append("    maxSessionIdleMinutes: ").append(toIndentedString(maxSessionIdleMinutes)).append("\n");
    sb.append("    maxSessionLifetimeMinutes: ").append(toIndentedString(maxSessionLifetimeMinutes)).append("\n");
    sb.append("    usePersistentCookie: ").append(toIndentedString(usePersistentCookie)).append("\n");
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

