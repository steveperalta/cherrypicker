package com.oktaapi.model;



/**
 * Gets or Sets EmailStatus
 */
public enum EmailStatus {
  
  VERIFIED("VERIFIED"),
  
  UNVERIFIED("UNVERIFIED");

  private String value;

  EmailStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmailStatus fromValue(String text) {
    for (EmailStatus b : EmailStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

