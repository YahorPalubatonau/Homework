package tests;

import org.junit.Assert;
import org.junit.Test;
import pageObjects.SearchResultPage;

public class TestForBooking extends BaseTest {

    @Test
    public void goToBookingAndSearchRoomForYouAndYourFriendTest() {
        homePage.fillSearchField("Москва");
        homePage.chooseOfArrivalAndDepartureDate();
        SearchResultPage searchResultPage = homePage.clickButtonForSearch();
        searchResultPage.grabListOfHotels();
        String nameOfHotel = searchResultPage.getNameOfHotelByIndex(0);
        Assert.assertFalse(nameOfHotel.isEmpty());
    }

    @Test
    public void checkRankingHotelTest() {
        homePage.fillSearchField("Москва");
        homePage.chooseOfArrivalAndDepartureDate();
        homePage.clickButtonForSearch();
        SearchResultPage searchResultPage = homePage.clickButtonForSearch();
        searchResultPage.clickOnButtonSortToRank();
        searchResultPage.clickOnButtonSortToRankChooseToMax();
        double rank = searchResultPage.getFirstHotelRank();
        Assert.assertTrue(9.0 <= rank);

    }

}

