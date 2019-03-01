package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumInArrList {


    public void returnMax (ArrayList<Integer> rangeArr) {

        Arrays.sort(new ArrayList[]{rangeArr}); //Сортировка

        System.out.println("\nArray numbers are \n"  + rangeArr);

        int max = rangeArr.get(rangeArr.size()-1);

        System.out.print("\nMax number is " + max  );


        }
    }

