package Lesson3.Methods;

import java.util.ArrayList;

public class ArrElementsAverage {

    public int arrAverage (ArrayList<Integer> arr) {

        int average = 0;
        int arrayLength;
        int sum = 0;

        for (int i=0; i <arr.size(); i++){
            sum = sum + arr.get(i);
            arrayLength = arr.size();
            average = sum / arrayLength;
        }
        return average;

    }


}
