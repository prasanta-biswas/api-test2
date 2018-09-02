package io.apitest.example;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

/**
 * Created by prasantabiswas on 01/09/18.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        strict = true,
        glue = "io.apitest.example.stepsdefinition",
        plugin = {"pretty",
                "html:target/reports/cucumber/html",
                "json:target/cucumber.json",
                "usage:target/usage.jsonx",
                "junit:target/junit.xml"}
)
public class Runner {
}
