		package net.serenitybdd.practiseSession.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.practiseSession.utilities.HelperMethods;
import net.serenitybdd.practiseSession.utilities.Utilities;

public class Guru99HomePage extends PageObject {
	//HelperMethods helper = new HelperMethods();
	//Utilities util = new Utilities();
	

	// PAGE OBJECTs are located Here
	@FindBy(xpath = "//table//tr[@class='heading3']")
	private WebElementFacade homePageUserName;

	@FindBy(xpath = "//a[contains(text(), 'Telecom Project')]")
	private WebElementFacade telecomprojectLink;
	@FindBy(xpath="(//*[@class='dropdown-toggle'])[2]")
	private WebElementFacade bankProjectDrpDwn;
	@FindBy(xpath="//a[text()='Bank Project V1']")
	private WebElementFacade bankProjectV1Link;
	@FindBy(xpath="//*[contains(text(),'Page of Guru99 Bank') ]")
	private WebElementFacade headingText;
	
	
	// Get the User name from Home Page

	public String getHomePageDashboardUserName() {
		return homePageUserName.getText();
	}

	public void clickonTelecomprojectLink() {
		telecomprojectLink.waitUntilClickable().click();
	
	}
	
	//select from dropdown
	public void clickonBankProjectLink()
	{
		bankProjectDrpDwn.waitUntilClickable().click();
		bankProjectV1Link.waitUntilClickable().click();
		//selectByVisibleText("Bank Project V1");
	}
	
	public String getHomePageheadingText() {
		return  headingText.getText();
	}

}
