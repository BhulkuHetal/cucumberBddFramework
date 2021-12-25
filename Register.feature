Feature: Nopcommerce Register
  Background:
    Given User open browser And Enter Url


#Simple Hard coded Scenario
  @E2E @Regression
  Scenario:Nopcommerce Register test
    Given User open browser And Enter Url
  Then :User click on Register Option
  And :User is on register page and Verify the Register page Title
  Then :User will click on Female Gender
  Then :User will Enter First name and Last name
  Then :User will Enter Day,Month, Year
  Then : User will Enter EmailID
  Then :User will Enter Company name
  Then :User will Enter Password
  When :User Enter Confirm password and  Click on Register button.
  Then :User will be on Homepage

