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

public class UserProfile  {
  
  @ApiModelProperty(value = "")
  private String email = null;

  @ApiModelProperty(value = "")
  private String firstName = null;

  @ApiModelProperty(value = "")
  private String lastName = null;

  @ApiModelProperty(value = "")
  private String login = null;

  @ApiModelProperty(value = "")
  private String mobilePhone = null;

  @ApiModelProperty(value = "")
  private String secondEmail = null;
 /**
   * Get email
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserProfile email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Get firstName
   * @return firstName
  **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserProfile firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Get lastName
   * @return lastName
  **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserProfile lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Get login
   * @return login
  **/
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public UserProfile login(String login) {
    this.login = login;
    return this;
  }

 /**
   * Get mobilePhone
   * @return mobilePhone
  **/
  @JsonProperty("mobilePhone")
  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public UserProfile mobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

 /**
   * Get secondEmail
   * @return secondEmail
  **/
  @JsonProperty("secondEmail")
  public String getSecondEmail() {
    return secondEmail;
  }

  public void setSecondEmail(String secondEmail) {
    this.secondEmail = secondEmail;
  }

  public UserProfile secondEmail(String secondEmail) {
    this.secondEmail = secondEmail;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    secondEmail: ").append(toIndentedString(secondEmail)).append("\n");
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

