package net.serenitybdd.practiseSession.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//tag::header[]
@DefaultUrl("http://www.etsy.com")                      // <1>
public class HomePage extends PageObject {              // <2>
//end::header[]
//tag::searchByKeyword[]

 @FindBy(css = "button[value='Search']")
 WebElement searchButton;

 public void searchFor(String keywords) {
     $("#search-query").sendKeys(keywords);          // <3>
     searchButton.click();                           // <4>
 }
//end::searchByKeyword[]
//tag::tail[]
}
//end::tail[]