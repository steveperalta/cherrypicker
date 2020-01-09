package com.oktaapi.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.oktaapi.model.FactorProfile;
import com.oktaapi.model.FactorProvider;
import com.oktaapi.model.FactorStatus;
import com.oktaapi.model.FactorType;
import com.oktaapi.model.VerifyFactorRequest;

public class Factor  {
  
  @ApiModelProperty(value = "")
  private Map<String, Object> embedded = null;

  @ApiModelProperty(value = "")
  private Map<String, Object> links = null;

  @ApiModelProperty(value = "")
  private String device = null;

  @ApiModelProperty(value = "")
  private String deviceType = null;

  @ApiModelProperty(value = "")
  private FactorType factorType = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private String mfaStateTokenId = null;

  @ApiModelProperty(value = "")
  private FactorProfile profile = null;

  @ApiModelProperty(value = "")
  private FactorProvider provider = null;

  @ApiModelProperty(value = "")
  private Boolean rechallengeExistingFactor = null;

  @ApiModelProperty(value = "")
  private String sessionId = null;

  @ApiModelProperty(value = "")
  private FactorStatus status = null;

  @ApiModelProperty(value = "")
  private Integer tokenLifetimeSeconds = null;

  @ApiModelProperty(value = "")
  private String userId = null;

  @ApiModelProperty(value = "")
  private VerifyFactorRequest verify = null;
 /**
   * Get embedded
   * @return embedded
  **/
  @JsonProperty("_embedded")
  public Map<String, Object> getEmbedded() {
    return embedded;
  }


 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public Map<String, Object> getLinks() {
    return links;
  }


 /**
   * Get device
   * @return device
  **/
  @JsonProperty("device")
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }

  public Factor device(String device) {
    this.device = device;
    return this;
  }

 /**
   * Get deviceType
   * @return deviceType
  **/
  @JsonProperty("deviceType")
  public String getDeviceType() {
    return deviceType;
  }


 /**
   * Get factorType
   * @return factorType
  **/
  @JsonProperty("factorType")
  public FactorType getFactorType() {
    return factorType;
  }

  public void setFactorType(FactorType factorType) {
    this.factorType = factorType;
  }

  public Factor factorType(FactorType factorType) {
    this.factorType = factorType;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * Get mfaStateTokenId
   * @return mfaStateTokenId
  **/
  @JsonProperty("mfaStateTokenId")
  public String getMfaStateTokenId() {
    return mfaStateTokenId;
  }

  public void setMfaStateTokenId(String mfaStateTokenId) {
    this.mfaStateTokenId = mfaStateTokenId;
  }

  public Factor mfaStateTokenId(String mfaStateTokenId) {
    this.mfaStateTokenId = mfaStateTokenId;
    return this;
  }

 /**
   * Get profile
   * @return profile
  **/
  @JsonProperty("profile")
  public FactorProfile getProfile() {
    return profile;
  }

  public void setProfile(FactorProfile profile) {
    this.profile = profile;
  }

  public Factor profile(FactorProfile profile) {
    this.profile = profile;
    return this;
  }

 /**
   * Get provider
   * @return provider
  **/
  @JsonProperty("provider")
  public FactorProvider getProvider() {
    return provider;
  }

  public void setProvider(FactorProvider provider) {
    this.provider = provider;
  }

  public Factor provider(FactorProvider provider) {
    this.provider = provider;
    return this;
  }

 /**
   * Get rechallengeExistingFactor
   * @return rechallengeExistingFactor
  **/
  @JsonProperty("rechallengeExistingFactor")
  public Boolean isRechallengeExistingFactor() {
    return rechallengeExistingFactor;
  }

  public void setRechallengeExistingFactor(Boolean rechallengeExistingFactor) {
    this.rechallengeExistingFactor = rechallengeExistingFactor;
  }

  public Factor rechallengeExistingFactor(Boolean rechallengeExistingFactor) {
    this.rechallengeExistingFactor = rechallengeExistingFactor;
    return this;
  }

 /**
   * Get sessionId
   * @return sessionId
  **/
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public Factor sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public FactorStatus getStatus() {
    return status;
  }


 /**
   * Get tokenLifetimeSeconds
   * @return tokenLifetimeSeconds
  **/
  @JsonProperty("tokenLifetimeSeconds")
  public Integer getTokenLifetimeSeconds() {
    return tokenLifetimeSeconds;
  }

  public void setTokenLifetimeSeconds(Integer tokenLifetimeSeconds) {
    this.tokenLifetimeSeconds = tokenLifetimeSeconds;
  }

  public Factor tokenLifetimeSeconds(Integer tokenLifetimeSeconds) {
    this.tokenLifetimeSeconds = tokenLifetimeSeconds;
    return this;
  }

 /**
   * Get userId
   * @return userId
  **/
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Factor userId(String userId) {
    this.userId = userId;
    return this;
  }

 /**
   * Get verify
   * @return verify
  **/
  @JsonProperty("verify")
  public VerifyFactorRequest getVerify() {
    return verify;
  }

  public void setVerify(VerifyFactorRequest verify) {
    this.verify = verify;
  }

  public Factor verify(VerifyFactorRequest verify) {
    this.verify = verify;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Factor {\n");
    
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    factorType: ").append(toIndentedString(factorType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mfaStateTokenId: ").append(toIndentedString(mfaStateTokenId)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    rechallengeExistingFactor: ").append(toIndentedString(rechallengeExistingFactor)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tokenLifetimeSeconds: ").append(toIndentedString(tokenLifetimeSeconds)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    verify: ").append(toIndentedString(verify)).append("\n");
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

