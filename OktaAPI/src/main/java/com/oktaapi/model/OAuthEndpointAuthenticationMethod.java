package com.oktaapi.model;



/**
 * Gets or Sets OAuthEndpointAuthenticationMethod
 */
public enum OAuthEndpointAuthenticationMethod {
  
  NONE("none"),
  
  CLIENT_SECRET_POST("client_secret_post"),
  
  CLIENT_SECRET_BASIC("client_secret_basic"),
  
  CLIENT_SECRET_JWT("client_secret_jwt");

  private String value;

  OAuthEndpointAuthenticationMethod(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OAuthEndpointAuthenticationMethod fromValue(String text) {
    for (OAuthEndpointAuthenticationMethod b : OAuthEndpointAuthenticationMethod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

