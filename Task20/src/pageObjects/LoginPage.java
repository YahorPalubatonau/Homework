package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends AbstractPage {

	private static final int LINK_PRESENSE_TIMEOUT = 11000;

	private WebElement loginField;
	private WebElement passwordField;
	private WebElement buttonEnter;
	private WebElement logoutLink;

	public LoginPage(WebDriver webDriver) {
		super(webDriver);
	}

	public void enterInMail(String login, String password) {
		loginField = webDriver.findElement(By.id("mailbox:login"));
		loginField.clear();
		loginField.sendKeys(login);
		passwordField = webDriver.findElement(By.id("mailbox:password"));
		passwordField.clear();
		passwordField.sendKeys(password);
		buttonEnter = webDriver.findElement(By.xpath(".//*[@id='mailbox:submit']/input"));
		buttonEnter.click();
	}

	public void quitFromMail() {
		logoutLink = webDriver.findElement(By.xpath(".//*[@id='PH_logoutLink']"));
		logoutLink.click();
	}

	public boolean logoutLinkPresents() {
		logoutLink = webDriver.findElement(By.xpath(".//*[@id='PH_logoutLink']"));
		return (new WebDriverWait(webDriver, LINK_PRESENSE_TIMEOUT)).until(ExpectedConditions.visibilityOf(logoutLink))
				.isDisplayed();
	}

}
