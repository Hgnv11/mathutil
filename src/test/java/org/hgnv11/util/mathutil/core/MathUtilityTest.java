package org.hgnv11.util.mathutil.core;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MathUtilityTest {
    private MathUtility mathUtility;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        mathUtility = new MathUtility();
    }

    @Test(groups = {"basicMath"})
    public void testAddition() {
        assertEquals(mathUtility.add(3, 5), 8);
    }

    @Test(groups = {"basicMath"}, dependsOnMethods = {"testAddition"})
    public void testAdditionDependent() {
        assertEquals(mathUtility.add(4, 4), 8);
    }

    @Test (priority = 2)
    public void testSumEvenDigits_123_Returns2() {
        assertEquals(MathUtility.sumEvenDigits(123), 2);
    }

    @Test (priority = 1)
    public void testSumEvenDigits_Negative227_Returns4() {
        assertEquals(MathUtility.sumEvenDigits(-227), 4);
    }

    @AfterMethod
    public void tearDown() {
        mathUtility = null;
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Tất cả các bài kiểm tra trong DependencyTests đã hoàn thành");
    }
}