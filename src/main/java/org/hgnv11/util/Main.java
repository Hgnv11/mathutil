package org.hgnv11.util;


import org.hgnv11.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        verifySumEvenDigitsGiveRightArgRunsWell(2,123);
        verifySumEvenDigitsGiveRightArgRunsWell(4,-227);
        verifySumEvenDigitsGiveRightArgRunsWell(6,-432);
        verifySumEvenDigitsGiveRightArgRunsWell(8,627);

    }

    public static void verifySumEvenDigitsGiveRightArgRunsWell(long expected, int n){
        //IN
        System.out.println("Sum Even Digits of " + n +  ": Expected: "+expected+" Actual: "+ MathUtility.sumEvenDigits(n) );

    }



}