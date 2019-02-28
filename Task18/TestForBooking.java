package forBooking;

import org.junit.Assert;
import org.junit.Test;

import pages.HomePage;
import pages.SearchResultPage;

public class TestForBooking extends AbstractTest {

	@Test
	public void goToBookingAndSearchRoomForYouAndYourFriendTest() {

		HomePage homePage = new HomePage();
		homePage.fillSearchField("Москва");
		homePage.chooseOfArrivalAndDepartureDate();
		homePage.clickButtonForSearch();
		SearchResultPage searchResultPage = new SearchResultPage();
		searchResultPage.grabListOfHotels();
		String nameOfHotel = searchResultPage.getNameOfHotelByIndex(0);
		Assert.assertFalse(nameOfHotel.isEmpty());
	}

	@Test
	public void checkRankingHotelTest() {
		HomePage homePage = new HomePage();
		homePage.fillSearchField("Москва");
		homePage.chooseOfArrivalAndDepartureDate();
		homePage.clickButtonForSearch();
		SearchResultPage searchResultPage = new SearchResultPage();
		searchResultPage.clickOnButtonSortToRank();
		searchResultPage.clickOnButtonSortToRankChooseToMax();
		double rank = searchResultPage.getFirstHotelRank();
		Assert.assertTrue(9.0 <= rank);

	}

}
