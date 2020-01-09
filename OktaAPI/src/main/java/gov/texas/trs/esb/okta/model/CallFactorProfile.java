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

public class CallFactorProfile  {
  
  @ApiModelProperty(value = "")
  private String phoneExtension = null;

  @ApiModelProperty(value = "")
  private String phoneNumber = null;
 /**
   * Get phoneExtension
   * @return phoneExtension
  **/
  @JsonProperty("phoneExtension")
  public String getPhoneExtension() {
    return phoneExtension;
  }

  public void setPhoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
  }

  public CallFactorProfile phoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
    return this;
  }

 /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CallFactorProfile phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallFactorProfile {\n");
    
    sb.append("    phoneExtension: ").append(toIndentedString(phoneExtension)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

