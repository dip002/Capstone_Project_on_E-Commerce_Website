package com.ecommerce.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src\\test\\resources\\Features\\Signup.feature"}
,glue="com.ecommerce.stepDefination")

public class TestRunnerSignUpLoginTestCase extends AbstractTestNGCucumberTests{

}
