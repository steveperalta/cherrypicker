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

public class ApplicationSettingsNotificationsVpnNetwork  {
  
  @ApiModelProperty(value = "")
  private String connection = null;

  @ApiModelProperty(value = "")
  private List<String> exclude = null;

  @ApiModelProperty(value = "")
  private List<String> include = null;
 /**
   * Get connection
   * @return connection
  **/
  @JsonProperty("connection")
  public String getConnection() {
    return connection;
  }

  public void setConnection(String connection) {
    this.connection = connection;
  }

  public ApplicationSettingsNotificationsVpnNetwork connection(String connection) {
    this.connection = connection;
    return this;
  }

 /**
   * Get exclude
   * @return exclude
  **/
  @JsonProperty("exclude")
  public List<String> getExclude() {
    return exclude;
  }

  public void setExclude(List<String> exclude) {
    this.exclude = exclude;
  }

  public ApplicationSettingsNotificationsVpnNetwork exclude(List<String> exclude) {
    this.exclude = exclude;
    return this;
  }

  public ApplicationSettingsNotificationsVpnNetwork addExcludeItem(String excludeItem) {
    this.exclude.add(excludeItem);
    return this;
  }

 /**
   * Get include
   * @return include
  **/
  @JsonProperty("include")
  public List<String> getInclude() {
    return include;
  }

  public void setInclude(List<String> include) {
    this.include = include;
  }

  public ApplicationSettingsNotificationsVpnNetwork include(List<String> include) {
    this.include = include;
    return this;
  }

  public ApplicationSettingsNotificationsVpnNetwork addIncludeItem(String includeItem) {
    this.include.add(includeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSettingsNotificationsVpnNetwork {\n");
    
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
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

