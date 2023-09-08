package br.web.automation.webDefs;

import br.web.automation.pageObjects.LoginPage;
import br.web.automation.pageObjects.InventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import br.web.automation.utilityClasses.WebUtility;

public class webExampleDefs {

    // Basic Required Variables
    private final WebDriver driver = WebUtility.getDriver();
    private LoginPage loginPage = new LoginPage();
    private InventoryPage inventoryPage = new InventoryPage();

    @Given("user is in the {string} Website")
    public void userIsInTheExampleWebsite(String site) {
        // Go to the Example Website
        driver.get(site);
    }

    @When("user fills username and password with {string} and {string}")
    public void userFillsUsernameAndPassword(String username, String password) {
        loginPage.fillLogin(username, password);
    }

    @And("user submits the login")
    public void userSubmitsTheLogin() {
        loginPage.login();
    }

    @Then("user is redirected to {string} Page")
    public void userIsAbleToSeePage(String page) {
        if (page.equals("inventory")) {
            inventoryPage.checkInventoryPage();
        }
    }

}