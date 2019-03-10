package pageObjects;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class AbstractDriver {
    public static final String MAIN_URL = "http://mail.ru";
    public static WebDriver webDriver;

    @BeforeClass
    public static void getWebDriver() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get(MAIN_URL);
    }

}
