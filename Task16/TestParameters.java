package core;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters extends AbstractTest {
	@Test
	@Parameters({ "actualNumber", "index", "number" })
	public void testAdd(int actualNumber, int index, int number) {
		arrayListOfIntegersForTest.add(1);
		arrayListOfIntegersForTest.add(2);
		assertEquals(actualNumber, (massive.replace(arrayListOfIntegersForTest, index, number).get(index)));
	}
}
