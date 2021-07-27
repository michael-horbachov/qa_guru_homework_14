package guru.qa.owner.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:~/tmp/api.properties",
        "classpath:api.properties"})
public interface ApiConfig extends Config {

    @Key("base.url")
    String getBaseUrl();

    @Key("token")
    String getToken();
}