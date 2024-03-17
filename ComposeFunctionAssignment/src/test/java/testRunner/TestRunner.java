package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resource/features",
    glue = "steps",
    plugin="pretty")

public class TestRunner extends AbstractTestNGCucumberTests {

}
