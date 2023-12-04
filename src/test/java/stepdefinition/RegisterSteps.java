package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pom.HomePage;
import pom.LoginPage;
import pom.RegisterPage;

import static stepdefinition.Hooks.driver;

public class RegisterSteps {
    RegisterPage registerPage = new RegisterPage(driver);

    @Given("Be on register page")
    public void beOnRegisterPage() {
        driver.get(RegisterPage.url);
    }

    @When("Select male gender")
    public void selectGender() {
        registerPage.selectMaleGender();
    }

    @And("Insert first name {string}")
    public void insertFirstName(String fName) {
        registerPage.insertFirstName(fName);
    }

    @And("Insert last name {string}")
    public void insertLastName(String lName) {
        registerPage.insertLastName(lName);
    }

    @And("Select day of birth {string}")
    public void selectDayOfBirth(String day) {
        registerPage.selectDayOfBirth(day);
    }

    @And("Select month of birth {string}")
    public void selectMonthOfBirth(String month) {
        registerPage.selectMonthOfBirth(month);
    }

    @And("Select year of birth {string}")
    public void selectYearOfBirth(String year) {
        registerPage.selectYearOfBirth(year);
    }

    @And("Insert email {string}")
    public void insertEmail(String email) {
        registerPage.insertEmail(email);
    }

    @And("Insert company name {string}")
    public void insertCompanyName(String company) {
        registerPage.insertCompanyName(company);
    }

    @And("Select newsletter checkbox")
    public void selectNewsletterCheckbox() {
        registerPage.checkNewsletterCheckbox();
    }

    @And("Insert password {string}")
    public void insertPassword(String password) {
        registerPage.insertPassword(password);
    }

    @And("Confirm password {string}")
    public void confirmPassword(String repPassword) {
        registerPage.insertRepeatPassword(repPassword);
    }

    @And("Click register")
    public void clickRegister() {
        registerPage.clickRegister();
    }

    @Then("Success register message is displayed")
    public void successRegisterMessageIsDisplayed() {
        Assert.assertTrue("Success register message is not displayed", registerPage.successRegisterMessage());
    }

    @And("Click continue")
    public void clickContinue() {
        registerPage.clickContinue();
    }

    @And("Homepage is displayed")
    public void homepageIsDisplayed() {
        Assert.assertEquals(driver.getCurrentUrl(), HomePage.url);
    }

    @Then("Already used email message is displayed")
    public void alreadyUsedEmailMessageIsDisplayed() {
        Assert.assertEquals("The specified email already exists", registerPage.emailAlreadyUsedErrorIsPressent());
    }

    @Then("Wrong email error is displayed at register")
    public void wrongEmailErrorIsDisplayedAtRegister() {
        Assert.assertEquals("Wrong email",registerPage.emailErrorIsDisplayed());
    }

    @Then("First name is required message is displayed")
    public void firstNameIsRequiredMessageIsDisplayed() {
        Assert.assertEquals("First name is required.",registerPage.firstNameErrorIsDisplayed());
    }

    @Then("Passwords do not match error is displayed")
    public void passwordsDoNotMatchErrorIsDisplayed() {
        Assert.assertEquals("The password and confirmation password do not match.",registerPage.confirmPasswordErrorIsDisplayed());
    }
}
