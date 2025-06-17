package org.hgnv11.util.mathutil.core;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MathUtilityTest {

    @Test
    public void testSumEvenDigits_123_Returns2() {
        assertEquals(MathUtility.sumEvenDigits(123), 2);  // 2
    }

    @Test
    public void testSumEvenDigits_Negative227_Returns4() {
        assertEquals(MathUtility.sumEvenDigits(-227), 4); // 2 + 2
    }

    @Test
    public void testSumEvenDigits_Negative432_Returns6() {
        assertEquals(MathUtility.sumEvenDigits(-432), 6); // 4 + 2
    }

    @Test
    public void testSumEvenDigits_627_Returns8() {
        assertEquals(MathUtility.sumEvenDigits(627), 8);  // 6 + 2
    }

    @Test
    public void testSumEvenDigits_Zero_Returns0() {
        assertEquals(MathUtility.sumEvenDigits(0), 0);    // edge case
    }

    @Test
    public void testSumEvenDigits_AllOddDigits_Returns0() {
        assertEquals(MathUtility.sumEvenDigits(13579), 0); // no even digits
    }
}
