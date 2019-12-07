package intermediate.lecture_08_UserExtensions;

import java.util.Iterator;

public class PersonValidator {
	
	public static boolean validateFirstName(Person person) {
		String firstName = person.getFirstName();
		if (firstName.isEmpty()) {
			return false;
		}
		for (char ch: firstName.toCharArray()) {
			if (!Character.isLetter(ch)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validateLastName(Person person) {
		String lastName = person.getLastName();
		if (lastName.isEmpty()) {
			return false;
		}
		for (char ch: lastName.toCharArray()) {
			if (!Character.isLetter(ch)) {
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean validateId(Person person) {
		long id = person.getId();
		if (id == 0) {
			return false;
		}
		return true;
	}

}
