Feature:Juice shop UI Automation feature

  Background:
    Given user is on the login page

    @Sanity
  Scenario: User login with valid credentials and Add to basket & add address and Verify them
    When user input valid "tufyalahmmed1@gmail.com" and "Tufyal123!"
    And user click on the login button
    And Add apple to the basket
    And Checkout from basket
    And Fill the new address
    Then Verify search bar by searching Apple
    And Verify two Apple product show up Banana product does not show up
