package com.oktaapi.model;



/**
 * Gets or Sets SessionAuthenticationMethod
 */
public enum SessionAuthenticationMethod {
  
  PWD("pwd"),
  
  SWK("swk"),
  
  HWK("hwk"),
  
  OTP("otp"),
  
  SMS("sms"),
  
  TEL("tel"),
  
  GEO("geo"),
  
  FPT("fpt"),
  
  KBA("kba"),
  
  MFA("mfa");

  private String value;

  SessionAuthenticationMethod(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SessionAuthenticationMethod fromValue(String text) {
    for (SessionAuthenticationMethod b : SessionAuthenticationMethod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

