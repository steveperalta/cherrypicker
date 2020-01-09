package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets FactorStatus
 */
public enum FactorStatus {
  
  PENDING_ACTIVATION("PENDING_ACTIVATION"),
  
  ACTIVE("ACTIVE"),
  
  INACTIVE("INACTIVE"),
  
  NOT_SETUP("NOT_SETUP"),
  
  ENROLLED("ENROLLED"),
  
  DISABLED("DISABLED"),
  
  EXPIRED("EXPIRED");

  private String value;

  FactorStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FactorStatus fromValue(String text) {
    for (FactorStatus b : FactorStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

