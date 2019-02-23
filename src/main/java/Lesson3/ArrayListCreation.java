package Lesson3;


import java.util.ArrayList;

public class ArrayListCreation {

    public ArrayList arrListCreat (int a) {

    ArrayList<Integer> myArr = new ArrayList<>();

    while (a <= 20) {
        myArr.add(a);
        a ++;
    }

    return myArr;

    }

}
