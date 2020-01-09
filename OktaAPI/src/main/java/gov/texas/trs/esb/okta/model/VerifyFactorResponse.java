package gov.texas.trs.esb.okta.model;

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

import gov.texas.trs.esb.okta.model.FactorResultType;

public class VerifyFactorResponse  {
  
  @ApiModelProperty(value = "")
  private Map<String, Object> embedded = null;

  @ApiModelProperty(value = "")
  private Map<String, Object> links = null;

  @ApiModelProperty(value = "")
  private Date expiresAt = null;

  @ApiModelProperty(value = "")
  private FactorResultType factorResult = null;

  @ApiModelProperty(value = "")
  private String factorResultMessage = null;
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
   * Get expiresAt
   * @return expiresAt
  **/
  @JsonProperty("expiresAt")
  public Date getExpiresAt() {
    return expiresAt;
  }


 /**
   * Get factorResult
   * @return factorResult
  **/
  @JsonProperty("factorResult")
  public FactorResultType getFactorResult() {
    return factorResult;
  }


 /**
   * Get factorResultMessage
   * @return factorResultMessage
  **/
  @JsonProperty("factorResultMessage")
  public String getFactorResultMessage() {
    return factorResultMessage;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyFactorResponse {\n");
    
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    factorResult: ").append(toIndentedString(factorResult)).append("\n");
    sb.append("    factorResultMessage: ").append(toIndentedString(factorResultMessage)).append("\n");
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

