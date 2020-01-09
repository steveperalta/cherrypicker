package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets LogCredentialType
 */
public enum LogCredentialType {
  
  OTP("OTP"),
  
  SMS("SMS"),
  
  PASSWORD("PASSWORD"),
  
  ASSERTION("ASSERTION"),
  
  IWA("IWA"),
  
  EMAIL("EMAIL"),
  
  OAUTH2("OAUTH2"),
  
  JWT("JWT");

  private String value;

  LogCredentialType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LogCredentialType fromValue(String text) {
    for (LogCredentialType b : LogCredentialType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

