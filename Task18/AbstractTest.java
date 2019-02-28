package forBooking;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractTest {
	protected static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();

	}

	@Before
	public void navigateToBookingHomePage() {

		driver.get("http://google.com");
		WebElement searchField = driver.findElement(By.xpath(".//input[@title='Поиск']"));
		searchField.clear();
		searchField.sendKeys("Booking.com");

		WebElement searchButton = driver
				.findElement(By.xpath(".//div[@class='VlcLAe']//input[@value='Поиск в Google']"));
		searchButton.click();

		WebElement booking = driver.findElement(By.xpath("//h3[contains(text(),'Booking.com | Отели‎')]"));
		booking.click();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
		driver.quit();
	}

}
