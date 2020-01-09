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

public class PasswordPolicyRecoveryEmailRecoveryToken  {
  
  @ApiModelProperty(value = "")
  private Integer tokenLifetimeMinutes = null;
 /**
   * Get tokenLifetimeMinutes
   * @return tokenLifetimeMinutes
  **/
  @JsonProperty("tokenLifetimeMinutes")
  public Integer getTokenLifetimeMinutes() {
    return tokenLifetimeMinutes;
  }

  public void setTokenLifetimeMinutes(Integer tokenLifetimeMinutes) {
    this.tokenLifetimeMinutes = tokenLifetimeMinutes;
  }

  public PasswordPolicyRecoveryEmailRecoveryToken tokenLifetimeMinutes(Integer tokenLifetimeMinutes) {
    this.tokenLifetimeMinutes = tokenLifetimeMinutes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyRecoveryEmailRecoveryToken {\n");
    
    sb.append("    tokenLifetimeMinutes: ").append(toIndentedString(tokenLifetimeMinutes)).append("\n");
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

