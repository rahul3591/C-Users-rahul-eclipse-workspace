package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="StepDefination",monochrome=true, tags="@SmokeTests",
plugin= {"pretty", "html:target/cumcumber.html" , "json:target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

	
}
