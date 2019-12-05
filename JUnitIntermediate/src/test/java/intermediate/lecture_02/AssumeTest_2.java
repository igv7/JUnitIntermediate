package intermediate.lecture_02;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class AssumeTest_2 {
	
	@Before
	public void setUp() {
		String versionNumber = "7"; // get it from configuration on runtime
		Assume.assumeTrue(Integer.valueOf(versionNumber) >= 4);
	}

	@Test
	public void testOneThing() {
		System.out.println("Test One Thing....");
	}
	
	@Test
	public void testAnotherThing() {
		System.out.println("Test Another Thing....");
	}

}
