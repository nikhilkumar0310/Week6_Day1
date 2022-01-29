package runnerLead;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/CreateLead.feature", glue="stepsDefinition", monochrome = true, publish = true)
public class RunnerLead extends AbstractTestNGCucumberTests{

	
}
