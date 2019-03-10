package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MailBoxPage extends AbstractDriver {
    private WebDriver driver;

    @FindBy(xpath = ".//div[@class='js-checkbox b-checkbox']//div[@class='b-checkbox__box']")
    List<WebElement> checkBoxOfMessage;

    @FindBy(xpath = "//div[@class='js-checkbox b-checkbox b-checkbox_checked']")
    List<WebElement> checkBoxOfMessageAfterSelected;

    @FindBy(xpath = ".//div[@title='Спам (J)']")
    WebElement spamButton;

    @FindBy(xpath = ".//span[contains(@class,'b-nav__item__text') and text() ='Спам']")
    WebElement spamSection;

    @FindBy(xpath = ".//div[@title='Не спам (J)']")
    WebElement nospamButton;

    @FindBy(xpath = ".//span[contains(text(),'Входящие')]")
    WebElement inboxButton;

    @FindBy(xpath = ".//div[@id='b-toolbar__right']//div[@data-cache-key='0_undefined_false']//div[@class='b-checkbox__checkmark']")
    WebElement unselectAllButton;

    @FindBy(xpath = ".//div[@id='b-toolbar__left']//div//a[contains(@class,'b-toolbar__btn b-toolbar__btn_with-foldings js-shortcut')]")
    WebElement writeMailButton;
    @FindBy(xpath = ".//textarea[@data-original-name='To']")
    WebElement fieldOfToWhom;

    @FindBy(xpath = ".//iframe[@allowtransparency=\"true\"]")
    WebElement changeFrame;

    @FindBy(xpath = ".//body[@id='tinymce']")
    WebElement fieldOfMessage;

    @FindBy(xpath = ".//div[@id='b-toolbar__right']//div//div[@class='b-toolbar__btn b-toolbar__btn_ b-toolbar__btn_false js-shortcut']")
    WebElement sendButton;

    @FindBy(xpath = ".//div[@class='message-sent__title']")
    WebElement textInWindow;

    public MailBoxPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.driver = webDriver;
    }

    public void tipMessage() {
        checkBoxOfMessage.get(0).click();
    }

    public void tipMessageinSpam() {
        checkBoxOfMessage.get(2).click();
    }

    public void tipTreeMessageinSpam() {
        checkBoxOfMessage.get(2).click();
        checkBoxOfMessage.get(1).click();
        checkBoxOfMessage.get(0).click();
    }

    public int getCountOfSelectedChecboxes() {
        return checkBoxOfMessageAfterSelected.size();
    }

    public void unselectAll() {
        unselectAllButton.click();
    }

    public void moveMessageToSpam() {
        spamButton.click();
    }

    public String getTextFromSpamSection() {
        return spamSection.getAttribute("innerText");
    }

    public void goToSpam() {
        try {
            spamSection.click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            spamSection.click();
        }
    }

    public void moveMessageToInput() {
        nospamButton.click();
    }

    public void goToInboxDerection() {
        inboxButton.click();
    }

    public void goToWriteSection() {

        writeMailButton.click();
    }

    public void enterToWhom() {
        fieldOfToWhom.clear();
        fieldOfToWhom.sendKeys("banfish@tut.by whynobrain@gmail.com");
    }

    public void enterMessage() {
        driver.switchTo().frame(changeFrame);
        fieldOfMessage.click();
        fieldOfMessage.clear();
        fieldOfMessage.sendKeys("Hello friends!!!!");
        driver.switchTo().defaultContent();
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public boolean messageIsPresent() {
        return (new WebDriverWait(webDriver, 3000)).until(ExpectedConditions.visibilityOf(textInWindow))
                .isDisplayed();
    }

}
