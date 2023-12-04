package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = true,
        features = "C:\\Projects\\Alexandru_Boghean_Project\\src\\test\\java\\features",
        glue = "stepdefinition",
        plugin = {"pretty", "html:target/RegressionTests.html"},
        publish = true
)
public class RegressionTestsRunner {
}
