package com.oktaapi.model;

import java.util.ArrayList;
import java.util.Date;
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

import com.oktaapi.model.SessionAuthenticationMethod;
import com.oktaapi.model.SessionIdentityProvider;
import com.oktaapi.model.SessionStatus;

public class Session  {
  
  @ApiModelProperty(value = "")
  private Map<String, Object> links = null;

  @ApiModelProperty(value = "")
  private List<SessionAuthenticationMethod> amr = null;

  @ApiModelProperty(value = "")
  private Date createdAt = null;

  @ApiModelProperty(value = "")
  private Date expiresAt = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private SessionIdentityProvider idp = null;

  @ApiModelProperty(value = "")
  private Date lastFactorVerification = null;

  @ApiModelProperty(value = "")
  private Date lastPasswordVerification = null;

  @ApiModelProperty(value = "")
  private String login = null;

  @ApiModelProperty(value = "")
  private SessionStatus status = null;

  @ApiModelProperty(value = "")
  private String userId = null;
 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public Map<String, Object> getLinks() {
    return links;
  }


 /**
   * Get amr
   * @return amr
  **/
  @JsonProperty("amr")
  public List<SessionAuthenticationMethod> getAmr() {
    return amr;
  }


 /**
   * Get createdAt
   * @return createdAt
  **/
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }


 /**
   * Get expiresAt
   * @return expiresAt
  **/
  @JsonProperty("expiresAt")
  public Date getExpiresAt() {
    return expiresAt;
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
   * Get idp
   * @return idp
  **/
  @JsonProperty("idp")
  public SessionIdentityProvider getIdp() {
    return idp;
  }


 /**
   * Get lastFactorVerification
   * @return lastFactorVerification
  **/
  @JsonProperty("lastFactorVerification")
  public Date getLastFactorVerification() {
    return lastFactorVerification;
  }


 /**
   * Get lastPasswordVerification
   * @return lastPasswordVerification
  **/
  @JsonProperty("lastPasswordVerification")
  public Date getLastPasswordVerification() {
    return lastPasswordVerification;
  }


 /**
   * Get login
   * @return login
  **/
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }


 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public SessionStatus getStatus() {
    return status;
  }


 /**
   * Get userId
   * @return userId
  **/
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    amr: ").append(toIndentedString(amr)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idp: ").append(toIndentedString(idp)).append("\n");
    sb.append("    lastFactorVerification: ").append(toIndentedString(lastFactorVerification)).append("\n");
    sb.append("    lastPasswordVerification: ").append(toIndentedString(lastPasswordVerification)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

