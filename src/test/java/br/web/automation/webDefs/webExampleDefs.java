package br.web.automation.webDefs;

import br.web.automation.pageObjects.HomePage;
import br.web.automation.pageObjects.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import br.web.automation.utilityClasses.WebUtility;

public class webExampleDefs {

    // Basic Required Variables
    private final WebDriver driver = WebUtility.getDriver();
    private HomePage homePage = new HomePage();
    private ResultPage resultPage = new ResultPage();

    @Given("user is in the {string} Website")
    public void userIsInTheExampleWebsite(String site) {
        // Go to the Example Website
        driver.get("http://www.google.com");
    }

    @When("user fills a search box with {string} Text")
    public void userFillsASearchBoxWith(String text) {
        homePage.fillTheSearchBox(text);
    }

    @And("user submits the Search")
    public void userClicksOnSearchButton() {
        homePage.clickSeach();
    }

    @Then("user is able to see the result {string} Page")
    public void userIsAbleToSeeTheResults(String page) {
        resultPage.checkPageTitle(page);
    }
}