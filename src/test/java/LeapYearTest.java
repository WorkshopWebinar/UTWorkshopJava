import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static org.junit.Assert.*;
@RunWith(JUnitParamsRunner.class)
public class LeapYearTest {
    LeapYear leapYear;
    @Before
    public void setUp() throws Exception {
        leapYear = new LeapYear();
    }

    @After
    public void tearDown() throws Exception {
    }

    private Object[] parametersToTestisLeapYear() {

        return new Object[]{
                new Object[] {400,true} ,
                new Object[] {4,true} ,
                new Object[] {100,false},

                new Object[] {401,false} ,
                new Object[] {399,false} ,

                new Object[] {3,false} ,
                new Object[] {5,false} ,

                new Object[] {99,false} ,
                new Object[] {101,false} ,

        };
    }

    @Test
    @Parameters(method = "parametersToTestisLeapYear")
    public void isLeapYear(int year, boolean expectedLeapYear) {
        boolean actualLeapYear = leapYear.isLeapYear(year);
        Assert.assertEquals(expectedLeapYear, actualLeapYear);
    }
}