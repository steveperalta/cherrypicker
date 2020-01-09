package com.oktaapi.model;



/**
 * Gets or Sets EmailType
 */
public enum EmailType {
  
  PRIMARY("PRIMARY"),
  
  SECONDARY("SECONDARY");

  private String value;

  EmailType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmailType fromValue(String text) {
    for (EmailType b : EmailType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

