@UI @Positive @Purchase
Feature:

  Scenario Outline: Test a complete purchase scenario
    Given Be on login page

    When Enter credentials from list and login
      | <username> |
      | <password> |

    And Hover over electronics button
    And Click on camera & photo
    And Select the Nikon
    And Add to cart the red version
    And Go to shopping cart
    And Agree terms of service
    And Click checkout
    And Insert billing adress
    And Select shipping method
    And Select payment method
    And Confirm payment information
    And Confirm order
    And At success page click continue
    And Go to My accout page
    And Click orders

    Then Order should be present in the orders page

    Examples:
      | username           | password       |
      | vasilica@email.com | parolaluvasile |








