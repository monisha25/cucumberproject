package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Features/lo.feature" ,glue ="Stepdefinition",
plugin = { "pretty","html:target/cucumber-reports.html","json:JSON_OUTPUT"} ,monochrome = true)
public class Runnerclass {

}
