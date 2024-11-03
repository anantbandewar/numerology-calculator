package org.learning.calculators;

import org.learning.util.SingleDigitSum;

import static org.learning.constant.Constants.FEMALE_KUA;
import static org.learning.constant.Constants.MALE_KUA;

public class KuaNumber {
    public static int calculate(String birthYear, char gender) {
        int year = Integer.parseInt(birthYear);
        int yearSum = SingleDigitSum.get(year);
        int kua = 0;

        if (gender == 'M') {
            kua = MALE_KUA - yearSum;
        } else {
            kua = yearSum + FEMALE_KUA;
        }

        return kua > 9 ? SingleDigitSum.get(kua) : kua;
    }
}
