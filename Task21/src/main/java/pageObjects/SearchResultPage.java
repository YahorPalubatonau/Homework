package pageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage extends AbstractPage {

    public SearchResultPage(WebDriver webDriver){
        super(webDriver);
    }

    List<WebElement> listOfFreeHotels;

    public List<WebElement> grabListOfHotels() {
        listOfFreeHotels = driver.findElements(By.xpath(".//a[@class=\"hotel_name_link url\"]"));
        return listOfFreeHotels;
    }

    public String getNameOfHotelByIndex(int index) {
        return listOfFreeHotels.get(index).getText();

    }

    public void clickOnButtonSortToRank() {
        WebElement sortToRank = findElementBy(By.xpath(".//a[@aria-haspopup=\"true\"]"));
        sortToRank.click();
    }

    public void clickOnButtonSortToRankChooseToMax() {
        WebElement chooseMAx = findElementBy(By.xpath(".//a[@class=\"sort_suboption\"]"));
        chooseMAx.click();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public double getFirstHotelRank() {
        WebElement firstHotelWithMaxReiting = driver.findElement(By.xpath(".//div[@role=\"link\"][1]"));
        String string = firstHotelWithMaxReiting.getText().replace(',', '.');
        return Double.parseDouble(string);

    }
}