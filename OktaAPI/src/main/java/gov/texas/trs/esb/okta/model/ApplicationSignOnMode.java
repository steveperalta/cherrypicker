package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets ApplicationSignOnMode
 */
public enum ApplicationSignOnMode {
  
  BOOKMARK("BOOKMARK"),
  
  BASIC_AUTH("BASIC_AUTH"),
  
  BROWSER_PLUGIN("BROWSER_PLUGIN"),
  
  SECURE_PASSWORD_STORE("SECURE_PASSWORD_STORE"),
  
  AUTO_LOGIN("AUTO_LOGIN"),
  
  WS_FEDERATION("WS_FEDERATION"),
  
  SAML_2_0("SAML_2_0"),
  
  OPENID_CONNECT("OPENID_CONNECT"),
  
  SAML_1_1("SAML_1_1");

  private String value;

  ApplicationSignOnMode(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApplicationSignOnMode fromValue(String text) {
    for (ApplicationSignOnMode b : ApplicationSignOnMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

