package Lesson3.Methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Stars {

    public void stars () {

        ArrayList<String> stars = new ArrayList<String>();
        stars.add(" ");
        stars.add("*");
        stars.add("**");
        stars.add("***");
        stars.add("****");
        stars.add("*****");
        stars.add("******");
        stars.add("*******");
        stars.add("********");
        stars.add("*********");

        String a = stars.get(1);
        String b = stars.get(2);
        String c = stars.get(3);
        String d = stars.get(4);
        String e = stars.get(5);
        String f = stars.get(6);
        String g = stars.get(7);
        String h = stars.get(8);
        String j = stars.get(9);


        System.out.println("\n Select a number(variant) from 1 to 9");
        Scanner scan1 = new Scanner(System.in);
        int number = scan1.nextInt();
        System.out.println("\n Your variant is - " + number);
        scan1.close();


        switch(number) {
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println(a+"\n" + b+"\n" + a);
                break;
            case 3:
                System.out.println(a+"\n"+b+"\n"+c+"\n"+b+"\n"+a);
                break;
            case 4:
                System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+c+"\n"+b+"\n"+a);
                break;
            case 5:
                System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+d+"\n"+c+"\n"+b+"\n"+a);
                break;
            case 6:
                System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+e+"\n"+d+"\n"+c+"\n"+b+"\n"+a);
                break;
            case 7:
                System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+f+"\n"+e+"\n"+d+"\n"+c+"\n"+b+"\n"+a);
                break;
            case 8:
                System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+h+"\n"+g+"\n"+f+"\n"+e+"\n"+d+"\n"+c+"\n"+b+"\n"+a);
                break;
            case 9:
                System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+h+"\n"+j+"\n"+h+"\n"+g+"\n"+f+"\n"+e+"\n"+d+"\n"+c+"\n"+b+"\n"+a);
                break;

        }}}

