Feature:

  Scenario: Register using all correct information including non mandatory information
    Given Be on register page

    When Select male gender
    And Insert first name "Vasilica"
    And Insert last name "Rasapura"
    And Select day of birth "20"
    And Select month of birth "July"
    And Select year of birth "1995"
    And Insert email "vasilica@email.com"
    And Insert company name "Firma Cucu"
    And Select newsletter checkbox
    And Insert password "parolaluvasile"
    And Confirm password "parolaluvasile"
    And Click register

    Then Success register message is displayed
    And Click continue
    And Homepage is displayed

  Scenario: Register using only mandatory correct information
    Given Be on register page

    When Insert first name "Vasilica"
    And Insert last name "Rasapura"
    And Insert email "vasilicaobligatoriul@email.com"
    And Insert password "parolaluvasile"
    And Confirm password "parolaluvasile"
    And Click register


    Then Success register message is displayed
    And Click continue
    And Homepage is displayed


  Scenario: Register using an already used email
    Given Be on register page

    When Insert first name "Vasilica"
    And Insert last name "Rasapura"
    And Insert email "vasilica@email.com"
    And Insert password "parolaluvasile"
    And Confirm password "parolaluvasile"
    And Click register


    Then Already used email message is displayed


  Scenario Outline: Register using wrong email format
    Given Be on register page

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
      Given Be on register page

      And Insert last name "Rasapura"
      And Insert email "vasilica361@email.com"
      And Insert password "parolaluvasile"
      And Confirm password "parolaluvasile"
      And Click register


      Then First name is required message is displayed

      Scenario: Register using different passwords
        Given Be on register page

        When Insert first name "Vasilica"
        And Insert last name "Rasapura"
        And Insert email "vasilica362@email.com"
        And Insert password "parolaluvasile"
        And Confirm password "altaparolaluvasile"
        And Click register


        Then Passwords do not match error is displayed