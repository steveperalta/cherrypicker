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

public class PasswordPolicyRuleAction  {
  

@XmlType(name="AccessEnum")
@XmlEnum(String.class)
public enum AccessEnum {

@XmlEnumValue("ALLOW") ALLOW(String.valueOf("ALLOW")), @XmlEnumValue("DENY") DENY(String.valueOf("DENY"));


    private String value;

    AccessEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AccessEnum fromValue(String v) {
        for (AccessEnum b : AccessEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private AccessEnum access = null;
 /**
   * Get access
   * @return access
  **/
  @JsonProperty("access")
  public String getAccess() {
    if (access == null) {
      return null;
    }
    return access.value();
  }

  public void setAccess(AccessEnum access) {
    this.access = access;
  }

  public PasswordPolicyRuleAction access(AccessEnum access) {
    this.access = access;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyRuleAction {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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

