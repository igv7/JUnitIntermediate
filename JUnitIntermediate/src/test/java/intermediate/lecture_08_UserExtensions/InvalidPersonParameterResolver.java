package intermediate.lecture_08_UserExtensions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

class InvalidPersonParameterResolver implements ParameterResolver {

	public static final Person[] VALID_PERSONS = {
			new Person().setId(1L).setFirstName("Moshe,").setLastName("Mo_she"),
			new Person().setId(2L).setFirstName("").setLastName(",Kobi"),
			new Person().setId(3L).setFirstName(null).setLastName(null),
			new Person().setId(4L).setFirstName("{Matan}").setLastName("Matan&"),
			new Person().setId(5L).setFirstName("Zamir Zamir").setLastName(""),
			new Person().setId(6L)/*.setFirstName("Tom").setLastName("Tom")*/,
		};

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
		Object ret = null;
		if (parameterContext.getParameter().getType() == Person.class) {
			ret = VALID_PERSONS[new Random().nextInt(VALID_PERSONS.length)];
		}
		return ret;
	}

	@Override
	public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
		boolean ret = false;
		if (parameterContext.getParameter().getType() == Person.class) {
			ret = true;
		}
		return ret;
	}


}
