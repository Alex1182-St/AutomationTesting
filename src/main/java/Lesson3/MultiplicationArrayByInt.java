package Lesson3;

import java.util.ArrayList;

public class MultiplicationArrayByInt {

 public ArrayList<Integer> arrayMult (ArrayList<Integer> arr, int multInt)

 {
     for (int i = 0; i < arr.size() ; i++){
         arr.set(i, arr.get(i)*multInt);
     }
     return arr;
 }
 }
