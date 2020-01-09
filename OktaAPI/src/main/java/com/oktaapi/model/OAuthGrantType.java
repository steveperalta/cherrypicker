package com.oktaapi.model;



/**
 * Gets or Sets OAuthGrantType
 */
public enum OAuthGrantType {
  
  AUTHORIZATION_CODE("authorization_code"),
  
  IMPLICIT("implicit"),
  
  PASSWORD("password"),
  
  REFRESH_TOKEN("refresh_token"),
  
  CLIENT_CREDENTIALS("client_credentials");

  private String value;

  OAuthGrantType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OAuthGrantType fromValue(String text) {
    for (OAuthGrantType b : OAuthGrantType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

