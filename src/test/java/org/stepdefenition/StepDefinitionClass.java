package org.stepdefenition;

import org.utilites.BaseClass;
import org.utilites.Loginpojo;
import org.utilites.Loginpojo.LogInPojo;

import cucumber.api.java.en.*;

public class StepDefinitionClass extends BaseClass {

	@Given("user launch browser and enter valid url")
	public void user_launch_browser_and_enter_valid_url() {
		launchBrowser();
		url("https://www.stylight.co.uk/");

	}

	@Given("user maximize the window")
	public void user_maximize_the_window() {
		toMaximize();
	}

	@Then("user reached the valid page or not")
	public void user_reached_the_valid_page_or_not() {

	}

	@When("user click menu bar option and select clothing category")
	public void user_click_menu_bar_option_and_select_clothing_category() {
		 Loginpojo li=new Loginpojo();
		toClick(li.getNavigator());
	}
}
