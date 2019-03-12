package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailBoxPage extends AbstractPage {

	List<WebElement> checkBoxOfMessage;
	List<WebElement> checkBoxOfMessageAfterSelected;
	WebElement spamButton; 
	WebElement spamSection;
	WebElement nospamButton;
	WebElement inboxButton;
	WebElement unselectAllButton;
	WebElement writeMailButton;
	WebElement fieldOfToWhom;
	WebElement changeFrame;
	WebElement fieldOfMessage;
	WebElement sendButton;
	WebElement textInWindow;

	public MailBoxPage(WebDriver webDriver) {
		super(webDriver);
	}

	public void tipMessage() {
		checkBoxOfMessage = webDriver.findElements(By.xpath(".//div[@class='js-checkbox b-checkbox']//div[@class='b-checkbox__box']"));
		checkBoxOfMessage.get(0).click();
	}

	public void tipMessageinSpam() {
		checkBoxOfMessage = webDriver.findElements(By.xpath(".//div[@class='js-checkbox b-checkbox']//div[@class='b-checkbox__box']"));
		checkBoxOfMessage.get(2).click();
	}

	public void tipTreeMessageinSpam() {
		checkBoxOfMessage = webDriver.findElements(By.xpath(".//div[@class='js-checkbox b-checkbox']//div[@class='b-checkbox__box']"));
		checkBoxOfMessage.get(2).click();
		checkBoxOfMessage.get(1).click();
		checkBoxOfMessage.get(0).click();
	}

	public int getCountOfSelectedChecboxes() {
		checkBoxOfMessageAfterSelected= webDriver.findElements(By.xpath("//div[@class='js-checkbox b-checkbox b-checkbox_checked']"));
		return checkBoxOfMessageAfterSelected.size();
	}

	public void unselectAll() {
		unselectAllButton= webDriver.findElement(By.xpath(".//div[@id='b-toolbar__right']//div[@data-cache-key='0_undefined_false']//div[@class='b-checkbox__checkmark']"));
		unselectAllButton.click();
	}

	public void moveMessageToSpam() {
		spamButton = webDriver.findElement(By.xpath(".//div[@title='Спам (J)']"));
		spamButton.click();
	}

	public String getTextFromSpamSection() {
		spamSection= webDriver.findElement(By.xpath(".//span[contains(@class,'b-nav__item__text') and text() ='Спам']"));
		return spamSection.getAttribute("innerText");
	}

	public void goToSpam() {
		spamSection= webDriver.findElement(By.xpath(".//span[contains(@class,'b-nav__item__text') and text() ='Спам']"));
		try {
			spamSection.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			spamSection.click();
		}
	}

	public void moveMessageToInput() {
		nospamButton= webDriver.findElement(By.xpath(".//div[@title='Не спам (J)']"));
		nospamButton.click();
	}

	public void goToInboxDerection() {
		inboxButton= webDriver.findElement(By.xpath(".//span[contains(text(),'Входящие')]"));
		inboxButton.click();
	}

	public void goToWriteSection() {
		writeMailButton= webDriver.findElement(By.xpath(".//div[@id='b-toolbar__left']//div//a[contains(@class,'b-toolbar__btn b-toolbar__btn_with-foldings js-shortcut')]"));
		writeMailButton.click();
	}

	public void enterToWhom() {
		fieldOfToWhom= webDriver.findElement(By.xpath(".//textarea[@data-original-name='To']"));
		fieldOfToWhom.clear();
		fieldOfToWhom.sendKeys("banfish@tut.by whynobrain@gmail.com");
	}

	public void enterMessage() {
		changeFrame= webDriver.findElement(By.xpath(".//iframe[@allowtransparency=\"true\"]"));
		fieldOfMessage= webDriver.findElement(By.xpath(".//body[@id='tinymce']"));
		webDriver.switchTo().frame(changeFrame);
		fieldOfMessage.click();
		fieldOfMessage.clear();
		fieldOfMessage.sendKeys("Hello friends!!!!");
		webDriver.switchTo().defaultContent();
	}

	public void clickSendButton() {
		sendButton= webDriver.findElement(By.xpath(".//div[@id='b-toolbar__right']//div//div[@class='b-toolbar__btn b-toolbar__btn_ b-toolbar__btn_false js-shortcut']"));
		sendButton.click();
	}

	public boolean messageIsPresent() {
		textInWindow= webDriver.findElement(By.xpath(".//div[@class='message-sent__title']"));
		return (new WebDriverWait(webDriver, 3000)).until(ExpectedConditions.visibilityOf(textInWindow)).isDisplayed();
	}

}
