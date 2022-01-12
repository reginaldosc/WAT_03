package br.web.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-report/cucumber.json"},
        features = "src/test/resources/br/web/automation/webFeatures")
public class RunWebTest {
    // Run This Cucumber Test Class to Run all the Web Automated Tests
}
