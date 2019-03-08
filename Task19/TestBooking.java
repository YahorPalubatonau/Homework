package forBooking;

import java.text.ParseException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import pages.CheckoutPage;
import pages.HomePageOfBooking;
import pages.HotelPage;
import pages.SearchResultPage;

public class TestBooking extends AbstractTestForBooking {

	@Test
	public void freeOrNotHotelTest() throws ParseException {

		HomePageOfBooking homePageOfBooking = new HomePageOfBooking(driver);
		homePageOfBooking.navigateToBookingHomePage();
		homePageOfBooking.fillSearchField("Париж");
		homePageOfBooking.specifyHowManyDaysAfterDepartureForHowManyDays(3, 7);
		homePageOfBooking.clickButtonForSearch();

		SearchResultPage searchResultPage = new SearchResultPage(driver);
		searchResultPage.clickCheapHotels();
		searchResultPage.grabListOfHotels();
		String nameOfHotel = searchResultPage.getCostOfHotelByIndex(0);
		Assert.assertFalse(nameOfHotel.isEmpty());
		searchResultPage.clickChipHotelsInTop();
		searchResultPage.chooseHotel();

		HotelPage hotelPage = new HotelPage(driver);
		hotelPage.turnThePage();
		Assert.assertTrue(120 >= hotelPage.getPriceForDay());
	}

	@Test
	public void hotelForFourPeoplesTest() throws ParseException {
		HomePageOfBooking homePageOfBooking = new HomePageOfBooking(driver);
		homePageOfBooking.navigateToBookingHomePage();
		homePageOfBooking.fillSearchField("Париж");
		homePageOfBooking.specifyHowManyDaysAfterDepartureForHowManyDays(3, 7);
		homePageOfBooking.clickButtonForSearch();

		SearchResultPage searchResultPage = new SearchResultPage(driver);
		searchResultPage.chooseNumbersOfPeople(4);
		searchResultPage.chooseNumbersOfRooms(2);
		searchResultPage.confirmChoose();
		searchResultPage.clickExpensiveHotels();
		searchResultPage.sortOfThemAtCheapest();
		searchResultPage.chooseHotel();

		HotelPage hotelPage = new HotelPage(driver);
		hotelPage.turnThePage();
		Assert.assertTrue(970 <= hotelPage.getPriceForDay());
		hotelPage.chooseThis();
	}

	@Test
	public void checkMyBook() throws ParseException {
		HomePageOfBooking homePageOfBooking = new HomePageOfBooking(driver);
		homePageOfBooking.navigateToBookingHomePage();
		homePageOfBooking.fillSearchField("Париж");
		homePageOfBooking.specifyHowManyDaysAfterDepartureForHowManyDays(3, 7);
		homePageOfBooking.clickButtonForSearch();

		SearchResultPage searchResultPage = new SearchResultPage(driver);
		searchResultPage.chooseNumbersOfPeople(4);
		searchResultPage.chooseNumbersOfRooms(2);
		searchResultPage.confirmChoose();
		searchResultPage.clickExpensiveHotels();
		searchResultPage.sortOfThemAtCheapest();
		searchResultPage.chooseHotel();

		HotelPage hotelPage = new HotelPage(driver);
		hotelPage.turnThePage();
		hotelPage.chooseNumbersOfRooms(2);
		hotelPage.chooseThis();

		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.enterName();
		checkoutPage.enterEmail();
		checkoutPage.goToFinalSteps();

		checkoutPage.enterPhone();
		checkoutPage.choosePayNow();
		checkoutPage.enterInfoOfCard(2);
		Assert.assertEquals("Введите номер действительной кредитной карты", checkoutPage.findErrorMessage());
	}
}