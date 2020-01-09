package com.oktaapi.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PolicyRuleAuthContextCondition  {
  

@XmlType(name="AuthTypeEnum")
@XmlEnum(String.class)
public enum AuthTypeEnum {

@XmlEnumValue("ANY") ANY(String.valueOf("ANY")), @XmlEnumValue("RADIUS") RADIUS(String.valueOf("RADIUS"));


    private String value;

    AuthTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AuthTypeEnum fromValue(String v) {
        for (AuthTypeEnum b : AuthTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private AuthTypeEnum authType = null;
 /**
   * Get authType
   * @return authType
  **/
  @JsonProperty("authType")
  public String getAuthType() {
    if (authType == null) {
      return null;
    }
    return authType.value();
  }

  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }

  public PolicyRuleAuthContextCondition authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyRuleAuthContextCondition {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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

