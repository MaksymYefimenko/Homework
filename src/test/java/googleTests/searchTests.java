package googleTests;

import base.SelenideBase;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;

import static com.codeborne.selenide.Selenide.open;

@Test(description = "Checks that search is working")
public class searchTests extends SelenideBase {
    @Test
    public void test1() {
        open("/");
        new GoogleSearchPage().setSearchQuery("Allure").clickSearch();

        Assert.assertTrue(Selenide.title().contains("Allure"));
    }

}
