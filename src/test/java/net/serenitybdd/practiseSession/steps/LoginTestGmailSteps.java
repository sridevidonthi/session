package net.serenitybdd.practiseSession.steps;

import net.serenitybdd.practiseSession.model.LoginGmailData;
import net.serenitybdd.practiseSession.pages.LoginGmailPage;
import net.serenitybdd.practiseSession.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginTestGmailSteps extends ScenarioSteps {
	LoginGmailPage LP;
	@Step
	public void open() {
		LP.openHomePage();
		
	}
	@Step
	public void enterValidUNandPass(LoginGmailData dp) throws InterruptedException {

		LP.enterValidUNandPass(dp);
	}

	@Step
	public void closeBrowser() {
		
		getDriver().close();
    	getDriver().quit();
	}
	@Step
	public void loginGmailAccount() {
		
		LP.loginAccount();
	}

}
