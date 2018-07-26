package net.serenitybdd.practiseSession.pages;

import com.google.common.base.Optional;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
//import net.serenitybdd.practiseSession.utilities.HelperMethods;
import net.serenitybdd.practiseSession.utilities.HelperMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;


//tag::header[]
public class SearchResultsPage extends PageObject {
	HelperMethods helpmeth;
//end::header[]
 public static final String SCROLL_TO_FILTERS = "$('a.red')[0].scrollIntoView(false);";
//tag::searchByKeyword[]
@FindBy(xpath="//a[contains(@href,'https://www.etsy.com/search/handmade?q=wool+fabric&explicit=1&guided_search=1&ref=guided_search_1_1')]")
WebElementFacade woolfab_btn;

@FindBy(xpath="//a[@data-path='link-Handmade']")
WebElementFacade handmadeLink;
@FindBy(xpath="//*[@data-path='link-Vintage']")
WebElementFacade vintageLink;
@FindBy(xpath="//*[@data-path='link-All items']")
WebElementFacade allitemsLink;


@FindBy(css=".listing-card")
 List<WebElement> listingCards;

 public List<String> getResultTitles() {
     return listingCards.stream()
             .map(element -> element.getText())
             .collect(Collectors.toList());
 }
//end::searchByKeyword[]

 public void selectItem(int itemNumber) {
     listingCards.get(itemNumber - 1)
             .findElement(By.tagName("a")).click();
 }

 public void filterByType(String type) {
	 //WebElementFacade elementType;
	 String type1 = "Handmade";
	 String type2="Vintage";
	 String type3 ="All items";
	 if (type.equalsIgnoreCase(type1))
         {
		 helpmeth.scrollIntoViewJS(handmadeLink);
		 handmadeLink.click();
         }else if(type.equalsIgnoreCase(type2)) {
        	 helpmeth.scrollIntoViewJS(vintageLink);
        	    // showFilters();
        	     //findBy("#search-filter-reset-form").then(By.partialLinkText(type)).click();
        	     vintageLink.click();
         }else if(type.equalsIgnoreCase(type3)) {
        	 helpmeth.scrollIntoViewJS(allitemsLink);
        	 allitemsLink.click();
       	 }
    }
//	
 

 public int getItemCount() {
     String resultCount = $(".result-count").getText()
             .replace("We found ","")
             .replace(" item","")
             .replace("s","")
             .replace("!","")
             .replace(",","")
             ;
     return Integer.parseInt(resultCount);
 }

 public Optional<String> getSelectedType() {
     List<WebElementFacade> selectedTypes = findAll("#search-filter-reset-form a.radio-label.strong");
     return (selectedTypes.isEmpty()) ? Optional.absent() : Optional.of(selectedTypes.get(1).getText());
 }

 public void showFilters() {
     evaluateJavascript(SCROLL_TO_FILTERS);
 }
//tag::tail[]

public String getSelectedVarietytype(String type) {
	String sval=null;
	 List<WebElementFacade> selectedTypes = findAll("#search-filter-reset-form a.radio-label.strong");
	 int iSize = selectedTypes.size();
	 System.out.println(iSize);
	// Start the loop from first Check Box to last Check Boxe
		for(int i=0; i < iSize ; i++ ){
			// Store the radiobutton name to the string variable, using 'Value' attribute
			String sValue = selectedTypes.get(i).getAttribute("value");
			
			// Select the Check Box it the value of the Check Box is same what you are looking for
			if (sValue.equalsIgnoreCase(type)){
				System.out.println("Type selected is"+ sValue);
				sval = sValue;
			break;
			}
	 //return sValue;
	// TODO Auto-generated method stub
	
}
		return sval;
}
}
//end:tail[]
