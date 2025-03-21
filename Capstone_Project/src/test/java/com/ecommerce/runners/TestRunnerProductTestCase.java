package com.ecommerce.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= {"src\\test\\resources\\Features\\Product.feature"}
,glue="com.ecommerce.stepDefination")

public class TestRunnerProductTestCase extends AbstractTestNGCucumberTests {

}
