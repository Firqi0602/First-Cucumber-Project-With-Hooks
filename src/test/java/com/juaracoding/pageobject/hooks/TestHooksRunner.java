package com.juaracoding.pageobject.hooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags="",
				features= "src/test/resources/features/SampleHooks.feature",
				glue = "com.juaracoding.pageobject.hooks",
				plugin = {"pretty","html:target/cucumber-TestCheckOut-reports.html"})	
public class TestHooksRunner extends AbstractTestNGCucumberTests {
	
}
