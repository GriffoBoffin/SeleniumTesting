package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.HomePage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {
    protected static WebDriver driver;


    @Before
    public void beforeSetup() throws InterruptedException {
        System.out.println("Setup method");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @After
    public void afterCleanup() {
        System.out.println("Cleanup method");
        driver.quit();
    }
}
