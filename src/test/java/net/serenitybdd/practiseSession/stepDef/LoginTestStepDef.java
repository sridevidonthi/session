package net.serenitybdd.practiseSession.stepDef;

import net.serenitybdd.practiseSession.model.LoginData;
import net.serenitybdd.practiseSession.steps.LoginTestSteps;
import net.thucydides.core.annotations.Steps;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestStepDef {

	LoginData dp= new LoginData();
	
	@Steps
	LoginTestSteps LT_steps;
	
	@Given("^I use Valid \"([^\"]*)\" and Valid \"([^\"]*)\"$")
	public void i_use_Valid_and_Valid(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		dp.setAll(arg1, arg2);
		System.out.println("User & pwd:" + dp.getUserName() +dp.getPassword());
	}

	@When("^I perform Login Action$")
	public void i_perform_Login_Action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		LT_steps.openHomePage();
		LT_steps.performLogin(dp);
	}

	@Then("^I should see my Account Mails\\.$")
	public void i_should_see_my_Account_Mails() throws Throwable {
	  
		LT_steps.isInboxPresent();
		
	}
	
	@Before
	public void afterTest(){
		
		LT_steps.closeBrowser();
	}

}
