
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage {
    public HomePage(WebDriver webDriver){
        super(webDriver);
    }

    public void fillSearchField(String nameOfPlace) {
        WebElement choosePlace = findElementBy(By.xpath(".//input[@id='ss']"));
        choosePlace.clear();
        choosePlace.sendKeys(nameOfPlace);
    }

    public void chooseOfArrivalAndDepartureDate() {
        WebElement dateOfArrival = findElementBy(By.xpath(
                ".//div[contains(@class,'xp__dates-inner xp__dates__checkin')]//*[contains(@class,'bk-icon -experiments-calendar sb-date-picker_icon-svg')]"));
        dateOfArrival.click();

        WebElement chooseDateOfArrival = findElementBy(By.xpath(".//td[@data-date=\"2019-03-30\"]"));
        chooseDateOfArrival.click();

        WebElement nextListOfDate = findElementBy(By.xpath(".//div[@class=\"bui-calendar__control bui-calendar__control--next\"]"));
        nextListOfDate.click();

        WebElement chooseDateOfDeparture = findElementBy(By.xpath(".//td[@data-date=\"2019-04-07\"]"));
        chooseDateOfDeparture.click();
    }

    public SearchResultPage clickButtonForSearch() {
        WebElement findHotels = findElementBy(By.xpath(".//span[text()=\"Проверить цены\"]"));
        findHotels.click();
        return new SearchResultPage(driver);
    }
}


