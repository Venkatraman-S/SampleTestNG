package com.makemytriprunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\91834\\eclipse-workspace\\New\\MakeMyTrip\\src\\test\\java\\feature\\makemytrip\\BookingPage.feature",
glue= "com.makemytripstepdefinition",
dryRun = false)


public class MakeMyTripRunner {

}
