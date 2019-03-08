package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import forBooking.AbstractTestForBooking;

public class CheckoutPage extends AbstractTestForBooking {

	@FindBy(xpath = ".//span[contains(text(),'Завершить')]")
	WebElement finalBook;

	@FindBy(xpath = ".//input[@id='lastname']")
	WebElement nameField;

	@FindBy(xpath = ".//input[@id='email']")
	WebElement emailField;

	@FindBy(xpath = ".//input[@id='email_confirm']")
	WebElement confirmEmail;

	@FindBy(xpath = ".//input[@id='cc_cvc']")
	WebElement cvcOfCard;

	@FindBy(xpath = ".//input[@id='phone']")
	WebElement phoneField;

	@FindBy(xpath = ".//input[@id=\"pay-now\"] ")
	WebElement buttonPayNow;

	@FindBy(xpath = ".//input[@id='cc_number']")
	WebElement cardNumbers;

	@FindBy(xpath = ".")
	WebElement typeOfCard;

	@FindBy(xpath = ".//p[@id=\"bp_form_cc_number_msg\"] ")
	WebElement warrningToEnterCard;

	@FindBy(xpath = ".//button[contains(text(),'финальные')]")
	WebElement goToFinalStady;

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterName() {
		nameField.sendKeys("Firgov");
	}

	public void enterEmail() {
		emailField.sendKeys("Firgov@gmail.com");
		confirmEmail.sendKeys("Firgov@gmail.com");
	}

	public void goToFinalSteps() {
		goToFinalStady.click();
	}

	public void enterPhone() {
		phoneField.sendKeys("224567876");
	}

	public void choosePayNow() {
		buttonPayNow.click();
	}

	public void enterInfoOfCard(int yourcardUnderNumber) {

		WebElement chooseTypeOfCard = driver.findElement(By.id("cc_type"));
		Select groupOfNumber = new Select(chooseTypeOfCard);
		groupOfNumber.selectByIndex(yourcardUnderNumber);

		cardNumbers.click();
		cardNumbers.clear();
		cardNumbers.sendKeys("42424242424242424242424242");

		cvcOfCard.sendKeys("666");

	}

	public String findErrorMessage() {
		System.out.println(warrningToEnterCard.getText());
		return warrningToEnterCard.getText();

	}
}
