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

public class ApplicationVisibilityHide  {
  
  @ApiModelProperty(value = "")
  private Boolean iOS = null;

  @ApiModelProperty(value = "")
  private Boolean web = null;
 /**
   * Get iOS
   * @return iOS
  **/
  @JsonProperty("iOS")
  public Boolean isIOS() {
    return iOS;
  }

  public void setIOS(Boolean iOS) {
    this.iOS = iOS;
  }

  public ApplicationVisibilityHide iOS(Boolean iOS) {
    this.iOS = iOS;
    return this;
  }

 /**
   * Get web
   * @return web
  **/
  @JsonProperty("web")
  public Boolean isWeb() {
    return web;
  }

  public void setWeb(Boolean web) {
    this.web = web;
  }

  public ApplicationVisibilityHide web(Boolean web) {
    this.web = web;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationVisibilityHide {\n");
    
    sb.append("    iOS: ").append(toIndentedString(iOS)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
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

