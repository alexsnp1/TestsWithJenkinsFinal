package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

@BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1600x900";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
//        Configuration.holdBrowserOpen = true;
    Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
