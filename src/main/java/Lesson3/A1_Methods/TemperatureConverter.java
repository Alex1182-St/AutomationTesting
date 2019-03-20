package Lesson3.A1_Methods;

import java.util.Scanner;

public class TemperatureConverter {

    public double tempConvert () {

        double convertedTemp = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter \"c\" to convert Kelvin to Celcium\n" +
                "\n Enter \"k\" to convert Celcium to Kelvin");
        String choise = sc.nextLine();

        if (choise.equals("c")) {
            System.out.println("\nEnter your temperature in Kelvin. Use numbers only");
            double kelv = sc.nextDouble();
            convertedTemp = kelv - 273.15;
            return convertedTemp;

        }
        else if (choise.equals("k")) {
            System.out.println("\nEnter your temperature in Celcium. Use numbers only");
            double celc = sc.nextDouble();
            convertedTemp = celc + 273.15;
            return convertedTemp;
        }
        else {
            System.out.println("Celcium of Kelvin has not been chosen. Run the program again");
            return tempConvert();
        }


    }


}
