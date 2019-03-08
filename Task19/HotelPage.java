package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import forBooking.AbstractTestForBooking;

public class HotelPage extends AbstractTestForBooking {

	@FindBy(xpath = ".//span[contains(text(),'BYN')]")
	WebElement hotelPrice;

	@FindBy(xpath = ".//div[@class=\"hprt-reservation-cta\"]//*[contains(text(),'бронирую')]")
	WebElement chooseThisHotel;

	public HotelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void turnThePage() {

		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
			driver.switchTo().window(winHandle);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public double getPriceForDay() {
		int week = 7;
		String filterPrice = hotelPrice.getText().replaceAll(" ", "").replace("BYN", "");
		double allPrice = Double.parseDouble(filterPrice);
		System.out.println(allPrice / week);
		return allPrice / week;

	}

	public void chooseThis() {
		chooseThisHotel.click();
	}

	public void chooseNumbersOfRooms(int numbersOfRooms) {
		WebElement chooseRooms = driver.findElement(By.className("hprt-nos-select"));
		Select groupOfNumber = new Select(chooseRooms);
		groupOfNumber.selectByIndex(numbersOfRooms);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
