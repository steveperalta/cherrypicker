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

public class LogDebugContext  {
  
  @ApiModelProperty(value = "")
  private Map<String, Object> debugData = null;
 /**
   * Get debugData
   * @return debugData
  **/
  @JsonProperty("debugData")
  public Map<String, Object> getDebugData() {
    return debugData;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    debugData: ").append(toIndentedString(debugData)).append("\n");
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

