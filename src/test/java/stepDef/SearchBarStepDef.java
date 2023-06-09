package stepDef;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class SearchBarStepDef {
    SetUp setUp;

    public SearchBarStepDef(SetUp setUp){
        this.setUp=setUp;
    }

    @Then("user sees that the logo is present")
    public void i_see_that_the_logo_is_present() {
        Assert.assertTrue(setUp.driver.findElement(By.cssSelector("img[src='https://magento.softwaretestingboard.com/pub/static/version1678540400/frontend/Magento/luma/en_US/images/logo.svg']")).isDisplayed());

    }
    @Then("i type  product name {string} in the search bar")
    public void i_type_product_name_in_the_search_bar(String text) {
        setUp.driver.findElement(By.cssSelector("#search")).sendKeys(text, Keys.ENTER);
    }
    @Then("i should get the search result {string}")
    public void i_should_get_the_search_result(String searchResult) {
        Assert.assertEquals(setUp.driver.findElement(By.cssSelector(".base")).getText(),searchResult);

    }

}
