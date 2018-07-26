package net.serenitybdd.practiseSession;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/search/search_by_keyword.feature",
tags = { "@regressionTest"} )
public class AcceptanceTests {}
