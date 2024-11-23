
Feature: Application login

Background: 

Given setup the data sets
When lanch the browser from config varibles
When  hit the url of banking site

Scenario: Admin login page
 
Given User is in netbanking page
When user login in to application with "admin" and password "1234"
Then Home page will be displayed
Then cards are displayed

Scenario: User login page

Given User is in netbanking page
When user login in to application with "user" and password "0987"
Then Home page will be displayed
Then cards are displayed

@SmokeTests
Scenario Outline: User login application as default

 Given User is in netbanking page
When User login in to application with "<Username>" and Password "<Password>"
Then Home page will be displayed
Then cards are displayed

Examples: 
| Username  | | Password |
| credituser| | lop123   |
| debituser | | room12   |

@SmokeTests
Scenario: User signup page
Given User is in signup page
When user signup in to application 
| rahul |
| revanth |
| rahul@gmail.com |
| 8185838823 |
Then Home page will be displayed
Then cards are displayed