package com.oktaapi.model;



/**
 * Gets or Sets LogAuthenticationProvider
 */
public enum LogAuthenticationProvider {
  
  OKTA_AUTHENTICATION_PROVIDER("OKTA_AUTHENTICATION_PROVIDER"),
  
  ACTIVE_DIRECTORY("ACTIVE_DIRECTORY"),
  
  LDAP("LDAP"),
  
  FEDERATION("FEDERATION"),
  
  SOCIAL("SOCIAL"),
  
  FACTOR_PROVIDER("FACTOR_PROVIDER");

  private String value;

  LogAuthenticationProvider(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LogAuthenticationProvider fromValue(String text) {
    for (LogAuthenticationProvider b : LogAuthenticationProvider.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

