package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets SessionStatus
 */
public enum SessionStatus {
  
  ACTIVE("ACTIVE"),
  
  MFA_ENROLL("MFA_ENROLL"),
  
  MFA_REQUIRED("MFA_REQUIRED");

  private String value;

  SessionStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SessionStatus fromValue(String text) {
    for (SessionStatus b : SessionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

