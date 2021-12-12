package HW9.src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import HW9.src.main.Calendar;

class TestCalendar {
	
	Calendar c;
	GregorianCalendar gC;

	@ParameterizedTest
	@ValueSource(ints = {2000,2004,2008,2012})
	public void Should_return_true(int year) {
		c = new Calendar(year);
		assertTrue(c.isLeapYear());
		
	}

	@ParameterizedTest
	@ValueSource(ints = {2001,2005,2009,2013})
	public void Should_return_false(int year) {
		c = new Calendar(year);
		assertFalse(c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {2000,2005,2008,2013})
	public void Should_return_if_year_is_leap(int year) {
		
		c = new Calendar(year);
		gC = new GregorianCalendar();
		
		
		assertEquals(gC.isLeapYear(year), c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {-1,1900,2100,2200})
	public void Should_return_false_boundaries(int year) {
		c = new Calendar(year);
		assertFalse(c.isLeapYear());
	}
	
}
