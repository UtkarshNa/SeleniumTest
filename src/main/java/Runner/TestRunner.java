package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\hp\\eclipse-workspace\\FreeCRMBDDFramework\\src\\main\\java\\Features\\login.feature",
		glue={"stepDefination"}, //package namewhere we have login step defination class
		format= {"pretty","html:test-outout"},// for good output...can see which file failed
		//dryRun=true
		monochrome=true,
		strict=true
		)


public class TestRunner {
	

}
