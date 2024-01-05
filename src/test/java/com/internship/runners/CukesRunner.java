package com.internship.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"},
        features="src/test/resources/Features",
        glue="com/internship/step_definitions",
        dryRun = false,
        tags = "@admin"
)

public class CukesRunner {

}
