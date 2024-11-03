package org.learning.util;

public class SingleDigitSum {
    public static int get(int number) {
        int sum = 0;
        while (number > 0 || sum > 9) {
            if (number == 0) {
                number = sum;
                sum = 0;
            }

            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
