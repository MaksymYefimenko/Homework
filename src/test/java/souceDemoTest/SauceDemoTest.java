package souceDemoTest;

import base.SelenideBase;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;
import saucedemoPages.LoginPage;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class SauceDemoTest extends SelenideBase {
    @Test()
    @Severity(SeverityLevel.BLOCKER)
    @Description("Chekset user login in to the site")
    public void test1() {
        open("");
        new LoginPage().setUserName("standard_user").setPassword("secret_sauce").clickTheLogin();
        $x("//*[@id=\"header_container\"]/div[2]/div").should(Condition.visible);
    }
}

