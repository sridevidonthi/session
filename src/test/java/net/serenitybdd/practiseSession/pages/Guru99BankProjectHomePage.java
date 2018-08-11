package net.serenitybdd.practiseSession.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Guru99BankProjectHomePage extends PageObject {
	@FindBy(xpath="//*[contains(text(),'Page of GTPL Bank')]")
	private WebElementFacade headingText;

	// Get the title of Login Page

	public String getHomePageTitle() {
		return getDriver().getTitle();
	}

	public String getTitleText()
	{
		return headingText.getText();
	}
		
}
