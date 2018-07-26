#Feature: To check user name
#Scenario: Github user's profile should have a login payload same as username
#  
#Given github user profile api
#When I look for eugenp via the api
#Then github's response contains a 'login' payload same as eugenp
Feature: Testing different requests on the reqres application


Scenario: Check if the student application can be accessed by users
When User sends a GET request to the list endpoint,they must get back a valid status code 200