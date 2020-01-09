package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets GroupRuleStatus
 */
public enum GroupRuleStatus {
  
  ACTIVE("ACTIVE"),
  
  INACTIVE("INACTIVE"),
  
  INVALID("INVALID");

  private String value;

  GroupRuleStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GroupRuleStatus fromValue(String text) {
    for (GroupRuleStatus b : GroupRuleStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

