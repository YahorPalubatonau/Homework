package core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

public class Test1 extends AbstractTest{


	@Test
	public void testEmptyOrNot() {
		assertTrue(massive.emptyOrNot(arrayListForTest));
	}

	@Test
	public void testAddStringFirst() {
		ArrayList<String> arrayListForTest1 = massive.addString(arrayListForTest, "AddString");
		String actualString = arrayListForTest1.get(0);
		assertEquals("AddString", actualString);
	}

	@Test(timeout = 1000)
	public void testAddStringSecond() {
		ArrayList<String> arrayListForTest1 = massive.addString(arrayListForTest, "Egor");
		String actualString = arrayListForTest1.get(0);
		assertEquals("Egor", actualString);
	}

	@Test(expected = Exception.class)
	public void testSearchExceptions() {
		assertEquals("Exception", massive.searchExceptions());
	}


	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
