package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "/Users/tatiana/Desktop/PROJECTS/OTUS/OTUS_07_Homework_by_Tatiana_Khen/Features/",
glue = {"stepDefinitions", "support"},
        monochrome = true

)
public class TestRunner {
}
