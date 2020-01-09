package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets SessionIdentityProviderType
 */
public enum SessionIdentityProviderType {
  
  ACTIVE_DIRECTORY("ACTIVE_DIRECTORY"),
  
  LDAP("LDAP"),
  
  OKTA("OKTA"),
  
  FEDERATION("FEDERATION"),
  
  SOCIAL("SOCIAL");

  private String value;

  SessionIdentityProviderType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SessionIdentityProviderType fromValue(String text) {
    for (SessionIdentityProviderType b : SessionIdentityProviderType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

