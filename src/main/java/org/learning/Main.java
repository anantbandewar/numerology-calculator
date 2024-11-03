package org.learning;

import org.learning.calculators.ConductorNumber;
import org.learning.calculators.DriverNumber;
import org.learning.calculators.KuaNumber;
import org.learning.chart.BirthChart;
import org.learning.util.ZodiacSign;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("====================================================");
        System.out.println("--------- Welcome To Numerology Calculator ---------");
        System.out.println("====================================================");
        System.out.println();

        System.out.println("Please enter below details ->");

        System.out.print("Name (FirstName LastName): ");
        String name = scanner.nextLine();

        System.out.print("Date Of Birth (DD-MM-YYYY): ");

        String dob = scanner.nextLine();
        String[] dobArray = dob.split("-");

        while(dobArray.length != 3) {
            System.out.println();
            System.out.print("Please enter valid a Date Of Birth (DD-MM-YYYY): ");
            dob = scanner.nextLine();
            dobArray = dob.split("-");
            System.out.println();
        }

        Date birthDate;
        try {
            birthDate = new SimpleDateFormat("dd-MM-yyyy").parse(dob);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.print("Gender M/F: ");
        char gender = Character.toUpperCase(scanner.next().charAt(0));

        while (gender != 'M' && gender != 'F') {
            System.out.println();
            System.out.print("Please enter a valid Gender M/F: ");
            gender = Character.toUpperCase(scanner.next().charAt(0));
        }

        int driver = DriverNumber.calculate(dobArray[0]);
        int conductor = ConductorNumber.calculate(dobArray);
        int kua = KuaNumber.calculate(dobArray[2], gender);

        System.out.println();
        System.out.println("====================== REPORT ======================");

        System.out.println();
        System.out.println("\t NAME: " + name);
        System.out.println("\t Gender: " + (gender=='M' ? "MALE" : "FEMALE"));
        System.out.println("\t Zodiac Sign -> राशि: " + ZodiacSign.get(birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()));


        String formattedDate = new SimpleDateFormat("E, dd MMMM yyyy").format(birthDate);
        System.out.println("\t Date Of Birth: " + formattedDate);
        System.out.println();

        System.out.println("====================================================");

        BirthChart.prepare(dobArray);
        BirthChart.addMagicNumbers(driver, conductor, kua);

        System.out.println();
        System.out.println("\t BIRTH CHART -> ");
        BirthChart.print();
        System.out.println();

        System.out.println("====================================================");

        System.out.println();
        System.out.println("\t MAGIC NUMBERS -> ");
        System.out.println("\t Driver = " + driver + ", Conductor = " + conductor + ", Kua = " + kua);
        System.out.println();

        System.out.println("====================================================");
        System.exit(0);
    }
}