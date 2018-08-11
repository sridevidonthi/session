Feature: Login to Guru99 website and navigate to different projects
  In order to explore different projects in Guru99 
  User has to login to Guru99 website
  
  Background: User is Logged In
	Given User navigate to the login page
	When User submit username 'mgr123' and password 'mgr!23'
	Then User should be logged into Home Page 
 
   Scenario: Should see information related to Telecom Project
   Given User is already on the home page
   When User clicks on Telecom Project link
   Then Login page for Telecom Project gets displayed
   Then complete registration if you are a new user
   And enter the login credentials to login to Telecom Project website
   Then close the browser
  
   Scenario: Should see information related to Bank Project
   Given User is already on the home page
   When User clicks on Bank Project link
   Then Login page for Bank gets displayed
   Then User submits bankusername "mgr123" and bankpassword "mgr!23"
   And User should be able to login to BankProject Page
   Then close the browser
#   