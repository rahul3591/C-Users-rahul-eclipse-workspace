Feature: Search and place the order from the app

Scenario: Search experience of the project in both home page and top deals page
Given User is on Greenkart landing page
When user searched with short name "Tom" and extracted actual name of the product
Then user serached for "Tom" short name in top deals page 
And validate product name in offers page matches with landing page
