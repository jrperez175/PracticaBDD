package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="projectFeatures", glue="stepDefinitions") //definimos donde esta el lenguaje gherkin y el codigo pegado
public class loginRunner {
	
}
