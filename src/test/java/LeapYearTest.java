import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static org.junit.Assert.*;

public class LeapYearTest {
    LeapYear leapYear;
    @Before
    public void setUp() throws Exception {
        leapYear = new LeapYear();
    }

    @After
    public void tearDown() throws Exception {
    }

	@Test
	public void leapTestPassBy2000() {
		String msg = "Year 2000 should be a leap year.";
		boolean result = leapYear.isLeapYear(2000);
		assertEquals(msg, true, result);
	}
	
}