package guru.qa.owner;

import guru.qa.owner.config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ApiTest {

    private ApiConfig config = ConfigFactory
            .create(ApiConfig.class, System.getProperties());

    @Test
    @Tag("api")
    public void printApiConfigs() {
        System.out.println("Base URL: " + config.getBaseUrl());
        System.out.println("Token: " + config.getToken());
    }
}