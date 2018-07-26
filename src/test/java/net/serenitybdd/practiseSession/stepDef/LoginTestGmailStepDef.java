package net.serenitybdd.practiseSession.stepDef;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.practiseSession.model.LoginData;
import net.serenitybdd.practiseSession.model.LoginGmailData;
import net.serenitybdd.practiseSession.steps.LoginTestGmailSteps;
import net.serenitybdd.practiseSession.steps.LoginTestSteps;
import net.thucydides.core.annotations.Steps;

public class LoginTestGmailStepDef {
	LoginGmailData dp= new LoginGmailData();
	@Steps
	LoginTestGmailSteps LTG_steps;
	@Given("^I'am on gmail login page$")
	public void i_am_on_gmail_login_page() throws Exception {
	    LTG_steps.open();
	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_valid_and(String arg1, String arg2) throws Exception {
	    //LTG_steps.enterValidUNandPass(dp);
		dp.setAll(arg1, arg2);
		System.out.println("User & pwd:" + dp.getUserName() +dp.getPassword());
	}

	@Then("^I should login to my gmail account$")
	public void i_should_login_to_my_gmail_account() throws Exception {
		LTG_steps.enterValidUNandPass(dp);
		LTG_steps.loginGmailAccount();
	}
	@Before
	public void afterTest(){
		
		//LTG_steps.closeBrowser();
	}

}
