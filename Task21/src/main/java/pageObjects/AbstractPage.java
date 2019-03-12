package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
    public WebDriver driver;
    public WebDriverWait driverWait;

    AbstractPage(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(driver, 10);
    }

    WebElement findElementBy(By by) {
        return driverWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    WebElement findElementBytoBeClickable(By by) {
        return driverWait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void navigateToBookingHomePage() {
        driver.get("http://google.com");
        WebElement searchField = findElementBy(By.xpath(".//input[@name='q']"));
        searchField.clear();
        searchField.sendKeys("Booking.com");

        WebElement searchButton = findElementBytoBeClickable(By.xpath(".//input[@name='btnK']"));
        searchButton.click();

        WebElement booking = findElementBy(By.xpath("//h3[contains(text(),'Booking.com')]"));
        booking.click();
    }
}
