package intermediate.lecture_03_CodeCoverage;

import static org.junit.Assert.*;

import org.junit.Test;

import intermediate.lecture_03_CodeCoverage.StringUtils;

public class StringUtilsTest {
	
	@Test
	public void testChopOff2SpacesAtHead_OnlyTwo() {
		assertEquals("**", intermediate.lecture_03_CodeCoverage.StringUtils.chopOff2SpacesAtHead("**"));
//		assertEquals("**", su.chopOff2SpacesAtHead("**"));
	}

	@Test
	public void testChopOff2SpacesAtHead_BothAtLeft() {
		assertEquals("**", intermediate.lecture_03_CodeCoverage.StringUtils.chopOff2SpacesAtHead("  **"));
//		assertEquals("**", su.chopOff2SpacesAtHead("  **"));
	}
	
	@Test
	public void testChopOff2SpacesAtHead_Single() {
		assertEquals("**", intermediate.lecture_03_CodeCoverage.StringUtils.chopOff2SpacesAtHead(" **"));
//		assertEquals("**", su.chopOff2SpacesAtHead(" **"));
	}
	
	@Test
	public void testChopOff2SpacesAtHead_None() {
		assertEquals("****", intermediate.lecture_03_CodeCoverage.StringUtils.chopOff2SpacesAtHead("****"));
//		assertEquals("****", su.chopOff2SpacesAtHead("****"));
	}
	
	@Test
	public void testChopOff2SpacesAtHead_BothAtRight() {
		assertEquals("**  ", intermediate.lecture_03_CodeCoverage.StringUtils.chopOff2SpacesAtHead("**  "));
//		assertEquals("**  ", su.chopOff2SpacesAtHead("**  "));
	}
	
	
	
	StringUtils su = new StringUtils();
	
	@Test
	public void testAre2CharsAtHeadAndTailEqual_AllDifferentSymbols() {
//		assertFalse("All Different Symbols", su.are2CharsAtHeadAndTailEqual("1234"));
		assertFalse(su.are2CharsAtHeadAndTailEqual("1234"));
	}
	
	@Test
	public void testAre2CharsAtHeadAndTailEqual_AllSameSymbols() {
		assertTrue(su.are2CharsAtHeadAndTailEqual("1212"));
	}
	
	@Test
	public void testAre2CharsAtHeadAndTailEqual_TwoSymbols() {
		assertTrue(su.are2CharsAtHeadAndTailEqual("12"));
	}
	
	@Test
	public void testAre2CharsAtHeadAndTailEqual_OneSymbol() {
		assertFalse(su.are2CharsAtHeadAndTailEqual("1"));
	}

}
