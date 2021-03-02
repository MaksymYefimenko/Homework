package saucedemoPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class ProductPage {
    ElementsCollection addToCart =$$(".btn_primary.btn_inventory");
    SelenideElement checkMyCart = $("#shopping_cart_container > a > svg > path");


    @Step("click the add to cart")
    public void setAddToCart() {
        addToCart.findBy(visible).click();
    }

    @Step("click the add to cart")
    public void clickTheAddToCart() {
        addToCart.findBy(visible).click();
    }

    @Step("go to the my cart")
    public void CheckMyCart() {
        checkMyCart.shouldBe(visible).click();

    }


}
