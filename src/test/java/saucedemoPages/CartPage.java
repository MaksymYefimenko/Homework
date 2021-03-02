package saucedemoPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.name;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CartPage {

    SelenideElement klickYourCart = $("#shopping_cart_container > a > svg > path");
    ElementsCollection removeYourCart =$$(".btn_secondary.cart_button");
    SelenideElement continueShopping = $(".btn_secondary");
    SelenideElement returnToProductPage =$(By.id("root"));




    @Step("click your cart")
    public void setKlickYourCart() {
        klickYourCart.shouldBe(visible).click();

    }

    @Step("remove your cart")
    public void setRemoveYourCart() {
        removeYourCart.findBy(visible).click();
    }

    @Step("Klick continue shopping")
    public void setContinueShopping() {
        continueShopping.shouldBe(visible).click();
    }
    @Step("Return to product page")
    public void setReturnToProductPage() {
       returnToProductPage.shouldBe(visible).click();
    }


}
