package net.serenitybdd.practiseSession.steps;

import net.serenitybdd.practiseSession.model.LoginData;
//import net.serenity.bdd.junit.cucumber.pages.AccountsPage;
import net.serenitybdd.practiseSession.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginTestSteps extends ScenarioSteps{
	
	
	LoginPage LP;
	//AccountsPage AP;
	
	@Step
	public void openHomePage(){
		LP.openHomePage_PO();
	}

	@Step
	public void performLogin(LoginData dp) {
		
		// TODO Auto-generated method stub
		LP.performLogin(dp);
	}

	@Step
	public void isInboxPresent() {
		// TODO Auto-generated method stub
	//System.out.println(AP.isInBoxLinkPresent());
	}

	@Step
	public void closeBrowser() {
		// TODO Auto-generated method stub
		getDriver().close();
    	getDriver().quit();
		
	}
   
}
