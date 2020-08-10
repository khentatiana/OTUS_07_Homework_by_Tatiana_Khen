package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchPage {

    WebDriver driver;

    @Given("I launch browser")
    public void i_launch_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @When("I open OurProject Search Page")
    public void i_open_our_project_search_page() {
        driver.get("https://www.google.com/");
    }

    @When("I input keyword in the search field")
    public void i_input_keyword_in_the_search_field() {
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Selenium");
        searchField.submit();
    }

    @Then("I verify search results")
    public void i_verify_search_results() {
        String keyWord = "Selenium";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String searchFieldXpath = "//div[@class='a4bIc']//input[@name='q']";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(searchFieldXpath)));
        String actualValue = driver.findElement(By.xpath(searchFieldXpath)).getAttribute("value");
       System.out.println("===========" + actualValue);
        Assert.assertEquals(actualValue, keyWord);
       }

    @Then("I close Search Page")
    public void i_close_search_page() {
        driver.quit();
    }

}
