package tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;

public class BaseTest  {
    protected  static WebDriver driver;
    protected static HomePage homePage;
    @BeforeClass
    public static void setUpDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage= new HomePage(driver);
    }
    @Before
    public void navigateToBooking(){
        homePage.navigateToBookingHomePage();
    }

    @AfterClass
    public  static void closeResources() { driver.quit();}
}
