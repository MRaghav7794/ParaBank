package runnerPackage;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/resources/Features/", glue= "stepdef",
plugin = {"pretty","html:target/test-output.html","rerun:target/rerun.txt"},
monochrome=true,
dryRun=true)

public class CreateCustomer 
{

}
