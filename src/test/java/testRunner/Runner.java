package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features="src/test/resources/Feature/",
    glue="stepDefinition",
    //dryRun=false,
    plugin={"pretty","json:target/cucumber-reports/cucumber.json",
            "junit:target/cucumber-reports/cucumber.xml",
            "html:target/cucumber-reports.html"},
    tags="@valid"
)

public class Runner {

}
