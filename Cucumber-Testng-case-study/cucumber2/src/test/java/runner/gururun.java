package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/login/gurulogin.feature"},glue= {"defination"},tags="@PositiveTesting")
public class gururun extends AbstractTestNGCucumberTests{
	
	
	
	

}
