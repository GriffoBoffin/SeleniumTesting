package stepdefinition;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pom.UserApi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class ApiSteps {
    UserApi testData;
    RequestSpecification request;
    Response response;
    String extractedId;
    JsonObject jsonResponse;


    @Given("Create user object test data")
    public void createUserObjectTestData() {
        testData = new UserApi("Gica Contra", "gica1234567@yeehaaw.com", "male", "active");
    }

    @And("Set Content Type {string}")
    public void setContentTypeA(String contentType) {
        request = given().contentType(contentType);
    }

    @And("Set Body with Test Data")
    public void setBodyWithTestData() {
        request.body(testData);
    }

    @When("Execute {string} Request On {string}")
    public void executeRequestOn(String requestType, String urlWithToken) {
        if (requestType.equals("POST")) {
            response = request.when().post(urlWithToken);
        } else if (requestType.equals("GET")) {
            response = request.when().get(urlWithToken);
        } else if (requestType.equals("DELETE")) {
            response = request.when().delete(urlWithToken);
        } else if (requestType.equals("PUT")) {
            response = request.when().put(urlWithToken);
        }
    }


    @Then("Log and Verify Status code is {int}")
    public void logAndVerifyStatusCodeIs(int statusCode) {
        response.then().log().body().statusCode(statusCode);
    }

    @And("Verify Response Body has field {string} equal to {string}")
    public void verifyResponseBodyHasFieldEqualTo(String field, String expectedValue) {
        response.then().body(field, equalTo(expectedValue));


    }

    @Given("Create user object test with wrong data")
    public void createUserObjectTestWithWrongData() {
        testData = new UserApi("Gica Contra", "gicutacontra638@yeehaaw.com", "male", "single");
    }
}
