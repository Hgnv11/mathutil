package org.hgnv11.util;


import org.hgnv11.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testSumEvenDigits_WithValidInput_ReturnsCorrectSum(2,123);
        testSumEvenDigits_WithValidInput_ReturnsCorrectSum(4,-227);
        testSumEvenDigits_WithValidInput_ReturnsCorrectSum(6,-432);
        testSumEvenDigits_WithValidInput_ReturnsCorrectSum(8,627);

    }

    public static void testSumEvenDigits_WithValidInput_ReturnsCorrectSum(long expected, int n){
        //IN
        System.out.println("Sum Even Digits of " + n +  ": Expected: "+expected+" Actual: "+ MathUtility.sumEvenDigits(n) );

    }



}