package core;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider{
	@DataProvider(name = "provideDaysInterval")
	public Object[][] provideData() {
		return new Object[][] { { 1 }, { 2 }, { 567 }, { 110 }, { 365 }, { 400 }, { 800 } };
	}
	@Test(dataProvider = "provideDaysInterval")
	public void test_Days_Are_Valid(int numberOfDaysInterval){
	 System.out.println(numberOfDaysInterval);
	}
}
