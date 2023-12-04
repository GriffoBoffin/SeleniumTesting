@API @Positive
  Feature:
    @Smoke
    Scenario: Create an user with test data object

      Given Create user object test data
      And Set Content Type "application/json"
      And Set Body with Test Data

      When Execute "POST" Request On "https://gorest.co.in/public/v2/users?access-token=911cfbbc2a6eae02cbea08cfd92cee3837a7f6014cf85fcdf9b18a23d385c1b4"
      Then Log and Verify Status code is 201
      And Verify Response Body has field "name" equal to "Gica Contra"