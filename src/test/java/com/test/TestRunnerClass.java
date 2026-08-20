package com.test;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\kanis\\OneDrive\\Documents\\Custom Office Templates\\CucumberMavenkani10AM\\src\\test\\resources\\Feature File",glue="com.step1",plugin= {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class TestRunnerClass {
	

}
