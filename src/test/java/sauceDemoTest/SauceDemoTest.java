package sauceDemoTest;

import base.SelenideBase;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemoPages.CartPage;
import saucedemoPages.LoginPage;
import saucedemoPages.ProductPage;

import static com.codeborne.selenide.Selenide.*;


public class SauceDemoTest extends SelenideBase {

    @Test()
    @Severity(SeverityLevel.BLOCKER)
    @Description("Chekset user login in to the site")
    public void test1() {
        open("");
        new LoginPage().setUserName("standard_user").setPassword("secret_sauce").clickTheLogin();
        $x("//*[@id=\"header_container\"]/div[2]/div").should(Condition.visible);
    }

    @Test()
    @Severity(SeverityLevel.CRITICAL)
    @Description("Chekset button ADD TO CART")
    public void test2() {
        open("//www.saucedemo.com/inventory.html");
        new ProductPage().clickTheAddToCart();
    }

    @Test()
    @Severity(SeverityLevel.CRITICAL)
    @Description("Chekset button CART")
    public void test3() {
        SelenideElement checkMyCart;
        new ProductPage().CheckMyCart();

    }

    @Test()
    @Severity(SeverityLevel.CRITICAL)
    @Description("Klick your cart")
    public void test4() {
        SelenideElement klickYourCart;
        new CartPage().setKlickYourCart();

    }

    @Test()
    @Severity(SeverityLevel.CRITICAL)
    @Description("Klick your cart")
    public void test5() {
        SelenideElement removeYourCart;
        new CartPage().setRemoveYourCart();

    }
    @Test()
    @Severity(SeverityLevel.NORMAL)
    @Description("Klick continue shopping")
    public void test6() {
        SelenideElement continueShopping;
        new CartPage().setContinueShopping();

    }


    @Test()
    @Severity(SeverityLevel.NORMAL)
    @Description("Return to product page ")
    public void test7() {
        SelenideElement returnToProductPage;
        new CartPage().setReturnToProductPage();

    }
}

