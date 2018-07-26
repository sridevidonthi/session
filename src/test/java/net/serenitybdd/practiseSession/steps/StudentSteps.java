package net.serenitybdd.practiseSession.steps;

import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class StudentSteps {
static String email=null;
	
//	@Steps
//	StudentSerenitySteps steps;

	@When("^User sends a GET request to the list endpoint,they must get back a valid status code 200$")
	public void verify_status_code_200_for_listendpoint(){
//	  	SerenityRest.rest()
//		.given().baseUri("https://reqres.in")
//        .when()
//		.get("/api/users")
//		.then()
//		.statusCode(200);
		SerenityRest.given().contentType("application/json")
        .when().get("https://reqres.in/api/users").then().statusCode(200);
	}
}
