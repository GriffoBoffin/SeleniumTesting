package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pom.HomePage;
import pom.LoginPage;
import pom.RegisterPage;

import java.text.ParseException;
import java.util.List;

import static stepdefinition.Hooks.driver;

public class LogInSteps {
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    RegisterPage registerPage = new RegisterPage(driver);

    @Given("Be on login page")
    public void beOnLoginPage() {
        driver.get(LoginPage.url);
        Assert.assertTrue(loginPage.homepageButtonisDisplayed());
        Assert.assertTrue(loginPage.welcomeTitleisDisplayed());
    }

    @When("Enter email {string}")
    public void enterEmail(String email) {
        loginPage.enterEmail(email);
    }


    @When("Enter password {string}")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("Enable remember me")
    public void enableRememberMe() {
        loginPage.enableRememberMe();
        Assert.assertTrue("Remember me checkbox is not checked", loginPage.rememberMeCheckboxAssert());
    }

    @When("Click login")
    public void clickLogin() {
        loginPage.clickLogin();
    }

    @Then("Logout button is displayed")
    public void logoutButtonIsDisplayed() {
        homePage.logoutButtonIsDisplayed();
        Assert.assertTrue(homePage.logoutButtonIsDisplayed());
    }

    @Then("No customer account message is displayed")
    public void noCustomerAccountMessageIsDisplayed() {
        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", loginPage.noCustomerAccountMessageAndIncorrectCredentialsIsPressent());
    }

    @Then("Incorrect credentials message is displayed")
    public void incorrectCredentialsMessageIsDisplayed() {
        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect", loginPage.noCustomerAccountMessageAndIncorrectCredentialsIsPressent());
    }

    @Then("Enter email error is displayed")
    public void enterEmailErrorIsDisplayed() {
        Assert.assertEquals("Please enter your email", loginPage.emailErrorIsPressent());
    }

    @When("Click on register button")
    public void clickOnRegisterButton() {
        loginPage.clickOnRegisterButton();
    }

    @Then("Register page is displayed")
    public void registerPageIsDisplayed() {
        Assert.assertEquals(driver.getCurrentUrl(), registerPage.url);
    }

    @When("Enter wrong email format {string}")
    public void enterWrongEmailFormat(String email) {
        loginPage.enterWrongEmail(email);
    }

    @Then("Wrong email error is displayed at login")
    public void wrongEmailErrorIsDisplayed() {
        Assert.assertEquals("Wrong email", loginPage.emailErrorIsPressent());
    }

    @When("Enter cookie")
    public void enterCookie() throws ParseException, InterruptedException {
        loginPage.cookieTest();
    }

    @When("Enter credentials from list and login")
    public void enterCredentialsFromListAndLogin(List<String> credentials) {
        loginPage.enterEmail(credentials.get(0));
        loginPage.enterPassword(credentials.get(1));
        loginPage.clickLogin();
    }
}
