package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\feauturefile",glue= "org.stepdefenition",dryRun = false ,monochrome=true)
public class Testrunnerclass {
  
}
