package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets OAuthResponseType
 */
public enum OAuthResponseType {
  
  CODE("code"),
  
  TOKEN("token"),
  
  ID_TOKEN("id_token");

  private String value;

  OAuthResponseType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OAuthResponseType fromValue(String text) {
    for (OAuthResponseType b : OAuthResponseType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

