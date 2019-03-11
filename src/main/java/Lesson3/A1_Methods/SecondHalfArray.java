package Lesson3.A1_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SecondHalfArray {

    public void arrHalf (ArrayList<Integer> arr) {

        Object [] array = arr.toArray(); //ArrayList to Array(array of object type)

        System.out.println("\nArray length is " + array.length);

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Enter the start of diapason");
        int start = newScanner.nextInt();
        System.out.println("Enter the end of diapason");
        int end = newScanner.nextInt();

        Object [] diapasonArray = Arrays.copyOfRange(array, start, end);

        System.out.println("\nYour diapason is ");

        for (int i = 0; i < diapasonArray.length; i++) {
            System.out.println(diapasonArray[i]);}

        newScanner.close();

    }




}
