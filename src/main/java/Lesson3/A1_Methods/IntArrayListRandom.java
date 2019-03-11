package Lesson3.A1_Methods;

import java.util.ArrayList;

public class IntArrayListRandom {

    public ArrayList arrCreatRandom (int lowDiapason, int upperDiapason, int size) {

        ArrayList<Integer> newArr = new ArrayList<Integer>();

        for (int i = 0; i <= size ; i++) {

            int range = (upperDiapason - lowDiapason) +1;
            int a = (int)(Math.random()*range) + lowDiapason;

            newArr.add(a);
        }
            return newArr;

    }

}
