package RunnerClass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinition",dryRun=false,plugin= {"pretty",
		"html:target\\Reports", "json:target\\Reports\\output.json",
		"junit:target\\Reports\\output.xml","rerun:Rerun\\Failedcase.txt"}, tags = { "@sanity" })

public class RunnerClass1 {
	
	@AfterClass
	public static void jvmReport() {
		JvmReport.generateJumpReport(System.getProperty("user.dir")+"\\target\\Reports\\output.json");

	}

}







