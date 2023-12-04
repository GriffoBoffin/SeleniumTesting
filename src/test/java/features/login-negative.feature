@UI @Negative @Login
Feature:
  Background: Opening Login Page
    Given Be on login page

  @Smoke
  Scenario: Login test using unexisting account

    When Enter email "vasilica360@email.com"
    When Enter password "parolaluvasile"
    When Enable remember me
    When Click login

    Then No customer account message is displayed

    @Smoke
    Scenario: Login using correct email and wrong password

      When Enter email "vasilica@email.com"
      When Enter password "parolagresita"
      When Click login

      Then Incorrect credentials message is displayed

  Scenario: Login using only email

    When Enter email "vasilica@email.com"
    When Click login

    Then Incorrect credentials message is displayed

  Scenario: Login using only password

    When Enter password "parolaluvasile"
    When Click login

    Then Enter email error is displayed


  Scenario: Login using empty email and empty password

    When Click login

    Then Enter email error is displayed

  Scenario Outline: Login using wrong email format

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
