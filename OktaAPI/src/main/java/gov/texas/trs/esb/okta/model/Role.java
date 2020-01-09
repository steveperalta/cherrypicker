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

import gov.texas.trs.esb.okta.model.RoleStatus;

public class Role  {
  
  @ApiModelProperty(value = "")
  private Map<String, Object> embedded = null;

  @ApiModelProperty(value = "")
  private Map<String, Object> links = null;


@XmlType(name="AssignmentTypeEnum")
@XmlEnum(String.class)
public enum AssignmentTypeEnum {

@XmlEnumValue("GROUP") GROUP(String.valueOf("GROUP")), @XmlEnumValue("USER") USER(String.valueOf("USER"));


    private String value;

    AssignmentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AssignmentTypeEnum fromValue(String v) {
        for (AssignmentTypeEnum b : AssignmentTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private AssignmentTypeEnum assignmentType = null;

  @ApiModelProperty(value = "")
  private Date created = null;

  @ApiModelProperty(value = "")
  private String description = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private String label = null;

  @ApiModelProperty(value = "")
  private Date lastUpdated = null;

  @ApiModelProperty(value = "")
  private RoleStatus status = null;

  @ApiModelProperty(value = "")
  private String type = null;
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
   * Get assignmentType
   * @return assignmentType
  **/
  @JsonProperty("assignmentType")
  public String getAssignmentType() {
    if (assignmentType == null) {
      return null;
    }
    return assignmentType.value();
  }

  public void setAssignmentType(AssignmentTypeEnum assignmentType) {
    this.assignmentType = assignmentType;
  }

  public Role assignmentType(AssignmentTypeEnum assignmentType) {
    this.assignmentType = assignmentType;
    return this;
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
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Role description(String description) {
    this.description = description;
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
   * Get label
   * @return label
  **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
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
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public RoleStatus getStatus() {
    return status;
  }


 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Role type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    assignmentType: ").append(toIndentedString(assignmentType)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

