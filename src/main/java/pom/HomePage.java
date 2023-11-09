package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public static String url = "https://demo.nopcommerce.com/";
    // Selectori

    By logoutButton = By.cssSelector("[class=\"ico-logout\"]");
    private WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actiuni

    public boolean logoutButtonIsDisplayed() {
        return driver.findElement(logoutButton).isDisplayed();
    }
}
