package org.learning.calculators;

import org.learning.util.SingleDigitSum;

public class DriverNumber {
    public static int calculate(String dayOfBirth) {
        int driver = Integer.parseInt(dayOfBirth);
        return SingleDigitSum.get(driver);
    }
}
