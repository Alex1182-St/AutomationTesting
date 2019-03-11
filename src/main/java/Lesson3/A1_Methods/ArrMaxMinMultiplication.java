package Lesson3.A1_Methods;

import java.util.ArrayList;
import java.util.Collections;


public class ArrMaxMinMultiplication {

    public int maxMult (ArrayList<Integer> arr) {

        Collections.sort(arr);
        int max = arr.get(arr.size() - 1);
        return max = max * 2;
    }

     public int minMult (ArrayList<Integer> arr){

         Collections.sort(arr);
         int min = arr.get(0);
         return min = min * 2;

    }


}
