package voot;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.UUID;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;


@RunWith(SpringRunner.class)
@SpringBootTest(
  webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
  value = {"externalProviders.config.path=classpath:/testExternalProviders.yml", "authz.checkToken.endpoint.url=http://localhost:12121/oauth/check_token", "checkToken.cache=false"}
)
public class VootAuthzApiIntegrationTest extends VootOidcApiIntegrationTest {

  private static final String accessToken = UUID.randomUUID().toString();

  @Override
  protected void stubOAuthCheckTokenUser() throws IOException {
    doStubOAuthCheckToken("json/authz/check_token.success.json");
  }

  @Override
  protected void stubOAuthCheckTokenClientCredentials() throws IOException {
    doStubOAuthCheckToken("json/authz/check_token.client_credentials.json");
  }

  @Override
  protected void stubOAuthCheckTokenMissingScope() throws IOException {
    doStubOAuthCheckToken("json/authz/check_token.missing_scope.json");
  }

  protected void doStubOAuthCheckToken(String path) throws IOException {
    InputStream inputStream = new ClassPathResource(path).getInputStream();
    String json = StreamUtils.copyToString(inputStream, Charset.forName("UTF-8"));
    authorizationServerMock.stubFor(post(urlMatching("/oauth/check_token")).willReturn(
      aResponse().
        withStatus(200).
        withHeader("Content-type", "application/json").
        withBody(json)
    ));
  }

  @Override
  protected String getAccessToken() {
    return accessToken;
  }

}
