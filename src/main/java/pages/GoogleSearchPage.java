package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchPage extends BasePage{
    SelenideElement searchInput = $("[name=\"q\"]");
    SelenideElement searchButton = $("[name=\"btnK\"]");

    @Step("Set search query: {query}")
    public GoogleSearchPage setSearchQuery(String query) {
        searchInput.sendKeys(query);
        return this;
    }

    @Step("Click the Search button")
    public GoogleSearchPage clickSearch() {
        searchButton.shouldBe(Condition.visible).click();
        return this;
    }
}
