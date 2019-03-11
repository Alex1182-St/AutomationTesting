package Lesson3.A1_Methods;

import java.util.ArrayList;

public class FindPresenceNmInArr {

    public boolean checkForNm (ArrayList<Integer> arr, int number1, int number2) {


        boolean presenceOfNumbers = true;

        for (int i=0; i<arr.size(); i ++)
        {
            if (arr.get(i) == number1) {
                presenceOfNumbers = false;
            }
            else if (arr.get(i) == number2) {
                presenceOfNumbers = false;
            }
            else {
                presenceOfNumbers = true;}
        }
        return presenceOfNumbers;


    }

}
