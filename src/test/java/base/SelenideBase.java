package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.ScreenShooter;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import utils.AllureProperties;

@Listeners({ScreenShooter.class})
public class SelenideBase {

    @BeforeClass(description = "Setting up the Selenide")
    public void setUp() {
        Configuration.baseUrl = "https://www.google.com";
        Configuration.reportsFolder = "selenide-reports";

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @AfterClass(description = "Shutting down the selenide and copping allure.properties to report folder")
    public void tearDown() {
        SelenideLogger.removeAllListeners();
        new AllureProperties()
                .setProperty("OS", System.getProperty("os.name"))
                .setProperty("Browser", Configuration.browser)
                .saveProps();
    }
}
