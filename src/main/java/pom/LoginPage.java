package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.text.ParseException;


public class LoginPage {
    public static String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    private final WebDriver driver;
    By rememberMeCheckbox = By.id("RememberMe");
    // Selectori
    By homepageButton = By.cssSelector("[alt=\"nopCommerce demo store\"]");
    By welcomeTitle = By.cssSelector("[class=\"page-title\"]");
    By loginEmail = By.id("Email");
    By loginPassword = By.id("Password");
    By loginMessage = By.cssSelector("[class=\"page-title\"]");
    By loginButton = By.cssSelector("[class=\"button-1 login-button\"]");
    By signInRegisterButton = By.cssSelector("[class=\"button-1 register-button\"]");
    By forgotPassword = By.cssSelector("[href=\"/passwordrecovery\"]");
    By noCustomerAccountAndIncorrectCredentialsMessage = By.cssSelector("[class=\"message-error validation-summary-errors\"]");
    By enterEmailMessage = By.id("Email-error");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Verificari

    public boolean homepageButtonisDisplayed() {
        return driver.findElement(homepageButton).isDisplayed();
    }

    public boolean welcomeTitleisDisplayed() {
        return driver.findElement(welcomeTitle).isDisplayed();
    }

    // Actiuni

    public void enterEmail(String email) {
        driver.findElement(loginEmail).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(loginPassword).sendKeys(password);
    }

    public void enableRememberMe() {
        driver.findElement(rememberMeCheckbox).click();
    }

    public boolean rememberMeCheckboxAssert() {
        return driver.findElement(rememberMeCheckbox).isDisplayed();
    }

    public void clickForgotPassword() {
        driver.findElement(forgotPassword).click();
    }


    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String noCustomerAccountMessageAndIncorrectCredentialsIsPressent() {
        return driver.findElement(noCustomerAccountAndIncorrectCredentialsMessage).getText();
    }

    public String emailErrorIsPressent() {
        return driver.findElement(enterEmailMessage).getText();
    }

    public void clickOnRegisterButton() {
        driver.findElement(signInRegisterButton).click();
    }

    public void enterWrongEmail(String emailu) {
        driver.findElement(loginEmail).sendKeys(emailu);
        driver.findElement(loginPassword).click();
    }

    public void cookieTest() {
        driver.manage().addCookie(new Cookie(".Nop.Vasilica", "Cfqwhu5uaKnQA8KclLl5A"));
        driver.navigate().refresh();
    }
}
