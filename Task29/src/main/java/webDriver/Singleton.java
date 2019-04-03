package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Singleton {
    private static WebDriver webDriver;

    private Singleton() {
    }

    public static WebDriver getSingletoneWebDriver() {
        if (webDriver == null) {
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\SatanEggs\\Downloads\\chromedriver_win32\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--disable-gpu");
            chromeOptions.addArguments("--no-sandbox");
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }
}
