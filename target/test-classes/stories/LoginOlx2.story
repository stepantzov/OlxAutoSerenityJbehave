Meta:

Narrative:
As a customer
I want to be able to login to olx site successfully

Meta:
@driver chrome
@login
Scenario: olx login
Given Customer is on the Olx site main page
When Customer want to log in Olx site by using 'My Profile' link
Then Customer has been redirected to Login Page
And He is able lo log to Olx by using correct credentials
