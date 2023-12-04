package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Projects\\Alexandru_Boghean_Project\\src\\test\\java\\features",
        glue = "stepdefinition",
        tags="@Positive",
        plugin = {"pretty","html:target/PositiveTests.html"}

)
public class PositiveTestsRunner {
}