package Lesson3.A1_Methods;

import java.util.ArrayList;

public class ArrElementsAverage {

    public int arrAverage (ArrayList<Integer> arr) {

        int average;
        int arrayLength;
        int sum = 0;

        for (int i=0; i <arr.size(); i++){
            sum = sum + arr.get(i);
                    }
        arrayLength = arr.size();
        average = sum / arrayLength;

        return average;

    }


}
