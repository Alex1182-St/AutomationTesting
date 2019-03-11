package Lesson3.A1_Methods;

import java.util.Scanner;

public class QuadraticEquation {

    public void quadraticEquationSol () {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a(is not 0): ");
        double a = scan.nextDouble();

        System.out.println("Enter b(is not 0): ");
        double b = scan.nextDouble();

        System.out.println("Enter c(is not 0): ");
        double c = scan.nextDouble();

        double root1;
        double root2;

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant < 0) {
            System.out.println("\nThe equation has no real roots");
        }
        if (discriminant == 0) {
            System.out.println("\nThe equation has two identical roots. Solutions are: ");
            root1 = - b / (2 * a);
            root2 = - b / (2 * a);
            System.out.println("Root1: " + root1);
            System.out.println("Root2: " + root2);
        }
        if (discriminant > 0) {
            System.out.println("\nThe equation has two unequal roots. Solutions are: ");
            root1 = ( - b + Math.sqrt(discriminant)) / ( 2 * a );
            root2 = ( - b - Math.sqrt(discriminant)) / ( 2 * a );
            System.out.println("Root1: " + root1);
            System.out.println("Root2: " + root2);
        }

        scan.close();
    }



}
