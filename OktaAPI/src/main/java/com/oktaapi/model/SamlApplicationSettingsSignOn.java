package com.oktaapi.model;

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

import com.oktaapi.model.SamlAttributeStatement;

public class SamlApplicationSettingsSignOn  {
  
  @ApiModelProperty(value = "")
  private Boolean assertionSigned = null;

  @ApiModelProperty(value = "")
  private List<SamlAttributeStatement> attributeStatements = null;

  @ApiModelProperty(value = "")
  private String audience = null;

  @ApiModelProperty(value = "")
  private String audienceOverride = null;

  @ApiModelProperty(value = "")
  private String authnContextClassRef = null;

  @ApiModelProperty(value = "")
  private String defaultRelayState = null;

  @ApiModelProperty(value = "")
  private String destination = null;

  @ApiModelProperty(value = "")
  private String destinationOverride = null;

  @ApiModelProperty(value = "")
  private String digestAlgorithm = null;

  @ApiModelProperty(value = "")
  private Boolean honorForceAuthn = null;

  @ApiModelProperty(value = "")
  private String idpIssuer = null;

  @ApiModelProperty(value = "")
  private String recipient = null;

  @ApiModelProperty(value = "")
  private String recipientOverride = null;

  @ApiModelProperty(value = "")
  private Boolean requestCompressed = null;

  @ApiModelProperty(value = "")
  private Boolean responseSigned = null;

  @ApiModelProperty(value = "")
  private String signatureAlgorithm = null;

  @ApiModelProperty(value = "")
  private String spIssuer = null;

  @ApiModelProperty(value = "")
  private String ssoAcsUrl = null;

  @ApiModelProperty(value = "")
  private String ssoAcsUrlOverride = null;

  @ApiModelProperty(value = "")
  private String subjectNameIdFormat = null;

  @ApiModelProperty(value = "")
  private String subjectNameIdTemplate = null;
 /**
   * Get assertionSigned
   * @return assertionSigned
  **/
  @JsonProperty("assertionSigned")
  public Boolean isAssertionSigned() {
    return assertionSigned;
  }

  public void setAssertionSigned(Boolean assertionSigned) {
    this.assertionSigned = assertionSigned;
  }

  public SamlApplicationSettingsSignOn assertionSigned(Boolean assertionSigned) {
    this.assertionSigned = assertionSigned;
    return this;
  }

 /**
   * Get attributeStatements
   * @return attributeStatements
  **/
  @JsonProperty("attributeStatements")
  public List<SamlAttributeStatement> getAttributeStatements() {
    return attributeStatements;
  }

  public void setAttributeStatements(List<SamlAttributeStatement> attributeStatements) {
    this.attributeStatements = attributeStatements;
  }

  public SamlApplicationSettingsSignOn attributeStatements(List<SamlAttributeStatement> attributeStatements) {
    this.attributeStatements = attributeStatements;
    return this;
  }

  public SamlApplicationSettingsSignOn addAttributeStatementsItem(SamlAttributeStatement attributeStatementsItem) {
    this.attributeStatements.add(attributeStatementsItem);
    return this;
  }

 /**
   * Get audience
   * @return audience
  **/
  @JsonProperty("audience")
  public String getAudience() {
    return audience;
  }

  public void setAudience(String audience) {
    this.audience = audience;
  }

  public SamlApplicationSettingsSignOn audience(String audience) {
    this.audience = audience;
    return this;
  }

 /**
   * Get audienceOverride
   * @return audienceOverride
  **/
  @JsonProperty("audienceOverride")
  public String getAudienceOverride() {
    return audienceOverride;
  }

  public void setAudienceOverride(String audienceOverride) {
    this.audienceOverride = audienceOverride;
  }

  public SamlApplicationSettingsSignOn audienceOverride(String audienceOverride) {
    this.audienceOverride = audienceOverride;
    return this;
  }

 /**
   * Get authnContextClassRef
   * @return authnContextClassRef
  **/
  @JsonProperty("authnContextClassRef")
  public String getAuthnContextClassRef() {
    return authnContextClassRef;
  }

  public void setAuthnContextClassRef(String authnContextClassRef) {
    this.authnContextClassRef = authnContextClassRef;
  }

  public SamlApplicationSettingsSignOn authnContextClassRef(String authnContextClassRef) {
    this.authnContextClassRef = authnContextClassRef;
    return this;
  }

 /**
   * Get defaultRelayState
   * @return defaultRelayState
  **/
  @JsonProperty("defaultRelayState")
  public String getDefaultRelayState() {
    return defaultRelayState;
  }

  public void setDefaultRelayState(String defaultRelayState) {
    this.defaultRelayState = defaultRelayState;
  }

  public SamlApplicationSettingsSignOn defaultRelayState(String defaultRelayState) {
    this.defaultRelayState = defaultRelayState;
    return this;
  }

 /**
   * Get destination
   * @return destination
  **/
  @JsonProperty("destination")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public SamlApplicationSettingsSignOn destination(String destination) {
    this.destination = destination;
    return this;
  }

 /**
   * Get destinationOverride
   * @return destinationOverride
  **/
  @JsonProperty("destinationOverride")
  public String getDestinationOverride() {
    return destinationOverride;
  }

  public void setDestinationOverride(String destinationOverride) {
    this.destinationOverride = destinationOverride;
  }

  public SamlApplicationSettingsSignOn destinationOverride(String destinationOverride) {
    this.destinationOverride = destinationOverride;
    return this;
  }

 /**
   * Get digestAlgorithm
   * @return digestAlgorithm
  **/
  @JsonProperty("digestAlgorithm")
  public String getDigestAlgorithm() {
    return digestAlgorithm;
  }

  public void setDigestAlgorithm(String digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  public SamlApplicationSettingsSignOn digestAlgorithm(String digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
    return this;
  }

 /**
   * Get honorForceAuthn
   * @return honorForceAuthn
  **/
  @JsonProperty("honorForceAuthn")
  public Boolean isHonorForceAuthn() {
    return honorForceAuthn;
  }

  public void setHonorForceAuthn(Boolean honorForceAuthn) {
    this.honorForceAuthn = honorForceAuthn;
  }

  public SamlApplicationSettingsSignOn honorForceAuthn(Boolean honorForceAuthn) {
    this.honorForceAuthn = honorForceAuthn;
    return this;
  }

 /**
   * Get idpIssuer
   * @return idpIssuer
  **/
  @JsonProperty("idpIssuer")
  public String getIdpIssuer() {
    return idpIssuer;
  }

  public void setIdpIssuer(String idpIssuer) {
    this.idpIssuer = idpIssuer;
  }

  public SamlApplicationSettingsSignOn idpIssuer(String idpIssuer) {
    this.idpIssuer = idpIssuer;
    return this;
  }

 /**
   * Get recipient
   * @return recipient
  **/
  @JsonProperty("recipient")
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public SamlApplicationSettingsSignOn recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

 /**
   * Get recipientOverride
   * @return recipientOverride
  **/
  @JsonProperty("recipientOverride")
  public String getRecipientOverride() {
    return recipientOverride;
  }

  public void setRecipientOverride(String recipientOverride) {
    this.recipientOverride = recipientOverride;
  }

  public SamlApplicationSettingsSignOn recipientOverride(String recipientOverride) {
    this.recipientOverride = recipientOverride;
    return this;
  }

 /**
   * Get requestCompressed
   * @return requestCompressed
  **/
  @JsonProperty("requestCompressed")
  public Boolean isRequestCompressed() {
    return requestCompressed;
  }

  public void setRequestCompressed(Boolean requestCompressed) {
    this.requestCompressed = requestCompressed;
  }

  public SamlApplicationSettingsSignOn requestCompressed(Boolean requestCompressed) {
    this.requestCompressed = requestCompressed;
    return this;
  }

 /**
   * Get responseSigned
   * @return responseSigned
  **/
  @JsonProperty("responseSigned")
  public Boolean isResponseSigned() {
    return responseSigned;
  }

  public void setResponseSigned(Boolean responseSigned) {
    this.responseSigned = responseSigned;
  }

  public SamlApplicationSettingsSignOn responseSigned(Boolean responseSigned) {
    this.responseSigned = responseSigned;
    return this;
  }

 /**
   * Get signatureAlgorithm
   * @return signatureAlgorithm
  **/
  @JsonProperty("signatureAlgorithm")
  public String getSignatureAlgorithm() {
    return signatureAlgorithm;
  }

  public void setSignatureAlgorithm(String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }

  public SamlApplicationSettingsSignOn signatureAlgorithm(String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
    return this;
  }

 /**
   * Get spIssuer
   * @return spIssuer
  **/
  @JsonProperty("spIssuer")
  public String getSpIssuer() {
    return spIssuer;
  }

  public void setSpIssuer(String spIssuer) {
    this.spIssuer = spIssuer;
  }

  public SamlApplicationSettingsSignOn spIssuer(String spIssuer) {
    this.spIssuer = spIssuer;
    return this;
  }

 /**
   * Get ssoAcsUrl
   * @return ssoAcsUrl
  **/
  @JsonProperty("ssoAcsUrl")
  public String getSsoAcsUrl() {
    return ssoAcsUrl;
  }

  public void setSsoAcsUrl(String ssoAcsUrl) {
    this.ssoAcsUrl = ssoAcsUrl;
  }

  public SamlApplicationSettingsSignOn ssoAcsUrl(String ssoAcsUrl) {
    this.ssoAcsUrl = ssoAcsUrl;
    return this;
  }

 /**
   * Get ssoAcsUrlOverride
   * @return ssoAcsUrlOverride
  **/
  @JsonProperty("ssoAcsUrlOverride")
  public String getSsoAcsUrlOverride() {
    return ssoAcsUrlOverride;
  }

  public void setSsoAcsUrlOverride(String ssoAcsUrlOverride) {
    this.ssoAcsUrlOverride = ssoAcsUrlOverride;
  }

  public SamlApplicationSettingsSignOn ssoAcsUrlOverride(String ssoAcsUrlOverride) {
    this.ssoAcsUrlOverride = ssoAcsUrlOverride;
    return this;
  }

 /**
   * Get subjectNameIdFormat
   * @return subjectNameIdFormat
  **/
  @JsonProperty("subjectNameIdFormat")
  public String getSubjectNameIdFormat() {
    return subjectNameIdFormat;
  }

  public void setSubjectNameIdFormat(String subjectNameIdFormat) {
    this.subjectNameIdFormat = subjectNameIdFormat;
  }

  public SamlApplicationSettingsSignOn subjectNameIdFormat(String subjectNameIdFormat) {
    this.subjectNameIdFormat = subjectNameIdFormat;
    return this;
  }

 /**
   * Get subjectNameIdTemplate
   * @return subjectNameIdTemplate
  **/
  @JsonProperty("subjectNameIdTemplate")
  public String getSubjectNameIdTemplate() {
    return subjectNameIdTemplate;
  }

  public void setSubjectNameIdTemplate(String subjectNameIdTemplate) {
    this.subjectNameIdTemplate = subjectNameIdTemplate;
  }

  public SamlApplicationSettingsSignOn subjectNameIdTemplate(String subjectNameIdTemplate) {
    this.subjectNameIdTemplate = subjectNameIdTemplate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlApplicationSettingsSignOn {\n");
    
    sb.append("    assertionSigned: ").append(toIndentedString(assertionSigned)).append("\n");
    sb.append("    attributeStatements: ").append(toIndentedString(attributeStatements)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    audienceOverride: ").append(toIndentedString(audienceOverride)).append("\n");
    sb.append("    authnContextClassRef: ").append(toIndentedString(authnContextClassRef)).append("\n");
    sb.append("    defaultRelayState: ").append(toIndentedString(defaultRelayState)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    destinationOverride: ").append(toIndentedString(destinationOverride)).append("\n");
    sb.append("    digestAlgorithm: ").append(toIndentedString(digestAlgorithm)).append("\n");
    sb.append("    honorForceAuthn: ").append(toIndentedString(honorForceAuthn)).append("\n");
    sb.append("    idpIssuer: ").append(toIndentedString(idpIssuer)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    recipientOverride: ").append(toIndentedString(recipientOverride)).append("\n");
    sb.append("    requestCompressed: ").append(toIndentedString(requestCompressed)).append("\n");
    sb.append("    responseSigned: ").append(toIndentedString(responseSigned)).append("\n");
    sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
    sb.append("    spIssuer: ").append(toIndentedString(spIssuer)).append("\n");
    sb.append("    ssoAcsUrl: ").append(toIndentedString(ssoAcsUrl)).append("\n");
    sb.append("    ssoAcsUrlOverride: ").append(toIndentedString(ssoAcsUrlOverride)).append("\n");
    sb.append("    subjectNameIdFormat: ").append(toIndentedString(subjectNameIdFormat)).append("\n");
    sb.append("    subjectNameIdTemplate: ").append(toIndentedString(subjectNameIdTemplate)).append("\n");
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

