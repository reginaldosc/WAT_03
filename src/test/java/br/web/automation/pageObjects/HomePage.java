package br.web.automation.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePOM{

    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(name = "btnK")
    public WebElement searchButton;


    public void fillTheSearchBox(String text) {
        // Check if thew element is presented
        Assert.assertTrue(searchBox.isDisplayed());

        // Fill the Search Box
        searchBox.sendKeys(text);

    }

    public void clickSeach() {
        // Click on button <Google Search>
        searchButton.click();
    }
}
