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

import gov.texas.trs.esb.okta.model.BookmarkApplicationSettingsApplication;

public class BookmarkApplicationSettings  {
  
  @ApiModelProperty(value = "")
  private BookmarkApplicationSettingsApplication app = null;
 /**
   * Get app
   * @return app
  **/
  @JsonProperty("app")
  public BookmarkApplicationSettingsApplication getApp() {
    return app;
  }

  public void setApp(BookmarkApplicationSettingsApplication app) {
    this.app = app;
  }

  public BookmarkApplicationSettings app(BookmarkApplicationSettingsApplication app) {
    this.app = app;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookmarkApplicationSettings {\n");
    
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
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

