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

public class GroupRuleGroupAssignment  {
  
  @ApiModelProperty(value = "")
  private List<String> groupIds = null;
 /**
   * Get groupIds
   * @return groupIds
  **/
  @JsonProperty("groupIds")
  public List<String> getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(List<String> groupIds) {
    this.groupIds = groupIds;
  }

  public GroupRuleGroupAssignment groupIds(List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  public GroupRuleGroupAssignment addGroupIdsItem(String groupIdsItem) {
    this.groupIds.add(groupIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRuleGroupAssignment {\n");
    
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
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

