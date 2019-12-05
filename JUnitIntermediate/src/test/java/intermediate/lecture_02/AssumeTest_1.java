package intermediate.lecture_02;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Test;

public class AssumeTest_1 {

	@Test
	public void testIfVesionGreaterThan4() {
		String versionNumber = "5"; //get it from configuration on run time
		Assume.assumeTrue(Integer.valueOf(versionNumber) >= 4);
		System.out.println("Test executed");
	}

}
