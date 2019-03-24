package tests;

import dataBase.DataBase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPage;

import java.sql.SQLException;

public class AbstractTest {
	protected static WebDriver webDriver;
	protected static LoginPage loginPage;

	@BeforeClass
	public static void setUpDriver() {
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		loginPage = new LoginPage(webDriver);
	}

	@Before
	public void navigateToLoginPage() throws SQLException {
		loginPage.navigateToMail();
	}

	@After
	public void quitFromMail() {
		loginPage.quitFromMail();
	}

	@AfterClass
	public static void closeResources() {
		webDriver.quit();
	}
}
