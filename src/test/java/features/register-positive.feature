@UI @Positive @Register
Feature:

  Background: Opening Register Page
    Given Be on register page

  @Smoke
  Scenario: Register using all correct information including non mandatory information

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

  @Smoke
  Scenario: Register using only mandatory correct information

    When Insert first name "Vasilica"
    And Insert last name "Rasapura"
    And Insert email "vasilicaobligatoriul@email.com"
    And Insert password "parolaluvasile"
    And Confirm password "parolaluvasile"
    And Click register


    Then Success register message is displayed
    And Click continue
    And Homepage is displayed