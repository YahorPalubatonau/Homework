package core;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class TestEx1 extends AbstractTest {

	@Test
	public void testEmptyOrNot() {
		assertTrue(massive.emptyOrNot(arrayListForTest));
	}
	@Test
	public void testReplace() {
		arrayListOfIntegersForTest.add(1);
		arrayListOfIntegersForTest.add(2);
		arrayListOfIntegersForTest.add(3);
		arrayListOfIntegersForTest.add(4);
		assertEquals(12,(massive.replace(arrayListOfIntegersForTest, 0, 12).get(0)));
		System.out.println(arrayListOfIntegersForTest);
	}

	@Test
	public void testAddStringFirst() {
		ArrayList<String> arrayListForTest1 = massive.addString(arrayListForTest, "AddString");
		String actualString = arrayListForTest1.get(0);
		assertEquals("AddString", actualString);
	}

	@Test(timeOut = 1000)
	public void testAddStringSecond() {
		ArrayList<String> arrayListForTest1 = massive.addString(arrayListForTest, "Egor");
		String actualString = arrayListForTest1.get(0);
		assertEquals("Egor", actualString);
	}

	@Test(expectedExceptions = NullPointerException.class)
	public void testSearchExceptions() {
		assertEquals("Exception", massive.searchExceptions());
	}
	@Test(enabled = false)
	public void test—ontainsString() {
		assertEquals( massive.addString(arrayListForTest,"Bbbbb"));
	}

}
