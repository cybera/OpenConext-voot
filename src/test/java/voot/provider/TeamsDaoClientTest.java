package voot.provider;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import voot.VootServiceApplication;
import voot.valueobject.Group;
import voot.valueobject.Membership;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = VootServiceApplication.class)
@WebIntegrationTest(value = "flyway.enabled=true")
public class TeamsDaoClientTest {

  private TeamsDaoClient subject;

  @Autowired
  @Qualifier("teamsDataSource")
  private DataSource dataSource;

  @Before
  public void setUp() throws Exception {
    subject = new TeamsDaoClient(dataSource);
  }

  @Test
  public void testLinkedExternalGroups() throws Exception {
    List<Group> groups = subject.linkedExternalGroups("nl:surfnet:diensten:test123","nl:surfnet:diensten:bazen");
    assertEquals(Arrays.asList("urn:collab:group:example.org:name1", "urn:collab:group:example.org:name2", "urn:collab:group:example.org:name3"),
      groups.stream().map(group -> group.id).collect(toList()));
  }

  @Test
  public void testLinkedGrouperGroupIds() throws Exception {
    List<String> ids = subject.linkedGrouperGroupIds("urn:collab:group:example.org:name1", "urn:collab:group:example.org:name3", "bogus");
    assertEquals(Arrays.asList("nl:surfnet:diensten:bazen", "nl:surfnet:diensten:test123"), ids);
  }
}
