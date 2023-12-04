@UI @Positive @Login
Feature:
  Background: Opening Login Page
    Given Be on login page
  #  Scenario: Login using cookie
#    Given Be on login page
#
#    When Enter cookie
#
#    Then Logout button is displayed

  @Smoke
  Scenario: Login test using correct credentials

    When Enter email "vasilica@email.com"
    When Enter password "parolaluvasile"
    When Enable remember me
    When Click login

    Then Logout button is displayed


  Scenario: Go to register from login page

    When Click on register button

    Then Register page is displayed

  Scenario: Login using different account

    When Enter email "vasilicaobligatoriul@email.com"
    When Enter password "parolaluvasile"
    When Enable remember me
    When Click login

    Then Logout button is displayed

