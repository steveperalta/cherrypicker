package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets ApplicationCredentialsScheme
 */
public enum ApplicationCredentialsScheme {
  
  SHARED_USERNAME_AND_PASSWORD("SHARED_USERNAME_AND_PASSWORD"),
  
  EXTERNAL_PASSWORD_SYNC("EXTERNAL_PASSWORD_SYNC"),
  
  EDIT_USERNAME_AND_PASSWORD("EDIT_USERNAME_AND_PASSWORD"),
  
  EDIT_PASSWORD_ONLY("EDIT_PASSWORD_ONLY"),
  
  ADMIN_SETS_CREDENTIALS("ADMIN_SETS_CREDENTIALS");

  private String value;

  ApplicationCredentialsScheme(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApplicationCredentialsScheme fromValue(String text) {
    for (ApplicationCredentialsScheme b : ApplicationCredentialsScheme.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

