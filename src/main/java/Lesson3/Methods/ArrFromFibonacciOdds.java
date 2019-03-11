package Lesson3.Methods;

import java.util.ArrayList;

public class ArrFromFibonacciOdds {


    public ArrayList<Long> oddArr (ArrayList<Long> arr, int length) {

        ArrayList<Long> odd = new ArrayList<Long>();


        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)%2!=0)
                odd.add(arr.get(i));

            if (odd.size() == length)
                break;
                        }
        return odd;
    }}
