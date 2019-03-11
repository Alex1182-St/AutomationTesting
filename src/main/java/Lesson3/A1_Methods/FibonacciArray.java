package Lesson3.A1_Methods;

import java.util.ArrayList;

public class FibonacciArray {

    public ArrayList<Long> fiboArr (int arrLength) {

        ArrayList<Long> arr = new ArrayList<Long>();
        long a1=1;
        long a2=1;
        long a3;

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
