package br.web.automation.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePOM{

    @FindBy(id = "inventory_container")
    public WebElement inventoryContainer;

    public void checkInventoryPage() {
        // Check if the element is presented
        Assert.assertTrue(inventoryContainer.isDisplayed());
    }
}
