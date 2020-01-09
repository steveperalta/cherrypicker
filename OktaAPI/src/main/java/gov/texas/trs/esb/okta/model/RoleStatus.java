package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets RoleStatus
 */
public enum RoleStatus {
  
  ACTIVE("ACTIVE"),
  
  INACTIVE("INACTIVE");

  private String value;

  RoleStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RoleStatus fromValue(String text) {
    for (RoleStatus b : RoleStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

