package net.serenitybdd.practiseSession.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.practiseSession.steps.LoginTestGuru99Steps;
import net.thucydides.core.annotations.Steps;

public class LoginGuru99StepDef {
	@Steps
	LoginTestGuru99Steps LTG_steps;
	@Given("^User navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Exception {
		 LTG_steps.open(); 
	}


	@When("^User submit username '(.*)' and password '(.*)'$")
	public void i_submit_username_and_password(String uname, String pass) throws Exception {
		    LTG_steps.submitUnameandPass(uname,pass);
	}
	
	@Then("^User should be logged into Home Page$")
	public void i_should_be_logged_in() throws Exception {
	   LTG_steps.logintoGuru99Accnt();
	}

	@Given("^User is already on the home page$")
	public void user_is_already_on_the_home_page() throws Exception {
	   LTG_steps.userIsOnHomePage();
	}

	//Begin of Telecom Project
	@When("^User clicks on Telecom Project link$")
	public void user_clicks_on_Telecom_Project_link() throws Exception {
	    LTG_steps.userClicksOnTelecomProjLink();
	}

	@Then("^Login page for Telecom Project gets displayed$")
	public void login_page_for_Telecom_gets_displayed() throws Exception {
		LTG_steps.TelecomProjectLoginPagedisplayed();
	    
	}

	@Then("^complete registration if you are a new user$")
	public void complete_registration_if_you_are_a_newuser() throws Exception {
		LTG_steps.completeRegistration();
	   
	}

	@Then("^enter the login credentials to login to Telecom Project website$")
	public void enter_the_login_credentials_to_login_to_TelecomProject() throws Exception {
	   
	}

    //End of Telecom Project
	
	//Begin of Bank Project
	@When("^User clicks on Bank Project link$")
	public void user_clicks_on_Bank_Project_link() throws Exception {
	   LTG_steps.userClicksOnBankProjLink(); 
	}


	@Then("^Login page for Bank gets displayed$")
	public void login_page_for_Bank_gets_displayed() throws Exception {
	    LTG_steps.verfiyBankPageDisplayed();
	}

	@Then("^User submits bankusername \"([^\"]*)\" and bankpassword \"([^\"]*)\"$")
	public void user_submits_bankusername_and_bankpassword(String uname, String pass) throws Exception {
	 	   LTG_steps.loginCredentialsBankPage(uname,pass);
	}


	@Then("^User should be able to login to BankProject Page$")
	public void user_should_be_able_to_login_to_BankProject_Page() throws Exception {
	 
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Exception {
	  LTG_steps.close();
	}
//
//	    //End of Bank Project
}
