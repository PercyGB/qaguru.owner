package tests;

import com.codeborne.selenide.Configuration;
import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class WebConfigTests {

    @Test
    void webConfigTest(){
        WebConfig webConfig = ConfigFactory
                .create(WebConfig.class, System.getProperties());

        System.out.println("browserName: " + webConfig.browserName());
        System.out.println("browserVersion: " + webConfig.browserVersion());
        System.out.println("isRemote: " + webConfig.isRemote());
    }
}