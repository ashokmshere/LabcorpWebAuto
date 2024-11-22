package com.labcorp.testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@regTest", features = "src/test/resources/labcorp-feature.feature", glue = "com.labcop.stepDefinitions", plugin = {
		"pretty", "json:target/json-cucumber-reports/cukejson.json",
		"junit:target/junit-cucumber-reports/cukejunit.xml", "html:target/cucumber.html" })
public class TestRunner {
}