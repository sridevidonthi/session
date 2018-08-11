package net.serenitybdd.practiseSession;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//import net.serenitybdd.jbehave.SerenityStories;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/guru99_Login/Login_Guru99.feature")
public class AcceptanceTestSuite {
	
}
