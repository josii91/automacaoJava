package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(

            plugin = {"pretty",
                    "html:target/report/cucumber.html",
                    "json:target/report/cucumber.json"
            },
            features = {"src/test/java/features"},
            glue = {"stepDefinitions"}// give the directory of stepDefinition

    )

    public class CukeRunner {
    }

