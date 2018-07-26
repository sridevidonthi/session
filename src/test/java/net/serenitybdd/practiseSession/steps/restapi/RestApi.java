package net.serenitybdd.practiseSession.steps.restapi;

import java.io.IOException;

import org.apache.http.entity.ContentType;
import org.junit.Before;
import org.junit.Test;

//import static com.jayway.restassured.RestAssured.when;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestApi {
	//private Response response;
	@Before
	public void setup() {
		RestAssured.baseURI = "https://reqres.in/";
	}

	
	@Title("This test will show testing Rest Api")
	@Test
	public void whenRequestGet_thenOK() throws JsonParseException, JsonMappingException, IOException {
//		 SerenityRest.given().contentType("application/json")
//        .when().get("https://reqres.in/api/users/2").then().extract().asString();
//		//String response = RestAssured.when().get("/api/users/2").then().extract().asString();
//		ValidatableResponse status = RestAssured.when().get("/api/users/2").then().assertThat().statusCode(200);
//		// String response =
//		// when().get("/api/v1/employee/719").then().extract().asString();
//	    //ObjectMapper mapper = new ObjectMapper();
//		//Reqres reqres_API = null;
//		//Employee emp_UI = new Employee();
////		try {
//	   // Reqres reqres_API = mapper.readValue(response, Reqres.class);
//////			 //emp_Db = mapper.readValue(documentdb.toString(), Employee.class);
////		} catch (IOException e) {
////
////			e.printStackTrace();
////		}
//		// emp_UI.setEmployee_age("23");// driver.findelement(gettext())
////		emp_UI.setEmployee_name("test1");
////		emp_UI.setEmployee_salary("123");
////		emp_UI.setId("719");
//		// emp_UI.setProfile_image("");
//		//System.out.println("equal to:" + emp_UI.equals(emp_API));
//	//	System.out.println(response);
//		//System.out.println(status);
//	   // System.out.println("ReqRes Object\n"+reqres_API);
//		SerenityRest.given().contentType(ContentType.APPLICATION_JSON).
//		when().body("").post();
		
	}
	
	@Test
	public void LoginIntoTheWebServiceSendsRequest() {
		
	}
	@Test
	public void GetStatusCode200() {
		
	}
	@Test
	public void Validate20CircuitsReturned() {
		//response.then().assertThat().body(arg0, arg1)
		//body("MRData.CircuitTable.Circuits.circuitId", equalTo(20));

	}
	
	}
