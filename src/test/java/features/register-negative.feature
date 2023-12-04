@UI @Negative @Register
Feature:
  Background: Opening Register Page
    Given Be on register page

  Scenario: Register using an already used email

    When Insert first name "Vasilica"
    And Insert last name "Rasapura"
    And Insert email "vasilica@email.com"
    And Insert password "parolaluvasile"
    And Confirm password "parolaluvasile"
    And Click register


    Then Already used email message is displayed

  Scenario Outline: Register using wrong email format

    When Insert first name "Vasilica"
    And Insert last name "Rasapura"
    And Insert email "<email>"
    And Insert password "parolaluvasile"
    And Confirm password "parolaluvasile"
    And Click register

    Then Wrong email error is displayed at register

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

  Scenario: Register without first name

    And Insert last name "Rasapura"
    And Insert email "vasilica361@email.com"
    And Insert password "parolaluvasile"
    And Confirm password "parolaluvasile"
    And Click register

    Then First name is required message is displayed

  Scenario: Register using different passwords

    When Insert first name "Vasilica"
    And Insert last name "Rasapura"
    And Insert email "vasilica362@email.com"
    And Insert password "parolaluvasile"
    And Confirm password "altaparolaluvasile"
    And Click register

    Then Passwords do not match error is displayed