package guru.qa.owner.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${webDriverMode}.properties",
        "classpath:local.properties"})
public interface WebConfig extends Config {

    @Key("web.browser")
    String webBrowser();

    @Key("web.browser.version")
    String webBrowserVersion();

    @Key("web.driver.remote")
    boolean isRemote();
}