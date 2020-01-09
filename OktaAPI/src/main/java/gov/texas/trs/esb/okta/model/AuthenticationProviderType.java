package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets AuthenticationProviderType
 */
public enum AuthenticationProviderType {
  
  ACTIVE_DIRECTORY("ACTIVE_DIRECTORY"),
  
  FEDERATION("FEDERATION"),
  
  LDAP("LDAP"),
  
  OKTA("OKTA"),
  
  SOCIAL("SOCIAL"),
  
  IMPORT("IMPORT");

  private String value;

  AuthenticationProviderType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AuthenticationProviderType fromValue(String text) {
    for (AuthenticationProviderType b : AuthenticationProviderType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

