package westpac.stepdefs;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class) 
	@CucumberOptions(
			
			monochrome=true,
			features= {"src/test/resources/westpac/featurefile/"},
			tags= {"@scenario1, @scenario2, @scenario3, @scenario4"},
			//glue = {"westpac/stepdefs/"},
			
			plugin = {"pretty",
					 "html:target/cucumber-htmlreport",
					 "json:target/cucumber-report.json",
					 "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
					 }
			
			
			)

public class runnerTest {
		

	
}
