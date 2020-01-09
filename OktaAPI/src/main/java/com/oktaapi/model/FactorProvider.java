package com.oktaapi.model;



/**
 * Gets or Sets FactorProvider
 */
public enum FactorProvider {
  
  OKTA("OKTA"),
  
  RSA("RSA"),
  
  GOOGLE("GOOGLE"),
  
  SYMANTEC("SYMANTEC"),
  
  DUO("DUO"),
  
  YUBICO("YUBICO"),
  
  FIDO("FIDO");

  private String value;

  FactorProvider(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FactorProvider fromValue(String text) {
    for (FactorProvider b : FactorProvider.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

