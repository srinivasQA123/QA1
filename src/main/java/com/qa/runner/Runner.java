package com.qa.runner;

import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue= {"StepDefination"})


public class Runner {

}
