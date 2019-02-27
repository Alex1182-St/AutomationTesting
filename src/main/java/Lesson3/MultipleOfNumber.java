package Lesson3;

import java.util.Scanner;

public class MultipleOfNumber {

    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public MultipleOfNumber() {
    }

    public void MultipleOfMethod () {


        Scanner NumberScanner = new Scanner(System.in);

        System.out.println("\n Enter your integer number here and push Enter ");
        int number = NumberScanner.nextInt();

        if((number % a) == 0) {
            System.out.println("True  " + number + " is a multiple of " + a);
        }
        else if ((number % b) ==0) {
            System.out.println("True  " + number + " is a multiple of " + b);
        }
        else
            System.out.println("True  " + number + " is not multiple of " + a + " or " + b);

        NumberScanner.close();

    }

}
