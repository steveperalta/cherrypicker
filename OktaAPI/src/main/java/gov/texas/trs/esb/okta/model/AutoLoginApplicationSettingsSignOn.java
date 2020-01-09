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

public class AutoLoginApplicationSettingsSignOn  {
  
  @ApiModelProperty(value = "")
  private String loginUrl = null;

  @ApiModelProperty(value = "")
  private String redirectUrl = null;
 /**
   * Get loginUrl
   * @return loginUrl
  **/
  @JsonProperty("loginUrl")
  public String getLoginUrl() {
    return loginUrl;
  }

  public void setLoginUrl(String loginUrl) {
    this.loginUrl = loginUrl;
  }

  public AutoLoginApplicationSettingsSignOn loginUrl(String loginUrl) {
    this.loginUrl = loginUrl;
    return this;
  }

 /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  @JsonProperty("redirectUrl")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public AutoLoginApplicationSettingsSignOn redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoLoginApplicationSettingsSignOn {\n");
    
    sb.append("    loginUrl: ").append(toIndentedString(loginUrl)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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

