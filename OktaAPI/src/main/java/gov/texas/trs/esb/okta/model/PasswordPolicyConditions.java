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

import gov.texas.trs.esb.okta.model.PasswordPolicyAuthenticationProviderCondition;
import gov.texas.trs.esb.okta.model.PolicyPeopleCondition;

public class PasswordPolicyConditions  {
  
  @ApiModelProperty(value = "")
  private PasswordPolicyAuthenticationProviderCondition authProvider = null;

  @ApiModelProperty(value = "")
  private PolicyPeopleCondition people = null;
 /**
   * Get authProvider
   * @return authProvider
  **/
  @JsonProperty("authProvider")
  public PasswordPolicyAuthenticationProviderCondition getAuthProvider() {
    return authProvider;
  }

  public void setAuthProvider(PasswordPolicyAuthenticationProviderCondition authProvider) {
    this.authProvider = authProvider;
  }

  public PasswordPolicyConditions authProvider(PasswordPolicyAuthenticationProviderCondition authProvider) {
    this.authProvider = authProvider;
    return this;
  }

 /**
   * Get people
   * @return people
  **/
  @JsonProperty("people")
  public PolicyPeopleCondition getPeople() {
    return people;
  }

  public void setPeople(PolicyPeopleCondition people) {
    this.people = people;
  }

  public PasswordPolicyConditions people(PolicyPeopleCondition people) {
    this.people = people;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyConditions {\n");
    
    sb.append("    authProvider: ").append(toIndentedString(authProvider)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
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

