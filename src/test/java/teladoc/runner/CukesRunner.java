package teladoc.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "html:target/cucumber-report.html",// generates cucumber html report.
                    "rerun:target/rerun.txt", //store failed scenario names into rerun.txt file
                    "json:target/cucumber.json" //generate json execution report to be used for html report
            },
            features = "src/test/resources/features",
            glue = "teladoc/step_defs",
            dryRun = false,    //false= run the test. true = check for missing steps
            tags = ""
    )
    public class CukesRunner {
    }
