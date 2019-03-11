package Lesson3.A1_Methods;

import java.util.ArrayList;

public class SumOfNumbsInString {

    public int numbsSumInString (String a) {

        String b = a.replaceAll("[^\\d]", "");

        /*
        The expression [^\\d] means not a digit where

        [] means one of these..
        [^ ..] means (not one of these)
        \  is escape character (because in Java you need to escape it)
        \d   means digit
        SO if you check an online checker, you're looking for \d, which means all digits, which is the same as

        [^0-9]
        So it will match 'h', 'e', 'l', 'l', 'o', and replace each one with a blank ("")
         */

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < b.length(); i++) {

            arr.add(Character.getNumericValue(b.charAt(i)));
        }

        int sum = 0;

        for (int i=0; i <arr.size(); i++){
            sum = sum+arr.get(i);
        }
        return sum;


    }


}
