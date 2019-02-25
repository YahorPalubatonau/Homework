package core;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;

public class AbstractTest {
	protected ArrayList arrayListForTest;
	protected ArrayList arrayListOfIntegersForTest;
	protected static Massive massive;

	@BeforeClass
	public static void BeforeClass() {
		massive = new Massive();

	}

	@BeforeMethod
	public void BeforeMethod() {
		arrayListForTest = new ArrayList();
		arrayListOfIntegersForTest = new ArrayList();
	}

	@AfterTest
	public void tearDown() throws Exception {
		System.out.println("Test was ended");
	}

	@AfterClass
	public static void after() {
		System.out.println("Test class is closed");
	}
}
