package com.oktaapi.model;



/**
 * Gets or Sets FactorType
 */
public enum FactorType {
  
  PUSH("push"),
  
  SMS("sms"),
  
  CALL("call"),
  
  TOKEN("token"),
  
  TOKEN_SOFTWARE_TOTP("token:software:totp"),
  
  TOKEN_HARDWARE("token:hardware"),
  
  QUESTION("question"),
  
  WEB("web"),
  
  EMAIL("email"),
  
  U2F("u2f"),
  
  WEBAUTHN("webauthn"),
  
  TOKEN_SOFTWARE("token:software"),
  
  CUSTOM("custom");

  private String value;

  FactorType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FactorType fromValue(String text) {
    for (FactorType b : FactorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

