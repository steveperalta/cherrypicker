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

public class SecurePasswordStoreApplicationSettingsApplication  {
  
  @ApiModelProperty(value = "")
  private String optionalField1 = null;

  @ApiModelProperty(value = "")
  private String optionalField1Value = null;

  @ApiModelProperty(value = "")
  private String optionalField2 = null;

  @ApiModelProperty(value = "")
  private String optionalField2Value = null;

  @ApiModelProperty(value = "")
  private String optionalField3 = null;

  @ApiModelProperty(value = "")
  private String optionalField3Value = null;

  @ApiModelProperty(value = "")
  private String passwordField = null;

  @ApiModelProperty(value = "")
  private String url = null;

  @ApiModelProperty(value = "")
  private String usernameField = null;
 /**
   * Get optionalField1
   * @return optionalField1
  **/
  @JsonProperty("optionalField1")
  public String getOptionalField1() {
    return optionalField1;
  }

  public void setOptionalField1(String optionalField1) {
    this.optionalField1 = optionalField1;
  }

  public SecurePasswordStoreApplicationSettingsApplication optionalField1(String optionalField1) {
    this.optionalField1 = optionalField1;
    return this;
  }

 /**
   * Get optionalField1Value
   * @return optionalField1Value
  **/
  @JsonProperty("optionalField1Value")
  public String getOptionalField1Value() {
    return optionalField1Value;
  }

  public void setOptionalField1Value(String optionalField1Value) {
    this.optionalField1Value = optionalField1Value;
  }

  public SecurePasswordStoreApplicationSettingsApplication optionalField1Value(String optionalField1Value) {
    this.optionalField1Value = optionalField1Value;
    return this;
  }

 /**
   * Get optionalField2
   * @return optionalField2
  **/
  @JsonProperty("optionalField2")
  public String getOptionalField2() {
    return optionalField2;
  }

  public void setOptionalField2(String optionalField2) {
    this.optionalField2 = optionalField2;
  }

  public SecurePasswordStoreApplicationSettingsApplication optionalField2(String optionalField2) {
    this.optionalField2 = optionalField2;
    return this;
  }

 /**
   * Get optionalField2Value
   * @return optionalField2Value
  **/
  @JsonProperty("optionalField2Value")
  public String getOptionalField2Value() {
    return optionalField2Value;
  }

  public void setOptionalField2Value(String optionalField2Value) {
    this.optionalField2Value = optionalField2Value;
  }

  public SecurePasswordStoreApplicationSettingsApplication optionalField2Value(String optionalField2Value) {
    this.optionalField2Value = optionalField2Value;
    return this;
  }

 /**
   * Get optionalField3
   * @return optionalField3
  **/
  @JsonProperty("optionalField3")
  public String getOptionalField3() {
    return optionalField3;
  }

  public void setOptionalField3(String optionalField3) {
    this.optionalField3 = optionalField3;
  }

  public SecurePasswordStoreApplicationSettingsApplication optionalField3(String optionalField3) {
    this.optionalField3 = optionalField3;
    return this;
  }

 /**
   * Get optionalField3Value
   * @return optionalField3Value
  **/
  @JsonProperty("optionalField3Value")
  public String getOptionalField3Value() {
    return optionalField3Value;
  }

  public void setOptionalField3Value(String optionalField3Value) {
    this.optionalField3Value = optionalField3Value;
  }

  public SecurePasswordStoreApplicationSettingsApplication optionalField3Value(String optionalField3Value) {
    this.optionalField3Value = optionalField3Value;
    return this;
  }

 /**
   * Get passwordField
   * @return passwordField
  **/
  @JsonProperty("passwordField")
  public String getPasswordField() {
    return passwordField;
  }

  public void setPasswordField(String passwordField) {
    this.passwordField = passwordField;
  }

  public SecurePasswordStoreApplicationSettingsApplication passwordField(String passwordField) {
    this.passwordField = passwordField;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SecurePasswordStoreApplicationSettingsApplication url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Get usernameField
   * @return usernameField
  **/
  @JsonProperty("usernameField")
  public String getUsernameField() {
    return usernameField;
  }

  public void setUsernameField(String usernameField) {
    this.usernameField = usernameField;
  }

  public SecurePasswordStoreApplicationSettingsApplication usernameField(String usernameField) {
    this.usernameField = usernameField;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurePasswordStoreApplicationSettingsApplication {\n");
    
    sb.append("    optionalField1: ").append(toIndentedString(optionalField1)).append("\n");
    sb.append("    optionalField1Value: ").append(toIndentedString(optionalField1Value)).append("\n");
    sb.append("    optionalField2: ").append(toIndentedString(optionalField2)).append("\n");
    sb.append("    optionalField2Value: ").append(toIndentedString(optionalField2Value)).append("\n");
    sb.append("    optionalField3: ").append(toIndentedString(optionalField3)).append("\n");
    sb.append("    optionalField3Value: ").append(toIndentedString(optionalField3Value)).append("\n");
    sb.append("    passwordField: ").append(toIndentedString(passwordField)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    usernameField: ").append(toIndentedString(usernameField)).append("\n");
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

