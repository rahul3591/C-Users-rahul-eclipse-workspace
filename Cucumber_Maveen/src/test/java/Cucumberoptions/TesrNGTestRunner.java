package Cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue ="StepDefination", monochrome=true)

public class TesrNGTestRunner extends AbstractTestNGCucumberTests{

}
