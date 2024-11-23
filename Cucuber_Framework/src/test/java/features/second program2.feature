
Feature: Application login

Background: 

Given setup the data sets
When lanch the browser from config varibles
When  hit the url of banking site

#Before->background->AFTER this is the exection process while giving annotations

@SmokeTests @NetBanking
Scenario: Admin login page
 
Given User is in netbanking page
When user login in to application with "admin" and password "1234"
Then Home page will be displayed
Then cards are displayed


@SmokeTests @Mortgage 
Scenario Outline: User login application as default

 Given User is in mortgage page
When User login in to application with "<Username>" and Password "<Password>"
Then Home page will be displayed
Then cards are displayed

Examples: 
| Username  | | Password |
| credituser| | lop123   |
| debituser | | room12   |

