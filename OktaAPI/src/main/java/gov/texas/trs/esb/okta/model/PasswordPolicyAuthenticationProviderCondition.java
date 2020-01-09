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

public class PasswordPolicyAuthenticationProviderCondition  {
  
  @ApiModelProperty(value = "")
  private List<String> include = null;


@XmlType(name="ProviderEnum")
@XmlEnum(String.class)
public enum ProviderEnum {

@XmlEnumValue("ACTIVE_DIRECTORY") ACTIVE_DIRECTORY(String.valueOf("ACTIVE_DIRECTORY")), @XmlEnumValue("ANY") ANY(String.valueOf("ANY")), @XmlEnumValue("LDAP") LDAP(String.valueOf("LDAP")), @XmlEnumValue("OKTA") OKTA(String.valueOf("OKTA"));


    private String value;

    ProviderEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ProviderEnum fromValue(String v) {
        for (ProviderEnum b : ProviderEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private ProviderEnum provider = null;
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

  public PasswordPolicyAuthenticationProviderCondition include(List<String> include) {
    this.include = include;
    return this;
  }

  public PasswordPolicyAuthenticationProviderCondition addIncludeItem(String includeItem) {
    this.include.add(includeItem);
    return this;
  }

 /**
   * Get provider
   * @return provider
  **/
  @JsonProperty("provider")
  public String getProvider() {
    if (provider == null) {
      return null;
    }
    return provider.value();
  }

  public void setProvider(ProviderEnum provider) {
    this.provider = provider;
  }

  public PasswordPolicyAuthenticationProviderCondition provider(ProviderEnum provider) {
    this.provider = provider;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyAuthenticationProviderCondition {\n");
    
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

