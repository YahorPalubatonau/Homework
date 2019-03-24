package pageObject;

import dataBase.DataBase;
import org.openqa.selenium.WebDriver;

import java.sql.SQLException;

public class AbstractPage {

	public WebDriver webDriver;
	
	AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

	public void navigateToMail() throws SQLException {
		DataBase dataBase = new DataBase();
		webDriver.manage().window().maximize();
		webDriver.get(String.valueOf(dataBase.getURL()));
	}

}
