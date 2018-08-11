package net.serenitybdd.practiseSession.pages;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Guru99TelecomProjectPage extends PageObject {
	@FindBy(xpath="//a[@href='addcustomer.php'][1]")
	private WebElementFacade addCustomerlink;

	//@FindBy(xpath="//a[contains(text(),'Guru99 telecom')]")
	@FindBy(xpath=".//a[@class='logo']")
	private WebElementFacade Guru99telecomlogo;

//	@FindBy(name = "password")
//	WebElement password99Guru;
//
//	@FindBy(className = "barone")
//	WebElement titleText;
//
//	@FindBy(name = "btnLogin")
//	WebElement loginbtn;
//
//	@FindBy(name = "btnReset")
//	WebElement resetbtn;

	
	

	// Click on login button

	public void clickAddCustomerLink() {
		addCustomerlink.waitUntilClickable().click();
	}
	// Get the info of Telecom project

	public String gettelecomlogoinfo() {
		return Guru99telecomlogo.getText();
	}

//	public void loginToGuru99(String strUserName, String strPasword) {
//		// Fill user name
//		this.setUserName(strUserName);
//		// Fill password
//		this.setPassword(strPasword);
//		// Click Login button
//		this.clickLogin();
//	}
}
