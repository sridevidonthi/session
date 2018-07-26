Feature: Login into the gmail.com
As a valid user I can 
login to  my gmail account 
and check my mails.


Scenario Outline: Login Success 

Given I'am on gmail login page
When I enter valid "<username>" and "<password>"
Then I should login to my gmail account

Examples: Data
|username|password|
|samhitha042017@gmail.com|Padmavathi123|
|samhitha042017@gmail.com|padmavathi123|