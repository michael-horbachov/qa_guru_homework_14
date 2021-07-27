package guru.qa.owner;

import guru.qa.owner.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class WebTest {

    private WebConfig config = ConfigFactory
            .create(WebConfig.class,System.getProperties());

    @Test
    @Tag("web")
    public void printWebConfigs() {
        System.out.println("Web browser: " + config.webBrowser());
        System.out.println("Web browser version: " + config.webBrowserVersion());
        System.out.println("Remote web driver: " + config.isRemote());
    }
}