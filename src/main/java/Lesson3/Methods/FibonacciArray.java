package Lesson3.Methods;

import java.util.ArrayList;

public class FibonacciArray {

    public ArrayList fiboArr (int arrLength) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        int a1=1;
        int a2=1;
        int a3;

        arr.add(a1);
        arr.add(a2);

        for (int i=3; i <= arrLength; i++) {
            a3 = a1 + a2;
            arr.add(a3);
            a1 = a2;
            a2 = a3;
        }

        return arr;
    }

}
