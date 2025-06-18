package org.hgnv11.util.mathutil.core;

public class MathUtility {

    public int add(int a, int b) {
        return a + b;
    }

    public static int sumEvenDigits(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }


}
