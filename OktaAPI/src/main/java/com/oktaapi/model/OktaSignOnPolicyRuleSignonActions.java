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

import com.oktaapi.model.OktaSignOnPolicyRuleSignonSessionActions;

public class OktaSignOnPolicyRuleSignonActions  {
  

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

  @ApiModelProperty(value = "")
  private Integer factorLifetime = null;


@XmlType(name="FactorPromptModeEnum")
@XmlEnum(String.class)
public enum FactorPromptModeEnum {

@XmlEnumValue("ALWAYS") ALWAYS(String.valueOf("ALWAYS")), @XmlEnumValue("DEVICE") DEVICE(String.valueOf("DEVICE")), @XmlEnumValue("SESSION") SESSION(String.valueOf("SESSION"));


    private String value;

    FactorPromptModeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FactorPromptModeEnum fromValue(String v) {
        for (FactorPromptModeEnum b : FactorPromptModeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private FactorPromptModeEnum factorPromptMode = null;

  @ApiModelProperty(value = "")
  private Boolean rememberDeviceByDefault = false;

  @ApiModelProperty(value = "")
  private Boolean requireFactor = false;

  @ApiModelProperty(value = "")
  private OktaSignOnPolicyRuleSignonSessionActions session = null;
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

  public OktaSignOnPolicyRuleSignonActions access(AccessEnum access) {
    this.access = access;
    return this;
  }

 /**
   * Get factorLifetime
   * @return factorLifetime
  **/
  @JsonProperty("factorLifetime")
  public Integer getFactorLifetime() {
    return factorLifetime;
  }

  public void setFactorLifetime(Integer factorLifetime) {
    this.factorLifetime = factorLifetime;
  }

  public OktaSignOnPolicyRuleSignonActions factorLifetime(Integer factorLifetime) {
    this.factorLifetime = factorLifetime;
    return this;
  }

 /**
   * Get factorPromptMode
   * @return factorPromptMode
  **/
  @JsonProperty("factorPromptMode")
  public String getFactorPromptMode() {
    if (factorPromptMode == null) {
      return null;
    }
    return factorPromptMode.value();
  }

  public void setFactorPromptMode(FactorPromptModeEnum factorPromptMode) {
    this.factorPromptMode = factorPromptMode;
  }

  public OktaSignOnPolicyRuleSignonActions factorPromptMode(FactorPromptModeEnum factorPromptMode) {
    this.factorPromptMode = factorPromptMode;
    return this;
  }

 /**
   * Get rememberDeviceByDefault
   * @return rememberDeviceByDefault
  **/
  @JsonProperty("rememberDeviceByDefault")
  public Boolean isRememberDeviceByDefault() {
    return rememberDeviceByDefault;
  }

  public void setRememberDeviceByDefault(Boolean rememberDeviceByDefault) {
    this.rememberDeviceByDefault = rememberDeviceByDefault;
  }

  public OktaSignOnPolicyRuleSignonActions rememberDeviceByDefault(Boolean rememberDeviceByDefault) {
    this.rememberDeviceByDefault = rememberDeviceByDefault;
    return this;
  }

 /**
   * Get requireFactor
   * @return requireFactor
  **/
  @JsonProperty("requireFactor")
  public Boolean isRequireFactor() {
    return requireFactor;
  }

  public void setRequireFactor(Boolean requireFactor) {
    this.requireFactor = requireFactor;
  }

  public OktaSignOnPolicyRuleSignonActions requireFactor(Boolean requireFactor) {
    this.requireFactor = requireFactor;
    return this;
  }

 /**
   * Get session
   * @return session
  **/
  @JsonProperty("session")
  public OktaSignOnPolicyRuleSignonSessionActions getSession() {
    return session;
  }

  public void setSession(OktaSignOnPolicyRuleSignonSessionActions session) {
    this.session = session;
  }

  public OktaSignOnPolicyRuleSignonActions session(OktaSignOnPolicyRuleSignonSessionActions session) {
    this.session = session;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OktaSignOnPolicyRuleSignonActions {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    factorLifetime: ").append(toIndentedString(factorLifetime)).append("\n");
    sb.append("    factorPromptMode: ").append(toIndentedString(factorPromptMode)).append("\n");
    sb.append("    rememberDeviceByDefault: ").append(toIndentedString(rememberDeviceByDefault)).append("\n");
    sb.append("    requireFactor: ").append(toIndentedString(requireFactor)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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

