Feature:

  Scenario: Login test using correct credentials
    Given Be on login page

    When Enter email "vasilica@email.com"
    When Enter password "parolaluvasile"
    When Enable remember me
    When Click login

    Then Logout button is displayed

  Scenario: Go to register from login page
    Given Be on login page

    When Click on register button

    Then Register page is displayed

  Scenario: Login using different account
    Given Be on login page

    When Enter email "vasilicaobligatoriul@email.com"
    When Enter password "parolaluvasile"
    When Enable remember me
    When Click login

    Then Logout button is displayed


  Scenario: Login test using unexisting account
    Given Be on login page

    When Enter email "vasilica360@email.com"
    When Enter password "parolaluvasile"
    When Enable remember me
    When Click login

    Then No customer account message is displayed

  Scenario: Login using only email
    Given Be on login page

    When Enter email "vasilica@email.com"
    When Click login

    Then Incorrect credentials message is displayed

  Scenario: Login using only password
    Given Be on login page

    When Enter password "parolaluvasile"
    When Click login

    Then Enter email error is displayed


  Scenario: Login using empty email and empty password
    Given Be on login page

    When Click login

    Then Enter email error is displayed

  Scenario Outline: Login using wrong email format
    Given Be on login page

    When Enter wrong email format "<email>"

    Then Wrong email error is displayed at login

    Examples:
      | email            |
      | 123@a.           |
      | 123@             |
      | 123              |
      | 123avvbasd       |
      | asdasd           |
      | vasilica@email.  |
      | vasilica@email.. |
      | vasilica@@email  |
      | email e          |


