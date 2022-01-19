package br.web.automation.pageObjects;

import br.web.automation.utilityClasses.WebUtility;
import org.openqa.selenium.WebDriver;

public class ResultPage extends BasePOM{


    public ResultPage() {

    }

    public void checkPageTitle(String title) {
        WebUtility.validateTitlePage(title);
    }
}
