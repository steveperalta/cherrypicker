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

import gov.texas.trs.esb.okta.model.PasswordDictionary;

public class PasswordPolicyPasswordSettingsComplexity  {
  
  @ApiModelProperty(value = "")
  private PasswordDictionary dictionary = null;

  @ApiModelProperty(value = "")
  private List<String> excludeAttributes = null;

  @ApiModelProperty(value = "")
  private Boolean excludeUsername = true;

  @ApiModelProperty(value = "")
  private Integer minLength = null;

  @ApiModelProperty(value = "")
  private Integer minLowerCase = null;

  @ApiModelProperty(value = "")
  private Integer minNumber = null;

  @ApiModelProperty(value = "")
  private Integer minSymbol = null;

  @ApiModelProperty(value = "")
  private Integer minUpperCase = null;
 /**
   * Get dictionary
   * @return dictionary
  **/
  @JsonProperty("dictionary")
  public PasswordDictionary getDictionary() {
    return dictionary;
  }

  public void setDictionary(PasswordDictionary dictionary) {
    this.dictionary = dictionary;
  }

  public PasswordPolicyPasswordSettingsComplexity dictionary(PasswordDictionary dictionary) {
    this.dictionary = dictionary;
    return this;
  }

 /**
   * Get excludeAttributes
   * @return excludeAttributes
  **/
  @JsonProperty("excludeAttributes")
  public List<String> getExcludeAttributes() {
    return excludeAttributes;
  }

  public void setExcludeAttributes(List<String> excludeAttributes) {
    this.excludeAttributes = excludeAttributes;
  }

  public PasswordPolicyPasswordSettingsComplexity excludeAttributes(List<String> excludeAttributes) {
    this.excludeAttributes = excludeAttributes;
    return this;
  }

  public PasswordPolicyPasswordSettingsComplexity addExcludeAttributesItem(String excludeAttributesItem) {
    this.excludeAttributes.add(excludeAttributesItem);
    return this;
  }

 /**
   * Get excludeUsername
   * @return excludeUsername
  **/
  @JsonProperty("excludeUsername")
  public Boolean isExcludeUsername() {
    return excludeUsername;
  }

  public void setExcludeUsername(Boolean excludeUsername) {
    this.excludeUsername = excludeUsername;
  }

  public PasswordPolicyPasswordSettingsComplexity excludeUsername(Boolean excludeUsername) {
    this.excludeUsername = excludeUsername;
    return this;
  }

 /**
   * Get minLength
   * @return minLength
  **/
  @JsonProperty("minLength")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public PasswordPolicyPasswordSettingsComplexity minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

 /**
   * Get minLowerCase
   * @return minLowerCase
  **/
  @JsonProperty("minLowerCase")
  public Integer getMinLowerCase() {
    return minLowerCase;
  }

  public void setMinLowerCase(Integer minLowerCase) {
    this.minLowerCase = minLowerCase;
  }

  public PasswordPolicyPasswordSettingsComplexity minLowerCase(Integer minLowerCase) {
    this.minLowerCase = minLowerCase;
    return this;
  }

 /**
   * Get minNumber
   * @return minNumber
  **/
  @JsonProperty("minNumber")
  public Integer getMinNumber() {
    return minNumber;
  }

  public void setMinNumber(Integer minNumber) {
    this.minNumber = minNumber;
  }

  public PasswordPolicyPasswordSettingsComplexity minNumber(Integer minNumber) {
    this.minNumber = minNumber;
    return this;
  }

 /**
   * Get minSymbol
   * @return minSymbol
  **/
  @JsonProperty("minSymbol")
  public Integer getMinSymbol() {
    return minSymbol;
  }

  public void setMinSymbol(Integer minSymbol) {
    this.minSymbol = minSymbol;
  }

  public PasswordPolicyPasswordSettingsComplexity minSymbol(Integer minSymbol) {
    this.minSymbol = minSymbol;
    return this;
  }

 /**
   * Get minUpperCase
   * @return minUpperCase
  **/
  @JsonProperty("minUpperCase")
  public Integer getMinUpperCase() {
    return minUpperCase;
  }

  public void setMinUpperCase(Integer minUpperCase) {
    this.minUpperCase = minUpperCase;
  }

  public PasswordPolicyPasswordSettingsComplexity minUpperCase(Integer minUpperCase) {
    this.minUpperCase = minUpperCase;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyPasswordSettingsComplexity {\n");
    
    sb.append("    dictionary: ").append(toIndentedString(dictionary)).append("\n");
    sb.append("    excludeAttributes: ").append(toIndentedString(excludeAttributes)).append("\n");
    sb.append("    excludeUsername: ").append(toIndentedString(excludeUsername)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minLowerCase: ").append(toIndentedString(minLowerCase)).append("\n");
    sb.append("    minNumber: ").append(toIndentedString(minNumber)).append("\n");
    sb.append("    minSymbol: ").append(toIndentedString(minSymbol)).append("\n");
    sb.append("    minUpperCase: ").append(toIndentedString(minUpperCase)).append("\n");
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

