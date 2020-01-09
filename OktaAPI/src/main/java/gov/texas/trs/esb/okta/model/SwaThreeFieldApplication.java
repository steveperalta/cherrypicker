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

import gov.texas.trs.esb.okta.model.SwaThreeFieldApplicationSettings;

public class SwaThreeFieldApplication  {
  
  @ApiModelProperty(value = "")
  private Object name = null;

  @ApiModelProperty(value = "")
  private SwaThreeFieldApplicationSettings settings = null;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }

  public SwaThreeFieldApplication name(Object name) {
    this.name = name;
    return this;
  }

 /**
   * Get settings
   * @return settings
  **/
  @JsonProperty("settings")
  public SwaThreeFieldApplicationSettings getSettings() {
    return settings;
  }

  public void setSettings(SwaThreeFieldApplicationSettings settings) {
    this.settings = settings;
  }

  public SwaThreeFieldApplication settings(SwaThreeFieldApplicationSettings settings) {
    this.settings = settings;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaThreeFieldApplication {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

