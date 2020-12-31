Feature: My Account Login Feature
Description: This is feature will test a login feature

#Scenario: Login with valid username and  password
#Given open browser
#When Enter the URL "http://practice.automationtesting.in/"
#And click on my Account Menu
#And Enter registered username and passsword
#And Click on login button
#Then user must successfully login and logout to the webpage


#Login with 
#Scenario: Login with valid username and  password
#Given open browser
#When Enter the URL "http://practice.automationtesting.in/"
#And click on my Account Menu
#And Enter registered username "akashtippa@gmail.com" and passsword "Akashtippa@123"
#And Click on login button
#Then user must successfully login and logout to the webpage


#simple login with scenario outline & Example keyword 
#Scenario Outline: Login with valid username and  password
#Given open browser
#When Enter the URL "http://practice.automationtesting.in/"
#And click on my Account Menu
#And Enter registered username "<username>" and passsword "<password>"
#And Click on login button
#Then Verify login


#Examples:
#| username | password |
#| akashtippa@gmail.com | Akashtippa@123 |
#| akashtippa@gmail.com | Akash@123 |
#| akash@gmail.com | Akashtippa@123 |

#Simple login with Data table param
#Scenario: Login with valid username and password
#Given open browser
#When Enter the URL "http://practice.automationtesting.in/"
#And click on my Account Menu
#And Enter registered username and password
#| akashtippa@gmail.com | Akashtippa@123 |
#And Click on login button	
#Then user must successfully login and logout to the webpage


#Simple login with Data table param WITH HEADER
Scenario: Login with valid username and password
Given open browser
When Enter the URL "http://practice.automationtesting.in/"
And click on my Account Menu
And Enter registered username and password
| username | password |
| akashtippa@gmail.com | Akashtippa@123 |
| akashtippa@gmail.com | Akash@123 |
| akash@gmail.com | Akashtippa@123 |


And Click on login button	
Then user must successfully login and logout to the webpage

