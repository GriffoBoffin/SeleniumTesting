package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    public static String url = "https://demo.nopcommerce.com/";
    // Selectori

    By logoutButton = By.cssSelector("[class=\"ico-logout\"]");

    By electonicsButton=By.xpath("//*[@class=\"header-menu\"]//*[@class=\"top-menu notmobile\"]//*[@href=\"/electronics\"]");

    By cameraButton=By.xpath("//*[@class=\"top-menu notmobile\"]//*[@href=\"/camera-photo\"]");
    private WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actiuni

    public boolean logoutButtonIsDisplayed() {
        return driver.findElement(logoutButton).isDisplayed();
    }

    public void hoverElectronicsButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(electonicsButton)).perform();
    }

    public void clickCameraButton(){
        driver.findElement(cameraButton).click();
    }
}
