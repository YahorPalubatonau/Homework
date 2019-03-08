package forBooking;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractTestForBooking {

	protected static WebDriver driver;

	/*
	 * @BeforeClass public static void setUpBeforeClass() throws Exception { driver
	 * = new ChromeDriver(); }
	 */

	@Before
	public void navigateToGoogle() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");

	}

	@After
	public void tearDownAfterClass() throws Exception {
		//driver.close();
		//driver.quit();
	}

}
