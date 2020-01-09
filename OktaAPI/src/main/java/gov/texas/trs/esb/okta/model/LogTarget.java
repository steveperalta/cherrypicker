package gov.texas.trs.esb.okta.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LogTarget  {
  
  @ApiModelProperty(value = "")
  private String alternateId = null;

  @ApiModelProperty(value = "")
  private Map<String, Object> detailEntry = null;

  @ApiModelProperty(value = "")
  private String displayName = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private String type = null;
 /**
   * Get alternateId
   * @return alternateId
  **/
  @JsonProperty("alternateId")
  public String getAlternateId() {
    return alternateId;
  }


 /**
   * Get detailEntry
   * @return detailEntry
  **/
  @JsonProperty("detailEntry")
  public Map<String, Object> getDetailEntry() {
    return detailEntry;
  }


 /**
   * Get displayName
   * @return displayName
  **/
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }


 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    alternateId: ").append(toIndentedString(alternateId)).append("\n");
    sb.append("    detailEntry: ").append(toIndentedString(detailEntry)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

