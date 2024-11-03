package org.learning.calculators;

import org.learning.util.SingleDigitSum;

public class ConductorNumber {
    public static int calculate(String[] dobArray) {
        String dob = String.join("", dobArray);
        int dobNumber = Integer.parseInt(dob);
        return SingleDigitSum.get(dobNumber);
    }
}
