/**
 * 
 */
package com.utworkshop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * LeapYear test
 *
 */
public class LeapYearTestCase {

	@Test
	public void leapTestPassBy2000() {
		String msg = "Year 2000 should be a leap year.";
		boolean result = LeapYear.checkYear(2000);
		assertEquals(msg, true, result);
	}
	
}
