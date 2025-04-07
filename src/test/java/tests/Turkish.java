package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.Assertion;

import static constants.Elements.*;
import static constants.Links.homeLink;

public class Turkish {
    public static WebDriver driver;
    public static Assertion assertion = new Assertion();

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openCastPgae(){
        driver.get(homeLink);
        driver.findElement(turkishButton).click();
    }

    // Test cases




    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
