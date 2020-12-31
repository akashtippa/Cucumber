package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="Features",
		//features="C:\\JavaFrame\\Cucumber\\Features\\CucumberTags.feature",
		features= "C:\\JavaFrame\\Cucumber\\Features\\CucumberHooks.feature",
		glue="stepDefinitions",
		dryRun=false,	
		monochrome=true,
		strict=false,
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
		//tags= {"@SanityTest"}  //execute only sanity test
		//tags= {"@SanityTest,@RegressionTest"} //execute only scenario which comes under sanity OR regression
			
		//tags= {"@SanityTest","@EndtoEnd"} //this will execute comes under both Regression and Endto End
		//tags= {"@RegressionTest","@EndtoEnd"}
		
		tags= {"~@EndtoEndTest","~@SanityTest"} //it will ignore end to end testcases
		)
public class TestRunner {

}
	