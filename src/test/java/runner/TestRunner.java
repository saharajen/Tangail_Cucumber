package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"step_definitions"},
        plugin = {"pretty", "summary", "json:target/cucumber.json"}
)
public class TestRunner {
}

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/resources/Features",
//        glue = {"step_definitions"},
//        plugin = {"pretty", "summary", "html:target/CucumberReports/reports.html"},
//        publish = true
//)

//With tags
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/resources/Features",
//        glue = {"step_definitions"},
//        plugin = {"pretty", "summary"},
//        tags = "@positive_test or negative_test"
//
//)


