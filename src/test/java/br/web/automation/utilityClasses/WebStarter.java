package br.web.automation.utilityClasses;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class WebStarter {

    // Cucumber Methods
    @Before
    public void openWebBrowser() {

        // Starts the Web Browser
        WebUtility.startWebBrowser(WebUtility.getValue("web.browser"));
    }

    @After
    public void closeWebBrowser(Scenario scenario) {

        if (scenario.isFailed()) {
            WebUtility.takeScreenshot(scenario.getId());
        }

        // Close the Web Browser
        WebUtility.getDriver().quit();
    }

}
