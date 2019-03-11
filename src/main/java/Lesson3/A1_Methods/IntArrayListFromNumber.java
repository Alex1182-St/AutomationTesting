package Lesson3.A1_Methods;

import java.util.ArrayList;

public class IntArrayListFromNumber {

    public ArrayList<Integer> amountOfDigs (String number) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {

            arr.add(Character.getNumericValue(number.charAt(i)));
        }

    return arr;

    }}