package intermediate.lecture_06_TestReporter;


import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.TestReporter;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestReporterDemo {

	@Test
//	@Order(1)
	void testKeyValuePair(TestReporter testReporter) {
		testReporter.publishEntry("myKey", "myValue");
	}
	
	@Test
//	@Order(2)
	void testMultipleKeyValuePair(TestReporter testReporter) {
		Map<String, String> values = new HashMap<>();
		values.put("greet", "Hello");
		values.put("name", "Moshe");
		testReporter.publishEntry(values);
	}

}
