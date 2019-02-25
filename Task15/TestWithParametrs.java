package core;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestWithParametrs extends AbstractTest{
	private int num;
	private String string;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { "aaa", 0 }, { "bbb", 1 } });
	}

	public TestWithParametrs(String srting, int num) {
		this.string = srting;
		this.num = num;
	}
	
	@Test
	public void testAddStringFirst() {
		System.out.println(num);
		ArrayList<String> arrayListForTest1 = massive.addString(arrayListForTest, string);
		String actualString = arrayListForTest1.get(0);
		assertEquals(string, actualString);
	}

}
