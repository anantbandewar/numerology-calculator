package org.learning.chart;

import org.learning.util.LoShuGrid;

public class BirthChart {
    public static void prepare(String[] dobArray) {
        String dob = String.join("", dobArray);
        LoShuGrid.reset();

        for (String digit : dob.split("")) {
            int number = Integer.parseInt(digit);
            LoShuGrid.fill(number);
        }
    }

    public static void addMagicNumbers(int driver, int conductor, int kua) {
        LoShuGrid.fill(driver);
        LoShuGrid.fill(conductor);
        LoShuGrid.fill(kua);
    }

    public static void print() {
        LoShuGrid.print();
    }
}
