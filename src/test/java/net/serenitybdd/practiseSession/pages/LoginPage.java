package net.serenitybdd.practiseSession.pages;

import net.serenitybdd.practiseSession.model.LoginData;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;






@DefaultUrl("https://www.mail.com")
public class LoginPage extends PageObject{
	
	

	@FindBy(xpath="//a[@id='login-button']")
	private WebElementFacade LoginButton;
	
	@FindBy(xpath="//input[@id='login-email']")
	private WebElementFacade loginUserField;
	
	@FindBy(xpath="//input[@id='login-password']")
	private WebElementFacade loginPasswordField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElementFacade loginSubmitButton;
	
	public void openHomePage_PO(){
		open();
	}

	
	public void performLogin( LoginData dp){
		System.out.println("Logging in using:"+  dp.getUserName() +";" + dp.getPassword());
		LoginButton.click();
		loginUserField.sendKeys(dp.getUserName());
		loginPasswordField.sendKeys(dp.getPassword());
		loginSubmitButton.click();
	}
}
