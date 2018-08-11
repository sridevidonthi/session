package net.serenitybdd.practiseSession.steps;


import org.junit.Assert;

import jline.internal.Log;
import net.serenitybdd.practiseSession.pages.Guru99BankProjectHomePage;
import net.serenitybdd.practiseSession.pages.Guru99BankProjectLoginPage;
import net.serenitybdd.practiseSession.pages.Guru99HomePage;
import net.serenitybdd.practiseSession.pages.Guru99LoginPage;
import net.serenitybdd.practiseSession.pages.Guru99TelecomProjectPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginTestGuru99Steps extends ScenarioSteps{
	Guru99LoginPage GLP;
	Guru99HomePage GHP;
	Guru99TelecomProjectPage GTPP;
	Guru99BankProjectLoginPage GBPP;
	Guru99BankProjectHomePage GBPHP;
	@Step("User should be able to login to Guru99 website")      
	public void open() {
		GLP.open();	
		getDriver().manage().window().maximize();
    	Log.info("Browser window has been Maximized");
	}

	
	@Step("User should be able to pass username {0} and password {1} ")      
	public void submitUnameandPass(String uname, String pass) {
		// TODO Auto-generated method stub
		GLP.loginToGuru99(uname, pass);
		GLP.clickLogin();
	}
	@Step("User successfully logged into the login page")
	public void logintoGuru99Accnt() {
		// TODO Auto-generated method stub
		String loginPageTitle =GLP.getLoginTitle();
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		Log.info("User is on the Login Page");
	}
	@Step("User is on Home Page")      
	public void userIsOnHomePage() {
		// TODO Auto-generated method stub
		String homePageUserName = GHP.getHomePageDashboardUserName();
		System.out.println("homePageUserName is:"+homePageUserName);
		Assert.assertTrue(homePageUserName.toLowerCase().contains("mgr123"));
		Log.info("User is on the Home Page");
		String heading =GHP.getHomePageheadingText();
		System.out.println("heading is:"+heading);
		Assert.assertTrue(heading.contains("Welcome To Manager's Page of Guru99 Bank"));
	}
	@Step("User clicked on Telecom Project Link")
	public void userClicksOnTelecomProjLink() {
		// TODO Auto-generated method stub
		GHP.clickonTelecomprojectLink();
	}
	@Step("LoginPage of TelecomProject is displayed")
	public void TelecomProjectLoginPagedisplayed() {
		// TODO Auto-generated method stub
		String telecomLogoInfo=GTPP.gettelecomlogoinfo();
		Assert.assertTrue(telecomLogoInfo.toLowerCase().contains("guru99 telecom"));
		Log.info("User is on the Telecom Insurance Project Page");
	}
	@Step("As a New Customer, Customer has to complete the registration form")
	public void completeRegistration() {
		GTPP.clickAddCustomerLink();
	}


	public void userClicksOnBankProjLink() {
		GHP.clickonBankProjectLink();
		
	}


	public void verfiyBankPageDisplayed() {
		
		String bankPageTitle=GBPP.getTitle();
		System.out.println("bankPageTitle is:"+bankPageTitle);
		Assert.assertTrue(bankPageTitle.contains("Gtpl Bank"));
		
	}


	public void loginCredentialsBankPage(String uname, String pass) {
		
		GBPP.setUserName(uname);
		GBPP.setPassword(pass);
		GBPP.clickLogin();
		String bankHomePageTitle=GBPHP.getHomePageTitle();
		System.out.println("bankHomePageTitle is:"+bankHomePageTitle);
		Assert.assertTrue(bankHomePageTitle.contains("GTPL Bank Manager HomePage"));
	}


	public void close() {
		getDriver().close();
		
	}
	
	
	
}
