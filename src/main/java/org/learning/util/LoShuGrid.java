package org.learning.util;

public class LoShuGrid {
    private static final StringBuilder[][] chart = new StringBuilder[3][3];

    public static void reset() {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                chart[i][j] = new StringBuilder();
            }
        }
    }

    public static void fill(int number) {
        switch (number) {
            case 1 -> chart[2][1].append(number);
            case 2 -> chart[0][2].append(number);
            case 3 -> chart[1][0].append(number);
            case 4 -> chart[0][0].append(number);
            case 5 -> chart[1][1].append(number);
            case 6 -> chart[2][2].append(number);
            case 7 -> chart[1][2].append(number);
            case 8 -> chart[2][0].append(number);
            case 9 -> chart[0][1].append(number);
        };
    }

    public static void print() {
        String value;
        System.out.println("\t _______________________________");
        for (int i=0; i<3; i++) {

            System.out.print("\t ");
            if (i == 0)
                System.out.printf("%-10s%-10s%-10s|", "|RAHU", "|MARS", "|MOON");
            else if (i == 1)
                System.out.printf("%-10s%-10s%-10s|", "|JUPITER", "|MERCURY", "|KETU");
            else
                System.out.printf("%-10s%-10s%-10s|", "|SATURN", "|SUN", "|VENUS");

            System.out.println();

            System.out.print("\t ");
            System.out.printf("%-10s%-10s%-10s|", "|", "|", "|");
            System.out.println();

            System.out.print("\t ");
            for (int j=0; j<3; j++) {
                value = chart[i][j].toString();
                if (value.length() > 2) {
                    int space = value.length() + 2;
                    System.out.printf("%-" + (10-space) + "s%-" + space + "s", "|", value);
                }
                else {
                    System.out.printf("%-5s%-5s", "|", value);
                }
            }
            System.out.println("|");
            System.out.print("\t ");
            System.out.println("|_________|_________|_________|");
        }
    }
}
