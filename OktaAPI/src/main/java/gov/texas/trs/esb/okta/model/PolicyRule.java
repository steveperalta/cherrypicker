package gov.texas.trs.esb.okta.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PolicyRule  {
  
  @ApiModelProperty(value = "")
  private Date created = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  private Date lastUpdated = null;

  @ApiModelProperty(value = "")
  private Integer priority = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("ACTIVE") ACTIVE(String.valueOf("ACTIVE")), @XmlEnumValue("INACTIVE") INACTIVE(String.valueOf("INACTIVE"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private StatusEnum status = StatusEnum.ACTIVE;

  @ApiModelProperty(value = "")
  private Boolean system = false;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("SIGN_ON") SIGN_ON(String.valueOf("SIGN_ON")), @XmlEnumValue("PASSWORD") PASSWORD(String.valueOf("PASSWORD"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private TypeEnum type = null;
 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }


 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PolicyRule id(String id) {
    this.id = id;
    return this;
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
   * Get priority
   * @return priority
  **/
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public PolicyRule priority(Integer priority) {
    this.priority = priority;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PolicyRule status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get system
   * @return system
  **/
  @JsonProperty("system")
  public Boolean isSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }

  public PolicyRule system(Boolean system) {
    this.system = system;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PolicyRule type(TypeEnum type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyRule {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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

