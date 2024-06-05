package com.makemytripstepdefinition;

import com.makemytrippageexecution.makemytrippageexecution;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeMyTripStepdefinition extends makemytrippageexecution{
	
	@Given("Luanch the URL")
	public void luanch_the_url() {
		browserLaunch();
	}
	@When("Close the popup")
	public void close_the_popup() {
		Closepopup().click();
	}
	@When("Enter the From {string}")
	public void enter_the_from(String From_location) {
		Chennaisearch(From_location);
	}
	@When("Enter the To {string}")
	public void enter_the_to(String TO_location) {
		bengaluru(TO_location);
	    
	}
	@When("CLick the Search button")
	public void c_lick_the_search_button() {
		Search().submit();
	}
	@Then("Search for flights")
	public void search_for_flights() {
	 System.out.println("Succesfully gone to booking page");
	}

}
