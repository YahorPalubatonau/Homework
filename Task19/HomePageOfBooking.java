package pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import forBooking.AbstractTestForBooking;

public class HomePageOfBooking extends AbstractTestForBooking {

	@FindBy(xpath = ".//input[@title='Поиск']")
	private WebElement searchFieldOfGoogle;

	@FindBy(xpath = ".//div[@class='VlcLAe']//input[@value='Поиск в Google']")
	private WebElement searchButton;

	@FindBy(xpath = " .//h3[contains(text(),'Booking.com | Отели‎')]")
	private WebElement cliclToBooking;

	@FindBy(xpath = ".//input[@id='ss']")
	private WebElement choosePlace;

	@FindBy(xpath = ".//div[contains(@class,'xp__dates-inner xp__dates__checkin')]//*[contains(@class,'bk-icon -experiments-calendar sb-date-picker_icon-svg')]")
	private WebElement fieldOfDate;

	@FindBy(xpath = ".//span[text()=\"Проверить цены\"]")
	private WebElement findHotels;

	public HomePageOfBooking(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void navigateToBookingHomePage() {
		searchFieldOfGoogle.clear();
		searchFieldOfGoogle.sendKeys("Booking.com");
		searchButton.click();
		cliclToBooking.click();
	}

	public void fillSearchField(String nameOfPlace) {
		choosePlace.clear();
		choosePlace.sendKeys(nameOfPlace);
	}

	public void specifyHowManyDaysAfterDepartureForHowManyDays(int afterHowManyDay, int numberOfDaysOfStay)
			throws ParseException {
		fieldOfDate.click();
		Date dateNow = new Date();
		SimpleDateFormat formatDateForDateNow = new SimpleDateFormat("yyyy-MM-dd");
		String dateNowFormat = formatDateForDateNow.format(dateNow);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(formatDateForDateNow.parse(dateNowFormat));
		calendar.add(Calendar.DATE, afterHowManyDay);
		String arrivDate = formatDateForDateNow.format(calendar.getTime());
		calendar.add(Calendar.DATE, numberOfDaysOfStay);
		String departureDate = formatDateForDateNow.format(calendar.getTime());
		String xpathForArriv = String.format("*//td[contains(@class, 'bui-calendar') and contains (@data-date,'%s')]",
				arrivDate);
		WebElement chooseArrivDate = driver.findElement(By.xpath(xpathForArriv));
		chooseArrivDate.click();
		String xpathForDeparture = String
				.format("*//td[contains(@class, 'bui-calendar') and contains (@data-date,'%s')]", departureDate);
		WebElement chooseDepartureDate = driver.findElement(By.xpath(xpathForDeparture));
		chooseDepartureDate.click();

	}

	public void clickButtonForSearch() {
		findHotels.click();
	}

}
