package Lesson3;

import java.io.IOException;
import java.util.Scanner;

public class BeginnerTask8 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask7.txt";
        String strng = "\nTesting";

        System.out.println("Task8. Beginner level");
        TaskDescriptionRead TaskDescription8 = new TaskDescriptionRead();
        TaskDescription8.taskDescriptionReading(taskDescriptionPath);

        System.out.println("\nYour Word is " +strng);

        System.out.println("\nSelect quantity of words to be created from Your Word (from 1 to 3 words). Enter only 1, 2 or 3");
        Scanner scan1 = new Scanner(System.in);
        int words = scan1.nextInt();
        System.out.println("Quantity of words to be created - " + words);

        switch(words) {
            case 1:
                Scanner scan2 = new Scanner(System.in);
                System.out.println("\nEnter number \"n\" (from 0 to 5) as start of string and push Enter");
                int n = scan2.nextInt();
                System.out.println("\nEnter number \"d\" (from 0 to 6) as end of string and push Enter. \"d\" cannot be lesser \"n\"");
                int d = scan2.nextInt();
                System.out.println(strng.substring(n,d));
                scan2.close();
                break;
            case 2:
                Scanner scan3 = new Scanner(System.in);
                System.out.println("\nEnter number \"n\" (from 0 to 5) as start of string and push Enter");
                int n1 = scan3.nextInt();
                System.out.println("\nEnter number \"d\" (from 0 to 6) as end of string and push Enter. \"d\" cannot be lesser \"n\"");
                int d1 = scan3.nextInt();
                System.out.println("\nEnter number \"a\" as start of string and push Enter");
                int a = scan3.nextInt();
                System.out.println("\nEnter number \"b\" as end of string and push Enter. \"d\" cannot be lesser \"n\"");
                int b = scan3.nextInt();
                System.out.println(strng.substring(n1,d1) + strng.substring(a,b));
                scan3.close();
                break;
            case 3:
                Scanner scan4 = new Scanner(System.in);
                System.out.println("\nEnter number \"n\" (from 0 to 5) as start of string and push Enter");
                int n2 = scan4.nextInt();
                System.out.println("\nEnter number \"d\" (from 0 to 6) as end of string and push Enter. \"d\" cannot be lesser \"n\"");
                int d2 = scan4.nextInt();
                System.out.println("\nEnter number \"a\" as start of string and push Enter");
                int a1 = scan4.nextInt();
                System.out.println("\nEnter number \"b\" as end of string and push Enter. \"d\" cannot be lesser \"n\"");
                int b1 = scan4.nextInt();
                System.out.println("\nEnter number \"c\" as start of string and push Enter");
                int c = scan4.nextInt();
                System.out.println("\nEnter number \"e\" as end of string and push Enter. \"d\" cannot be lesser \"n\"");
                int e = scan4.nextInt();
                System.out.println(strng.substring(n2,d2) + strng.substring(a1,b1) + strng.substring(c,e));
                scan4.close();
                break;
        }
        scan1.close();

    }}



