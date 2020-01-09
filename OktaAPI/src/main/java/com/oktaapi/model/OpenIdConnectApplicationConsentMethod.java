package com.oktaapi.model;



/**
 * Gets or Sets OpenIdConnectApplicationConsentMethod
 */
public enum OpenIdConnectApplicationConsentMethod {
  
  REQUIRED("REQUIRED"),
  
  TRUSTED("TRUSTED");

  private String value;

  OpenIdConnectApplicationConsentMethod(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OpenIdConnectApplicationConsentMethod fromValue(String text) {
    for (OpenIdConnectApplicationConsentMethod b : OpenIdConnectApplicationConsentMethod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

