package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import forBooking.AbstractTest;

public class HomePage extends AbstractTest {

	public void fillSearchField(String nameOfPlace) {

		WebElement choosePlace = driver.findElement(By.xpath(".//input[@id='ss']"));
		choosePlace.clear();
		choosePlace.sendKeys(nameOfPlace);
	}

	public void chooseOfArrivalAndDepartureDate() {
		WebElement dateOfArrival = driver.findElement(By.xpath(
				".//div[contains(@class,'xp__dates-inner xp__dates__checkin')]//*[contains(@class,'bk-icon -experiments-calendar sb-date-picker_icon-svg')]"));
		dateOfArrival.click();

		WebElement chooseDateOfArrival = driver.findElement(By.xpath(".//td[@data-date=\"2019-03-30\"]"));
		chooseDateOfArrival.click();

		WebElement nextListOfDate = driver
				.findElement(By.xpath(".//div[@class=\"bui-calendar__control bui-calendar__control--next\"]"));
		nextListOfDate.click();

		WebElement chooseDateOfDeparture = driver.findElement(By.xpath(".//td[@data-date=\"2019-04-07\"]"));
		chooseDateOfDeparture.click();
	}

	public void clickButtonForSearch() {
		WebElement findHotels = driver.findElement(By.xpath(".//span[text()=\"Проверить цены\"]"));
		findHotels.click();
	}
}
