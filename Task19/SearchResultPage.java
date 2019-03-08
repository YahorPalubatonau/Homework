package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import forBooking.AbstractTestForBooking;

public class SearchResultPage extends AbstractTestForBooking {

	@FindBy(xpath = ".//*[@class=\"hotel_name_link url\"]")
	List<WebElement> listOfCheapHotels;

	@FindBy(xpath = ".//div[contains(@class,'vpm_d_sr_filter_suggestion')]//span[contains(@class,'filter_label')][contains(text(),'Очень хорошо: 8+')]")
	WebElement choosePopular;

	@FindBy(xpath = ".//span[@class=\"b-button__text\"][1]")
	WebElement chooseHotel;

	@FindBy(xpath = ".//button[@data-sb-id='main']")
	WebElement findNeedsHotels;

	@FindBy(xpath = ".//span[contains(text(),'120 за')]")
	WebElement chooseCheap;

	@FindBy(xpath = ".//span[contains(text(),'0 +')]")
	WebElement chooseExpensive;

	@FindBy(xpath = ".//a[contains(text(),'Цена (сначала самая низкая)')]")
	WebElement sortFromMinToMaxPrice;

	public SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickCheapHotels() {
		chooseCheap.click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public List<WebElement> grabListOfHotels() {
		return listOfCheapHotels;
	}

	public String getCostOfHotelByIndex(int index) {
		return listOfCheapHotels.get(index).getText();

	}

	public void chooseNumbersOfPeople(int number) {
		WebElement numbersOfGroup = driver.findElement(By.id("group_adults"));
		Select groupOfNumber = new Select(numbersOfGroup);
		groupOfNumber.selectByIndex(number - 1);
	}

	public void chooseNumbersOfRooms(int number) {
		WebElement numbersOfRooms = driver.findElement(By.id("no_rooms"));
		Select roomsNumbers = new Select(numbersOfRooms);
		roomsNumbers.selectByIndex(number - 1);
	}

	public void confirmChoose() {
		findNeedsHotels.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickChipHotelsInTop() {
		choosePopular.click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickExpensiveHotels() {
		chooseExpensive.click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void chooseHotel() {
		chooseHotel.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void sortOfThemAtCheapest() {
		sortFromMinToMaxPrice.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
