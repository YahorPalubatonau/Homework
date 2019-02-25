package core;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class AbstractTest {

	protected ArrayList arrayListForTest;
	protected static Massive massive;

	@BeforeClass
	public static void BeforeClass() {
		massive = new Massive();

	}

	@Before
	public void BeforeMethod() {
		arrayListForTest = new ArrayList();

	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void after()  {
		System.out.println("Test class is closed");
	}
}
