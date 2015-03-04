package voot.provider;

import java.util.List;

import voot.valueobject.Group;

public interface Provider {

  /**
   * Tells us if it is worthwhile calling this client
   * @param schacHomeOrganization the end-user's schacHomeOrg
   * @return
   */
  boolean shouldBeQueriedFor(String schacHomeOrganization);

  List<Group> getMemberships(String uid);

  static class Configuration{

    public Configuration(String url, Credentials credentials, Integer timeOutMillis, String schacHomeOrganisation) {
      this.url = url;
      this.credentials = credentials;
      this.timeOutMillis = timeOutMillis;
      this.schacHomeOrganisation = schacHomeOrganisation;
    }

    public static class Credentials {
      final String username;
      final String password;

      public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
      }
    }

    public final String url;
    public final Credentials credentials;
    public final Integer timeOutMillis;
    public final String schacHomeOrganisation;

  }
}
