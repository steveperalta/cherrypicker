package com.oktaapi.model;



/**
 * Gets or Sets LogSeverity
 */
public enum LogSeverity {
  
  DEBUG("DEBUG"),
  
  INFO("INFO"),
  
  WARN("WARN"),
  
  ERROR("ERROR");

  private String value;

  LogSeverity(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LogSeverity fromValue(String text) {
    for (LogSeverity b : LogSeverity.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

