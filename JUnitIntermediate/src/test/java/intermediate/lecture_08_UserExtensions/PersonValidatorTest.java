package intermediate.lecture_08_UserExtensions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@DisplayName("Testing PersonValidator")
class PersonValidatorTest {

	@Nested
	@DisplayName("When using valid data")
	@ExtendWith(ValidPersonParameterResolver.class)
	public class validData {
		@RepeatedTest(10)
		@DisplayName("All first names are valid")
		public void testValidateFirstName(Person person) {
			assertTrue(PersonValidator.validateFirstName(person));
		}
		
		@RepeatedTest(10)
		@DisplayName("All last names are valid")
		public void testValidateLastName(Person person) {
			assertTrue(PersonValidator.validateLastName(person));
		}
		
		@RepeatedTest(10)
		@DisplayName("All id are valid")
		public void testValidateId(Person person) {
			assertTrue(PersonValidator.validateId(person));
		}
	}
	
	@Nested
	@DisplayName("When using invalid data")
	@ExtendWith(InvalidPersonParameterResolver.class)
	public class invalidData {
		@RepeatedTest(10)
		@DisplayName("All first names are invalid")
		public void testValidateFirstName(Person person) {
			assertTrue(PersonValidator.validateFirstName(person));
		}
		
		@RepeatedTest(10)
		@DisplayName("All last names are invalid")
		public void testValidateLastName(Person person) {
			assertTrue(PersonValidator.validateLastName(person));
		}
		
		@RepeatedTest(10)
		@DisplayName("All id are invalid")
		public void testValidateId(Person person) {
			assertTrue(PersonValidator.validateId(person));
		}
	}

}
