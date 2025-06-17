package org.hgnv11.util.mathutil.core;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MathUtilityDDTTest {

    @DataProvider(name="evenDigitData")
    public Object[][] provideEvenDigitData(){
        return new Object [][]{{123,2},{-227,4},{-432,6}, {-627,8}, {0,0}, {13,0}};
    }

    @Test(dataProvider = "evenDigitData")
    public void testSumEvenDigits_ValidCases(int input, int expected) {
        int actual = MathUtility.sumEvenDigits(input);
        assertEquals(actual, expected);
    }

}