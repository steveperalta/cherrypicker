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

import gov.texas.trs.esb.okta.model.PasswordCredential;

public class ChangePasswordRequest  {
  
  @ApiModelProperty(value = "")
  private PasswordCredential newPassword = null;

  @ApiModelProperty(value = "")
  private PasswordCredential oldPassword = null;
 /**
   * Get newPassword
   * @return newPassword
  **/
  @JsonProperty("newPassword")
  public PasswordCredential getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(PasswordCredential newPassword) {
    this.newPassword = newPassword;
  }

  public ChangePasswordRequest newPassword(PasswordCredential newPassword) {
    this.newPassword = newPassword;
    return this;
  }

 /**
   * Get oldPassword
   * @return oldPassword
  **/
  @JsonProperty("oldPassword")
  public PasswordCredential getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(PasswordCredential oldPassword) {
    this.oldPassword = oldPassword;
  }

  public ChangePasswordRequest oldPassword(PasswordCredential oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePasswordRequest {\n");
    
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
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

