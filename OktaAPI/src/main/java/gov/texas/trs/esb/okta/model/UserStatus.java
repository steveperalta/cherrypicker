package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets UserStatus
 */
public enum UserStatus {
  
  STAGED("STAGED"),
  
  PROVISIONED("PROVISIONED"),
  
  ACTIVE("ACTIVE"),
  
  RECOVERY("RECOVERY"),
  
  PASSWORD_EXPIRED("PASSWORD_EXPIRED"),
  
  LOCKED_OUT("LOCKED_OUT"),
  
  DEPROVISIONED("DEPROVISIONED"),
  
  SUSPENDED("SUSPENDED");

  private String value;

  UserStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserStatus fromValue(String text) {
    for (UserStatus b : UserStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

