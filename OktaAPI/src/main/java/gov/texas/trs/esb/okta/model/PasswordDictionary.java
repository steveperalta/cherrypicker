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

import gov.texas.trs.esb.okta.model.PasswordDictionaryCommon;

public class PasswordDictionary  {
  
  @ApiModelProperty(value = "")
  private PasswordDictionaryCommon common = null;
 /**
   * Get common
   * @return common
  **/
  @JsonProperty("common")
  public PasswordDictionaryCommon getCommon() {
    return common;
  }

  public void setCommon(PasswordDictionaryCommon common) {
    this.common = common;
  }

  public PasswordDictionary common(PasswordDictionaryCommon common) {
    this.common = common;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordDictionary {\n");
    
    sb.append("    common: ").append(toIndentedString(common)).append("\n");
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

