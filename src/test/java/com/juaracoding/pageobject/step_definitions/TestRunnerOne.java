package com.juaracoding.pageobject.step_definitions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//tags = untuk memilih run nomer berapa saja di file feature
@CucumberOptions(tags = "", 
				features = {"src/test/resources/features/1.LoginAccount.feature",
						"src/test/resources/features/2.CheckOut.feature"},
				glue = "com.juaracoding.pageobject.step_definitions",
				plugin = {"pretty","html:target/cucumber-TestCheckOut-reports.html"})
				
public class TestRunnerOne extends AbstractTestNGCucumberTests {
}


 

