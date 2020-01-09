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

public class LogGeolocation  {
  
  @ApiModelProperty(value = "")
  private Double lat = null;

  @ApiModelProperty(value = "")
  private Double lon = null;
 /**
   * Get lat
   * @return lat
  **/
  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }


 /**
   * Get lon
   * @return lon
  **/
  @JsonProperty("lon")
  public Double getLon() {
    return lon;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
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

