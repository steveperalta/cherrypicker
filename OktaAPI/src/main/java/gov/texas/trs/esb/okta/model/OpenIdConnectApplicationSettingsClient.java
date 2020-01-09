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

import gov.texas.trs.esb.okta.model.OAuthGrantType;
import gov.texas.trs.esb.okta.model.OAuthResponseType;
import gov.texas.trs.esb.okta.model.OpenIdConnectApplicationConsentMethod;
import gov.texas.trs.esb.okta.model.OpenIdConnectApplicationType;

public class OpenIdConnectApplicationSettingsClient  {
  
  @ApiModelProperty(value = "")
  private OpenIdConnectApplicationType applicationType = null;

  @ApiModelProperty(value = "")
  private String clientUri = null;

  @ApiModelProperty(value = "")
  private OpenIdConnectApplicationConsentMethod consentMethod = null;

  @ApiModelProperty(value = "")
  private List<OAuthGrantType> grantTypes = null;

  @ApiModelProperty(value = "")
  private String logoUri = null;

  @ApiModelProperty(value = "")
  private String policyUri = null;

  @ApiModelProperty(value = "")
  private List<String> redirectUris = null;

  @ApiModelProperty(value = "")
  private List<OAuthResponseType> responseTypes = null;

  @ApiModelProperty(value = "")
  private String tosUri = null;
 /**
   * Get applicationType
   * @return applicationType
  **/
  @JsonProperty("application_type")
  public OpenIdConnectApplicationType getApplicationType() {
    return applicationType;
  }

  public void setApplicationType(OpenIdConnectApplicationType applicationType) {
    this.applicationType = applicationType;
  }

  public OpenIdConnectApplicationSettingsClient applicationType(OpenIdConnectApplicationType applicationType) {
    this.applicationType = applicationType;
    return this;
  }

 /**
   * Get clientUri
   * @return clientUri
  **/
  @JsonProperty("client_uri")
  public String getClientUri() {
    return clientUri;
  }

  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
  }

  public OpenIdConnectApplicationSettingsClient clientUri(String clientUri) {
    this.clientUri = clientUri;
    return this;
  }

 /**
   * Get consentMethod
   * @return consentMethod
  **/
  @JsonProperty("consent_method")
  public OpenIdConnectApplicationConsentMethod getConsentMethod() {
    return consentMethod;
  }

  public void setConsentMethod(OpenIdConnectApplicationConsentMethod consentMethod) {
    this.consentMethod = consentMethod;
  }

  public OpenIdConnectApplicationSettingsClient consentMethod(OpenIdConnectApplicationConsentMethod consentMethod) {
    this.consentMethod = consentMethod;
    return this;
  }

 /**
   * Get grantTypes
   * @return grantTypes
  **/
  @JsonProperty("grant_types")
  public List<OAuthGrantType> getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(List<OAuthGrantType> grantTypes) {
    this.grantTypes = grantTypes;
  }

  public OpenIdConnectApplicationSettingsClient grantTypes(List<OAuthGrantType> grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

  public OpenIdConnectApplicationSettingsClient addGrantTypesItem(OAuthGrantType grantTypesItem) {
    this.grantTypes.add(grantTypesItem);
    return this;
  }

 /**
   * Get logoUri
   * @return logoUri
  **/
  @JsonProperty("logo_uri")
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public OpenIdConnectApplicationSettingsClient logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

 /**
   * Get policyUri
   * @return policyUri
  **/
  @JsonProperty("policy_uri")
  public String getPolicyUri() {
    return policyUri;
  }

  public void setPolicyUri(String policyUri) {
    this.policyUri = policyUri;
  }

  public OpenIdConnectApplicationSettingsClient policyUri(String policyUri) {
    this.policyUri = policyUri;
    return this;
  }

 /**
   * Get redirectUris
   * @return redirectUris
  **/
  @JsonProperty("redirect_uris")
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public OpenIdConnectApplicationSettingsClient redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public OpenIdConnectApplicationSettingsClient addRedirectUrisItem(String redirectUrisItem) {
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

 /**
   * Get responseTypes
   * @return responseTypes
  **/
  @JsonProperty("response_types")
  public List<OAuthResponseType> getResponseTypes() {
    return responseTypes;
  }

  public void setResponseTypes(List<OAuthResponseType> responseTypes) {
    this.responseTypes = responseTypes;
  }

  public OpenIdConnectApplicationSettingsClient responseTypes(List<OAuthResponseType> responseTypes) {
    this.responseTypes = responseTypes;
    return this;
  }

  public OpenIdConnectApplicationSettingsClient addResponseTypesItem(OAuthResponseType responseTypesItem) {
    this.responseTypes.add(responseTypesItem);
    return this;
  }

 /**
   * Get tosUri
   * @return tosUri
  **/
  @JsonProperty("tos_uri")
  public String getTosUri() {
    return tosUri;
  }

  public void setTosUri(String tosUri) {
    this.tosUri = tosUri;
  }

  public OpenIdConnectApplicationSettingsClient tosUri(String tosUri) {
    this.tosUri = tosUri;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenIdConnectApplicationSettingsClient {\n");
    
    sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
    sb.append("    clientUri: ").append(toIndentedString(clientUri)).append("\n");
    sb.append("    consentMethod: ").append(toIndentedString(consentMethod)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    policyUri: ").append(toIndentedString(policyUri)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    responseTypes: ").append(toIndentedString(responseTypes)).append("\n");
    sb.append("    tosUri: ").append(toIndentedString(tosUri)).append("\n");
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

