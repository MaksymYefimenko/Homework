package saucedemoPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    SelenideElement loginImput = $("#user-name");
    SelenideElement passwordImput = $("#password");
    SelenideElement loginButton = $("#login-button");

    @Step("Setting username:{username}")
    public LoginPage setUserName(String username) {
        loginImput.shouldBe(Condition.visible).sendKeys(username);
        return this;
    }
    @Step("Setting password ")
    public LoginPage setPassword(String password) {
        passwordImput.shouldBe(Condition.visible).sendKeys(password);
        return this;
    }

    @Step("click the loginButton")
    public void clickTheLogin(){
        loginButton.shouldBe(Condition.visible).click();
    }


}