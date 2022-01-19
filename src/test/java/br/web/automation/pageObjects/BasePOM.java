package br.web.automation.pageObjects;

import br.web.automation.utilityClasses.WebUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePOM {

    private final WebDriver driver;
    private final WebDriverWait waitVar;

    public BasePOM() {
        this.driver = WebUtility.getDriver();

        waitVar = WebUtility.getWait();
        PageFactory.initElements(driver, this);

    }
}
