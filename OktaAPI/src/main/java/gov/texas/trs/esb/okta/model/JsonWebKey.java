package gov.texas.trs.esb.okta.model;

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

public class JsonWebKey  {
  
  @ApiModelProperty(value = "")
  private Map<String, Object> links = null;

  @ApiModelProperty(value = "")
  private String alg = null;

  @ApiModelProperty(value = "")
  private Date created = null;

  @ApiModelProperty(value = "")
  private String e = null;

  @ApiModelProperty(value = "")
  private Date expiresAt = null;

  @ApiModelProperty(value = "")
  private List<String> keyOps = null;

  @ApiModelProperty(value = "")
  private String kid = null;

  @ApiModelProperty(value = "")
  private String kty = null;

  @ApiModelProperty(value = "")
  private Date lastUpdated = null;

  @ApiModelProperty(value = "")
  private String n = null;

  @ApiModelProperty(value = "")
  private String status = null;

  @ApiModelProperty(value = "")
  private String use = null;

  @ApiModelProperty(value = "")
  private List<String> x5c = null;

  @ApiModelProperty(value = "")
  private String x5t = null;

  @ApiModelProperty(value = "")
  private String x5tS256 = null;

  @ApiModelProperty(value = "")
  private String x5u = null;
 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public Map<String, Object> getLinks() {
    return links;
  }


 /**
   * Get alg
   * @return alg
  **/
  @JsonProperty("alg")
  public String getAlg() {
    return alg;
  }


 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }


 /**
   * Get e
   * @return e
  **/
  @JsonProperty("e")
  public String getE() {
    return e;
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
   * Get keyOps
   * @return keyOps
  **/
  @JsonProperty("key_ops")
  public List<String> getKeyOps() {
    return keyOps;
  }


 /**
   * Get kid
   * @return kid
  **/
  @JsonProperty("kid")
  public String getKid() {
    return kid;
  }


 /**
   * Get kty
   * @return kty
  **/
  @JsonProperty("kty")
  public String getKty() {
    return kty;
  }


 /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @JsonProperty("lastUpdated")
  public Date getLastUpdated() {
    return lastUpdated;
  }


 /**
   * Get n
   * @return n
  **/
  @JsonProperty("n")
  public String getN() {
    return n;
  }


 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }


 /**
   * Get use
   * @return use
  **/
  @JsonProperty("use")
  public String getUse() {
    return use;
  }


 /**
   * Get x5c
   * @return x5c
  **/
  @JsonProperty("x5c")
  public List<String> getX5c() {
    return x5c;
  }


 /**
   * Get x5t
   * @return x5t
  **/
  @JsonProperty("x5t")
  public String getX5t() {
    return x5t;
  }


 /**
   * Get x5tS256
   * @return x5tS256
  **/
  @JsonProperty("x5t#S256")
  public String getX5tS256() {
    return x5tS256;
  }


 /**
   * Get x5u
   * @return x5u
  **/
  @JsonProperty("x5u")
  public String getX5u() {
    return x5u;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonWebKey {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    keyOps: ").append(toIndentedString(keyOps)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    x5c: ").append(toIndentedString(x5c)).append("\n");
    sb.append("    x5t: ").append(toIndentedString(x5t)).append("\n");
    sb.append("    x5tS256: ").append(toIndentedString(x5tS256)).append("\n");
    sb.append("    x5u: ").append(toIndentedString(x5u)).append("\n");
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

