package Lesson3.A1_Methods;

import java.util.ArrayList;

public class MultiplicationArrayList {

 public ArrayList<Integer> arrayMult (ArrayList<Integer> arr, int multInt)

 {
     for (int i = 0; i < arr.size() ; i++){
         arr.set(i, arr.get(i)*multInt);
     }
     return arr;
 }
 }
