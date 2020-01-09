package com.oktaapi.model;



/**
 * Gets or Sets LogCredentialProvider
 */
public enum LogCredentialProvider {
  
  OKTA_AUTHENTICATION_PROVIDER("OKTA_AUTHENTICATION_PROVIDER"),
  
  RSA("RSA"),
  
  SYMANTEC("SYMANTEC"),
  
  GOOGLE("GOOGLE"),
  
  DUO("DUO"),
  
  YUBIKEY("YUBIKEY");

  private String value;

  LogCredentialProvider(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LogCredentialProvider fromValue(String text) {
    for (LogCredentialProvider b : LogCredentialProvider.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

