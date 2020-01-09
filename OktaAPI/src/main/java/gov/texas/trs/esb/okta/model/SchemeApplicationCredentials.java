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

import gov.texas.trs.esb.okta.model.ApplicationCredentialsScheme;
import gov.texas.trs.esb.okta.model.ApplicationCredentialsSigning;
import gov.texas.trs.esb.okta.model.PasswordCredential;

public class SchemeApplicationCredentials  {
  
  @ApiModelProperty(value = "")
  private PasswordCredential password = null;

  @ApiModelProperty(value = "")
  private Boolean revealPassword = null;

  @ApiModelProperty(value = "")
  private ApplicationCredentialsScheme scheme = null;

  @ApiModelProperty(value = "")
  private ApplicationCredentialsSigning signing = null;

  @ApiModelProperty(value = "")
  private String userName = null;
 /**
   * Get password
   * @return password
  **/
  @JsonProperty("password")
  public PasswordCredential getPassword() {
    return password;
  }

  public void setPassword(PasswordCredential password) {
    this.password = password;
  }

  public SchemeApplicationCredentials password(PasswordCredential password) {
    this.password = password;
    return this;
  }

 /**
   * Get revealPassword
   * @return revealPassword
  **/
  @JsonProperty("revealPassword")
  public Boolean isRevealPassword() {
    return revealPassword;
  }

  public void setRevealPassword(Boolean revealPassword) {
    this.revealPassword = revealPassword;
  }

  public SchemeApplicationCredentials revealPassword(Boolean revealPassword) {
    this.revealPassword = revealPassword;
    return this;
  }

 /**
   * Get scheme
   * @return scheme
  **/
  @JsonProperty("scheme")
  public ApplicationCredentialsScheme getScheme() {
    return scheme;
  }

  public void setScheme(ApplicationCredentialsScheme scheme) {
    this.scheme = scheme;
  }

  public SchemeApplicationCredentials scheme(ApplicationCredentialsScheme scheme) {
    this.scheme = scheme;
    return this;
  }

 /**
   * Get signing
   * @return signing
  **/
  @JsonProperty("signing")
  public ApplicationCredentialsSigning getSigning() {
    return signing;
  }

  public void setSigning(ApplicationCredentialsSigning signing) {
    this.signing = signing;
  }

  public SchemeApplicationCredentials signing(ApplicationCredentialsSigning signing) {
    this.signing = signing;
    return this;
  }

 /**
   * Get userName
   * @return userName
  **/
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public SchemeApplicationCredentials userName(String userName) {
    this.userName = userName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemeApplicationCredentials {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    revealPassword: ").append(toIndentedString(revealPassword)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    signing: ").append(toIndentedString(signing)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

