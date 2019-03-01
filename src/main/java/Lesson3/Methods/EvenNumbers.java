package Lesson3.Methods;

import java.util.ArrayList;

public class EvenNumbers {


    public void returnEven (ArrayList<Integer> rangeArr) {

        System.out.println("First method " + "Even: ");
        for (int i : rangeArr) {
            if (i%2==0)
                System.out.print(i + " ");

        }
    }

    public void returnEven2 (ArrayList<Integer> rangeArr) {

        System.out.println("\nSecond method " + "Even: ");

          for (int i = 0; i <= rangeArr.size(); i = i + 2) {
              System.out.print(i + " ");
    }
}}
