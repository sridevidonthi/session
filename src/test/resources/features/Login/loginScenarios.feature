#@Login @smoke
Feature: Login into the Mail.com
As a Valid User
I want to login to the mail
So that I can check my mails.


Scenario Outline: Success Login 

Given I use Valid "<userName>" and Valid "<password>"
When I perform Login Action
Then I should see my Account Mails.


Examples: Valid Data
|userName|password|
|serenitytraining@mail.com|Password01|

