package Lesson3;

import java.util.HashMap;
import java.util.Scanner;

public class SchoolMarks {


    public void marksResult() {

    HashMap<Integer,String> schoolMarksValue = new HashMap<Integer, String>();

        schoolMarksValue.put(1,"Very Bad");
        schoolMarksValue.put(2,"Bad");
        schoolMarksValue.put(3,"Failed");
        schoolMarksValue.put(4,"Good");
        schoolMarksValue.put(5,"Excellent");

    Scanner NumberScanner = new Scanner(System.in);

    System.out.println("\nEnter your number here and push Enter ");
    int number = NumberScanner.nextInt();

        System.out.println(schoolMarksValue.get(number));

        NumberScanner.close();

}}
