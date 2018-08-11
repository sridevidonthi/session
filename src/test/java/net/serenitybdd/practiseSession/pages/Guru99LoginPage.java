package net.serenitybdd.practiseSession.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.practiseSession.utilities.HelperMethods;
import net.serenitybdd.practiseSession.utilities.Utilities;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.guru99.com/V4/")
public class Guru99LoginPage extends PageObject{
	HelperMethods helper = new HelperMethods();
	Utilities util = new Utilities();
	@FindBy(name = "uid")
	private WebElementFacade user99GuruName;

	@FindBy(name = "password")
	private WebElementFacade password99Guru;

	@FindBy(className = "barone")
	private WebElementFacade titleText;

	@FindBy(name = "btnLogin")
	private WebElementFacade loginbtn;

	@FindBy(name = "btnReset")
	private WebElementFacade resetbtn;

	public void openLoginPage() {
		open();
}


	// Set user name in textbox

	public void setUserName(String strUserName) {
		user99GuruName.waitUntilClickable().clear();
		user99GuruName.waitUntilClickable().sendKeys(strUserName);
	}

	// Set password in password textbox

	public void setPassword(String strPassword) {
		password99Guru.waitUntilClickable().clear();
		password99Guru.waitUntilClickable().sendKeys(strPassword);
	}

	// Click on login button

	public void clickLogin() {
		//loginbtn.waitUntilClickable().click();
		helper.clickOnElementJS(loginbtn);
	}
	// Get the title of Login Page

	public String getLoginTitle() {
		return titleText.getText();
	}

	public void loginToGuru99(String strUserName, String strPasword) {
		// Fill user name
		this.setUserName(strUserName);
		// Fill password
		this.setPassword(strPasword);
		// Click Login button
		//this.clickLogin();
	}
}
