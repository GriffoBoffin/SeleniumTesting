package pom;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterPage {


    public static String url = "https://demo.nopcommerce.com/register?returnUrl=%2F";
    By genderMale = By.id("gender-male");
    By genderFemale = By.id("gender-female");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dayOfBirth = By.cssSelector("[name=\"DateOfBirthDay\"]");
    By monthOfBirth = By.cssSelector("[name=\"DateOfBirthMonth\"]");
    By yearOfBirth = By.cssSelector("[name=\"DateOfBirthYear\"]");
    By email = By.id("Email");
    By companyName = By.id("Company");
    By newsletterCheckbox = By.id("Newsletter");
    By password = By.id("Password");
    By repeatPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");

    By successRegisterMessage = By.cssSelector("[class=\"result\"]");

    By continueButton = By.cssSelector("[class=\"button-1 register-continue-button\"]");

    By alreadySpecifiedEmailMessage = By.cssSelector("[class=\"message-error validation-summary-errors\"]");

    By emailError = By.id("Email-error");
    By firstNameError = By.id("FirstName-error");
    By confirmPasswordError = By.id("ConfirmPassword-error");
    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectMaleGender() {
        driver.findElement(genderMale).click();
    }

    public void selectFemaleGender() {
        driver.findElement(genderFemale).click();
    }

    public void insertFirstName(String fName) {
        driver.findElement(firstName).sendKeys(fName);
    }

    public void insertLastName(String lName) {
        driver.findElement(lastName).sendKeys(lName);
    }

    public void selectDayOfBirth(String day) {
        WebElement selectElement = driver.findElement(dayOfBirth);
        Select dayDropdown = new Select(selectElement);
        dayDropdown.selectByValue(day);
    }

    public void selectMonthOfBirth(String month) {
        WebElement selectElement = driver.findElement(monthOfBirth);
        Select monthDropdown = new Select(selectElement);
        monthDropdown.selectByVisibleText(month);
    }

    public void selectYearOfBirth(String year) {
        WebElement selectElement = driver.findElement(yearOfBirth);
        Select yearDropdown = new Select(selectElement);
        yearDropdown.selectByVisibleText(year);
    }

    public void insertEmail(String emailu) {
        driver.findElement(email).sendKeys(emailu);
    }

    public void insertCompanyName(String company) {
        driver.findElement(companyName).sendKeys(company);
    }

    public void checkNewsletterCheckbox() {
        if (!driver.findElement(newsletterCheckbox).isSelected()) {
            driver.findElement(newsletterCheckbox).click();
        }
    }

    public void uncheckNewsletterCheckbox() {
        if (driver.findElement(newsletterCheckbox).isSelected()) {
            driver.findElement(newsletterCheckbox).click();
        }
    }

    public void insertPassword(String passwordVar) {
        driver.findElement(password).sendKeys(passwordVar);
    }

    public void insertRepeatPassword(String repPassword) {
        driver.findElement(repeatPassword).sendKeys(repPassword);
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }

    public boolean successRegisterMessage() {
        return driver.findElement(successRegisterMessage).isDisplayed();
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public String emailAlreadyUsedErrorIsPressent() {
        return driver.findElement(alreadySpecifiedEmailMessage).getText();
    }

    public String emailErrorIsDisplayed() {
        return driver.findElement(emailError).getText();
    }

    public String firstNameErrorIsDisplayed(){
        return driver.findElement(firstNameError).getText();
    }

    public String confirmPasswordErrorIsDisplayed(){
        return driver.findElement(confirmPasswordError).getText();
    }
}

