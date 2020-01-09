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

import gov.texas.trs.esb.okta.model.AuthenticationProvider;
import gov.texas.trs.esb.okta.model.EmailAddress;
import gov.texas.trs.esb.okta.model.PasswordCredential;
import gov.texas.trs.esb.okta.model.RecoveryQuestionCredential;

public class UserCredentials  {
  
  @ApiModelProperty(value = "")
  private List<EmailAddress> emails = null;

  @ApiModelProperty(value = "")
  private PasswordCredential password = null;

  @ApiModelProperty(value = "")
  private AuthenticationProvider provider = null;

  @ApiModelProperty(value = "")
  private RecoveryQuestionCredential recoveryQuestion = null;
 /**
   * Get emails
   * @return emails
  **/
  @JsonProperty("emails")
  public List<EmailAddress> getEmails() {
    return emails;
  }

  public void setEmails(List<EmailAddress> emails) {
    this.emails = emails;
  }

  public UserCredentials emails(List<EmailAddress> emails) {
    this.emails = emails;
    return this;
  }

  public UserCredentials addEmailsItem(EmailAddress emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

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

  public UserCredentials password(PasswordCredential password) {
    this.password = password;
    return this;
  }

 /**
   * Get provider
   * @return provider
  **/
  @JsonProperty("provider")
  public AuthenticationProvider getProvider() {
    return provider;
  }

  public void setProvider(AuthenticationProvider provider) {
    this.provider = provider;
  }

  public UserCredentials provider(AuthenticationProvider provider) {
    this.provider = provider;
    return this;
  }

 /**
   * Get recoveryQuestion
   * @return recoveryQuestion
  **/
  @JsonProperty("recovery_question")
  public RecoveryQuestionCredential getRecoveryQuestion() {
    return recoveryQuestion;
  }

  public void setRecoveryQuestion(RecoveryQuestionCredential recoveryQuestion) {
    this.recoveryQuestion = recoveryQuestion;
  }

  public UserCredentials recoveryQuestion(RecoveryQuestionCredential recoveryQuestion) {
    this.recoveryQuestion = recoveryQuestion;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCredentials {\n");
    
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    recoveryQuestion: ").append(toIndentedString(recoveryQuestion)).append("\n");
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

