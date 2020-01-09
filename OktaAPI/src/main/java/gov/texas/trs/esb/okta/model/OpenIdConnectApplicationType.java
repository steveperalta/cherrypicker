package gov.texas.trs.esb.okta.model;



/**
 * Gets or Sets OpenIdConnectApplicationType
 */
public enum OpenIdConnectApplicationType {
  
  WEB("web"),
  
  NATIVE("native"),
  
  BROWSER("browser"),
  
  SERVICE("service");

  private String value;

  OpenIdConnectApplicationType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OpenIdConnectApplicationType fromValue(String text) {
    for (OpenIdConnectApplicationType b : OpenIdConnectApplicationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

