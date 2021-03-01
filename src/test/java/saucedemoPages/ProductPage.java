package saucedemoPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {

    SelenideElement addToCart = $("#inventory_container > div > div:nth-child(1) > div.pricebar > button");
    SelenideElement addToCart1 = $("#inventory_container > div > div:nth-child(2) > div.pricebar > button");
    SelenideElement addToCart2 = $("#inventory_container > div > div:nth-child(3) > div.pricebar > button");
    SelenideElement addToCart3 = $("#inventory_container > div > div:nth-child(4) > div.pricebar > button");
    SelenideElement checkMyCart = $("#shopping_cart_container > a > svg > path");
    SelenideElement klickYourCart = $("#shopping_cart_container > a > svg > path");
    SelenideElement removeYourCart = $("#cart_contents_container > div > div.cart_list > div:nth-child(3) > div.cart_item_label > div.item_pricebar > button");
    SelenideElement removeYourCart1 = $("#cart_contents_container > div > div.cart_list > div:nth-child(4) > div.cart_item_label > div.item_pricebar > button");
    SelenideElement removeYourCart3 = $x("//*[@id=\"cart_contents_container\"]/div/div[1]/div[5]/div[2]/div[2]/button");
    SelenideElement removeYourCart4 = $x("//*[@id=\"cart_contents_container\"]/div/div[1]/div[6]/div[2]/div[2]/button");


    @Step("click the add to cart")
    public void setAddToCart() {
        addToCart.shouldBe(Condition.visible).click();
    }

    @Step("click the add to cart")
    public void clickTheAddToCart() {
        addToCart.shouldBe(Condition.visible).click();
        addToCart1.shouldBe(Condition.visible).click();
        addToCart2.shouldBe(Condition.visible).click();
        addToCart3.shouldBe(Condition.visible).click();
    }

    @Step("go to the my cart")
    public void CheckMyCart() {
        checkMyCart.shouldBe(Condition.visible).click();

    }

    @Step("click your cart")
    public void setKlickYourCart() {
        klickYourCart.shouldBe(Condition.visible).click();

    }

    @Step("remove your cart")
    public void setRemoveYourCart() {

        removeYourCart.shouldBe(Condition.visible).click();
        removeYourCart1.shouldBe(Condition.visible).click();
        removeYourCart3.shouldBe(Condition.visible).click();
        removeYourCart4.shouldBe(Condition.visible).click();
    }
}
