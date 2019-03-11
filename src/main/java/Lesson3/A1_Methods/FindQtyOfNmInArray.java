package Lesson3.A1_Methods;

import java.util.ArrayList;

public class FindQtyOfNmInArray {

    public int qTyOfNmInArr (ArrayList<Integer> arr, int number) {

        int countOfNumber = 0;
        for (int i = 0; i < arr.size() ; i++){
            if(arr.get(i) == number ){
                countOfNumber++;
            }
        }
        return countOfNumber;

    }

}
