package Lesson3.Methods;

import java.util.ArrayList;

public class OddNumbersArr {


    public ArrayList oddArr (ArrayList<Integer> arr) {

        ArrayList<Integer> odd = new ArrayList<Integer>();


        for (int i : arr) {
            if (i%2!=0)
                odd.add(i);
                        }
        return odd;
    }}
