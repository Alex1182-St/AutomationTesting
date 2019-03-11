package Lesson3.A1_Methods;

import java.util.ArrayList;

public class ArrElementsSum {

    public int arrSum (ArrayList<Integer> arr) {

        int sum = 0;

        for (int i=0; i <arr.size(); i++){
            sum = sum+arr.get(i);
        }
        return sum;


    }

}
