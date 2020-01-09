package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets FactorResultType
 */
public enum FactorResultType {
  
  SUCCESS("SUCCESS"),
  
  CHALLENGE("CHALLENGE"),
  
  WAITING("WAITING"),
  
  FAILED("FAILED"),
  
  REJECTED("REJECTED"),
  
  TIMEOUT("TIMEOUT"),
  
  TIME_WINDOW_EXCEEDED("TIME_WINDOW_EXCEEDED"),
  
  PASSCODE_REPLAYED("PASSCODE_REPLAYED"),
  
  ERROR("ERROR");

  private String value;

  FactorResultType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FactorResultType fromValue(String text) {
    for (FactorResultType b : FactorResultType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

