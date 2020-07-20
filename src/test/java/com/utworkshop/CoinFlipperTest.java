package com.utworkshop;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static org.junit.Assert.*;
@RunWith(JUnitParamsRunner.class)
public class CoinFlipperTest {
    CoinFlipper coinFlipper;
    @Before
    public void setUp() throws Exception {
        coinFlipper = new CoinFlipper();
    }

    @After
    public void tearDown() throws Exception {
    }

    private Object[] parametersToTest() {

        RandomGenerator  randomGenerator = Mockito.mock(RandomGenerator.class);
        return new Object[]{
                        new Object[] {randomGenerator,0,1,2,CoinFlipper.Result.HEADS} ,
                        new Object[] {randomGenerator,1,0,0,CoinFlipper.Result.TAILS}
                     };
        }

    @Test
    @Parameters(method = "parametersToTest")
    public void ShouldReturnHeadsIfRandValueIsLessThanProbability(RandomGenerator randomGenerator,
        int x, int y, int z, CoinFlipper.Result expectedResult) throws Exception{
        Mockito.when(randomGenerator.generate(x,y)).thenReturn(z);
        CoinFlipper.Result actualResult = coinFlipper.flipCoin(randomGenerator,x,y);
        Assert.assertEquals(expectedResult,actualResult);

    }


}