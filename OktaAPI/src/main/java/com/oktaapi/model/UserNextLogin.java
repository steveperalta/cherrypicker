package com.oktaapi.model;



/**
 * Gets or Sets UserNextLogin
 */
public enum UserNextLogin {
  
  CHANGEPASSWORD("changePassword");

  private String value;

  UserNextLogin(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserNextLogin fromValue(String text) {
    for (UserNextLogin b : UserNextLogin.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

