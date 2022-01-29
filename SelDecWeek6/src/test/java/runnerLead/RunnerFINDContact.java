package runnerLead;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/feature/findContact.feature", glue="stepsDefinition", monochrome = true, snippets = SnippetType.CAMELCASE, publish = true, dryRun = false)
public class RunnerFINDContact extends AbstractTestNGCucumberTests{

}
