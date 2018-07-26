package net.serenitybdd.practiseSession.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.practiseSession.model.LoginGmailData;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.gmail.com")
public class LoginGmailPage extends PageObject {
	@FindBy(xpath="//a[contains(.,'Sign In')]")
	private WebElementFacade SigninButton;
	
	@FindBy(xpath="//input[contains(@type,'email')]")
	private WebElementFacade loginUserField;
	
	//@FindBy(xpath="//input[@type='password']")
	@FindBy(xpath="//*[@type='password']")
	private WebElementFacade loginPasswordField;
	
	@FindBy(xpath="//span[contains(.,'Next')]")
	private WebElementFacade NextButton;

	public void openHomePage() {
			open();
	}

	public void enterValidUNandPass(LoginGmailData dp) throws InterruptedException {
		//SigninButton.click();
		System.out.println("Logging in using:"+  dp.getUserName() +";" + dp.getPassword());
		loginUserField.sendKeys(dp.getUserName());
		NextButton.click();
		Thread.sleep(2000);
		//loginPasswordField.waitUntilClickable().click();
		//element.clear();
		loginPasswordField.sendKeys(dp.getPassword());
		//NextButton.click();
		//loginSubmitButton.click();
		
	}

	public void loginAccount() {
		
		NextButton.click();
	}
	
	public boolean nextButtonIsVisible() {
		//boolean enabled =NextButton.isEnabled();
		return NextButton.isVisible();
	}
}
