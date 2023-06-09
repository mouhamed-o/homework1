package fr.ledger.homework1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {
    		"pretty",
    		"html:target/homework-reports"
    },
    glue= {
    		"fr.ledger.homework1.stepsDefinitions"
    },
    features = "src/test/resources/features"
)
public class CucumberTestSuite {

}
