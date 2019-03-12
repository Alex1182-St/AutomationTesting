package Lesson3.A1_Methods;

import java.util.Scanner;

public class StringFromIntWithScan {

    public String stringFromInt () {

        Scanner sc = new Scanner(System.in);

        int number;
        do {
            System.out.println("\n Please, enter a positive integer number!");

            if (sc.hasNextInt()== false) {
                System.out.println("\n It is not a number!");
                sc.next();
            }
            number = sc.nextInt();

        } while (number <= 0);

        String numberString = Integer.toString(number);

        sc.close();
        return numberString;
    }



}
