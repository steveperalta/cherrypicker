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

public class ApplicationAccessibility  {
  
  @ApiModelProperty(value = "")
  private String errorRedirectUrl = null;

  @ApiModelProperty(value = "")
  private String loginRedirectUrl = null;

  @ApiModelProperty(value = "")
  private Boolean selfService = null;
 /**
   * Get errorRedirectUrl
   * @return errorRedirectUrl
  **/
  @JsonProperty("errorRedirectUrl")
  public String getErrorRedirectUrl() {
    return errorRedirectUrl;
  }

  public void setErrorRedirectUrl(String errorRedirectUrl) {
    this.errorRedirectUrl = errorRedirectUrl;
  }

  public ApplicationAccessibility errorRedirectUrl(String errorRedirectUrl) {
    this.errorRedirectUrl = errorRedirectUrl;
    return this;
  }

 /**
   * Get loginRedirectUrl
   * @return loginRedirectUrl
  **/
  @JsonProperty("loginRedirectUrl")
  public String getLoginRedirectUrl() {
    return loginRedirectUrl;
  }

  public void setLoginRedirectUrl(String loginRedirectUrl) {
    this.loginRedirectUrl = loginRedirectUrl;
  }

  public ApplicationAccessibility loginRedirectUrl(String loginRedirectUrl) {
    this.loginRedirectUrl = loginRedirectUrl;
    return this;
  }

 /**
   * Get selfService
   * @return selfService
  **/
  @JsonProperty("selfService")
  public Boolean isSelfService() {
    return selfService;
  }

  public void setSelfService(Boolean selfService) {
    this.selfService = selfService;
  }

  public ApplicationAccessibility selfService(Boolean selfService) {
    this.selfService = selfService;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationAccessibility {\n");
    
    sb.append("    errorRedirectUrl: ").append(toIndentedString(errorRedirectUrl)).append("\n");
    sb.append("    loginRedirectUrl: ").append(toIndentedString(loginRedirectUrl)).append("\n");
    sb.append("    selfService: ").append(toIndentedString(selfService)).append("\n");
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

