package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets PolicyType
 */
public enum PolicyType {
  
  OAUTH_AUTHORIZATION_POLICY("OAUTH_AUTHORIZATION_POLICY"),
  
  OKTA_SIGN_ON("OKTA_SIGN_ON"),
  
  PASSWORD("PASSWORD");

  private String value;

  PolicyType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PolicyType fromValue(String text) {
    for (PolicyType b : PolicyType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

