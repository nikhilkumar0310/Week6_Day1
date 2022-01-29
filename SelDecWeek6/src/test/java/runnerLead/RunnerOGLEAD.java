package runnerLead;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/feature/CrateOGLEADS.feature", glue="stepsDefinition", monochrome = true, snippets = SnippetType.CAMELCASE, publish = true, dryRun = false)
public class RunnerOGLEAD extends AbstractTestNGCucumberTests{

}
