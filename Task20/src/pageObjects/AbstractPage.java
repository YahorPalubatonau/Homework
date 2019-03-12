package pageObjects;

import org.openqa.selenium.WebDriver;

public class AbstractPage {

	public static final String MAIN_URL = "http://mail.ru";
	public WebDriver webDriver;
	
	AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

	public void navigateToMail() {
		webDriver.manage().window().maximize();
		webDriver.get(MAIN_URL);
	}

}
