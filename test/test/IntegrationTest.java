package test;

import org.junit.Test;
import play.libs.F.Callback;
import play.test.TestBrowser;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.HTMLUNIT;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.running;
import static play.test.Helpers.testServer;

/**
 * Runs a server with a fake in-memory database to test the system.
 */
public class IntegrationTest {

  /**
   * Check to see that both the index and page1 pages can be retrieved.
   */
  @Test
  public void test() {
    running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
      public void invoke(TestBrowser browser) {
        browser.goTo("http://localhost:3333");
        assertThat(browser.pageSource()).contains("Castle High");

        browser.goTo("http://localhost:3333/students");
        assertThat(browser.pageSource()).contains("Knights");

        browser.goTo("http://localhost:3333/faculty");
        assertThat(browser.pageSource()).contains("Chapter");

        browser.goTo("http://localhost:3333/alumni");
        assertThat(browser.pageSource()).contains("Alumni");

        browser.goTo("http://localhost:3333/contact");
        assertThat(browser.pageSource()).contains("HI");


      }
    });
  }

}
