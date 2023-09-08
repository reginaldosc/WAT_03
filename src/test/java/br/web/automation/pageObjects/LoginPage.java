package br.web.automation.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePOM{

    @FindBy(id = "user-name")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "login-button")
    public WebElement loginButton;


    public void fillLogin(String user, String pwd) {
        // Check if the element is presented
        Assert.assertTrue(usernameInput.isDisplayed());
        // Fill the username field
        usernameInput.sendKeys(user);

        // Check if the element is presented
        Assert.assertTrue(passwordInput.isDisplayed());
        // Fill the Search Box
        passwordInput.sendKeys(pwd);
    }

    public void login() {
        loginButton.click();
    }
}
